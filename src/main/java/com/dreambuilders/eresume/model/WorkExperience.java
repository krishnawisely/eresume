package com.dreambuilders.eresume.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "work_experience")
public class WorkExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	@Column(name="user_id")
	 private Long userId;
	@Column(name="company_name")
	 private String companyName;
	@Column(name="joined_on")
	 private LocalDateTime joinedOn;
	@Column(name="leaved_on")
	 private LocalDateTime leavedOn;
	@Column(name="designation")
	 private String designation;
	 
}