package dao;

import java.util.List;

import mode.Veiculo;

public interface VeiculoDao {
	
	public void salvar(Veiculo veiculo);
	
	public void altera(Veiculo veiculo);
	
	public void  remover(String placa);
	
	public Veiculo pesquisar(String placa);
	
	public List<Veiculo> listaTodos();

}
