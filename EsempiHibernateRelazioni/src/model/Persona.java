package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Persona {

	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_Persona;
	
	@Column(name="Nome")
	private String nome;
	

	private String cognome;
	
//	@OneToOne
//	private Computer computer;
	
//	@OneToMany(mappedBy="persone",cascade=CascadeType.ALL)
//  @NotFound(action=NotFoundAction.IGNORE)
//	private Set<Computer> computer=new HashSet<>();
//	
	@ManyToMany(mappedBy="persone")
	private Set<Computer> computer=new HashSet<>();
	
public Persona() {
	 
		this.nome = "";
		this.cognome = "";
	}

	public Persona(int id_Persona, String nome, String cognome) {
		
		this.id_Persona = id_Persona;
		this.nome = nome;
		this.cognome = cognome;
	}

	public int getId_Persona() {
		return id_Persona;
	}

	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Set<Computer> getComputer() {
		return computer;
	}

	public void setComputer(Set<Computer> computer) {
		this.computer = computer;
	}


	public void addComputer(Computer c){
		this.computer.add(c);
	}
	
	
}
