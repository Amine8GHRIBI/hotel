package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.Hotel.Projet.Model.TelephoneClient;

public interface TelClientRepositories extends JpaRepository<TelephoneClient, Long> {

}
