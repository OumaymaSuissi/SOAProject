package Ressources;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


import Entities.DossierMedical;
import Entities.Hopital;

public class DossierMedicalRessources implements IDossierMedicalRessources{
	private static List<DossierMedical> dossiers = new ArrayList<>();

	@Override
	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String addDossier(DossierMedical dossierMedical) {
		if(dossiers.contains(dossierMedical))
			return "Cet dossier existe déjà";
		else {
			dossiers.add(dossierMedical);
			return "ajout réussie !";
		}
	}
	@Override
	@PUT
	public String updateDossier(DossierMedical dossier) {
		dossiers.set(dossiers.indexOf(dossier), dossier);
			return "Modif réussie !";
	}
	@Override
	@DELETE
	@Path("{id}")
	public boolean deleteDossier(@PathParam(value="id") int id) {
		return dossiers.remove(new DossierMedical(id));
	}

	@Override
	@GET
	@Path("{id}")
	public DossierMedical searchHopital(@PathParam(value="id") int id) {
		return dossiers.stream().filter(dossier-> dossier.equals(new DossierMedical(id))).findFirst().orElse(null);
	}
	@Override
	@GET
	public List<DossierMedical> getAllDossier() {
		return dossiers;
	}
}
