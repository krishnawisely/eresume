/**
 * 
 */
package com.dreambuilders.eresume.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author yaswanth
 *
 */
@Data
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	@Column(name="created_on")
	private LocalDateTime createdOn;
	@Column(name="modified_on")
	private LocalDateTime modifiedOn;
	@Column(name="current_address")
	private String currentAddress;
	@Column(name="permanent_address")
	private String permanentAddress;
}