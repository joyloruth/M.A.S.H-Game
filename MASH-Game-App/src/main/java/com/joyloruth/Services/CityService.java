package com.joyloruth.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joyloruth.Models.City;
import com.joyloruth.Repos.CityRepository;


	
	@Service
	@Transactional
	public class CityService {
		
		
		@Autowired
		private CityRepository cityRepo;
		
		public List<City> listAll() {
			return cityRepo.findAll();
		}
		
		public void save(City city) {
			cityRepo.save(city);
		}
		
		public City get(long cityid) {
			
			return cityRepo.findById(cityid).get();
		}
		
		public void delete(long cityid) {
			cityRepo.deleteById(cityid);
		}
		
		
		

}
