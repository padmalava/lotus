package com.lotus.ratemylap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lotus.ratemylap.dto.LapRating;

@Transactional(rollbackFor = Exception.class)
public interface ILapRatingService {

	List<LapRating> getLapRating(String lapModel);
	
	String saveLapRating(com.lotus.ratemylap.request.LapRating lapRating);
}
