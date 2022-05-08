package uniftc.projeto;

public class Pedido {
    
    private Funcionario funcionario; // FUNCIONARIO
    private String componente; // FORNECEDOR
    private String data_pedido;
    private double largura_aviario;
    private double altura_aviario;
    private double comprimento_aviario;
    
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

    public double getLargura_aviario() {
        return largura_aviario;
    }

    public void setLargura_aviario(double largura_aviario) {
        this.largura_aviario = largura_aviario;
    }

    public double getAltura_aviario() {
        return altura_aviario;
    }

    public void setAltura_aviario(double altura_aviario) {
        this.altura_aviario = altura_aviario;
    }

    public double getComprimento_aviario() {
        return comprimento_aviario;
    }

    public void setComprimento_aviario(double comprimento_aviario) {
        this.comprimento_aviario = comprimento_aviario;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
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
            metragem_tela = aviario.getComprimento() - metragem_obstaculos;
            return metragem_tela;
        }
        else{
            metragem_tela = aviario.getComprimento();
            return metragem_tela;
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
            metragem_tela = aviario.getComprimento() - metragem_obstaculos;
            return metragem_tela;
        }
        else{
            metragem_tela = aviario.getComprimento();
            return metragem_tela;
        }
    }
    
    public double orcamentoTelaEsquerda(double metragem_tela, Tela tela){
        double orcamento = 0;
        orcamento = tela.valor_metro()*metragem_tela;
        return orcamento;
    }
    
    public double orcamentoTelaDireita(double metragem_tela, Tela tela){
        double orcamento = 0;
        orcamento = tela.valor_metro()*metragem_tela;
        return orcamento;
    }
}
