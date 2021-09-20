package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("index")
	public String index()
	{
		return "root.index";
	}
	
	
//	@RequestMapping("index")
//	public void index(HttpServletResponse response) throws IOException
//	{
//		PrintWriter out = response.getWriter();
//
//		out.println("Hello Index");
//		
//		//return "root.index";
//	}
	
	
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("root.index");
//		
//		return mv;
//	}

}
