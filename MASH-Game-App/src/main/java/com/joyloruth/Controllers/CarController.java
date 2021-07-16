package com.joyloruth.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joyloruth.Models.Car;
import com.joyloruth.Services.CarService;

@Controller
public class CarController {
	
	@Autowired
	private CarService carService; 
	
	@RequestMapping("/car")
	public String viewCar(Model model) {
		List<Car> listCars = carService.listAll();
		model.addAttribute("listCars", listCars);
		
		return "carIndex";
	}
	
	@RequestMapping("/addcar")
	public String showNewCarPage(Model model) {
		Car car = new Car();
		model.addAttribute("car", car);
		
		return "addCar";
	}
	
	@RequestMapping(value = "/saveCar", method = RequestMethod.POST)
	public String saveCar(@ModelAttribute("car") Car car) {
		carService.save(car);
		
		return "redirect:/addcar";
	}
	

	
}
