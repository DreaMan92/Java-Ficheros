package Recursos;

import java.io.File;
import java.io.IOException;
import java.awt.Desktop;

public class AbrirArchivo {
	public static void abrirArchivo(String ruta){

	     try {

	            File objetofile = new File (ruta);
	            Desktop.getDesktop().open(objetofile);

	     }catch (IOException ex) {

	            System.out.println(ex);

	     }

	}                         


}
