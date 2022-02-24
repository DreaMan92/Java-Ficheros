package Entidades;

public class Puerto {
	private String LugarP;
	private String KM;
	private String Categoria;

	public Puerto(String lugarP, String kM, String categoria) {
		super();
		LugarP = lugarP;
		KM = kM;
		Categoria = categoria;
	}

	public String getLugarP() {
		return LugarP;
	}

	public String getKM() {
		return KM;
	}

	public String getCategoria() {
		return Categoria;
	}
	@Override
	public  String toString() {
		String cadena="";
		cadena="|-------------------------------------------------------|\n";
		cadena=cadena+"|   "+getLugarP()+"                  |   \n|           "+getCategoria()+"                    "+getKM()+" |";			
		
		return cadena;
	}

}
