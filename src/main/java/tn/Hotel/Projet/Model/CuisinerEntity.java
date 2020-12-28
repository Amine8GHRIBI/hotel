package tn.Hotel.Projet.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class CuisinerEntity extends PersonneEntity{
	
	
	@Column(name ="pseudo_cuisinier", length=50)
	private String pseudocuisinier;
	
	@Column(name ="Mot_De_Passe_Cuisinier", length=50,unique=true)

	private String motdepassecuisinier;
	
	
	
	@OneToMany(mappedBy = "cuisinier",cascade = CascadeType.REMOVE)
	private List<TelephoneCuisinier> TelephoneCuisinier;

}
