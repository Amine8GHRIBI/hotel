package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.Hotel.Projet.Model.ClientEntity;

public interface ClientRepositories extends JpaRepository<ClientEntity, Long> {

}
