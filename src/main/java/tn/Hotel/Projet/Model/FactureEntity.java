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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class FactureEntity {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="Id_Facture")
	private long idFact;
	
	private LocalDate date_Facture;
	
	private String Prix_totale;
	
	private String tva;
	
	@ManyToOne
	@JsonIgnore
	private CarteBancaireEntity CarteP;
	
	@ManyToOne
	@JsonIgnore
	 private ChéqueEntity ChequeP;
	
	@OneToMany(mappedBy="facture",cascade = CascadeType.REMOVE)
	private List<ReservationEntity> reservations; 
	
}
