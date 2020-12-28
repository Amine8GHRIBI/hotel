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
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class PromotionEntity {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    private long idpromotion;
	
	@Column(name="Date_debut_promotion")
	private LocalDate datedeb;
	
	@Column(name="Date_Fin_promotion")
	private LocalDate datefin;
	private String type;
	
	@ManyToMany(mappedBy="promotion" , cascade=CascadeType.REMOVE)
	private List<ReservationEntity> reservations;
	
	
}
