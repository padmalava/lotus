package com.lotus.ratemylap.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laprating")
public class LapRating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LAPRATINGID")
	private Integer lapratingId;
	@Column(name = "LAPMODELID")
	private Integer lapmodelId;
	@Column(name = "LAPRATING")
	private Integer laprating;
	@Column(name = "LAPRATINGCMT")
	private String lapratingDesc;
	
	
	public Integer getLapratingId() {
		return lapratingId;
	}
	public void setLapratingId(Integer lapratingId) {
		this.lapratingId = lapratingId;
	}
	public Integer getLapmodelId() {
		return lapmodelId;
	}
	public void setLapmodelId(Integer lapmodelId) {
		this.lapmodelId = lapmodelId;
	}
	public Integer getLaprating() {
		return laprating;
	}
	public void setLaprating(Integer laprating) {
		this.laprating = laprating;
	}
	public String getLapratingDesc() {
		return lapratingDesc;
	}
	public void setLapratingDesc(String lapratingDesc) {
		this.lapratingDesc = lapratingDesc;
	}
	
	
	
	
}
