package com.jeff.desinpattern.chainofresponsibility.filter;

import com.jeff.desinpattern.chainofresponsibility.bean.Request;
import com.jeff.desinpattern.chainofresponsibility.bean.Response;

public class PostfixFilter implements Filter {

	@Override
	public void doFilter(Request req, Response resp, Filter filterChain) {
		
		
		System.out.println("PostfixFilter");
		req.setRequest(req.getRequest()+" + postfix");
		
		filterChain.doFilter(req, resp, filterChain);
		
	}

}
