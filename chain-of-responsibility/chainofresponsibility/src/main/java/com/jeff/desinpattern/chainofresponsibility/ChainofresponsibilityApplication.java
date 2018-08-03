package com.jeff.desinpattern.chainofresponsibility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jeff.desinpattern.chainofresponsibility.bean.Request;
import com.jeff.desinpattern.chainofresponsibility.bean.Response;
import com.jeff.desinpattern.chainofresponsibility.filter.FilterChain;
import com.jeff.desinpattern.chainofresponsibility.filter.PostfixFilter;
import com.jeff.desinpattern.chainofresponsibility.filter.PrefixFilter;

@SpringBootApplication
public class ChainofresponsibilityApplication {

	public static void main(String[] args) {

		runFilter();

		SpringApplication.run(ChainofresponsibilityApplication.class, args);
	}

	private static void runFilter() {

		FilterChain chain = new FilterChain();

		chain.register(new PrefixFilter());
		chain.register(new PostfixFilter());

		Request req = new Request();
		chain.doFilter(req, new Response(), chain);

		System.out.println(req.getRequest());
	}

}
