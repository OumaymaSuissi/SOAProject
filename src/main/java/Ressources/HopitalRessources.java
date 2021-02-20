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
import javax.ws.rs.Produces;

import Entities.Hopital;

@Path("hopital")
public class HopitalRessources implements IHopitalRessources{

private static List<Hopital> hopitals = new ArrayList<>();
	
	@Override
	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String addHopital(Hopital hopital) {
		if(hopitals.contains(hopital))
			return "Cet hopital existe déjà";
		else {
			hopitals.add(hopital);
			return "ajout réussie !";
		}
	}
	@Override
	@PUT
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String updateHopital(Hopital hopital) {
		hopitals.set(hopitals.indexOf(hopital), hopital);
			return "Modif réussie !";
	}
	@Override
	@DELETE
	@Path("{id}")
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public boolean deleteHopital(@PathParam(value="id") int id) {
		return hopitals.remove(new Hopital(id));
	}

	@Override
	@GET
	@Path("{id}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Hopital searchHopital(@PathParam(value="id") int cin) {
		return hopitals.stream().filter(employe-> employe.equals(new Hopital(cin))).findFirst().orElse(null);
	}
	@Override
	@GET
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Hopital> getAllHopital() {
		return hopitals;
	}
}
