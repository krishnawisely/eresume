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
@Table(name = "projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	@Column(name="user_id")
	 private Long userId;
	@Column(name="name")
	 private String name;
	@Column(name="started_on")
	 private LocalDateTime startedOn; 
	@Column(name="completed_on")
	 private LocalDateTime completedOn;
}
