package tn.Hotel.Projet.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class FournisseurEntity extends PersonneEntity{
	
	
	@Column(name ="Pseudo_fournisseur", length=50,unique=true)
	private String pseudofournisseur;
	@Column(name ="Mot_De_Passe_Fournisseur", length=50,unique=true)
	private String motdepasse;
	
	@OneToMany(mappedBy = "fournisseur",cascade = CascadeType.REMOVE)
	private List<fournisseurTelephone> Telephonefournisseur;
	
	@OneToMany(mappedBy="fornisseur",cascade = CascadeType.REMOVE)
	private List<FournisseurProduitEntity> fornisseurproduit; 
	
	
	
	

}
