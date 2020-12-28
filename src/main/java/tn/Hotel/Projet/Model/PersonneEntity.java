package tn.Hotel.Projet.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public abstract class PersonneEntity  {

   
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long Id;
	
	@Column(name =" Nom_Personne")
	private String nom;
	private String prenom;
	private String mail;	

}
