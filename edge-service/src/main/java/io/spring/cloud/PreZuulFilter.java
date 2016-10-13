package io.spring.cloud;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PreZuulFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(PreZuulFilter.class);
	
	@Override
	public String filterType() {
	    return "pre";
	}
	
	@Override
	public int filterOrder() {
	    return 1;
	}
	
	@Override
	public boolean shouldFilter() {
	    return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.netflix.zuul.IZuulFilter#run()
	 * 
	 * add authorization variable to the header which holds the token
	 */
	@Override
	public Object run() {
	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
	    ctx.addZuulRequestHeader("Authorization", request.getHeader("Authorization"));
	    log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
	    log.info(String.format("w. headers : %s", request.getHeader("Authorization")));
	
	    return null;
	}

}