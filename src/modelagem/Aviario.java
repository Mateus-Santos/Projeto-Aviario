package modelagem;
//Biblioteca Utilizada com o intutito de usar os arrays em java.
import java.util.*;
//Outra biblioteca possivel seria a [java.util.Arrays] para uma busca de optimização.

public class Aviario {
    
    /*
    
      |  Em pesquisa encontrei essa forma para usar em array                        |
      |                                                                             |
      |  List<String> testList = new ArrayList<String>();                           |
      |                                                                             |
      | Deixarei registrado como uma futura forma para atualização de optimização.  |
    
    */
    private Cliente cliente;
    private double largura;
    private double comprimento;
    private double altura;
    private double peDireito;
    //Alguns aviarios podem possuir mais de uma estrutura.
    public List<Obstaculo> estrutura_direita = new ArrayList<Obstaculo>();
    public List<Obstaculo> estrutura_esquerda = new ArrayList<Obstaculo>();

    public Aviario(Cliente cliente, double largura, double comprimento, double altura, double peDireito) {
        this.cliente = cliente;
        this.largura = largura;
        this.comprimento = comprimento;
        this.altura = altura;
        this.peDireito = peDireito;
    }
       
    // inserindo os GETs e SETs
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    // Variavel com sigla "ed" significa Estrutura Direita
    public void setEstrutura_direita(Obstaculo ed){
        estrutura_direita.add(ed);
    }
    
    public String getEstrutura_direita(){
        Obstaculo obstaculo = null;
        for(int i=0; i < this.estrutura_direita.size(); i++){
            obstaculo = this.estrutura_direita.get(i);
            System.out.println("Estrutura: " + obstaculo.getNome() + " | Metragem: " + obstaculo.getMetragem());
        }
        return "Finalizado!";
    }
    
    // Variavel com sigla ee significa Estrutura esquerda
    public void setEstrutura_esquerda(Obstaculo ee){
        estrutura_esquerda.add(ee);
    }
    
    public String getEstrutura_esquerda(){
        Obstaculo obstaculo = null;
        for(int i=0; i < this.estrutura_esquerda.size(); i++){
            obstaculo = this.estrutura_esquerda.get(i);
            System.out.println("Estrutura: " + obstaculo.getNome() + " | Metragem: " + obstaculo.getMetragem());
        }
        return "Finalizado!";
    }

    public double getLargura(){
        return this.largura;
    }
    
    public void setLargura(double l){
        this.largura = l;
    }

    public double getComprimento(){
        return this.comprimento;
    }
    
    public void setComprimento(double com){
        this.comprimento = com;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double alt){
        this.altura = alt;
    }  
    
    public double getPeDireito() {
		return peDireito;
	}

	public void setPeDireito(double peDireito) {
		this.peDireito = peDireito;
	}

	//Calcular a metragem da tela
    public double metragemTelaDireita (){
        double metragem_tela = 0;
        if(this.estrutura_direita.size() > 0){
            double metragem_obstaculos = 0;
            Obstaculo obstaculo = null;
            for(int i=0; i < this.estrutura_direita.size(); i++){
                obstaculo = this.estrutura_direita.get(i);
                metragem_obstaculos = metragem_obstaculos + obstaculo.getMetragem();
            }
            metragem_tela = this.getComprimento() - metragem_obstaculos;
            return metragem_tela;
        }
        else{
            metragem_tela = this.getComprimento();
            return metragem_tela;
        }
    }
    
    public double metragemTelaEsquerda(){
        double metragem_tela = 0;
        if(this.estrutura_esquerda.size() > 0){
            double metragem_obstaculos = 0;
            Obstaculo obstaculo = null;
            for(int i=0; i < this.estrutura_esquerda.size(); i++){
                obstaculo = estrutura_esquerda.get(i);
                metragem_obstaculos = metragem_obstaculos + obstaculo.getMetragem();
            }
            metragem_tela = this.getComprimento() - metragem_obstaculos;
            return metragem_tela;
        }
        else{
            metragem_tela = this.getComprimento();
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