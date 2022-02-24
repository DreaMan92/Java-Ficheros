package FicherosDeEtapas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Tiempo.*;
import javax.swing.JOptionPane;
import Entidades.*;

public class LeyendoFicheroEtapa4 {
	public static Etapa Etapa4;
	public static MetaF MetaFE4;
	public static Tiempo tiempoSalida;
	public static ArrayList<Ciclista> DorsalTiempoSalida;
	public static ArrayList<Ciclista> DorsalTiempo1;
	
	public static void LeerEtapa() {		
		DorsalTiempoSalida=new ArrayList<Ciclista>();
		DorsalTiempo1=new ArrayList<Ciclista>();
		String rutaFichEtapa4 = "C:/Datos/Fichero Etapa 4.txt";

		FileReader fr = null;
		String cadena = "";
		String[] part;
		String tiempoSal = "";
		try {
			fr = new FileReader(rutaFichEtapa4);
			BufferedReader entrada = new BufferedReader(fr);
			cadena = entrada.readLine();
			part = cadena.split("-");
			Etapa4 = new Etapa(part[0], part[1], part[2]);
			cadena = entrada.readLine();
			cadena = entrada.readLine();
			while (!cadena.contains("Meta")) {	
			part = cadena.split(", ");
			tiempoSal = part[1];        
			tiempoSalida = new Tiempo(tiempoSal);
			Tiempo unTiempo=new Tiempo(part[1]);
			DorsalTiempoSalida.add(new Ciclista(part[0],unTiempo));			
			cadena = entrada.readLine();
			}			
		/*-----------------------------------------------------------------------------------*/	
			if (cadena.contains("Meta")) {
				part = cadena.split("-");
				MetaFE4 = new MetaF(part[0], part[1]);
				cadena = entrada.readLine();
				}
			while (cadena != null) {
			part = cadena.split(", ");
			Tiempo unTiempo = new Tiempo(part[1]);
			DorsalTiempo1.add(new Ciclista(part[0], unTiempo));
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
