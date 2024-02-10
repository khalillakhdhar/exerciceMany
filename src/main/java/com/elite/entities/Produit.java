package com.elite.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Positive;
import lombok.Data;
@Entity
@Data
public class Produit  extends AuditModel{
	@Column(nullable = false)
private String titre,description;
	
private String photo;
@Column(nullable = false)
@Positive
private double prix;
@ManyToOne(optional = false,fetch = FetchType.LAZY)
@JoinColumn(referencedColumnName = "categorie",name = "categorie")
private Categorie categorie;
}
