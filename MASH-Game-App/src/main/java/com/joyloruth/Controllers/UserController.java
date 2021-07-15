package com.joyloruth.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.joyloruth.Models.User;
import com.joyloruth.Services.UserService;










@Controller("/user")
public class UserController {
	
	@Autowired
	private UserService service; 
	
	
	@RequestMapping("/")
	public String viewUser(Model model) {
		List<User> listUsers = service.listAll();
		model.addAttribute("listUsers", listUsers);
		
		return "index";
	}
	
	@RequestMapping("/adduser")
	public String showNewUserPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		return "adduser";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		service.save(user);
		
		return "redirect:/";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
     
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
		
    
///////////////////////////////////////////////////////////////////////////////////////////////////////    
   /* @PostMapping("/results")
    public String submitForm(@ModelAttribute("city") City city,@ModelAttribute("user") User user) {
        System.out.println(city);
        System.out.println(user);
        return "register_success";
    }*/
    
  /*  @PostMapping("/results")
    public String submitCityForm(@ModelAttribute("city") City city) {
        System.out.println(city);
        return "redirect:/register"; }*/
    
    
    

    
     
    
