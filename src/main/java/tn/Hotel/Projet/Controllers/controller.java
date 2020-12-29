package tn.Hotel.Projet.Controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.net.server.Client;
import tn.Hotel.Projet.Model.ChambreEntity;
import tn.Hotel.Projet.Model.ClientEntity;
import tn.Hotel.Projet.Model.ReservationEntity;
import tn.Hotel.Projet.Model.TelephoneClient;
import tn.Hotel.Projet.Service.HotelService;

@Controller
public class controller {
    @Autowired      
	private HotelService service;
	
	 @GetMapping("/register")
	 public String showSignUpForm(Model model) {
		ClientEntity client = new ClientEntity();
		 model.addAttribute("user", client);
		 return "register";
	 }	
	
    @PostMapping("/register")
    public String addUser(@ModelAttribute("user") ClientEntity client) {
        
		 service.CreateClientEntity(client);
	
		return "index";
		 
	 }
    @GetMapping("/reservation")
    public String showResForm(Model model) {
    	ReservationEntity res = new ReservationEntity();
    	model.addAttribute("reser", res);
    	return "reservation";
    }
    
    @GetMapping("/room")
    public String showRoomForm(Model model) {
    	ChambreEntity ch = new ChambreEntity();
    	model.addAttribute("CHAM", ch);
    	return "room";
    }
    
    @GetMapping("/login")
    public String ShowLoginForm(Model model) {
        ClientEntity client = new ClientEntity();
        model.addAttribute("login ", client);
		return "login";
        
    }
    
   
    
    

 

 
}
