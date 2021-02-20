package Ressources;

import java.util.List;

import javax.ws.rs.PathParam;

import Entities.DossierMedical;
import Entities.Hopital;

public interface IDossierMedicalRessources {

	public String addDossier(DossierMedical dossierMedical) ;
	public String updateDossier(DossierMedical dossier);
	public boolean deleteDossier( int id);
	public DossierMedical searchHopital( int id) ;
	public List<DossierMedical> getAllDossier();



}
