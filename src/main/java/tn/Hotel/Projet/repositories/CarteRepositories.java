package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import tn.Hotel.Projet.Model.CarteBancaireEntity;

 public interface CarteRepositories extends JpaRepository<CarteBancaireEntity, Long> {

	
 }
