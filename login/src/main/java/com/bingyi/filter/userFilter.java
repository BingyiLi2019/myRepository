package com.bingyi.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.bingyi.util.MD5;

public class userFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		if (name!=null && !name.equals("") && pwd!=null && !pwd.equals("")) {			
			chain.doFilter(req, resp);
		}else {		
			req.getRequestDispatcher("index").forward(req, resp);
		}
		System.out.println("Ö´ÐÐ¹ýÂËÆ÷");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
