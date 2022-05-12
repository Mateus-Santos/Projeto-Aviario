package uniftc.projeto;

public class Estrutura {
    private String obstaculo;
    private int qtd_obstaculo;
    
    public String getObstaculo(){
        return this.obstaculo;
    }
    
    public void setObstaculo(String o){
        this.obstaculo = o;
    }
    
    public int getQtd_obstaculo(){
        return this.qtd_obstaculo;
    }
    
    public void setQtd_obstaculo(int qtdo){
        this.qtd_obstaculo = qtdo;
    }
    
    void status(){
        System.out.println("Nome do Obstaculo: " + obstaculo);
        System.out.println("Quantidade: " + qtd_obstaculo);
        System.out.println("");
    }
}
