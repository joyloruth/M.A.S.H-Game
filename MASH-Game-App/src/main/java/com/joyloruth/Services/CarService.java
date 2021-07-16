package com.joyloruth.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joyloruth.Models.Car;
import com.joyloruth.Repos.CarRepository;

@Service
@Transactional
public class CarService {
	
	@Autowired
	private CarRepository carRepo;
	
	public List<Car> listAll() {
		return carRepo.findAll();
	}
	
	public void save(Car car) {
		carRepo.save(car);
	}
	
	public Car get(long carid) {
		
		return carRepo.findById(carid).get();
	}
	
	public void delete(long carid) {
		carRepo.deleteById(carid);
	}

}
