package com.elite.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
public class Commande  extends AuditModel{

	@Column(nullable = false)	
private String produit;
	@Column(nullable = false)
	@Min(value = 1)
private int quantite;
	@Column(nullable = false,columnDefinition = "varchar(50) default 'en attente'")
private String etat;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
}
