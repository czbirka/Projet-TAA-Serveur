package m2.ila.taa.projet.back.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * Classe représentant les régions où les utilisateurs peuvent faire des activités.
 * Une Region est constituée de plusieurs Departements.
 * 
 * @author christophe
 *
 */
@Entity
public class Region {

	private long id;
	private String nom;

	private List<Departement> departements = new ArrayList<Departement>();
	
	public Region() {
		
	}

	public Region(String nom) {
		this.nom = nom;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	//@OneToMany(mappedBy="region", cascade={CascadeType.PERSIST,CascadeType.MERGE})
	//@JsonManagedReference
	@OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}
	
	public void addDepartement(Departement departement) {
		this.getDepartements().add(departement);
	}
	
}
