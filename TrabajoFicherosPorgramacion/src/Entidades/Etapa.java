package Entidades;

public class Etapa {
	private String etapa;
	private String recorrido;
	private String KM;

	public Etapa(String etapa, String recorrido, String kM) {
		super();
		this.etapa = etapa;
		this.recorrido = recorrido;
		KM = kM;
	}
	public String getEtapa() {
		return etapa;
	}

	public String getRecorrido() {
		return recorrido;
	}

	public String getKM() {
		return KM;
	}
	
	@Override
	public  String toString() {
		String cadena="";
		cadena="|-------------------------------------------------------|\n";
		cadena=cadena+"| "+getEtapa()+" |  "+getRecorrido()+"  | "+getKM()+" |";		
		
		
		return cadena;
	}

}
