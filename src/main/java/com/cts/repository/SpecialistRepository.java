package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.entity.Specialist;

@Repository
public interface SpecialistRepository extends CrudRepository<Specialist,Integer> {
	
	@Query
	List<Specialist> findByName(@Param(value= "specialistName") String specialistName);
		
}
