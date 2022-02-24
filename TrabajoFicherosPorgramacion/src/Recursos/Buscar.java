package Recursos;

import Entidades.Ciclista;
import FicherosDeEtapas.ListaCiclistas;

public class Buscar {
	public static Ciclista obetenerAtributosPorDorsal(String dorsal) {
		ListaCiclistas.CrearCiclistas();
		Ciclista miCiclista=null;
		for(Ciclista clic : ListaCiclistas.listaCiclistas) {
			if(dorsal.equals(clic.getDorsal())) {
				miCiclista=clic;			
			}			
		}		
		return miCiclista;
	}


}
