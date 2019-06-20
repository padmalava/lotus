package com.lotus.ratemylap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lotus.ratemylap.dto.LapModel;

public interface LapModelRepository extends CrudRepository<LapModel, Integer> {

	@Query("from LapModel lp")
	List<com.lotus.ratemylap.response.LapModel> getAllLap();

}
