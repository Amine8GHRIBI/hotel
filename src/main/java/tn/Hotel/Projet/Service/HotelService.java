package tn.Hotel.Projet.Service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import tn.Hotel.Projet.Model.ChambreEntity;
import tn.Hotel.Projet.Model.ChéqueEntity;
import tn.Hotel.Projet.Model.ClientEntity;
import tn.Hotel.Projet.Model.FactureEntity;
import tn.Hotel.Projet.Model.FournisseurEntity;
import tn.Hotel.Projet.Model.ReservationEntity;
import tn.Hotel.Projet.Model.ReservationWraperEntity;
import tn.Hotel.Projet.repositories.FactureRepositories;

@Service
public interface HotelService  {
	
	public List<FactureEntity> getFactureEntities();	
	public ChéqueEntity CreatePaiementChéque(ChéqueEntity PaiementEntity);
	public ClientEntity CreateClientEntity(ClientEntity client);
	public ClientEntity findById(long id);
	public FournisseurEntity CreateFournisseur(FournisseurEntity PersonneEntity);
	public ChambreEntity AjoutChambreReserver(long id, ChambreEntity chambre);

	
	
	
}