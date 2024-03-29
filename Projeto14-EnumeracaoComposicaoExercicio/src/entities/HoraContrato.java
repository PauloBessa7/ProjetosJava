package entities;

import java.time.LocalDate;

public class HoraContrato {
	private LocalDate data;
	private double horaContrato;
	private Integer horas;
	
	public double valorTotal() {
		return horaContrato * horas;
	}
	
	public HoraContrato() {
		
	}

	public HoraContrato(LocalDate data, double horaContrato, Integer horas) {
		this.data = data;
		this.horaContrato = horaContrato;
		this.horas = horas;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getHoraContrato() {
		return horaContrato;
	}

	public void setHoraContrato(double horaContrato) {
		this.horaContrato = horaContrato;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "HoraContrato [data=" + data + ", horaContrato=" + horaContrato + ", horas=" + horas + "]"+ ", MM =" + data.getMonthValue() + "]"+ ", yyyy =" + data.getYear() + "]";
	}
	
	
}
