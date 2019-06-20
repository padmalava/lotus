package com.lotus.ratemylap.repository;

import org.springframework.data.repository.CrudRepository;

import com.lotus.ratemylap.dto.LapRating;

public interface LapRatingRepository extends CrudRepository<LapRating, Integer> {

}
