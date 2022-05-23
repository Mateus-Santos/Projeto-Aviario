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
    private boolean peDireito;
    //Alguns aviarios podem possuir mais de uma estrutura.
    public List<Obstaculo> estrutura_direita = new ArrayList<Obstaculo>();
    public List<Obstaculo> estrutura_esquerda = new ArrayList<Obstaculo>();

    public Aviario(Cliente cliente, double largura, double comprimento, double altura, boolean peDireito) {
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
    
    public Obstaculo getEstrutura_esquerda(int i){
        return this.estrutura_esquerda.get(i);
        /* Percorrer o array obstaculo.
        for(i < this.estrutura_esquerda.size(); i++){
            obstaculo = this.estrutura_esquerda.get(i);
            System.out.println("Estrutura: " + obstaculo.getNome() + " | Metragem: " + obstaculo.getMetragem());
        }
        */
    }

    public int qtd_obstaculo() {
    	return this.estrutura_esquerda.size();
    }
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public double getLargura(){
        return this.largura;
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
    
    public boolean getPeDireito() {
		return this.peDireito;
	}

	public void setPeDireito(boolean peDireito) {
		this.peDireito = peDireito;
	}
}