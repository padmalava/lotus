package com.lotus.ratemylap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


@Transactional(rollbackFor = Exception.class)
public interface ILapModelService {

	
	List<com.lotus.ratemylap.response.LapModel> getAllLapModels();
	
}
