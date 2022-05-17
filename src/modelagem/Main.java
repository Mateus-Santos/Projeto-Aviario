package modelagem;

public class Main {
	public static void main(String[] args) {
		// Cadastrado de cliente
		Cliente cliente = new Cliente("06/05/2022", "Mateus Santos", "mateus.jesus2@ftc.edu.br", "Bairro: Jardim Cruzeiro", "999.999.999-50");
		System.out.println("Cliente cadastrado com sucesso!!");
		System.out.println("\nNome: " + cliente.getNome());
		System.out.println("\nEmail: " + cliente.getEmail());
		System.out.println("\nData de Cadastro: " + cliente.getData_cadastro());

		// Cadastrado de funcionario
		Funcionario funcionario = new Funcionario("Gerente", "Ronaldo Alves", "ronaldo.alves@ftc.edu.br", "Bairro: Aviario", "999.999.999-50");
		System.out.println("\nFuncionario cadastrado com sucesso!!");
		System.out.println("\nNome: " + funcionario.getNome());
		System.out.println("\nEmail: " + funcionario.getEmail());
		System.out.println("\nCargo: " + funcionario.getCargo());

		// Criar um obstaculo
		Obstaculo exaustor = new Obstaculo("Exaustor", 1.5);
		Obstaculo cooler = new Obstaculo("Cooler", 2.0);
		
		// Criando estrutura
		// Cliente, Largura, comprimento, altura, Pé direito
		Aviario aviario = new Aviario(cliente, 12, 150, 2.6, 1.0);
		//aviario.setEstrutura_direita(cooler);
		//aviario.setEstrutura_direita(cooler);
		//aviario.setEstrutura_esquerda(exaustor);
		//aviario.setEstrutura_esquerda(exaustor);
		
		//Toda tela possui uma comprimento, altura do rolo, valor_rolo.
		//metragem quadrada da tela 2.600 = 100
		//metragem quadrada do aviario
		Tela tela = new Tela(150, 2.6, 1);
		// Cliente, Potencia das Lampadas
		Lampada lampada = new Lampada(150.0);
		
		
		Pedido pedido = new Pedido(funcionario, "17/05/2022", cliente);
		System.out.println("\nAviario Direito: " + aviario.getEstrutura_direita());
		System.out.println("\nAviario Esquerdo: " + aviario.getEstrutura_esquerda());
		System.out.println("\nMetragem de tela direita aviario: " + pedido.metragemTelaDireita(aviario));
		System.out.println("\nMetragem de tela esquerda aviario: " + pedido.metragemTelaEsquerda(aviario));
		System.out.println("Orcamento de tela direita aviario: R$: "
				+ pedido.orcamentoTelaEsquerda(pedido.metragemTelaDireita(aviario), tela));
		System.out.println("Orcamento de tela esquerda aviario: R$: "
				+ pedido.orcamentoTelaEsquerda(pedido.metragemTelaEsquerda(aviario), tela));
		double orcamento_total = 0;
		orcamento_total = pedido.orcamentoTelaEsquerda(pedido.metragemTelaDireita(aviario), tela)
				+ pedido.orcamentoTelaEsquerda(pedido.metragemTelaEsquerda(aviario), tela);
		System.out.println("Orcamento total das telas e de: R$: " + orcamento_total);
		System.out.println("Quantidade de lampadas necessárias: " + lampada.quantidadeLampdas(aviario, aviario, aviario));
	}

}
