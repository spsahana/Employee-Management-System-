package com.sakha.ems.boot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Ems {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empId;
	String empName;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	LocalDate dob;
	float salary;
	String generatedId;
	public String getGeneratedId() {
		return generatedId;
	}
	public void setGeneratedId(String generatedId) {
		this.generatedId = generatedId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Ems [empId=" + empId + ", empName=" + empName + ", dob=" + dob + ", salary=" + salary + ", generatedId="
				+ generatedId + "]";
	}
	public Ems(String empName, LocalDate dob, float salary) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.salary = salary;
	}
	public Ems() {
//		super();
		// TODO Auto-generated constructor stub
	}
	
}
