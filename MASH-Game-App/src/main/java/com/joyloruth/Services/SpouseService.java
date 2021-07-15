package com.joyloruth.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joyloruth.Models.Spouse;
import com.joyloruth.Repos.SpouseRepository;



@Service
@Transactional
public class SpouseService {
	
	@Autowired
	private SpouseRepository spouseRepo;
	
	public List<Spouse> listAll() {
		return spouseRepo.findAll();
	}
	
	public void save(Spouse spouse) {
		spouseRepo.save(spouse);
	}
	
	public Spouse get(long spouseid) {
		
		return spouseRepo.findById(spouseid).get();
	}
	
	public void delete(long spouseid) {
		spouseRepo.deleteById(spouseid);
	}
	
	
	

}
