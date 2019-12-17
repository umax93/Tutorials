package com.example.demo;





import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/open")
	public ModelAndView open(@RequestParam("t1") int t1,@RequestParam("t2") int t2) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("View");
		mv.addObject("obj", "Vasya");
		
		return mv;
		
	}
	@GetMapping("/")
	public String index( HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		
return "index";
}
	@PostMapping("/add/{t3}")
	public void add(@PathVariable("t3") String t3, HttpServletResponse res) {
		try {
			
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.println("<h1>"+ t3 + " </h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}