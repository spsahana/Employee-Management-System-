package com.sakha.ems.boot.repositor;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sakha.ems.boot.model.Ems;


@Repository
public interface EmsRepo extends JpaRepository<Ems,Integer>{
	@Query("from Ems where emp_id=:empId")
	public Ems getEmployee(int empId);
	
	@Transactional
	@Modifying
	@Query("UPDATE Ems SET salary=:salary WHERE emp_id=:empId")
	public void updateEmployee(int empId, float salary);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Ems WHERE emp_id=:empId")
	public int deleteEmployee(int empId);

}
