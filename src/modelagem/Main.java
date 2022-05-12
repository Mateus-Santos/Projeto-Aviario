package modelagem;

public class Main {
	public static void main(String[] args) {
		// Cadastrado de cliente
		Cliente cliente = new Cliente("06/05/2022", "Mateus Santos", "mateus.jesus2@ftc.edu.br");
		System.out.println("Cliente cadastrado com sucesso!!");
		System.out.println("\nNome: " + cliente.getNome());
		System.out.println("\nEmail: " + cliente.getEmail());
		System.out.println("\nData de Cadastro: " + cliente.getData_cadastro());

		// Cadastrado de funcionario
		Funcionario funcionario = new Funcionario("Gerente", "Ronaldo Alves", "ronaldo.alves@ftc.edu.br");
		System.out.println("\nFuncionario cadastrado com sucesso!!");
		System.out.println("\nNome: " + funcionario.getNome());
		System.out.println("\nEmail: " + funcionario.getEmail());
		System.out.println("\nCargo: " + funcionario.getCargo());

		// Criar um obstaculo
		Obstaculo exaustor = new Obstaculo("Exaustor", 1.5);
		Obstaculo cooler = new Obstaculo("Cooler", 2.0);
		// Criando estrutura

		// Cliente, Largura|comprimento|altura|P� direito
		Aviario aviario = new Aviario(cliente, 100.0, 100.0, 2.5, 1.0);
		aviario.setEstrutura_direita(cooler);
		aviario.setEstrutura_direita(cooler);
		aviario.setEstrutura_esquerda(exaustor);
		aviario.setEstrutura_esquerda(exaustor);
		// Toda tela possui uma descrição, valor do rolo, metro por rolo
		Tela tela = new Tela("Fina", 100.0, 50.0);
		
		// Cliente, Potencia das Lampadas
		Lampada lampada = new Lampada(150.0);

		Pedido pedido = new Pedido();
		System.out.println("\nAviario Direito: " + aviario.getEstrutura_direita());
		System.out.println("\nAviario Esquerdo: " + aviario.getEstrutura_esquerda());
		System.out.println("\nMetragem de tela direita aviario: " + aviario.metragemTelaDireita());
		System.out.println("\nMetragem de tela esquerda aviario: " + aviario.metragemTelaEsquerda());
		System.out.println("Orcamento de tela direita aviario: R$: "
				+ aviario.orcamentoTelaEsquerda(aviario.metragemTelaDireita(), tela));
		System.out.println("Orcamento de tela esquerda aviario: R$: "
				+ aviario.orcamentoTelaEsquerda(aviario.metragemTelaEsquerda(), tela));
		double orcamento_total = 0;
		orcamento_total = aviario.orcamentoTelaEsquerda(aviario.metragemTelaDireita(), tela)
				+ aviario.orcamentoTelaEsquerda(aviario.metragemTelaEsquerda(), tela);
		System.out.println("Orçamento total das telas é de: R$: " + orcamento_total);
		System.out.println("Quantidade de lampadas necess�rias: " + lampada.quantidadeLampdas(aviario, aviario, aviario));
	}

}
