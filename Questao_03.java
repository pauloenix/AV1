package av1;

public class Questao_03 {

	public static void main(String[] args) {
		Copo c1 = new Copo(350,350,"roxo");
		Copo c2 = new Copo(350,0, "azul");
		
		
		c2.adicionarLiquido(150);
		
		c1.obterInformacoes();
		c2.obterInformacoes();
		
				

	}

}
