package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	@OneToOne
	private CarteCredit carteCredit;
	
	public Client() {
		super();
	}

	public Client(String nom, String prenom, CarteCredit carteCredit) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.carteCredit = carteCredit;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CarteCredit getCarteCredit() {
		return carteCredit;
	}

	public void setCarteCredit(CarteCredit carteCredit) {
		this.carteCredit = carteCredit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", carteCredit=" + carteCredit + "]";
	}
	
}