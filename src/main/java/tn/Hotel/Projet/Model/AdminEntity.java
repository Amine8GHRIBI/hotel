package tn.Hotel.Projet.Model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Entity;

import lombok.Data;
@Data
@Entity
public class AdminEntity extends PersonneEntity{
	
	
	@Column(name ="Pseudo_Admin", length=50)
	private String pseudoAdmin;
	@Column(name ="Mot_de_passe_Admin")
	private String motdepasseAdmin;
	
	
	@OneToMany(mappedBy = "admin" , cascade = CascadeType.REMOVE)
	private List<TelephoneAdmin> telephone;

}
