package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/first")
public class HomeController {
	
	//to provide static data
	
	//used with class level annotation
	  @RequestMapping(path="/home",method=RequestMethod.GET) 
	  public String home() 
	  { return "index"; 
	  }
	
		
//		@RequestMapping("/about")
//		public String about() {
//			return "about";
//		}
//		
		//To provide data dynamically
//		@RequestMapping("/home")
//		public String home(Model model) {
//			
//			model.addAttribute("name", "sachin");
//			return "index";
//		}
		
	
	
	//With ModelAndView
	
		@RequestMapping("/help")
		public ModelAndView help() {
			//creating modelandview object
			ModelAndView modelandview=new ModelAndView();
			
			//setting data
			modelandview.addObject("name", "sagar");
			
			//setting view name
			modelandview.setViewName("help");
			
			return modelandview;
			
			
		//passing list of marks
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
}
