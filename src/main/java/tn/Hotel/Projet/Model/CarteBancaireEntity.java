package tn.Hotel.Projet.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Carte_Table")

public class CarteBancaireEntity extends PaimentEntity {
	public CarteBancaireEntity(List<FactureEntity> facture) {
		super();
		this.facture = facture;
	}
     
	
	
	private String Numero_Carte;
	
	@OneToMany(mappedBy ="CarteP",cascade = CascadeType.REMOVE,orphanRemoval = true)
	private List<FactureEntity> facture;

	
}
