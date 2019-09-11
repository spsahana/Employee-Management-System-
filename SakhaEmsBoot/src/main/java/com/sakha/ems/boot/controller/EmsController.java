package com.sakha.ems.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import com.sakha.ems.boot.model.Ems;
import com.sakha.ems.boot.service.EmsService;

@Controller
public class EmsController{
	@Autowired
	EmsService service;
	@PostMapping("/add")
	public String save(@ModelAttribute Ems emp,Model m) throws Exception {
		Ems saveemp=service.save(emp);
		m.addAttribute("emp",saveemp);
		return "save";
	}
	
	@GetMapping("/get")
	public String getEmployee(@RequestParam("empId") int empId,Model m) {
		Ems getemp=service.getEmployee(empId);
		m.addAttribute("emp",getemp);
		return "getview";
	}
	@PostMapping("/update")
	public String updateEmployee(@RequestParam("empId") int empId,@RequestParam("salary") float salary,Model m) {
		service.updateEmployee(empId,salary);
		return "updateview";
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(@RequestParam("empId")int empId,Model m) {
		int i=service.deleteEmployee(empId);
		return "deletesuccess";
//		if(i>0) {
//			return "deletesuccess";
//		}
//		else
//			return "deletefailure";
	}
	
	@GetMapping("/getall")
	public String getAll(Model m) {
		List<Ems> getall=service.getAll();
		m.addAttribute("getall",getall);
		return "getall";
		}
//	@GetMapping("/employees")
//	public List<Ems> getAllEmployees() throws Exception{
//		return service.getAll();
//	}
//	
//	@DeleteMapping("/employees/{empId}")
//	public int deleteEmployee(@PathVariable("empId") int empId) {
//		return service.deleteEmployee(empId);
//	}
//	@PostMapping("/employee")
//	public Ems saveEmployees(@RequestBody Ems emp) throws Exception {
//		return service.save(emp);
//	}
//	@GetMapping("/employees/{empId}")
//	public Ems getEmployee(@PathVariable("empId") int empId) {
//		return service.getEmployee(empId);
//	}
//	
//	@PutMapping("/employeeupdate")
//	public Ems updateEmployee(@RequestBody Ems emp) {
//		return service.updateEmployee(emp);
//	}
	
	
	
}
