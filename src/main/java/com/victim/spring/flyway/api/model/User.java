package com.victim.spring.flyway.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "REGISTRATION_USERS")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String first_name;
	private String last_name;
	private String email;
	private String mobile;
}
