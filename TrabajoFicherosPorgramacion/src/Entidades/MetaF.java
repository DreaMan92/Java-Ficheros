package Entidades;

public class MetaF {
	private String Lugar;
	private String KM;

	public MetaF(String lugar, String kM) {
		super();
		Lugar = lugar;
		KM = kM;
	}

	public String getLugar() {
		return Lugar;
	}

	public String getKM() {
		return KM;
	}
	@Override
	public  String toString() {
		String cadena="";
		cadena="|-------------------------------------------------------|\n";
		cadena=cadena+"|   "+getLugar()+"               |   "+getKM()+"    |";		
		
		return cadena;
	}

}
