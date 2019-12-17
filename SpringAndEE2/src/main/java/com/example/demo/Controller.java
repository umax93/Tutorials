package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.transform.impl.AddDelegateTransformer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fasterxml.jackson.core.sym.Name;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	Repository rep;
//	@Autowired
//	User usr;
	
	@RequestMapping(value= {"home","jjj"})
	public String home(@RequestParam("t1") String t1, HttpSession s) {
		s.setAttribute("param1", t1);
		return "home";
	}
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	@PostMapping("/add")
	public String Adddata(@RequestParam("t2") String name,@RequestParam("t3") String surname,User usr) {
		usr.setName(name);
		usr.setSurname(surname);
		
		rep.save(usr);
		
		return "home";
		
	}

}
