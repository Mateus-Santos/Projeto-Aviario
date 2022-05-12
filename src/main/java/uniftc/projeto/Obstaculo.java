package uniftc.projeto;

public class Obstaculo {
    private String nome;
    private double metragem;
    
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
    
    void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Metragem: " + this.metragem);
        System.out.println("");
    }
}
