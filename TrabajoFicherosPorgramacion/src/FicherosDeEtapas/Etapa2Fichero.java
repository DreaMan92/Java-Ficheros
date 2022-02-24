package FicherosDeEtapas;

import java.util.ArrayList;

import Entidades.Ciclista;
import Puntuacion.*;
import Recursos.AbrirArchivo;

public class Etapa2Fichero {
	public static ArrayList<Ciclista>segundaGeneral;

	public static void imprimirFicheroEtapa2() {
		String ruta="C:/Datos/AAAFicheroResultadoEtapa2.txt";
		
		LeyendoFicheroEtapa2.LeerEtapa();
		String salida="|-------------------------------------------------------|\n";
		salida=salida+"| Salida:  "+LeyendoFicheroEtapa2.tiempoSalida.toString()+" horas                               |";
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa2.Etapa2.toString());
		Escribir.escribirEnFichero(ruta, salida);
		/*------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa2.MetaVE2.get(0).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa2.DorsalTiempo1,true,false,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa2.DorsalTiempo1,LeyendoFicheroEtapa2.tiempoSalida);
		Escribir.escribirEnFichero(ruta,Ordenar.Puntuacion(LeyendoFicheroEtapa2.DorsalTiempo1,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionM());
		/*---------------*/
		Escribir.escribirEnFichero(ruta, LeyendoFicheroEtapa2.PuertoE2.get(0).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa2.DorsalTiempo2,false,false,true,false);
		Ordenar.calcularT(LeyendoFicheroEtapa2.DorsalTiempo2,LeyendoFicheroEtapa2.tiempoSalida);
		Escribir.escribirEnFichero(ruta, Ordenar.Puntuacion(LeyendoFicheroEtapa2.DorsalTiempo2,"categoria2"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionP());	
		/*--------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa2.MetaVE2.get(1).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa2.DorsalTiempo3,true,false,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa2.DorsalTiempo3,LeyendoFicheroEtapa2.tiempoSalida);
		Escribir.escribirEnFichero(ruta, Ordenar.Puntuacion(LeyendoFicheroEtapa2.DorsalTiempo3,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionM());
		/*----------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa2.PuertoE2.get(1).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa2.DorsalTiempo4,false,false,false,true);
		Ordenar.calcularT(LeyendoFicheroEtapa2.DorsalTiempo4,LeyendoFicheroEtapa2.tiempoSalida);
		Escribir.escribirEnFichero(ruta, Ordenar.Puntuacion(LeyendoFicheroEtapa2.DorsalTiempo4,"categoria1"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionP());
		/*---------------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa2.PuertoE2.get(2).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa2.DorsalTiempo5,false,false,false,true);
		Ordenar.calcularT(LeyendoFicheroEtapa2.DorsalTiempo5,LeyendoFicheroEtapa2.tiempoSalida);
		Escribir.escribirEnFichero(ruta, Ordenar.Puntuacion(LeyendoFicheroEtapa2.DorsalTiempo5,"categoria1"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionP());		
		/*-------------------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa2.MetaFE2.toString());
		Escribir.escribirEnFichero(ruta,Ordenar.PuntuacionTotal(LeyendoFicheroEtapa2.DorsalTiempo5));
		Ordenar.listaAbandonos(LeyendoFicheroEtapa2.DorsalTiempoSalida, LeyendoFicheroEtapa2.DorsalTiempo5);
		Escribir.escribirEnFichero(ruta,Ordenar.mostrarAbandonos());
		segundaGeneral=new ArrayList<>();
		segundaGeneral=Ordenar.dorsalTiempoGeneral(LeyendoFicheroEtapa2.DorsalTiempo5);
		segundaGeneral=Ordenar.sumaTiempoArray(Etapa1Fichero.primeraGeneral, segundaGeneral);
		segundaGeneral=Ordenar.ordenarPorTiempo(segundaGeneral);
		/*-------------------------------------------------------*/
		Escribir.escribirEnFichero(ruta, Ordenar.ClasificacionFinal1());
		Escribir.escribirEnFichero(ruta,Ordenar.PuntuacionGeneralTotal(segundaGeneral));
		Escribir.escribirEnFichero(ruta, Ordenar.ClasificacionFinal2());
		
		AbrirArchivo.abrirArchivo(ruta);
		
		
		
		
		
		
	}

}
