package FicherosDeEtapas;

import java.util.ArrayList;

import Entidades.Ciclista;
import Puntuacion.Ordenar;
import Recursos.AbrirArchivo;

public class Etapa4Fichero {
	public static ArrayList<Ciclista>cuartaGeneral;
	public static ArrayList<Ciclista>aux;
	public static void imprimirFicheroEtapa4() {
		String ruta="C:/Datos/AAAFicheroResultadoEtapa4.txt";
		
		LeyendoFicheroEtapa4.LeerEtapa();
		String salida="|-------------------------------------------------------|\n";
		salida=salida+"| Salida:  "+LeyendoFicheroEtapa4.tiempoSalida.toString()+" horas                               |";
		Escribir.escribirEnFichero(ruta,(LeyendoFicheroEtapa4.Etapa4.toString()+" Contrareloj"));
		Escribir.escribirEnFichero(ruta, salida);
		/*-------------------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa4.MetaFE4.toString());
		Ordenar.calcularTContra(LeyendoFicheroEtapa4.DorsalTiempo1, LeyendoFicheroEtapa4.DorsalTiempoSalida);
		aux=Ordenar.ordenarPorTiempo(LeyendoFicheroEtapa4.DorsalTiempo1);
		Escribir.escribirEnFichero(ruta,Ordenar.PuntuacionGeneralTotal(aux));
		Ordenar.listaAbandonos(LeyendoFicheroEtapa4.DorsalTiempoSalida, LeyendoFicheroEtapa4.DorsalTiempo1);
		Escribir.escribirEnFichero(ruta,Ordenar.mostrarAbandonos());
		cuartaGeneral=new ArrayList<>();
		cuartaGeneral=Ordenar.dorsalTiempoGeneral(LeyendoFicheroEtapa4.DorsalTiempo1);
		cuartaGeneral=Ordenar.sumaTiempoArray(Etapa3Fichero.terceraGeneral, cuartaGeneral);
		cuartaGeneral=Ordenar.ordenarPorTiempo(cuartaGeneral);
		/*-------------------------------------------------------*/
		Escribir.escribirEnFichero(ruta, Ordenar.ClasificacionFinal1());
		Escribir.escribirEnFichero(ruta,Ordenar.PuntuacionGeneralTotal(cuartaGeneral));
		Escribir.escribirEnFichero(ruta, Ordenar.ClasificacionFinal2());
		
		AbrirArchivo.abrirArchivo(ruta);
		
		
		
		
		
		
	}

}

