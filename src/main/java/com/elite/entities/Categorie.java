package com.elite.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Categorie  extends AuditModel{

	@Column(nullable = false,unique = true)
	private String categorie;
}
