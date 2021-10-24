package controler;

import java.util.ArrayList;
import java.util.List;

import mode.TipoVeiculo;
import mode.Veiculo;

public class Principal {

	public static void main(String[] args) {
		List<Veiculo> veiculos = new ArrayList<>();
		Veiculo veiculo = new Veiculo();
		Veiculo veiculo2 = new Veiculo();
		Veiculo veiculo3 = new Veiculo();
		veiculo.setTipoVeiculo(TipoVeiculo.MOTO);
		veiculo.setPlaca("123123");
		veiculo2.setTipoVeiculo(TipoVeiculo.CARRO);
		veiculo3.setTipoVeiculo(TipoVeiculo.UTILITARIO);
		veiculo3.setPlaca("asd123");
		
		veiculos.add(veiculo);
		veiculos.add(veiculo2);
		veiculos.add(veiculo3);
		
		System.out.println("Qual o tamanho da lista? "+veiculos.size());
		veiculos.forEach(v->System.out.println(v.getPlaca()+" "+v.getTipoVeiculo()));
		
		
		
		
		
		//for (itn i=0; i>lenge; i++ ) {}
		

	}

}
