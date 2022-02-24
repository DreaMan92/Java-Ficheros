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
	
	public static String a�adirEspaciosNom(String cadena) {
		longitudNombreCiclistas();
		int espacioA�adir=0;
		if(cadena.length()<= longitudNombreCiclistas()) {
			espacioA�adir=longitudNombreCiclistas()-cadena.length();
			for(int i=0;i<espacioA�adir+1;i++) {
				cadena=cadena+" ";
			}
		}
		return cadena;	
	}
	public static String a�adirEspaciosEquipo(String cadena) {
		longitudEquipoCiclistas();
		int espacioA�adir=0;
		if(cadena.length()<= longitudEquipoCiclistas()) {
			espacioA�adir=longitudEquipoCiclistas()-cadena.length();
			for(int i=0;i<espacioA�adir+1;i++) {
				cadena=cadena+" ";
			}
		}
		return cadena;	
	}

}
