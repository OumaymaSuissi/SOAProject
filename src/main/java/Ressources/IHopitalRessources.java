package Ressources;
import Entities.Hopital;
import java.util.List;

public interface IHopitalRessources {
	
	public String addHopital(Hopital hopital);
	public String updateHopital(Hopital hopital);
	public boolean deleteHopital(int id);

	public Hopital searchHopital(int id);

	public List<Hopital> getAllHopital();



}
