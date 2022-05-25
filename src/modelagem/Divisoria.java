package modelagem;

public class Divisoria{
	private String descricaoLinhas;
	private double valor_unitario;
	private double quantidade;
	private double orçamento;
	
	public Divisoria (String descricaoLinhas , double Valor_unitario) {
		this.descricaoLinhas = descricaoLinhas;
		this.valor_unitario = Valor_unitario;
		
	}
	public String getDescricaoLinhas() {
		return this.descricaoLinhas;
	}
	
	public void setDescricaoLinhas(String descricaolinhas) {
		this.descricaoLinhas = descricaolinhas;
	}
	
	public double getValor_unitario() {
		return this.valor_unitario;
	}
	
	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	
	public double calculoDivisoria(double comprimento) {
		if ((comprimento%30)>0) {
			this.quantidade = (comprimento/30)-(comprimento%30);
			this.orçamento = this.quantidade = this.valor_unitario;
		}else {
			this.quantidade = (comprimento/30);
			this.orçamento = this.quantidade * this.valor_unitario;
		}
		
		
		return orçamento;
	}
	
}