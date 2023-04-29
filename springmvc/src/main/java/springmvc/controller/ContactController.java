package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
	m.addAttribute("Header","learn coding");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
	
	
	
	
	/*@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}*/
		
		
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	/*public String handleForm(@RequestParam("email") String email,
			@RequestParam("userName") String userName,
			@RequestParam("password") String userPassword,Model model) {
		
		System.out.println(email);
		System.out.println(userName);
		System.out.println(userPassword);
		
		model.addAttribute("name",userName);
		model.addAttribute("email",email);
		model.addAttribute("password",userPassword);
		*/ 
		
	
	public String handleForm(@ModelAttribute("user")User user,Model model) {
	this.userService.createUser(user);
	return "success";
	}
	
}
