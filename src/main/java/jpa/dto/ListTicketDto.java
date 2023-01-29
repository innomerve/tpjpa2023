package jpa.dto;

import javax.validation.constraints.NotNull;

public class ListTicketDto {

	// { "nom": "toto", "siret": "titi",  "adresse": "tutu", "bateau": "tyty", "montant": 2000}
    @NotNull(message = "Name may not be null")
	String nom;
	
	String siret;
	String adresse;
	String bateau;
	long montant;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getBateau() {
		return bateau;
	}
	public void setBateau(String bateau) {
		this.bateau = bateau;
	}
	public long getMontant() {
		return montant;
	}
	public void setMontant(long montant) {
		this.montant = montant;
	}
}
