package com.joyloruth.Models.modelmisc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

	
	@Service
	@Transactional
	public class ChildrenService {
		
		
		@Autowired
		private ChildrenRepository repo;
		
		public List<Children> listAll() {
			return repo.findAll();
		}
		
		public void save(Children children) {
			repo.save(children);
		}
		
		public Children get(long childrenid) {
			return repo.findById(childrenid).get();
		}
		
		public void delete(long childrenid) {
			repo.deleteById(childrenid);
		}
		
		

}
