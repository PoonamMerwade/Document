package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.entity.Hospital;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {

	@Query
	List<Hospital> getBeds(@Param(value= "bedsAvailable") int bedsAvailable);
}
