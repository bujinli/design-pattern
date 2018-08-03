package com.jeff.desinpattern.chainofresponsibility.filter;

import com.jeff.desinpattern.chainofresponsibility.bean.Request;
import com.jeff.desinpattern.chainofresponsibility.bean.Response;

public interface Filter {

	public void doFilter(Request req, Response resp, Filter filterChain);

}
