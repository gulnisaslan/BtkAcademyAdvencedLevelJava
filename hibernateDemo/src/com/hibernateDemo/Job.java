package com.hibernateDemo;

import javax.persistence.*;

@Entity
@Table(name="jobs")
public class Job {
	
	@Id
	@Column(name="job_id")
	private int jobId;
	@Column(name="job_title")
	private String jobTitle;
	@Column(name="min_salary")
	private double minSalary;
	@Column(name="max_salary")
	private double maxSalary;
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}
	public double getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

}
