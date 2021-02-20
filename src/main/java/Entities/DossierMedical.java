package Entities;

import java.io.Serializable;

public class DossierMedical implements Serializable{
	private static final long serialVersionUID = -5577579081118070434L;
	private int id;
	private String description;
	private boolean etat;
	
	
	public DossierMedical(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	

}
