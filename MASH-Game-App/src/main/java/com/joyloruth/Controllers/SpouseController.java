package com.joyloruth.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joyloruth.Models.Spouse;
import com.joyloruth.Services.SpouseService;


@Controller
public class SpouseController {
	
	@Autowired
	private SpouseService spouseService; 
	
	@RequestMapping("/spouse")
	public String viewSpouse(Model model) {
		List<Spouse> listSpouses = spouseService.listAll();
		model.addAttribute("listSpouses", listSpouses);
		
		return "spouseIndex";
	}
	
	@RequestMapping("/addspouse")
	public String showNewSpousePage(Model model) {
		Spouse spouse = new Spouse();
		model.addAttribute("spouse", spouse);
		
		return "addSpouse";
	}
	
	@RequestMapping(value = "/saveSpouse", method = RequestMethod.POST)
	public String saveSpouse(@ModelAttribute("spouse") Spouse spouse) {
		spouseService.save(spouse);
		
		return "redirect:/";
	}
	

}
