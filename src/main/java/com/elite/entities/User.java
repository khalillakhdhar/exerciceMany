package com.elite.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Entity
public class User extends AuditModel{

	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	@Email
private String email;
	@Column(nullable = false)
private String password;
	@Column(nullable = false)
private String grade;
	
private String telephone;
@OneToMany(mappedBy = "user")
private Set<Commande> commandes;
}
