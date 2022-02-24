package FicherosDeEtapas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Tiempo.*;
import javax.swing.JOptionPane;
import Entidades.*;

public class LeyendoFicheroEtapa1 {
	public static Etapa Etapa1;
	public static Tiempo tiempoSalida;
	public static ArrayList<MetaV> MetaVE1;
	public static ArrayList<Puerto> PuertoE1;
	public static MetaF MetaFE1;
	public static ArrayList<Ciclista> DorsalTiempoSalida;
	public static ArrayList<Ciclista> DorsalTiempo1;
	public static ArrayList<Ciclista> DorsalTiempo2;
	public static ArrayList<Ciclista> DorsalTiempo3;
	public static ArrayList<Ciclista> DorsalTiempo4;
	public static ArrayList<Ciclista> DorsalTiempo5;
	
	public static void LeerEtapa() {
		MetaVE1=new ArrayList<MetaV>();
		DorsalTiempoSalida=new ArrayList<Ciclista>();
		DorsalTiempo1=new ArrayList<Ciclista>();
		DorsalTiempo2=new ArrayList<Ciclista>();
		DorsalTiempo3=new ArrayList<Ciclista>();
		DorsalTiempo4=new ArrayList<Ciclista>();
		DorsalTiempo5=new ArrayList<Ciclista>();
		PuertoE1 =new ArrayList<Puerto>();
		String rutaFichEtapa1 = "C:/Datos/Fichero Etapa 1.txt";

		FileReader fr = null;
		String cadena = "";
		String[] part;
		String tiempoSal = "";
		try {
			fr = new FileReader(rutaFichEtapa1);
			BufferedReader entrada = new BufferedReader(fr);
			cadena = entrada.readLine();
			part = cadena.split("-");
			Etapa1 = new Etapa(part[0], part[1], part[2]);//guardo linea etapa1
			cadena = entrada.readLine();
			cadena = entrada.readLine();//me salto la linea de salida
			while (!cadena.contains("Meta volante")) {//me salto todos los tiempos de salida por que son iguales,solo guardo uno	
			part = cadena.split(", ");
			tiempoSal = part[1];        //solo guardo el tiempo de salida
			tiempoSalida = new Tiempo(tiempoSal);
			Tiempo unTiempo=new Tiempo(part[1]);
			DorsalTiempoSalida.add(new Ciclista(part[0],unTiempo));			
			cadena = entrada.readLine();
			}
			
		/*-----------------------------------------------------------------------------------*/	
			if (cadena.contains("Meta volante")) {//cuando llego a la linea de meta volante guardo la frase en un objeto
				part = cadena.split("-");
				MetaVE1.add(new MetaV(part[0], part[1]));
				cadena = entrada.readLine();
			}
			while(!cadena.contains("Puerto")) {//hasta que no encuentra la siguiente frase con puerto guardo los datos en un array list con dorsal y tiempo.
				part=cadena.split(", ");
				Tiempo unTiempo=new Tiempo(part[1]);
				DorsalTiempo1.add(new Ciclista(part[0],unTiempo));
				cadena = entrada.readLine();
			}	
		/*---------------------------------------------------------------------------------*/	
			if (cadena.contains("Puerto")) {
				part = cadena.split("-");
				PuertoE1.add(new Puerto(part[0], part[1], part[2]));
				cadena = entrada.readLine();}
			while(!cadena.contains("Puerto")) {
				part=cadena.split(", ");
				Tiempo unTiempo=new Tiempo(part[1]);
				DorsalTiempo2.add(new Ciclista(part[0],unTiempo));
				cadena = entrada.readLine();
			}			
		/*---------------------------------------------------------------------------------------*/	
			if (cadena.contains("Puerto")) {
				part = cadena.split("-");
				PuertoE1.add(new Puerto(part[0], part[1], part[2]));
				cadena = entrada.readLine();}
			while(!cadena.contains("Meta volante")) {
				part=cadena.split(", ");
				Tiempo unTiempo=new Tiempo(part[1]);
				DorsalTiempo3.add(new Ciclista(part[0],unTiempo));
				cadena = entrada.readLine();
			}				
		/*-----------------------------------------------------------------------------------------*/	
			if (cadena.contains("Meta volante")) {
				part = cadena.split("-");
				MetaVE1.add(new MetaV(part[0], part[1]));
				cadena = entrada.readLine();
			}
			while(!cadena.contains("Meta")) {
				part=cadena.split(", ");
				Tiempo unTiempo=new Tiempo(part[1]);
				DorsalTiempo4.add(new Ciclista(part[0],unTiempo));
				cadena = entrada.readLine();
			}
		/*-------------------------------------------------------------------------------------------*/
			if (cadena.contains("Meta")) {
				part = cadena.split("-");
				MetaFE1=new MetaF(part[0], part[1]);
				cadena = entrada.readLine();
			}
			while(cadena != null) {				
				part=cadena.split(", ");
				Tiempo unTiempo=new Tiempo(part[1]);
				DorsalTiempo5.add(new Ciclista(part[0],unTiempo));
				cadena = entrada.readLine();
			}			
			entrada.close();			
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}

	}

}
