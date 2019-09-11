package com.sakha.ems.boot.service;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.ems.boot.model.Ems;
import com.sakha.ems.boot.repositor.EmsRepo;

@Service
public class EmsService {
	
	
	@Autowired
	EmsRepo repo;
	public Ems save(Ems emp) throws Exception {
		emp.setGeneratedId(generateId(emp.getEmpName()));
		return repo.save(emp);
	}
	
	public Ems getEmployee(int empId) {
		return repo.getEmployee(empId);
	}
	
	
	
	public void updateEmployee(int empId,float salary) {
		repo.updateEmployee(empId, salary);
	}
	
	@Transactional
	public int deleteEmployee(int empId) {
		return repo.deleteEmployee(empId);
		
	}
	public String generateId(String empname) throws Exception {
		String namechar = empname.substring(0,2).toUpperCase();
		Random rand = new Random();
		int dgt = (int)(rand.nextDouble()*10000);
		return namechar+dgt;
	}
	public List<Ems> getAll() {
		List<Ems> empall=repo.findAll();
		return empall;
	}


}
