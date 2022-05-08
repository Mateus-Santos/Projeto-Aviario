package uniftc.projeto;

public class Obstaculo {
    private String nome;
    private double metragem;

    public Obstaculo(String nome, double metragem) {
        this.nome = nome;
        this.metragem = metragem;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nom){
        this.nome = nom;  
    }
    
    public double getMetragem(){
        return this.metragem;
    }
    
    public void setMetragem(double met){
        this.metragem = met;
    }
    
}
