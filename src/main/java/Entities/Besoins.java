package Entities;

import java.io.Serializable;
import sang.tn.entities.Hopital;

public class Besoins implements Serializable{
	private static final long serialVersionUID = -5577579081118070434L;
	private int id;
	private String statut;
	private Hopital hopital ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Hopital getHopital() {
		return hopital;
	}
	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	} 
	

}
