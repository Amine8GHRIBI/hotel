package tn.Hotel.Projet.Model;

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
public class CommandEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int Id;

	@Column(name =" Numéro_Commande")
	private String NumCom;
    
	@ManyToOne
    private PlatEntity plat;
	
	@ManyToOne
    private ClientEntity client;
	

}  
