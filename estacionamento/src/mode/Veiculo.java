package mode;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Veiculo {
	
	@Id
	private String placa;
	private String marca;
	private String modelo;
	private double fatorEstacionamento;
	private String horaEntrada;
	private String horaSaida;
	private Double totalEstacionamento;
	private TipoVeiculo tipoVeiculo;
	
	
	
	
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Veiculo(String placa) {
		super();
		this.placa = placa;
	}


	public Veiculo(String placa, String marca, String modelo, double fatorEstacionamento, String horaEntrada,
			String horaSaida, Double totalEstacionamento, TipoVeiculo tipoVeiculo) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.fatorEstacionamento = fatorEstacionamento;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.totalEstacionamento = totalEstacionamento;
		this.tipoVeiculo = tipoVeiculo;
	}





	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getFatorEstacionamento() {
		return fatorEstacionamento;
	}


	public void setFatorEstacionamento(double fatorEstacionamento) {
		this.fatorEstacionamento = fatorEstacionamento;
	}


	public String getHoraEntrada() {
		return horaEntrada;
	}


	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}


	public String getHoraSaida() {
		return horaSaida;
	}


	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}


	public Double getTotalEstacionamento() {
		return totalEstacionamento;
	}


	public void setTotalEstacionamento(Double totalEstacionamento) {
		this.totalEstacionamento = totalEstacionamento;
	}


	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}


	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", fatorEstacionamento="
				+ fatorEstacionamento + ", horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida
				+ ", totalEstacionamento=" + totalEstacionamento + ", tipoVeiculo=" + tipoVeiculo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(fatorEstacionamento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((horaEntrada == null) ? 0 : horaEntrada.hashCode());
		result = prime * result + ((horaSaida == null) ? 0 : horaSaida.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((tipoVeiculo == null) ? 0 : tipoVeiculo.hashCode());
		result = prime * result + ((totalEstacionamento == null) ? 0 : totalEstacionamento.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (Double.doubleToLongBits(fatorEstacionamento) != Double.doubleToLongBits(other.fatorEstacionamento))
			return false;
		if (horaEntrada == null) {
			if (other.horaEntrada != null)
				return false;
		} else if (!horaEntrada.equals(other.horaEntrada))
			return false;
		if (horaSaida == null) {
			if (other.horaSaida != null)
				return false;
		} else if (!horaSaida.equals(other.horaSaida))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (tipoVeiculo != other.tipoVeiculo)
			return false;
		if (totalEstacionamento == null) {
			if (other.totalEstacionamento != null)
				return false;
		} else if (!totalEstacionamento.equals(other.totalEstacionamento))
			return false;
		return true;
	}
	
	
	
	
	
	

}
