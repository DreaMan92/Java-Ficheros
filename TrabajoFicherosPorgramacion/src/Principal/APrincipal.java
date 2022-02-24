package Principal;
import FicherosDeEtapas.*;
import Puntuacion.*;
public class APrincipal {

	public static void main(String[] args) {
		ListaCiclistas.CrearCiclistas();
		Puntos.CrearlistaConPuntos();	
		Controlador.menu();	
		
	}

}
