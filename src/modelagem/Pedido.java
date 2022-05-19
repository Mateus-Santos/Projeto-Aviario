package modelagem;

public class Pedido {
    
    private Funcionario funcionario; // FUNCIONARIO
    private String data_pedido; //Data do pedido
    private Cliente cliente; //Cliente
    private double metragem_tela_esquerda; //armazenar valores da metragem da tela do lado esquerdo.
    private double metragem_tela_direita; //armazenar valores da metragem da tela do lado direito.
    private double valor_tela_esquerda; //Valor da tela do lado esquerdo do aviario.
    private double valor_tela_direita; //Valor da tela do lado direito do aviario
    
    //Construtor do pedido
    public Pedido(Funcionario funcionario, String data_pedido, Cliente cliente)
    {
		this.funcionario = funcionario;
		this.data_pedido = data_pedido;
		this.cliente = cliente;
	}

  //Calcular a metragem da tela do lado direito do aviario
    public double metragemTelaDireita (Aviario aviario){
        double metragem_tela = 0;
        if(aviario.estrutura_direita.size() > 0){
            double metragem_obstaculos = 0;
            Obstaculo obstaculo = null;
            for(int i=0; i < aviario.estrutura_direita.size(); i++){
                obstaculo = aviario.estrutura_direita.get(i);
                metragem_obstaculos = metragem_obstaculos + obstaculo.getMetragem();
            }
            metragem_tela = (aviario.getComprimento() - metragem_obstaculos) * aviario.getAltura();
            this.metragem_tela_direita = metragem_tela;
            return this.metragem_tela_direita;
        }
        else{
        	metragem_tela = aviario.getComprimento() * aviario.getAltura();
            this.metragem_tela_direita = metragem_tela;
            return this.metragem_tela_direita;
        }
    }

    //Calcular a metragem da tela do lado esquerdo do aviario
    public double metragemTelaEsquerda(Aviario aviario){
        double metragem_tela = 0; // Variavel que vai armazenar a metragem total de tela do lado esquerdo.
        //Verificar se existe obstaculos para serem subtraidos no comprimento do aviario, como os exaustores e coolings.
        if(aviario.estrutura_esquerda.size() > 0){
            double metragem_obstaculos = 0; //Variavel que vai armazenar o total de metragem ocupada pelos obstaculos.
            Obstaculo obstaculo = null; //Variavel para armazenar o objeto obstaculo que está no array, um obstaculo por fez, e de cada obstaculo será extraido a metram.
            for(int i=0; i < aviario.estrutura_esquerda.size(); i++){
                obstaculo = aviario.estrutura_esquerda.get(i); //Coletando o obstaculo
                metragem_obstaculos = metragem_obstaculos + obstaculo.getMetragem(); //Coletando a metragem desse obstaculo e somando.
            }
            metragem_tela = (aviario.getComprimento() - metragem_obstaculos) * aviario.getAltura(); //Subtraindo o comprimento pelo total de comprimento dos obstaculos e encontrando o m².
            this.metragem_tela_esquerda = metragem_tela;
            return this.metragem_tela_esquerda;
        }
        //O mesmo calculo porém com o array vazio já que não possui obstaculos
        else{
        	metragem_tela = aviario.getComprimento() * aviario.getAltura(); //Encontrando M².
            this.metragem_tela_esquerda = metragem_tela; //Armazenando o mº de telas do lado esquerdo no atributo.
            return this.metragem_tela_esquerda;
        }
    }
    
    //Funcoes que aplicam a regra de tres para realizar os orcamentos
    public double orcamentoTelaEsquerda(double metragem_tela, Tela tela){
        double orcamento = 0;	//Variavel que vai armazenar o orcamento.
        orcamento = (tela.getValor_rolo() * metragem_tela);//Aplicacao da regra de tres.
        this.valor_tela_esquerda = orcamento;
        return this.valor_tela_esquerda;
    }
    //A mesma regra de três apenas para o lado direito.
    public double orcamentoTelaDireita(double metragem_tela, Tela tela){
        double orcamento = 0;
        orcamento = (tela.getValor_rolo() * metragem_tela);
        this.valor_tela_direita = orcamento;
        return this.valor_tela_direita;
    }
    
    //Getts e Setts.
    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMetragem_tela_esquerda() {
		return metragem_tela_esquerda;
	}

	public void setMetragem_tela_esquerda(double metragem_tela_esquerda) {
		this.metragem_tela_esquerda = metragem_tela_esquerda;
	}

	public double getMetragem_tela_direita() {
		return metragem_tela_direita;
	}

	public void setMetragem_tela_direita(double metragem_tela_direita) {
		this.metragem_tela_direita = metragem_tela_direita;
	}

	public double getValor_tela_esquerda() {
		return valor_tela_esquerda;
	}

	public void setValor_tela_esquerda(double valor_tela_esquerda) {
		this.valor_tela_esquerda = valor_tela_esquerda;
	}

	public double getValor_tela_direita() {
		return valor_tela_direita;
	}

	public void setValor_tela_direita(double valor_tela_direita) {
		this.valor_tela_direita = valor_tela_direita;
	}

	public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }
  
}
