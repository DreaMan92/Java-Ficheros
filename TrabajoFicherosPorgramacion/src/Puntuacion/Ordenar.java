package Puntuacion;

import java.util.ArrayList;
import Tiempo.*;
import Entidades.*;
import Recursos.*;

public class Ordenar{
	public static ArrayList<Tiempo>tiemporestado;
	public static ArrayList<Ciclista>tiemposGeneralE1;
	public static ArrayList<Ciclista>Abandonos;
	
	public static void calcularT(ArrayList<Ciclista>lista,Tiempo salida) {// este metodo lo que hace es recibir una lista de dorsal y tiempo (ciclistas) y crea otro con los tiempos ya restados al tiempo de salida.
		tiemporestado=new ArrayList<Tiempo>();
		
		for(Ciclista i :lista) {
			i.getUnTiempo().restaTiempo(salida);	
			tiemporestado.add(i.getUnTiempo());
		}		
	}
	public static void calcularTContra(ArrayList<Ciclista>lista,ArrayList<Ciclista>tiempo) {
		Puntos.ordenNumDorsal(lista);
		Puntos.ordenNumDorsal(tiempo);
		tiemporestado=new ArrayList<Tiempo>();
		
		for(int i=0;i<lista.size();i++) {
			lista.get(i).getUnTiempo().restaTiempo(tiempo.get(i).getUnTiempo());
			tiemporestado.add(lista.get(i).getUnTiempo());
		}
	}
	public static ArrayList<Ciclista> dorsalTiempoGeneral(ArrayList<Ciclista>uno){
		tiemposGeneralE1=new ArrayList<>();
		int j=0;
		for(Ciclista i:uno) {
			tiemposGeneralE1.add(new Ciclista(i.getDorsal(),tiemporestado.get(j)));
			j++;
		}
		return tiemposGeneralE1;
	}
	public static ArrayList<Ciclista> sumaTiempoArray(ArrayList<Ciclista>uno,ArrayList<Ciclista>dos){
		Puntos.ordenNumDorsal(uno);
		Puntos.ordenNumDorsal(dos);
		for(int i=0;i<dos.size();i++) {
			dos.get(i).getUnTiempo().sumaTiempo(uno.get(i).getUnTiempo());
		}
		return dos;
	}
	
	public static  String Puntuacion(ArrayList<Ciclista>lista,String categoria) {
		int num=1;
		String cadena="";
		String espacio=" ";
		cadena="|-------------------------------------------------------|\n";
		cadena=cadena+"| Puntuación:                                           |\n";
		for(@SuppressWarnings("unused") Ciclista i:lista) {
			if(num>=10) {
				espacio="";
			}else {espacio=" ";}
			if(num>3&&!categoria.equals("categoria1")) {break;}else if(num>4) {break;}
			cadena=cadena+"| "+espacio+num+". ("+lista.get(num-1).getDorsal()+") "+Cuadrar.añadirEspaciosNom(Buscar.obetenerAtributosPorDorsal(lista.get(num-1).getDorsal()).getNombre())+"           "+tiemporestado.get(num-1) + "  "+Puntos.numerosPuntuacion(categoria)[num-1]+" Puntos |\n";
			num++;			
		}	
		return cadena;
	}
	public static  String PuntuacionTotal(ArrayList<Ciclista>lista) {
		int num=1;
		int j=0;
		String espacio=" ";	
		String cadena="";
		cadena="|-------------------------------------------------------|\n";
		for(Ciclista i : lista) {
			if(num>=10) {
				espacio="";
			}else {espacio=" ";}
			cadena=cadena+"| "+espacio+num+". ("+i.getDorsal()+") "+Cuadrar.añadirEspaciosNom(Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getNombre())+Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getPais()+"           "+tiemporestado.get(j) + " |\n";
			num++;
			j++;			
		}	
		return cadena;
	}
	public static  String PuntuacionGeneralTotal(ArrayList<Ciclista>lista) {
	int num=1;
	String espacio=" ";	
	String cadena="";
	cadena="|-------------------------------------------------------|\n";
	for(Ciclista i : lista) {
		if(num>=10) {
			espacio="";
		}else {espacio=" ";}
		cadena=cadena+"| "+espacio+num+". ("+i.getDorsal()+") "+Cuadrar.añadirEspaciosNom(Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getNombre())+Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getPais()+"           "+i.getUnTiempo() + " |\n";
		num++;			
	}	
	return cadena;
}
	public static String ClasificacionM() {
		Puntos.losPrimerosM();
		int num=1;
		String espacio=" ";	
		String espacio2=" ";
		String cadena="";
		cadena="|                                                       |\n";
		cadena=cadena+"| Clasificación:                                        |\n";
		for(Ciclista i :Puntos.listaCicPuntos) {
			if(num>=10) {
				espacio="";
			}else {espacio=" ";}
			if(i.getPuntosM()>=10) {
				espacio2="";
			}else {espacio2=" ";}
			if(i.getPuntosM()!=0) {
				cadena=cadena+"| "+espacio+num+". ("+i.getDorsal()+")"+Cuadrar.añadirEspaciosNom(Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getNombre())+Cuadrar.añadirEspaciosEquipo(Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getEquipo())+" "+espacio2+i.getPuntosM()+" Puntos |\n";
				num++;
			}			
		}
		return cadena;
	}
	public static String ClasificacionP() {
		Puntos.losPrimerosP();
		int num=1;
		String espacio=" ";	
		String espacio2=" ";
		String cadena="";
		cadena="|                                                       |\n";
		cadena=cadena+"| Clasificación:                                        |\n";
		for(Ciclista i :Puntos.listaCicPuntos) {
			if(num>=10) {
				espacio="";
			}else {espacio=" ";}
			if(i.getPuntosP()>=10) {
				espacio2="";
			}else {espacio2=" ";}
			if(i.getPuntosP()!=0) {
				cadena=cadena+"| "+espacio+num+". ("+i.getDorsal()+")"+Cuadrar.añadirEspaciosNom(Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getNombre())+Cuadrar.añadirEspaciosEquipo(Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getEquipo())+" "+espacio2+i.getPuntosP()+" Puntos |\n";
				num++;
			}			
		}
		return cadena;
	}	
	public static String ClasificacionFinal1() {
		String cadena="";
		cadena="                                                         \n";
		cadena=cadena+"---------------------------------------------------------\n";
		cadena=cadena+"|                    CLASIFICACIONES                    |\n";
		cadena=cadena+"|-------------------------------------------------------|\n";
		cadena=cadena+"|GENERAL :                                              |";
		
		return cadena;		
				
	}
	
