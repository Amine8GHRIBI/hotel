package tn.Hotel.Projet.Model;

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
@Data
public class ClientEntity extends PersonneEntity{
	
	
	@Column(name ="Pseudo_client", length=50)
	private String pseudoclient;
	@Column(name ="Mot_de_passe_client", length=50)
    private String motdepasseclient;
	
	
	
	@OneToMany(mappedBy = "client",cascade = CascadeType.REMOVE)
	private List<TelephoneClient> TelephonesClient;
	
	@OneToMany(mappedBy = "client",cascade = CascadeType.REMOVE)
     private List<CommandEntity> commande;
	
	
	@OneToMany(mappedBy="Client",cascade = CascadeType.REMOVE)
	private List<ReservationEntity> reservations;
     
}
