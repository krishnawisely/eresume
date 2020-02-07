package com.dreambuilders.eresume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "projects_with_technologies")
public class ProjectWithTechnologie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	@Column(name="project_id")
	 private Long projectId;
	@Column(name="technology_id")
	 private Long technologyId;
}