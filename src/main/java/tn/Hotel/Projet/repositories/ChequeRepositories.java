package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.Hotel.Projet.Model.ChéqueEntity;

public interface ChequeRepositories extends JpaRepository<ChéqueEntity, Long> {

}
