package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.Hotel.Projet.Model.ReservationEntity;

public interface ReservationRepositories extends JpaRepository<ReservationEntity, Long> {

}
