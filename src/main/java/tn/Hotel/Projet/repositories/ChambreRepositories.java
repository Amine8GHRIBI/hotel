package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.Hotel.Projet.Model.ChambreEntity;

public interface ChambreRepositories extends JpaRepository<ChambreEntity, Long> {

}
