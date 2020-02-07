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
@Table(name = "academic_detail")
public class AcademicDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="user_id")
	private Long userId;
	@Column(name="institution_id")
	private Long institutionId;
	@Column(name="year_of_passing")
	private Long yearOfPassing;
	@Column(name="is_pursuing")
	private Boolean isPursuing;
	@Column(name="score")
	private Double score;
}
