package com.elite.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Author extends AuditModel {
private String nom;
private String telephone;
private String domaine;
@ManyToMany(cascade = CascadeType.ALL) 

private Set<Book> books;
}
