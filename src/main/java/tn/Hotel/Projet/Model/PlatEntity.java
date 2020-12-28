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
public class PlatEntity {
    
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int Id;

	@Column(name =" Nom_plat")
	private String nom;

	@OneToMany(mappedBy ="plat",cascade = CascadeType.REMOVE)
	private List<CommandEntity> Commande;
	
}