	public static String ClasificacionFinal2() {
		String cadena="";
		cadena=cadena+"|-------------------------------------------------------|\n";
		cadena=cadena+"|METAS VOLANTES :                                       |\n";
		cadena=cadena+ClasificacionM();
		cadena=cadena+"|-------------------------------------------------------|\n";
		cadena=cadena+"|MONTAÑA :                                              |\n";
		cadena=cadena+ClasificacionP();
		cadena=cadena+"---------------------------------------------------------\n";
		return cadena;		
				
	}
	public static void listaAbandonos(ArrayList<Ciclista> salida, ArrayList<Ciclista> meta) { //buscamos el que si que esta y le decimos que no le guarde, asi sabemos cual tenemos que guardar.
		Abandonos = new ArrayList<Ciclista>();
		for (int i = 0; i < salida.size(); i++) {
			boolean encontrado = false;
			for (int j = 0; j < meta.size(); j++) {
				if (salida.get(i).getDorsal().equals(meta.get(j).getDorsal())) {
				encontrado = true;
				}
			}
			if (!encontrado) {
				Abandonos.add(salida.get(i));				
			}
		}
	}	
	public static void matarAbandonos() {
		for (int i = 0; i < Puntos.listaCicPuntos.size(); i++) {
			if (Puntos.listaCicPuntos.get(i).getDorsal().equals(Abandonos.get(0).getDorsal())) {
				Puntos.listaCicPuntos.remove(Puntos.listaCicPuntos.get(i));
			}
		}
	}
	public static String mostrarAbandonos() {
		String cadena="";
		cadena=cadena+"| Abandonos:                                            |\n";
		for(Ciclista i : Abandonos) {
			cadena=cadena+"| ("+Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getDorsal()+") "+Buscar.obetenerAtributosPorDorsal(i.getDorsal()).getNombre()+"\n";			
		}				
		return cadena;		
	}	

	public static ArrayList<Ciclista> ordenarPorTiempo(ArrayList<Ciclista> uno) {
		ArrayList<Ciclista>ordenados = new ArrayList<>();
		for(Ciclista i: uno) {
			for(int j =0; j<ordenados.size();j++) {
				if (!i.getUnTiempo().esMayor(ordenados.get(j).getUnTiempo())) {
					ordenados.add(j, i);
					break;
				}
				if(j==ordenados.size()-1) {
					ordenados.add(i);
					break;
				}
			}
			if(ordenados.size()==0) {
				ordenados.add(i);
			}
			
		}	
		return ordenados;
	}
}
