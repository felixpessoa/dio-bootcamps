package mode;

public class Estacionamento {
	

	private double valorHora;
	private double totalFaturamento;
	private double totalFaturamentoCarro;
	private double totalFaturamentoMoto;
	private double totalFaturamentoUtilitario;
	
	
	public Estacionamento() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Estacionamento(double valorHora, double totalFaturamento, double totalFaturamentoCarro,
			double totalFaturamentoMoto, double totalFaturamentoUtilitario) {
		super();
		this.valorHora = valorHora;
		this.totalFaturamento = totalFaturamento;
		this.totalFaturamentoCarro = totalFaturamentoCarro;
		this.totalFaturamentoMoto = totalFaturamentoMoto;
		this.totalFaturamentoUtilitario = totalFaturamentoUtilitario;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	public double getTotalFaturamento() {
		return totalFaturamento;
	}


	public void setTotalFaturamento(double totalFaturamento) {
		this.totalFaturamento = totalFaturamento;
	}


	public double getTotalFaturamentoCarro() {
		return totalFaturamentoCarro;
	}


	public void setTotalFaturamentoCarro(double totalFaturamentoCarro) {
		this.totalFaturamentoCarro = totalFaturamentoCarro;
	}


	public double getTotalFaturamentoMoto() {
		return totalFaturamentoMoto;
	}


	public void setTotalFaturamentoMoto(double totalFaturamentoMoto) {
		this.totalFaturamentoMoto = totalFaturamentoMoto;
	}


	public double getTotalFaturamentoUtilitario() {
		return totalFaturamentoUtilitario;
	}


	public void setTotalFaturamentoUtilitario(double totalFaturamentoUtilitario) {
		this.totalFaturamentoUtilitario = totalFaturamentoUtilitario;
	}
	
	
	
	
	
	

}
