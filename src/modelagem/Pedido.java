package modelagem;

public class Pedido {
    
    private Funcionario funcionario; // FUNCIONARIO
    private String data_pedido; //Data do pedido
    private Cliente cliente; //Cliente
    private double metragem_tela_esquerda; //armazenar valores da metragem da tela do lado esquerdo.
    private double metragem_tela_direita; //armazenar valores da metragem da tela do lado direito.

    private double valor_tela_esquerda; //Valor da tela do lado esquerdo do aviario.
    private double valor_tela_direita; //Valor da tela do lado direito do aviario
    
    
    
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

    //Calcular a metragem da tela
    public double metragemTelaDireita (Aviario aviario){
        double metragem_tela = 0;
        if(aviario.estrutura_direita.size() > 0){
            double metragem_obstaculos = 0;
            Obstaculo obstaculo = null;
            for(int i=0; i <= aviario.estrutura_direita.size(); i++){
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

    public double metragemTelaEsquerda(Aviario aviario){
        double metragem_tela = 0;
        if(aviario.estrutura_esquerda.size() > 0){
            double metragem_obstaculos = 0;
            Obstaculo obstaculo = null;
            for(int i=0; i <= aviario.estrutura_esquerda.size(); i++){
                obstaculo = aviario.estrutura_esquerda.get(i);
                metragem_obstaculos = metragem_obstaculos + obstaculo.getMetragem();
            }
            metragem_tela = (aviario.getComprimento() - metragem_obstaculos) * aviario.getAltura();
            return metragem_tela;
        }
        else{
        	metragem_tela = aviario.getComprimento() * aviario.getAltura();
            this.metragem_tela_esquerda = metragem_tela;
            return this.metragem_tela_esquerda;
        }
    }
    
    //regra de três 
    public double orcamentoTelaEsquerda(double metragem_tela, Tela tela){
        double orcamento = 0;
        orcamento = (tela.getValor_rolo() * metragem_tela) / tela.getMetro_quadrado();
        this.valor_tela_esquerda = orcamento;
        return this.valor_tela_esquerda;
    }
    
    public double orcamentoTelaDireita(double metragem_tela, Tela tela){
        double orcamento = 0;
        orcamento = (tela.getValor_rolo() * metragem_tela) / tela.getMetro_quadrado();
        this.valor_tela_direita = orcamento;
        return this.valor_tela_direita;
    }
}
