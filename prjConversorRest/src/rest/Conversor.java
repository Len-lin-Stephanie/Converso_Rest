package rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/conversor")
public class Conversor {
	public static float KmToMl = .62137f;
	@GET
	@Produces("text/plain")
	public String conversor(
			@DefaultValue("km") @QueryParam("metrica") String medida, 
			@QueryParam("value") float valor) {
		String resultado = "algo errado";
		System.out.println("Medida = " + medida);
		
		if(medida.contentEquals("km")) {
			float ml = valor * (float) KmToMl;
			resultado = Float.toString(ml);
		}else if(medida.contentEquals("ml")) {
			float km = valor / (float) KmToMl;
			resultado = Float.toString(km);
		}
		return resultado;
		
		
	}
	
}
