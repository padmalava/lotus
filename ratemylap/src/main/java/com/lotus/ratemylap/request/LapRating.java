package com.lotus.ratemylap.request;

public class LapRating {

	private Integer lapratingId;
	private Integer lapmodelId;
	private Integer laprating;
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
