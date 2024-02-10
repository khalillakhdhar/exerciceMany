package com.elite.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Book extends AuditModel {
	private String titre,description;
	private double prix;
	@ManyToMany(mappedBy = "books")
	private Set<Author> authors;
	

}
