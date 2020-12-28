package tn.Hotel.Projet.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public abstract class PaimentEntity {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="Code_Paiement")
    private long CodePaiement;
	
	private LocalDate DatePaiement; 
	


}
