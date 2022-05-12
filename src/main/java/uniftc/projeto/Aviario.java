package uniftc.projeto;


public class Aviario {
    private String cliente;
    private int estrutura_direita;
    private int estrutura_esquerda;
    private double largura;
    private double comprimento;
    private double altura;
    
    // inserindo os GETs e SETs
    public String getCliente(){
        return this.cliente;
        
    }
    
    public void setCliente(String c){
        this.cliente = c;
    }
    
    public int getEstrutura_direita(){
        return this.estrutura_direita;
        
    }
    
    public void setEstrutura_direita(int ed){
        this.estrutura_direita = ed;
    }
    
    public int getEstrutura_esquerda(){
        return this.estrutura_esquerda;
       
    }
    
    public void setEstrutura_esquerda(int ee){
        this.estrutura_esquerda = ee;
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
        this.cliente = this.cliente + " Atualizado";
        this.estrutura_direita = this.estrutura_direita + this.estrutura_direita;
        this.estrutura_esquerda = this.estrutura_esquerda + this.estrutura_esquerda;
        this.largura = this.largura + this.largura;
        this.comprimento = this.comprimento + this.comprimento;
        this.altura = this.altura + this.altura;
        this.consultar_estrutura();
        
        
    }
    
}
