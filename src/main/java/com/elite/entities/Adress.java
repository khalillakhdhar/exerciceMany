package com.elite.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Adress {
@Id
private long id;
	
private String pays;
private String city;
private String zipCode;
private int streetno;
private String roadname;
private int cbnumber;
@OneToOne(optional = false,cascade = CascadeType.ALL)
@MapsId
private User user;
}
