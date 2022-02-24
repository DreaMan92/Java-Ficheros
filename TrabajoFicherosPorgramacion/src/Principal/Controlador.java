package Principal;

import javax.swing.JOptionPane;
import FicherosDeEtapas.*;
import Recursos.*;

public class Controlador {
	public static void menu() {
		boolean salir = false;
		int opcion;
		String menu = "Que fichero te gustaria ver :";
		menu = menu + "\n 1=> Lista de participantes :";
		menu = menu + "\n 2=> 1ª Etapa";
		menu = menu + "\n 3=> 2ª Etapa";
		menu = menu + "\n 4=> 3ª Etapa";
		menu = menu + "\n 5=> 4ª Etapa";
		menu = menu + "\n 6=> Salir";

		while (!salir) {
			try {

				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				if (opcion > 6) {
					JOptionPane.showMessageDialog(null, "Tienes que introducir un numero del 1 al 6");
				}

				switch (opcion) {

				case 1:
					String ruta1 = "C:/Datos/AAAFicheroMostrarCiclistas.txt";
					Escribir.escribirEnFichero(ruta1, ListaCiclistas.FicheroCiclista());
					AbrirArchivo.abrirArchivo(ruta1);
					break;
				case 2:
					Etapa1Fichero.imprimirFicheroEtapa1();
					break;
				case 3:
					Etapa2Fichero.imprimirFicheroEtapa2();
					break;
				case 4:
					Etapa3Fichero.imprimirFicheroEtapa3();
					break;
				case 5:
					Etapa4Fichero.imprimirFicheroEtapa4();
					break;
				case 6:
					salir = true;
					break;

				}
			} catch (java.lang.NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Debes introducir un numero para moverte por el menu.\nSi quieres salir pulsa 6 .\nGracias.");
			}
		}

	}
}
