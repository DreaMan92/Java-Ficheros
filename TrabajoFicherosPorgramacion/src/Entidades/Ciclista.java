package Entidades;
import Tiempo.*;
import Recursos.*;

public class Ciclista {
	// Atributos
	private String dorsal;
	private String nombre;
	private String pais;
	private String equipo;
	private Tiempo unTiempo;
	private int puntosM;
	private int puntosP;

	// constructor
	public Ciclista(String dorsal, String nombre, String pais, String equipo) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.pais = pais;
		this.equipo = equipo;
	}

	public Ciclista(String dorsal, Tiempo unTiempo) {
		this.dorsal = dorsal;
		this.unTiempo = unTiempo;
	}
	public Ciclista(String cadena) {
		this.dorsal = cadena.split(",")[0];
		this.nombre = cadena.split(",")[1];
		this.pais = cadena.split(",")[2];
		this.equipo = cadena.split(",")[3];
	}
	public Ciclista (String dorsal, int puntosM,int puntosP) {
		this.dorsal=dorsal;
		this.puntosM=puntosM;
		this.puntosP=puntosP;
	}	
	public Ciclista(String dorsal, String nombre, String pais, String equipo, int puntosM,int puntosP,Tiempo unTiempo) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.pais = pais;
		this.equipo = equipo;
		this.puntosM=puntosM;
		this.puntosP=puntosP;
		this.unTiempo = unTiempo;
		
	}
	// metodos getandset
	public String getDorsal() {
		return dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPais() {
		return pais;
	}

	public String getEquipo() {
		return equipo;
	}

	public Tiempo getUnTiempo() {
		return unTiempo;
	}
	public int getPuntosM() {
		return puntosM;
	}
	public int getPuntosP() {
		return puntosP;
	}
	public int setPuntosM(int num) {
		puntosM=puntosM+num;
		return puntosM;
	}
	public int setPuntosP(int num) {
		puntosP=puntosP+num;
		return puntosP;
	}
/*--------------------------------------------------------*/	
	public String getDorTiempo() {//es como un override de tostring pero para sacar dorsal y tiempo para ciclista
		String cadena = "";
		cadena = dorsal + ", "+unTiempo.toString();
		return cadena;
	}
	public String getDorPuntosM() {
		String cadena="";
		cadena=dorsal+", "+puntosM;
		return cadena;
	}
	public String getDorPuntosP() {
		String cadena="";
		cadena=dorsal+", "+puntosP;
		return cadena;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		cadena = dorsal + "," + Cuadrar.añadirEspaciosNom(nombre + ",") + pais + "," + Cuadrar.añadirEspaciosEquipo(equipo + ".");
		return cadena;
	}
	
	

}
