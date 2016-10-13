package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Computer {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_computer;
	
	
	private String modello;
	
//	@ManyToOne
//	@JoinColumn(name="id_Persona")
//	private Persona persona;
	
	@ManyToMany
	private Set<Persona> persone=new HashSet<>();
	
	public Computer() {
		
		
		this.modello = "";
	}
	
	
	public Computer(long id_computer, String modello) {
	
		this.id_computer = id_computer;
		this.modello = modello;
	}


	public long getId_computer() {
		return id_computer;
	}


	public void setId_computer(long id_computer) {
		this.id_computer = id_computer;
	}


	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	public Set<Persona> getPersone() {
		return persone;
	}


	public void setPersone(Set<Persona> persone) {
		this.persone = persone;
	}

  
	
	public void addPersona(Persona p){
		this.persone.add(p);
	}

	
	
	
	
}
