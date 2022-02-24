package FicherosDeEtapas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Entidades.*;

public class ListaCiclistas {
	public static ArrayList<Ciclista> listaCiclistas;

	public static void CrearCiclistas() {//este metodo que lee el fichero de participantes y crea un arrayList de objetos Ciclistas, es decir, de Ciclistas con sus atributos.
		listaCiclistas = new ArrayList<Ciclista>();

		String rutaConcursantes = "C:/Datos/Fichero Participantes.txt";
		
		FileReader fr = null;
		String cadena = "";
		String[] part;
		try {
			fr = new FileReader(rutaConcursantes);
			BufferedReader entrada = new BufferedReader(fr);
			cadena = entrada.readLine();
			while (cadena != null) {
				part = cadena.split(",");
				listaCiclistas.add(new Ciclista(part[0], part[1], part[2], part[3]));				
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
	public static void imprimirLista() {//Este metodo recorre el arrayList y lo muestra en un String que acumula las lineas
		String cadena = "Lista de ciclistas \n------------------------------\n";
		for (Ciclista cic : listaCiclistas) {
			cadena = cadena + cic.toString() + "\n";
		}

		JOptionPane.showMessageDialog(null, cadena);

	}	

	public static String FicheroCiclista() {//este metodo engloba y muestra la lista de ciclistas con formato, en un String.
		String cadena = "";
		cadena = "|----------------------------------------------------|\n";
		cadena = cadena + "|----------------Lista de Ciclistas------------------|\n";
		for (Ciclista cic : listaCiclistas) {
			cadena = cadena + "|----------------------------------------------------|\n";
			cadena = cadena + "|   " + cic.toString() + "|\n";
			cadena = cadena + "|----------------------------------------------------|\n";
		}

		return cadena;
	}
	

}
