package Entidades;

public class MetaV {
	private String LugarMetaV;
	private String KM;

	public MetaV(String lugarMetaV, String kM) {
		super();
		LugarMetaV = lugarMetaV;
		KM = kM;
	}

	public String getLugarMetaV() {
		return LugarMetaV;
	}

	public String getKM() {
		return KM;
	}
	@Override
	public  String toString() {
		String cadena="";
		cadena="|-------------------------------------------------------|\n";
		cadena=cadena+"| "+getLugarMetaV()+"                      | "+getKM()+" |";		
		
		return cadena;
	}

}
