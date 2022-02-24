package FicherosDeEtapas;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Escribir {
	public static ArrayList<String> fichero;
	public static int longitud;

	public static void escribirEnFichero(String ruta, String frase) {
		FileWriter fw;
		PrintWriter salida = null;
		try {
			fw = new FileWriter(ruta, true);
			salida = new PrintWriter(fw);
			salida.println(frase);
			salida.flush();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		} finally {
			salida.close();
		}

	}

/*	public static ArrayList<String> leerYcuadrar(String ruta) {
		FileReader fr = null;
		String cadena = "";
		fichero = new ArrayList<>();
		longitud = 0;
		int longitudAux = 0;

		try {
			fr = new FileReader(ruta);
			BufferedReader entrada = new BufferedReader(fr);
			cadena = entrada.readLine();
			while (cadena != null) {
				fichero.add(cadena);
				longitudAux = cadena.length();
				if (longitudAux > longitud) {
					longitud = longitudAux;
				}
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
		return fichero;
	}

	public static ArrayList<String> ecuadrar(ArrayList<String> cadenas) {
		int espacios = 0;
		for (String i : cadenas) {
			if (i.length() <= longitud) {
				espacios = longitud - i.length() + 1;
				i = "|  " + i + espacios + "|";
			}
		}

		return cadenas;
	}

	public static void escribirEncuadrado(String ruta, ArrayList<String> cadenas) {
		FileWriter fw;
		PrintWriter salida = null;
		try {
			fw = new FileWriter(ruta, true);
			salida = new PrintWriter(fw);
			for (String i : cadenas) {
				salida.println(i);
			}
			salida.flush();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		} finally {
			salida.close();
		}

	}*/
}
