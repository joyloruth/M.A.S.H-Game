package com.joyloruth.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joyloruth.Models.City;

import com.joyloruth.Services.CityService;

@Controller
public class CityController {
	
	
	@Autowired
	private CityService cityService; 
	
	@RequestMapping("/city")
	public String viewCity(Model model) {
		List<City> listCitys = cityService.listAll();
		model.addAttribute("listCitys", listCitys);
		
		return "cityIndex";
	}
	
	@RequestMapping("/addcity")
	public String showNewCityPage(Model model) {
		City city = new City();
		model.addAttribute("city", city);
		
		return "addCity";
	}
	
	@RequestMapping(value = "/saveCity", method = RequestMethod.POST)
	public String saveCity(@ModelAttribute("city") City city) {
		cityService.save(city);
		
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
