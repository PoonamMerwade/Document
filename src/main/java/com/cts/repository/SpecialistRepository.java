package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Specialist;

@Repository
public interface SpecialistRepository extends CrudRepository<Specialist,Integer> {
	
	@Query
	List<Specialist> findByType(String type);

	@Query(value="SELECT * from specialist s WHERE s.type=:type AND s.availableDay=:availableDay AND s.availableTime=:availableTime", nativeQuery=true)
	List<Specialist> isSpecialistAvailable(String type, String availableDay, String availableTime);

//	@Query(value="SELECT * from hospital h where h.specialistId=:specialistId AND h.type=:type",nativeQuery=true)
//	List<Specialist> checkSpecialistByHospitalName(String hospitalName, String type);
		
}
