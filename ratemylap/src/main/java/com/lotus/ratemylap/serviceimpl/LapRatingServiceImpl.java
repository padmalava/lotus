package com.lotus.ratemylap.serviceimpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.ratemylap.dto.LapRating;
import com.lotus.ratemylap.repository.LapRatingRepository;
import com.lotus.ratemylap.service.ILapRatingService;
import com.lotus.ratemylap.util.AppConstant;
@Service
public class LapRatingServiceImpl implements ILapRatingService {
	
	@Autowired
	private LapRatingRepository lapRatingRepo;
	
	@Override
	public List<LapRating> getLapRating(String lapModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveLapRating(com.lotus.ratemylap.request.LapRating lapRating) {
		
		LapRating lapRateDto = new LapRating();
		BeanUtils.copyProperties(lapRating, lapRateDto);
		
		LapRating savedDto= lapRatingRepo.save(lapRateDto);
		
		if(savedDto!= null) {
			return AppConstant.CREATE_SUCCESS;
		}
		
		
		return AppConstant.CREATE_FAILED;
	}

}
