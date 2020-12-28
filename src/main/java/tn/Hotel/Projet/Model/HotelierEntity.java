package tn.Hotel.Projet.Model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Entity
@Setter
@Table(name="Hotelier_Table")
public class HotelierEntity extends PersonneEntity {
	
	
	@Column(name ="Pseudo_Admin_Hotelier", length=50,unique=true)
	private String pseudAdmin;
	@Column(name ="Mot_De_Passe_Hotelier", length=50,unique=true)
	private String motdepasseAdmin;

	@OneToMany(mappedBy = "hotelier",cascade = CascadeType.REMOVE)
	private List<TelephoneHotelerie> Telephone;
    
    
}
