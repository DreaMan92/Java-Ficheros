package FicherosDeEtapas;

import java.util.ArrayList;

import Entidades.Ciclista;
import Puntuacion.Ordenar;
import Puntuacion.Puntos;
import Recursos.AbrirArchivo;

public class Etapa3Fichero {
	public static ArrayList<Ciclista>terceraGeneral;
	public static void imprimirFicheroEtapa3() {
		String ruta="C:/Datos/AAAFicheroResultadoEtapa3.txt";
		
		LeyendoFicheroEtapa3.LeerEtapa();
		String salida="|-------------------------------------------------------|\n";
		salida=salida+"| Salida:  "+LeyendoFicheroEtapa3.tiempoSalida.toString()+" horas                               |";
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa3.Etapa3.toString());
		Escribir.escribirEnFichero(ruta, salida);
		/*------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa3.MetaVE3.get(0).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa3.DorsalTiempo1,true,false,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa3.DorsalTiempo1,LeyendoFicheroEtapa3.tiempoSalida);
		Escribir.escribirEnFichero(ruta,Ordenar.Puntuacion(LeyendoFicheroEtapa3.DorsalTiempo1,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionM());
		/*---------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa3.MetaVE3.get(1).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa3.DorsalTiempo2,true,false,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa3.DorsalTiempo2,LeyendoFicheroEtapa3.tiempoSalida);
		Escribir.escribirEnFichero(ruta,Ordenar.Puntuacion(LeyendoFicheroEtapa3.DorsalTiempo2,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionM());
		/*--------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa3.MetaVE3.get(2).toString());
		Puntos.añadirPuntos(LeyendoFicheroEtapa3.DorsalTiempo3,true,false,false,false);
		Ordenar.calcularT(LeyendoFicheroEtapa3.DorsalTiempo3,LeyendoFicheroEtapa3.tiempoSalida);
		Escribir.escribirEnFichero(ruta, Ordenar.Puntuacion(LeyendoFicheroEtapa3.DorsalTiempo3,"meta"));
		Escribir.escribirEnFichero(ruta,Ordenar.ClasificacionM());		
		/*-------------------------------------*/
		Escribir.escribirEnFichero(ruta,LeyendoFicheroEtapa3.MetaFE3.toString());
		Ordenar.calcularT(LeyendoFicheroEtapa3.DorsalTiempo4,LeyendoFicheroEtapa3.tiempoSalida);
		Escribir.escribirEnFichero(ruta,Ordenar.PuntuacionTotal(LeyendoFicheroEtapa3.DorsalTiempo4));
		Ordenar.listaAbandonos(LeyendoFicheroEtapa3.DorsalTiempoSalida, LeyendoFicheroEtapa3.DorsalTiempo4);
		Escribir.escribirEnFichero(ruta,Ordenar.mostrarAbandonos());
		Ordenar.matarAbandonos();
		terceraGeneral=new ArrayList<>();
		terceraGeneral=Ordenar.dorsalTiempoGeneral(LeyendoFicheroEtapa3.DorsalTiempo4);
		terceraGeneral=Ordenar.sumaTiempoArray(Etapa2Fichero.segundaGeneral, terceraGeneral);
		terceraGeneral=Ordenar.ordenarPorTiempo(terceraGeneral);
		/*-------------------------------------------------------*/
		Escribir.escribirEnFichero(ruta, Ordenar.ClasificacionFinal1());
		Escribir.escribirEnFichero(ruta,Ordenar.PuntuacionGeneralTotal(terceraGeneral));
		Escribir.escribirEnFichero(ruta, Ordenar.ClasificacionFinal2());
		
		AbrirArchivo.abrirArchivo(ruta);
		
		
		
		
		
		
	}

}
