package tn.Hotel.Projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.Hotel.Projet.Model.AdminEntity;

public interface AdminRepositories extends JpaRepository<AdminEntity, Long> {

}
