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
		Aviario aviario = new Aviario(cliente, 12, 206.5, 2, 1.0);
		//aviario.setEstrutura_direita(cooler);
		//aviario.setEstrutura_direita(cooler);
		//aviario.setEstrutura_esquerda(exaustor);
		//aviario.setEstrutura_esquerda(exaustor);
		
		Tela tela = new Tela(16.40); //Declarando tela com o valor unitario.
		
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
		
		//Codigo juliel ------------------------------------
		
		Rolo rolo1 = new Rolo(4,50);
        Rolo rolo2 = new Rolo(6,50);
        Rolo rolo3 = new Rolo(8,50);
        Rolo rolo4 = new Rolo(4,100);
        Rolo rolo5 = new Rolo(6,100);
        Rolo rolo6 = new Rolo(8,100);
        
        Lona lona1 = new Lona(12,150,true);
        System.out.println("");
        System.out.println("Área da lona: " + lona1.getArea_lona() + " Metros");
        System.out.println("");
        System.out.println("Rolos disponíveis:");
        int rolo_ideal = 0;
        if(lona1.getPe_direito()==true){
            if ((lona1.getComprimento()%100)==0){
                rolo_ideal = 1;
            }
            if ((lona1.getArea_lona()%rolo1.getArea())==0){
                System.out.println("");
                System.out.println("Dimensão: " + rolo1.getLargura() + "X" + rolo1.getComprimento() + "M");
                System.out.println("Quantidade de rolo 1: " + (lona1.getArea_lona()/rolo1.getArea()));
                if ((((rolo1.getLargura()/lona1.getLargura())*2)==1)&&((lona1.getComprimento()/100)!=1)&& (rolo_ideal == 0) ){
                    System.out.println("Rolo IDEAL");
                    rolo_ideal = 1;
                }
                
            }
            if ((lona1.getArea_lona()%rolo2.getArea())==0){
                System.out.println("");
                System.out.println("Dimensão: " + rolo2.getLargura() + "X" + rolo2.getComprimento() + "M");
                System.out.println("Quantidade de rolo 2: " + (lona1.getArea_lona()/rolo2.getArea()));
                if ((((rolo2.getLargura()/lona1.getLargura())*2)==1)&&((lona1.getComprimento()/100)!=1)&& (rolo_ideal == 0) ){
                    System.out.println("Rolo IDEAL");
                    rolo_ideal = 1;
                }
                
            }
            if ((lona1.getArea_lona()%rolo3.getArea())==0){
                System.out.println("");
                System.out.println("Dimensão: " + rolo3.getLargura() + "X" + rolo3.getComprimento() + "M");
                System.out.println("Quantidade de rolo 3: " + (lona1.getArea_lona()/rolo3.getArea()));
                if ((((rolo3.getLargura()/lona1.getLargura())*2)==1)&&((lona1.getComprimento()/100)!=1)&& (rolo_ideal == 0) ){
                    System.out.println("Rolo IDEAL");
                    rolo_ideal = 1;
                }
                
            }
            if ((lona1.getArea_lona()%rolo4.getArea())==0){
                System.out.println("");
                System.out.println("Dimensão: " + rolo4.getLargura() + "X" + rolo4.getComprimento() + "M");
                System.out.println("Quantidade de rolo 4: " + (lona1.getArea_lona()/rolo4.getArea()));
                if ((((rolo4.getLargura()/lona1.getLargura())*2)==1)&&((lona1.getComprimento()%100)==0)&& (rolo_ideal == 1) ){
                    System.out.println("Rolo IDEAL");
                    rolo_ideal = 1;
                }
                
                
            }
            if ((lona1.getArea_lona()%rolo5.getArea())==0){
                System.out.println("");
                System.out.println("Dimensão: " + rolo5.getLargura() + "X" + rolo5.getComprimento() + "M");
                System.out.println("Quantidade de rolo 5: " + (lona1.getArea_lona()/rolo5.getArea()));
                if ((((rolo5.getLargura()/lona1.getLargura())*2)==1)&&((lona1.getComprimento()%100)==0)&& (rolo_ideal == 1) ){
                    System.out.println("Rolo IDEAL");
                    rolo_ideal = 1;
                }
                
                
            }
            if ((lona1.getArea_lona()%rolo6.getArea())==0){
                System.out.println("");
                System.out.println("Dimensão: " + rolo6.getLargura() + "X" + rolo6.getComprimento() + "M");
                System.out.println("Quantidade de rolo 6: " + (lona1.getArea_lona()/rolo6.getArea()));
                if ((((rolo6.getLargura()/lona1.getLargura())*2)==1)&&((lona1.getComprimento()%100)==0)&& (rolo_ideal == 1) ){
                    System.out.println("Rolo IDEAL");
                    rolo_ideal = 1;
                }
                
                
            }   
        }else{
            
        }
	}

}
