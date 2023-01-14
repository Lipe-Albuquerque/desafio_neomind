package br.com.filipe.relogio.service;

public class RelogioService {

	private int hora;
	private int minutos;

	public RelogioService() {
		super();
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int retornaAnguloRelogio(int hora, int minuto) {
		
		if(hora < 0 || minuto < 0) {
			return 0;
		}
		
		hora = (hora > 12 ? hora -= 12 : hora);

		int angleminute = (360 / 60 * minuto);
		
		int angleHours = (360 / 12) * hora;
		
		if((angleHours > angleminute)) {
			return angleHours - angleminute;
		} else {
			return angleminute - angleHours;
		}
	}

}
