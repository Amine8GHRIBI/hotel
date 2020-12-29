package tn.Hotel.Projet.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.Hotel.Projet.Model.*;
import tn.Hotel.Projet.repositories.*;

@Service
public class HotelServiceImp1 implements HotelService {
	
	
	@Autowired
    private FactureRepositories reposFacture;
	private ChequeRepositories reposCheque;
	private CarteRepositories  reposCarte;
    private PersonneRepositories reposPersonne;
    private FournisseurrRepositories reposFournisseur;
    private FournisseurProduitRepositories reposFournisseurProduit;
    private  ProduitRepositories reposProduit;
    private HotelierRepositories reposHotelier;
    private TelhotelierRepositories reposTelhotelier;
    private ChambreRepositories reposChambre;
    private ClientRepositories  reposClient;
    private ReservationRepositories reposReserv;
    private TelClientRepositories reposTelClient;
     
    public HotelServiceImp1( FactureRepositories reposFacture,ChequeRepositories reposCheque ,CarteRepositories reposCarte,FournisseurrRepositories reposFournisseur,
    		ProduitRepositories reposProduit ,TelhotelierRepositories reposTelhotelier,ChambreRepositories reposChambre, ClientRepositories  reposClient,TelClientRepositories reposTelClient,ReservationRepositories reposReserv) {
		super();
		this.reposFacture = reposFacture;
		this.reposCheque=reposCheque;
		this.reposCarte =reposCarte;
		this.reposFournisseur=reposFournisseur;
		this.reposProduit=reposProduit;
		this.reposTelhotelier=reposTelhotelier;
		this.reposChambre=reposChambre;
		this.reposClient=reposClient;
		this.reposReserv=reposReserv;
	    this.reposTelClient=reposTelClient;
    }
	
	public List<FactureEntity> getFactureEntities(){
		return reposFacture.findAll();
	}
	
	//Create Chéque Entity et facture Entity
	
    public ChéqueEntity CreatePaiementChéque(ChéqueEntity PaiementEntity){
		List<FactureEntity> factures = PaiementEntity.getFacture();
		//List<FactureEntity> facturesInBase= reposFacture.findAll();
		ChéqueEntity ChequeEntityInBase =reposCheque.save(PaiementEntity);
		     for(FactureEntity facture : factures ) {
		    	 facture.setChequeP(ChequeEntityInBase);
		    	 reposFacture.save(facture);
		     };
		     
		 return ChequeEntityInBase;
		 
    }	             
    
    public CarteBancaireEntity CreatePaiementCarte(CarteBancaireEntity PaiementEntity ){
		             
    	List<FactureEntity> factures = PaiementEntity.getFacture();
    	CarteBancaireEntity CarteEntityInBase = reposCarte.save(PaiementEntity);
    	   for(FactureEntity facture : factures ) {
    		     facture.setCarteP(CarteEntityInBase);  
    		     reposFacture.save(facture);
    	   };
                  
    	return CarteEntityInBase;
    		
     }
    
    //create FournisseurEntity et FournisseurProduitEntity et ProduitEntity
    public FournisseurEntity CreateFournisseur(FournisseurEntity PersonneEntity) {
    	   
    	FournisseurEntity FournisseurEntityInBase =reposFournisseur.save(PersonneEntity);
    	List<FournisseurProduitEntity> FournisseurProduits =PersonneEntity.getFornisseurproduit();
    	     
    	      for(FournisseurProduitEntity fournisseurproduit : FournisseurProduits ) {
    	    	  fournisseurproduit.setFornisseur(FournisseurEntityInBase);
    	    	  reposFournisseurProduit.save(fournisseurproduit);    	    	  
    	      };
    	      List<FournisseurProduitEntity>  FournisseurProduitInBase = reposFournisseurProduit.findAll();
    	      
    	      for ( FournisseurProduitEntity ProduitEntity : FournisseurProduitInBase) {
    	    	  ProduitEntity  produit = ProduitEntity.getProduit();
    	    	  produit.setFornisseur(FournisseurProduitInBase);
    	    	  reposProduit.save(produit);
    	      }
    	      
		return  FournisseurEntityInBase;
    }

    //create HotelierEntity
    public HotelierEntity CreateHotelier(HotelierEntity PersonneEntity) {
    	HotelierEntity HotelierEntityInBase = reposHotelier.save(PersonneEntity);
        List<TelephoneHotelerie> tels = PersonneEntity.getTelephone();
             for(TelephoneHotelerie tel : tels) {
                     tel.setHotelier(HotelierEntityInBase); 
                     reposTelhotelier.save(tel);
             };
    	
		return HotelierEntityInBase ;
    	
    	
      }
    //2. Partie Client 
     public ClientEntity CreateClientEntity(ClientEntity client) {
		  
    	 ClientEntity ClientEntityInBase = reposClient.save(client);
    	    for(TelephoneClient tel : ClientEntityInBase.getTelephonesClient()) {
    	    	tel.setClient(ClientEntityInBase); 
    	    	reposTelClient.save(tel);
    	    	
    	   
    	    }
    	 return ClientEntityInBase;
    	 
     }
     
     //find a person with a given pseudo name and password_name
     
     public ClientEntity findbyname(String pseudoname) {
    	List<ClientEntity> ClientEntityInBase = reposClient.findAll();
    	ClientEntity Clientnameentity = null;
    	 for(ClientEntity Clientname : ClientEntityInBase) {
    		 Clientname.getPseudoclient().equalsIgnoreCase(pseudoname);
    		 Clientnameentity=Clientname;
    		 
    	 }
    	
		return Clientnameentity;
    	 
    	 
     }
     //find a person with a given id
     public ClientEntity findById(long id) {
		      
    	 Optional<ClientEntity> opt = reposClient.findById(id);
    	 ClientEntity client;
    	 if(opt.isPresent()) {
    		 client=opt.get();
    		 
    	 }
    	 else
    		 throw new NoSuchElementException("Person with this Id is not found");
    	 return client;
    	 
     }
     
     //find a reservation with a given id
     public ReservationEntity findRById(long id) {
    	 
    	 Optional<ReservationEntity> opt1 = reposReserv.findById(id);
    	 ReservationEntity res;
    	 if(opt1.isPresent()) {
    		 res=opt1.get();
    	 }
    	 else 
    		 throw new NoSuchElementException("Reservation with this Id is not found");
     
    	 return res;
     }
         

    // ReserverChambre
      public ChambreEntity AjoutChambreReserver(long id ,ChambreEntity chambre) {
          //ReservationEntity resfind = this.findRById(id);
         ClientEntity oldclient = this.findById(id);
        /*  List<ReservationEntity> chres = chambre.getReservations();
          chres.add(resfind);*/
         List<ReservationEntity> newres = chambre.getReservations();
         List<ReservationEntity> oldres =  oldclient.getReservations();
         ChambreEntity chambreInBase = reposChambre.save(chambre);
         
          for (ReservationEntity r : newres) {
        	  r.setChambre(chambreInBase);
        	  r.setClient(oldclient);
        	  
        	  reposReserv.save(r);
        	  oldres.add(r);
        	  reposClient.save(oldclient);
             
          }
          
    	  return chambreInBase; 
    	  
      }
      
      
      
}
     //public ChambreEntity SupprimerChambre(ChambreEntity chambre)

	       
   
      
