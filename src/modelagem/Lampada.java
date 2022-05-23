/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelagem;

/**
 *
 * @author Mateus Santos
 */
public class Lampada {

	private double potenciaLampada;
	private double area;
	private double lumens;

	public Lampada(double potenciaLampada) {
		this.potenciaLampada = potenciaLampada;
	}

	public double getPotenciaLampada() {
		return potenciaLampada;
	}

	public void setPotenciaLampada(double potenciaLampada) {
		this.potenciaLampada = potenciaLampada;
	}

	public double quantidadeLampdas(Aviario largura, Aviario comprimento, Aviario peDireito) {
		int qtdLampadas = 0;
		this.area = largura.getLargura() * comprimento.getComprimento();
		this.lumens = (this.area * 150) / (0.55 * 0.66);
		qtdLampadas = (int) Math.round(this.lumens / (this.potenciaLampada * 100 * 0.86));
		return qtdLampadas;

	}

}
