package Entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


public class Hopital implements Serializable{
	private static final long serialVersionUID = -5577579081118070434L;
	private int id;
	private String name;
	private String adresse;
	
	public Hopital() {
		// TODO Auto-generated constructor stub
	}
	
	public Hopital(int id, String name, String adresse) {
		super();
		this.id = id;
		this.name = name;
		this.adresse = adresse;
	}

	public Hopital(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


}
