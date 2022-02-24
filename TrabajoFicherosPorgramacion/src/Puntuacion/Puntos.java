package Puntuacion;

import java.util.ArrayList;
import java.util.Comparator;
import Entidades.*;
import FicherosDeEtapas.*;


public class Puntos {
	public static ArrayList<Ciclista> listaCicPuntos;// = new ArrayList<Ciclista>();
	public static boolean categoriaMeta = false;
	public static boolean categoria1 = false;
	public static boolean categoria2 = false;
	public static boolean categoria3 = false;

	public static void CrearlistaConPuntos() {
		listaCicPuntos = new ArrayList<Ciclista>();
		for (Ciclista i : ListaCiclistas.listaCiclistas) {
			listaCicPuntos.add(new Ciclista(i.getDorsal(), 0,0));
		}
	}

	public static void añadirPuntos(ArrayList<Ciclista> lista ,Boolean categoriaMeta,Boolean categoria3,Boolean categoria2,Boolean categoria1) {//este metodo sirve para calcular los puntos en funcion de que categoria es o si es meta
		for (Ciclista i : listaCicPuntos) {
			if (categoriaMeta) {
				if (i.getDorsal().toString().equals(lista.get(0).getDorsal().toString())) {
					i.setPuntosM(5);
				}
				if (i.getDorsal().toString().equals(lista.get(1).getDorsal().toString())) {
					i.setPuntosM(3);
				}
				if (i.getDorsal().toString().equals(lista.get(2).getDorsal().toString())) {
					i.setPuntosM(1);
				}
			}
			
			if (categoria1) {
				if (i.getDorsal().toString().equals(lista.get(0).getDorsal().toString())) {
					i.setPuntosP(20);
				}
				if (i.getDorsal().toString().equals(lista.get(1).getDorsal().toString())) {
					i.setPuntosP(15);
				}
				if (i.getDorsal().toString().equals(lista.get(2).getDorsal().toString())) {
					i.setPuntosP(10);
				}
				if (i.getDorsal().toString().equals(lista.get(3).getDorsal().toString())) {
					i.setPuntosP(5);
				}
			}
			if (categoria2) {
				if (i.getDorsal().toString().equals(lista.get(0).getDorsal().toString())) {
					i.setPuntosP(10);
				}
				if (i.getDorsal().toString().equals(lista.get(1).getDorsal().toString())) {
					i.setPuntosP(5);
				}
				if (i.getDorsal().toString().equals(lista.get(2).getDorsal().toString())) {
					i.setPuntosP(3);
				}

			}
			if (categoria3) {
				if (i.getDorsal().toString().equals(lista.get(0).getDorsal().toString())) {
					i.setPuntosP(5);
				}
				if (i.getDorsal().toString().equals(lista.get(1).getDorsal().toString())) {
					i.setPuntosP(3);
				}
				if (i.getDorsal().toString().equals(lista.get(2).getDorsal().toString())) {
					i.setPuntosP(1);
				}

			}

		}
	}
	public static int[] numerosPuntuacion(String categoria) {//este metodo sirve para en funcion de que categoria de puerto o si es meta la puntuacion que se debe mostrar y escribir en el fichero
		int[]num1=new int[3];
		int[]num2 = new int[4];
		if(categoria.equals("categoria1")) {
			num2[0]=20;
			num2[1]=15;
			num2[2]=10;
			num2[3]=5;
			return num2;
		}else if(categoria.equals("categoria2")) {
			num1[0]=10;
			num1[1]=5;
			num1[2]=3;
		}else if(categoria.equals("categoria3")) {
			num1[0]=5;
			num1[1]=3;
			num1[2]=1;
		}else if(categoria.equals("meta")) {
			num1[0]=5;
			num1[1]=3;
			num1[2]=1;
		}
		return num1;
		
	}
	

	public static void losPrimerosM() { // este metodo ordena el arraylist en funcion de quien tiene mas puntos en metas.
		listaCicPuntos.sort(Comparator.comparing(Ciclista::getPuntosM).reversed());
	}
		
	public static void losPrimerosP() { // este metodo ordena el arraylist en funcion de quien tiene mas puntos en puertos.
		listaCicPuntos.sort(Comparator.comparing(Ciclista::getPuntosP).reversed());
	}

	public static void ordenNumDorsal(ArrayList<Ciclista>uno) {
		uno.sort(Comparator.comparing(Ciclista::getDorsal));
		
	}

}
