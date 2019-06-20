package com.lotus.ratemylap.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lapmodel")
public class LapModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LAPMODELID")
	private Integer lapmodelId;
	@Column(name = "LAPMODELNAME")
	private String lapmodelName;
	@Column(name = "LAPMODELDESC")
	private String lapmodelDesc;
	
	
	public Integer getLapmodelId() {
		return lapmodelId;
	}
	public void setLapmodelId(Integer lapmodelId) {
		this.lapmodelId = lapmodelId;
	}
	public String getLapmodelName() {
		return lapmodelName;
	}
	public void setLapmodelName(String lapmodelName) {
		this.lapmodelName = lapmodelName;
	}
	public String getLapmodelDesc() {
		return lapmodelDesc;
	}
	public void setLapmodelDesc(String lapmodelDesc) {
		this.lapmodelDesc = lapmodelDesc;
	}
	
	
	
}
