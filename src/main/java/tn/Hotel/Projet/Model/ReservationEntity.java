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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Data

public class ReservationEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    private long idresevation;
	
    private LocalDate datereservation;

	@Column(name ="Type_de_reservation",length=50)
    private String typereservation;
    
    @ManyToOne
    @JsonIgnore
    private ChambreEntity Chambre;

    @ManyToOne
    @JsonIgnore
    private ClientEntity Client;
    
    @ManyToOne
    private FactureEntity facture;
    
    @ManyToMany
    @JoinTable(name="réservation_promotionnée")
    private List<PromotionEntity> promotion;
    
}
