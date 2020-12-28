package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.Hotel.Projet.Model.HotelierEntity;

public interface HotelierRepositories extends JpaRepository<HotelierEntity, Long> {

}
