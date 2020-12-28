package tn.Hotel.Projet.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class ProduitEntity {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    private long Idroduit;
	
	@Column(name ="Quantite")
	private String quantité;
	
	@OneToMany(mappedBy = "produit",cascade = CascadeType.REMOVE)
	private List<FournisseurProduitEntity> fornisseur;
}
