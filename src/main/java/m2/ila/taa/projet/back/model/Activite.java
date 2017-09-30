package m2.ila.taa.projet.back.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe représentant les activités que peuvent faire les utilisateurs.
 * 
 * @author christophe
 *
 */
@Entity
public class Activite {

	private long id;
	private String designation;

	private List<User> users = new ArrayList<User>();
	private List<Lieu> lieux = new ArrayList<Lieu>();
	
	@Id
    @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@ManyToMany(mappedBy="activites", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@ManyToMany
	public List<Lieu> getLieux() {
		return lieux;
	}

	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}

	public void addLieu(Lieu lieu) {
		this.getLieux().add(lieu);
	}
}
