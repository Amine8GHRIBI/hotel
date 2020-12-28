package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.Hotel.Projet.Model.ProduitEntity;

public interface ProduitRepositories extends JpaRepository<ProduitEntity, Long> {

}
