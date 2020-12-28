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

import lombok.Getter;
import lombok.Setter;

@Entity

@Getter

@Setter
public class ChambreEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long idchambre;

	@Column(name ="Numero_de_Chambre",length=50)
	private String numchambre;

	@Column(name ="Type_Chambre",length=50)
	private String typechambre;
	
	@Column(name ="Nombre_De_Lit",length=50)
	private String nbrdelit;
   
	@OneToMany(mappedBy="Chambre" )
	
	private List<ReservationEntity> reservations;

}
