package Tiempo;

public class Tiempo {
	private int hora;
	private int minuto;
	private int segundo;

	public Tiempo(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public Tiempo(Tiempo unTiempo) {
	}

	public Tiempo(String tiempo) {
		this.hora = Integer.parseInt(tiempo.split(":")[0]);
		this.minuto = Integer.parseInt(tiempo.split(":")[1]);
		this.segundo = Integer.parseInt(tiempo.split(":")[2]);

	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getminuto() {
		return minuto;
	}

	public void setminuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	/*---------------------------------------------------------------*/
	private void compMinuto() {
		if (minuto >= 60) {
			minuto = minuto % 60;
			hora++;
			
		}
	}

	public void incMin() {
		minuto += 1;
		compMinuto();

	}

	public void incSeg() {
		segundo += 1;
		compSegundos();

	}

	private void compSegundos() {
		if (segundo >= 60) {
			segundo = segundo % 60;
			incMin();

		}
	}

	public void sumaTiempo(Tiempo unTiempo) {
		this.segundo = segundo + unTiempo.getSegundo();
		compSegundos();
		this.minuto = minuto + unTiempo.getminuto();
		compMinuto();
		this.hora = hora + unTiempo.getHora();
		
	}

	public void restaTiempo(Tiempo untiempo) {
		this.segundo = segundo - untiempo.getSegundo();
		if (segundo < untiempo.getSegundo()) {
			segundo = segundo + 60;
			minuto--;
			compSegundos();
		} else {
			compSegundos();
		}
		this.minuto = minuto - untiempo.getminuto();
		if (minuto < untiempo.getminuto()) {
			minuto = minuto + 60;
			hora--;
			compMinuto();
		} else {
			compMinuto();
		}
		this.hora = hora - untiempo.getHora();

	}
	public boolean esMayor(Tiempo untiempo) {
	if(this.hora>untiempo.getHora()) {
		return true;
	}else if(this.hora==untiempo.getHora()) {
		if(this.minuto>untiempo.getminuto()) {
			return true;
		}else if(this.minuto==untiempo.getminuto()) {
			if(this.segundo>untiempo.getSegundo()) {
				return true;
			}else {return false;}
		}else {return false;}
	}else {return false;}
	
	}
	
	@Override
	public String toString() {
		String mostrarHora = String.format("%02d", hora) + ":" + String.format("%02d", minuto) + ":"
				+ String.format("%02d", segundo);

		return mostrarHora;

	}

}
