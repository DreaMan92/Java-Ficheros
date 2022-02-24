package Recursos;

import Entidades.Ciclista;
import FicherosDeEtapas.ListaCiclistas;

public class Cuadrar {
	public static int longitudNombreCiclistas() {         
		int longitudNombre=0;
		int longitud=0;
		for (Ciclista cli : ListaCiclistas.listaCiclistas) {
			longitudNombre=cli.getNombre().length();
			if(longitudNombre>longitud) {
				longitud=longitudNombre;
			}			
		}return longitud;
		
	}
	public static int longitudEquipoCiclistas() {
		int longitudEquipo=0;
		int longitud=0;
		for (Ciclista cli : ListaCiclistas.listaCiclistas) {
			longitudEquipo=cli.getEquipo().length();
			if(longitudEquipo>longitud) {
				longitud=longitudEquipo;
			}			
		}return longitud;
		
	}
	
	public static String añadirEspaciosNom(String cadena) {
		longitudNombreCiclistas();
		int espacioAñadir=0;
		if(cadena.length()<= longitudNombreCiclistas()) {
			espacioAñadir=longitudNombreCiclistas()-cadena.length();
			for(int i=0;i<espacioAñadir+1;i++) {
				cadena=cadena+" ";
			}
		}
		return cadena;	
	}
	public static String añadirEspaciosEquipo(String cadena) {
		longitudEquipoCiclistas();
		int espacioAñadir=0;
		if(cadena.length()<= longitudEquipoCiclistas()) {
			espacioAñadir=longitudEquipoCiclistas()-cadena.length();
			for(int i=0;i<espacioAñadir+1;i++) {
				cadena=cadena+" ";
			}
		}
		return cadena;	
	}

}
