package modelagem;




public class Rolo {
    
    private double largura;
    private double comprimento;
    private double area;
    
    public Rolo(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
        this.area = this.largura * this.comprimento; 
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
}