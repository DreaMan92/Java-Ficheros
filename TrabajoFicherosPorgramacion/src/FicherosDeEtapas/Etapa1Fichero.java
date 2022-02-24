package FicherosDeEtapas;

import java.util.ArrayList;
import Entidades.*;
import Puntuacion.Ordenar;
import Puntuacion.Puntos;
import Recursos.AbrirArchivo;
public class Etapa1Fichero {
	public static ArrayList<Ciclista>primeraGeneral;
	
	public static void imprimirFicheroEtapa1() {
		String ruta="C:/Datos/AAAFicheroResultadoEtapa1.txt";
		//String rutaBuena="C:/Datos/AAAPrueba.txt";		
		
		LeyendoFicheroEtapa1.LeerEtapa();
		String salida="|-------------------------------------------------------|\n";
		salida=salida+"| Salida:  "+LeyendoFicheroEtapa1.tiempoSalida.toString()+" horas                               |";
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa1.Etapa1.toString());
		Escribir.escribirEnFichero(ruta, salida);
		/*------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa1.MetaVE1.get(0).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa1.DorsalTiempo1,true,false,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa1.DorsalTiempo1,LeyendoFicheroEtapa1.tiempoSalida);
		Escribir.escribirEnFichero(ruta,Ordenar.Puntuacion(LeyendoFicheroEtapa1.DorsalTiempo1,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionM());
		/*---------------*/
		Escribir.escribirEnFichero(ruta, LeyendoFicheroEtapa1.PuertoE1.get(0).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa1.DorsalTiempo2,false,true,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa1.DorsalTiempo2,LeyendoFicheroEtapa1.tiempoSalida);
		Escribir.escribirEnFichero(ruta, Ordenar.Puntuacion(LeyendoFicheroEtapa1.DorsalTiempo2,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionP());	
		/*--------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa1.PuertoE1.get(1).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa1.DorsalTiempo3,false,true,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa1.DorsalTiempo3,LeyendoFicheroEtapa1.tiempoSalida);
		Escribir.escribirEnFichero(ruta, Ordenar.Puntuacion(LeyendoFicheroEtapa1.DorsalTiempo3,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionP());
		/*----------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa1.MetaVE1.get(1).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa1.DorsalTiempo4,true,false,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa1.DorsalTiempo4,LeyendoFicheroEtapa1.tiempoSalida);
		Escribir.escribirEnFichero(ruta, Ordenar.Puntuacion(LeyendoFicheroEtapa1.DorsalTiempo4,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionM());
		/*---------------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa1.MetaFE1.toString());
		Ordenar.calcularT(LeyendoFicheroEtapa1.DorsalTiempo5,LeyendoFicheroEtapa1.tiempoSalida);
		Escribir.escribirEnFichero(ruta,Ordenar.PuntuacionTotal(LeyendoFicheroEtapa1.DorsalTiempo5));
		Ordenar.listaAbandonos(LeyendoFicheroEtapa1.DorsalTiempoSalida, LeyendoFicheroEtapa1.DorsalTiempo5);
		Escribir.escribirEnFichero(ruta,Ordenar.mostrarAbandonos());
		Ordenar.matarAbandonos();
		primeraGeneral=new ArrayList<>();
		primeraGeneral=Ordenar.dorsalTiempoGeneral(LeyendoFicheroEtapa1.DorsalTiempo5);
		/*-------------------------------------------------------*/
		Escribir.escribirEnFichero(ruta, Ordenar.ClasificacionFinal1());
		Escribir.escribirEnFichero(ruta,Ordenar.PuntuacionTotal(primeraGeneral));
		Escribir.escribirEnFichero(ruta, Ordenar.ClasificacionFinal2());		
		
		//Escribir.escribirEncuadrado(rutaBuena,Escribir.ecuadrar(Escribir.leerYcuadrar(ruta)));
		
		AbrirArchivo.abrirArchivo(ruta);
		
		
		
		
		
	}
	
	

	
}
