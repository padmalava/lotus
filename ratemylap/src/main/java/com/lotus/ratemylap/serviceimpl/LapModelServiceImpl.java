package com.lotus.ratemylap.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.ratemylap.dto.LapModel;
import com.lotus.ratemylap.repository.LapModelRepository;
import com.lotus.ratemylap.service.ILapModelService;
@Service
public class LapModelServiceImpl implements ILapModelService {

	@Autowired
	private LapModelRepository lapRepo;
	
	@Override
	public List<com.lotus.ratemylap.response.LapModel> getAllLapModels() {
		
		Iterable<LapModel> lapModel = lapRepo.findAll();
		
		List<com.lotus.ratemylap.response.LapModel> lapResp = new ArrayList<com.lotus.ratemylap.response.LapModel>();
		
		for (LapModel lapModel2 : lapModel) {
			com.lotus.ratemylap.response.LapModel lapModelResp = new com.lotus.ratemylap.response.LapModel();
			BeanUtils.copyProperties(lapModel2, lapModelResp);
			lapResp.add(lapModelResp);
		}
		
		return lapResp; 
		
	}
	

}
