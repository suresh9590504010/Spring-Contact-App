package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.command.LoginCommand;

@Controller
public class UserController {

	@RequestMapping(value= {"/","/index"})
	public String index(Model m) {
		m.addAttribute("command", new LoginCommand());
		return "index";//jsp - /WEB-INF/view/index.jsp
		
	}
	
	@RequestMapping(value= {"/user/dashboard"})
	public String UserDashboard() {
		return "dashboard_user";//jsp - /WEB-INF/view/index.jsp
		
	}
	
	@RequestMapping(value= {"/admin/dashboard"})
	public String AdminDashboard() {
		return "dashboard_admin";//jsp - /WEB-INF/view/index.jsp
		
	}
}
