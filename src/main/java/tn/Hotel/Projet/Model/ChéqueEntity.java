package tn.Hotel.Projet.Model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class ChéqueEntity extends PaimentEntity {
	
	public ChéqueEntity(String numChéque, List<FactureEntity> facture) {
		super();
		this.numChéque = numChéque;
		this.facture = facture;
	}
	
	@Column(name ="Numéro_de_chéque",nullable=false,unique=true)
	private String numChéque;
	
	@OneToMany(mappedBy ="ChequeP",cascade = CascadeType.REMOVE)
	private List<FactureEntity> facture;

	


	
    
}
