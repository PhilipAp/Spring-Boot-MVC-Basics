package com.philip.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.philip.model.User;
import com.philip.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String registerPage() {
		return "register";
	}
	
	
	@PostMapping(value="/registerSuccess")
	public ModelAndView registerSuccess(@Valid @RequestParam Map<String, String> requestMap) {
		User user = new User(requestMap.get("name"), Integer.parseInt(requestMap.get("age")), requestMap.get("email"), requestMap.get("country"));
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("user", user/*userService.registerSuccess()*/);
		return modelAndView;
	}

	/*@PostMapping(value="/registerSuccess")
	public ModelAndView registerSuccess(@RequestParam("name") String name, @RequestParam(required=false,name="email") String email,
			                            @RequestParam(defaultValue="Ghana",name="country") String country, @RequestParam("age") Integer age ) {
		User user = new User(name, age, email, country);
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("user", user);
		return modelAndView;
		
	}*/
	
	
	/*@RequestMapping(value="/someController")
	public String welcomePage(Model model) {
		model.addAttribute("userList", userService.getUserList());
		model.addAttribute("employeeList", employeeService.getEmployeeList());
		return "welcomePage";
		
	}*/
	
	/*@RequestMapping(value="/someController")
	public String welcomePage(Map<String, Object> map) {
		map.put("userList", userService.getUserList());
		map.put("employeeList", employeeService.getEmployeeList());
		return "welcomePage";
		
	}*/
	
	/*@PostMapping(value="/registerSuccess")
	public ModelAndView registerSuccess(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		Integer age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User user = new User(name, age, email, country);
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("user", user);
		return modelAndView;
		
	}
*/
}
