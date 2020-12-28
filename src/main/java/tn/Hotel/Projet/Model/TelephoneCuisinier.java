package tn.Hotel.Projet.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class TelephoneCuisinier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String number;
	private String operator;
	
	@ManyToOne
	@JsonIgnore
	private CuisinerEntity cuisinier;

}
