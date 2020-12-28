package tn.Hotel.Projet.Model;

import java.util.List;

import lombok.Data;

@Data
public class ReservationWraperEntity {
	
	
	List<ReservationEntity> reservations;



	public List<ReservationEntity> getReservations() {
		return reservations;
	}

	public void setReservations(List<ReservationEntity> reservations) {
		this.reservations = reservations;
	}
	

}
