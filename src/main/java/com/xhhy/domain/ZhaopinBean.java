package com.xhhy.domain;

public class ZhaopinBean {
	private int zhaopinId;
	private int dept_id;
	private String zhaopinType;
	private int zhaopinNum;
	private String job_id;
	private String dengjiren;
	private String startTime;
	private String endTime;
	private String jobmiaoshu;
	private String yaoqiu;
	
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id	) {
		this.dept_id = dept_id;
	}
	public String getZhaopinType() {
		return zhaopinType;
	}
	public void setZhaopinType(String zhaopinType) {
		this.zhaopinType = zhaopinType;
	}
	public int getZhaopinNum() {
		return zhaopinNum;
	}
	public void setZhaopinNum(int zhaopinNum) {
		this.zhaopinNum = zhaopinNum;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getDengjiren() {
		return dengjiren;
	}
	public void setDengjiren(String dengjiren) {
		this.dengjiren = dengjiren;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getJobmiaoshu() {
		return jobmiaoshu;
	}
	public void setJobmiaoshu(String jobmiaoshu) {
		this.jobmiaoshu = jobmiaoshu;
	}
	public String getYaoqiu() {
		return yaoqiu;
	}
	public void setYaoqiu(String yaoqiu) {
		this.yaoqiu = yaoqiu;
	}
	public int getZhaopinId() {
		return zhaopinId;
	}
	public void setZhaopinId(int zhaopinId) {
		this.zhaopinId = zhaopinId;
	}
	@Override
	public String toString() {
		return "ZhaopinBean [zhaopinId=" + zhaopinId + ", dept_id=" + dept_id + ", zhaopinType=" + zhaopinType
				+ ", zhaopinNum=" + zhaopinNum + ", job_id=" + job_id + ", dengjiren=" + dengjiren + ", startTime="
				+ startTime + ", endTime=" + endTime + ", jobmiaoshu=" + jobmiaoshu + ", yaoqiu=" + yaoqiu + "]";
	}
	
		
	
}
