package uniftc.projeto;
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
    
    private Estrutura[] estrutura_direita;
    private Estrutura[] estrutura_esquerda;
    
    
    // inserindo os GETs e SETs
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Estrutura[] getEstrutura_direita(){
        return this.estrutura_direita;
    }
    
    //Variavel com sigla "ed" significa Estrutura Direita
    public void setEstrutura_direita(Estrutura ed){
        this.estrutura_direita[estrutura_direita.length-1] = ed;
    }
    
    public Estrutura[] getEstrutura_esquerda(){
        return this.estrutura_esquerda;
    }
    
    //Variavel com sigla ee significa Estrutura esquerda
    public void setEstrutura_esquerda(Estrutura ee){
        this.estrutura_esquerda[estrutura_esquerda.length-1] = ee;
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
    
    // Inserindo as funções
    void consultar_estrutura(){
        System.out.println("Nome do Cliente: " + this.cliente);
        System.out.println("Estrutura da direita: " + this.estrutura_direita);
        System.out.println("Estrutura da esquerda: " + this.estrutura_esquerda);
        System.out.println("Largura: " + this.largura);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Altura: " + this.altura);
    }
    
    void atualizar_estrutura(){
        /*
        
        this.cliente = this.cliente + " Atualizado";
        this.estrutura_direita = this.estrutura_direita + this.estrutura_direita;
        this.estrutura_esquerda = this.estrutura_esquerda + this.estrutura_esquerda;
        this.largura = this.largura + this.largura;
        this.comprimento = this.comprimento + this.comprimento;
        this.altura = this.altura + this.altura;
        this.consultar_estrutura();
        
        */
    }
    
}
