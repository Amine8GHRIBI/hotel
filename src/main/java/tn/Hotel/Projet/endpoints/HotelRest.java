/*package tn.Hotel.Projet.endpoints;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.Hotel.Projet.Model.ChambreEntity;
import tn.Hotel.Projet.Model.ChéqueEntity;
import tn.Hotel.Projet.Model.ClientEntity;
import tn.Hotel.Projet.Model.FactureEntity;
import tn.Hotel.Projet.Model.FournisseurEntity;
import tn.Hotel.Projet.Model.ReservationEntity;
import tn.Hotel.Projet.Model.ReservationWraperEntity;
import tn.Hotel.Projet.Service.HotelService;

@RestController
@RequestMapping("/api/hotel")
public class HotelRest {
	private HotelService service;

	@Autowired
	public HotelRest(HotelService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	 public List<FactureEntity> getFacture(){
		return service.getFactureEntities();
	}

	@PostMapping("/cheque")
	 public  ChéqueEntity CreatePaiementChéque(@RequestBody ChéqueEntity cheque ) {
		return service.CreatePaiementChéque(cheque);
	 }
	
	@PostMapping("/client")
	 public ClientEntity CreateClient(@RequestBody ClientEntity client) {
		return service.CreateClientEntity(client);
		
	}
	
    @PutMapping("/Chambre/{id}")
     public ChambreEntity  AjoutChambreReservesr(@PathVariable("id")long id ,@RequestBody ChambreEntity chambre) {
            return service.AjoutChambreReserver(id, chambre);
    }
    
    @PostMapping("/fournisseur")
    public FournisseurEntity CreateFournisseur(@RequestBody FournisseurEntity PersonneEntity) {
         return service.CreateFournisseur(PersonneEntity);	
    }
		
}*/
    
	

