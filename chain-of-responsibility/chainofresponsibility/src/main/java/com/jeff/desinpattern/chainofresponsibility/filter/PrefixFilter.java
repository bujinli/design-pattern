package com.jeff.desinpattern.chainofresponsibility.filter;

import com.jeff.desinpattern.chainofresponsibility.bean.Request;
import com.jeff.desinpattern.chainofresponsibility.bean.Response;

public class PrefixFilter implements Filter {

	@Override
	public void doFilter(Request req, Response resp, Filter filterChain) {

		System.out.println("PrefixFilter ");
		req.setRequest("prefix + " + req.getRequest());

		filterChain.doFilter(req, resp, filterChain);
	}

}
