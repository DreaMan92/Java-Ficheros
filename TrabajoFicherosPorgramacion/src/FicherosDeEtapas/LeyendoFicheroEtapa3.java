package FicherosDeEtapas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Tiempo.*;
import javax.swing.JOptionPane;
import Entidades.*;

public class LeyendoFicheroEtapa3 {
	public static Etapa Etapa3;
	public static Tiempo tiempoSalida;
	public static ArrayList<MetaV> MetaVE3;
	public static MetaF MetaFE3;
	public static ArrayList<Ciclista> DorsalTiempoSalida;
	public static ArrayList<Ciclista> DorsalTiempo1;
	public static ArrayList<Ciclista> DorsalTiempo2;
	public static ArrayList<Ciclista> DorsalTiempo3;
	public static ArrayList<Ciclista> DorsalTiempo4;
	
	public static void LeerEtapa() {
		MetaVE3=new ArrayList<MetaV>();
		DorsalTiempoSalida=new ArrayList<Ciclista>();
		DorsalTiempo1=new ArrayList<Ciclista>();
		DorsalTiempo2=new ArrayList<Ciclista>();
		DorsalTiempo3=new ArrayList<Ciclista>();
		DorsalTiempo4=new ArrayList<Ciclista>();
		String rutaFichEtapa3 = "C:/Datos/Fichero Etapa 3.txt";

		FileReader fr = null;
		String cadena = "";
		String[] part;
		String tiempoSal = "";
		try {
			fr = new FileReader(rutaFichEtapa3);
			BufferedReader entrada = new BufferedReader(fr);
			cadena = entrada.readLine();
			part = cadena.split("-");
			Etapa3 = new Etapa(part[0], part[1], part[2]);
			cadena = entrada.readLine();
			cadena = entrada.readLine();
			while (!cadena.contains("Meta volante")) {	
			part = cadena.split(", ");
			tiempoSal = part[1];        
			tiempoSalida = new Tiempo(tiempoSal);
			Tiempo unTiempo=new Tiempo(part[1]);
			DorsalTiempoSalida.add(new Ciclista(part[0],unTiempo));			
			cadena = entrada.readLine();
			}			
		/*-----------------------------------------------------------------------------------*/	
			if (cadena.contains("Meta volante")) {
			part = cadena.split("-");
			MetaVE3.add(new MetaV(part[0], part[1]));
			cadena = entrada.readLine();
			}
			while (!cadena.contains("Meta volante")) {
			part = cadena.split(", ");
			Tiempo unTiempo = new Tiempo(part[1]);
			DorsalTiempo1.add(new Ciclista(part[0], unTiempo));
			cadena = entrada.readLine();
			}
		/*---------------------------------------------------------------------------------*/	
			if (cadena.contains("Meta volante")) {
			part = cadena.split("-");
			MetaVE3.add(new MetaV(part[0], part[1]));
			cadena = entrada.readLine();
			}
			while (!cadena.contains("Meta volante")) {
			part = cadena.split(", ");
			Tiempo unTiempo = new Tiempo(part[1]);
			DorsalTiempo2.add(new Ciclista(part[0], unTiempo));
			cadena = entrada.readLine();
			}	
		/*---------------------------------------------------------------------------------------*/	
			if (cadena.contains("Meta volante")) {
			part = cadena.split("-");
			MetaVE3.add(new MetaV(part[0], part[1]));
			cadena = entrada.readLine();
			}
			while (!cadena.contains("Meta")) {
			part = cadena.split(", ");
			Tiempo unTiempo = new Tiempo(part[1]);
			DorsalTiempo3.add(new Ciclista(part[0], unTiempo));
			cadena = entrada.readLine();
				}			
		/*--------------------------------------------------------------------------------------*/
			if (cadena.contains("Meta")) {
			part = cadena.split("-");
			MetaFE3 = new MetaF(part[0], part[1]);
			cadena = entrada.readLine();
			}
			while (cadena != null) {
			part = cadena.split(", ");
			Tiempo unTiempo = new Tiempo(part[1]);
			DorsalTiempo4.add(new Ciclista(part[0], unTiempo));
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
