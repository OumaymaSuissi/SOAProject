package Entities;

import java.io.Serializable;
import Entities.Besoins;
import Entities.DossierMedical;

public class PosheSang implements Serializable{
	private static final long serialVersionUID = -5577579081118070434L;
	private int id;
	private String classe; // A/B/O-+/AB
	private Besoins Besoin ;
	private DossierMedical dossierMedical ;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public Besoins getBesoin() {
		return Besoin;
	}
	public void setBesoin(Besoins besoin) {
		Besoin = besoin;
	}
	public DossierMedical getDossierMedical() {
		return dossierMedical;
	}
	public void setDossierMedical(DossierMedical dossierMedical) {
		this.dossierMedical = dossierMedical;
	}
	

	

}
