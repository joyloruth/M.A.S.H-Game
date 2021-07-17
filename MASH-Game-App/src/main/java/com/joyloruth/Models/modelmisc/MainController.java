package com.joyloruth.Models.modelmisc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joyloruth.Models.City;
import com.joyloruth.Models.User;
import com.joyloruth.Services.CityService;
import com.joyloruth.Services.UserService;

@Controller("/results")
public class MainController {
	
	
		
		@Autowired
		private UserService userService;
		private CityService cityService;
		
		
		@RequestMapping("/f")
		public String viewResults(Model model) {
			
			//List<User> listUsers = userService.listAll();
			//model.addAttribute("listUsers", listUsers);
			
			//List<City> listCitys = cityService.listAll();
			//model.addAttribute("listCitys", listCitys);
			
			return "NewFile";
		}
		
		/*@RequestMapping("/adduser")
		public String showNewUserPage(Model model) {
			User user = new User();
			model.addAttribute("user", user);
			
			return "adduser";
		}
		
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveUser(@ModelAttribute("user") User user) {
			service.save(user);
			
			//return "redirect:/";
			return "redirect:/addcity";
		}*/
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	     
	  /*  @GetMapping("/register")
	    public String showForm(Model model) {
	        User user = new User();
	        model.addAttribute("user", user);
	         
	        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
	        model.addAttribute("listProfession", listProfession);
	       
	         
	        return "register_form";
	    }
	    
	    @PostMapping("/register")
	    public String submitForm(@ModelAttribute("user") User user) {
	        System.out.println(user);
	        
	        return  "register_success";
	       // return "redirect:/cityregister";
	        
	           }
	    
	    
	    
	    
	    
	    @GetMapping("/cityregister")
	    public String showCityForm(Model model) {
	        City city = new City();
	        model.addAttribute("city", city);
	 
	        return "city_form";
	    }
	    
	    @PostMapping("/cityregister")
	    public String submitCityForm(@ModelAttribute("city") City city) {
	    	
	        System.out.println(city);
	        return  "city_success";}
	        
	  
	        
	        

		@GetMapping("/results")
		public String showAll(Model model) {
			User user = new User();
	        model.addAttribute("user", user);
		    City city = new City();
		    model.addAttribute("city", city);
		
		    return "results_success";
		}

		@PostMapping("/results")
		public String submitAll(@ModelAttribute("city") City city) {
			
		    System.out.println(city);
		    return  "results";
		    
		 } */
	   
		
		 
			
	}	


