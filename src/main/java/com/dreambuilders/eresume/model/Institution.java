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
@Table(name = "institution")
public class Institution {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id; 
	@Column(name="name")
	 private String name;
	
}