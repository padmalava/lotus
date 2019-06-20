package com.lotus.ratemylap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lotus.ratemylap.request.LapRating;
import com.lotus.ratemylap.service.ILapModelService;
import com.lotus.ratemylap.service.ILapRatingService;

@RestController
@RequestMapping("/mylap/")
public class RateMyLapController {

	@Autowired
	private ILapModelService lapModelService;
	@Autowired
	private ILapRatingService lapRatingService;
	
	@GetMapping(value = "/getAllLaps",produces="application/json")
	public List<com.lotus.ratemylap.response.LapModel> getLapList(){
		
		List<com.lotus.ratemylap.response.LapModel> lapList = lapModelService.getAllLapModels();
		
		return lapList;
	}
	
	@PostMapping("/rateLap")
	public String rateLap(@RequestBody LapRating lapRate) {
		
		String msg = lapRatingService.saveLapRating(lapRate);
		
		return msg;
	}
}
