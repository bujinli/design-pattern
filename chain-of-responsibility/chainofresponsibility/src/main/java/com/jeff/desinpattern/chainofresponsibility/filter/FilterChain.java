package com.jeff.desinpattern.chainofresponsibility.filter;

import java.util.ArrayList;
import java.util.List;

import com.jeff.desinpattern.chainofresponsibility.bean.Request;
import com.jeff.desinpattern.chainofresponsibility.bean.Response;

public class FilterChain implements Filter {

	List<Filter> filterList = new ArrayList();

	int index = -1;

	public void register(Filter filter) {
		filterList.add(filter);
	}

	@Override
	public void doFilter(Request req, Response resp, Filter filterChain) {

		index++;
		if (this.index == filterList.size()) {
			return;
		}

		else {
			filterList.get(index).doFilter(req, resp, this);
		}

	}

}
