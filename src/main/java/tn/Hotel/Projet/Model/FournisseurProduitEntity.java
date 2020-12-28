package tn.Hotel.Projet.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FournisseurProduitEntity{
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    private long IdFournisseur;
	
	@ManyToOne
	private FournisseurEntity fornisseur;
	
	@ManyToOne
	private ProduitEntity produit;
	
	

}
