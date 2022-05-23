package modelagem;

public class Lona {
	
    private double largura;
    private double comprimento;
    private boolean pe_direito;
    private double quantidade_lona;
    private double area_lona;
    
    

    public Lona(double largura , double comprimento, boolean pe_direito){
        this.largura = largura;
        this.comprimento = comprimento; 
        this.area_lona = this.largura * this.comprimento;
        this.pe_direito = pe_direito;
    
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public boolean getPe_direito() {
        return pe_direito;
    }

    public void setPe_direito(boolean pe_direito) {
        this.pe_direito = pe_direito;
    }

    public double getQuantidade_lona() {
        return quantidade_lona;
    }

    public void setQuantidade_lona(double quantidade_lona) {
        this.quantidade_lona = quantidade_lona;
    }

    public double getArea_lona() {
        return area_lona;
    }

    public void setArea_lona(double area_lona) {
        this.area_lona = area_lona;
    }
        
}