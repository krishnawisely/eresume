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
@Table(name = "hobbies")
public class Hobbie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	@Column(name="user_id")
	  private Long userId;
	@Column(name="hobby")
	private String hobby;

}
