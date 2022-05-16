/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelagem;

/**
 *
 * @author Mateus Santos
 */

public class Tela {
	
	private double metro_comprimento_rolo;
	private double metro_altura_rolo;
	private double metro_quadrado;
	private double valor_rolo;

	public Tela(double metro_comprimento_rolo, double metro_altura_rolo, double valor_rolo) {
		this.metro_comprimento_rolo = metro_comprimento_rolo;
		this.metro_altura_rolo = metro_altura_rolo;
		this.valor_rolo = valor_rolo;
		this.metro_quadrado = metro_altura_rolo*metro_comprimento_rolo;
	}
	
	public double getMetro_comprimento_rolo() {
		return metro_comprimento_rolo;
	}
	
	public void setMetro_comprimento_rolo(double metro_comprimento_rolo) {
		this.metro_comprimento_rolo = metro_comprimento_rolo;
	}
	
	public double getMetro_altura_rolo() {
		return this.metro_altura_rolo;
	}
	
	public void setMetro_altura_rolo(double metro_altura_rolo) {
		this.metro_altura_rolo = metro_altura_rolo;
	}
	
	public double getMetro_quadrado() {
		return this.metro_quadrado;
	}
	
	public void setMetro_quadrado() {
		this.metro_quadrado = this.metro_comprimento_rolo*this.metro_altura_rolo;
	}
	
	public double getValor_rolo() {
		return this.valor_rolo;
	}
	
	public void setValor_rolo(double valor_rolo) {
		this.valor_rolo = valor_rolo;
	}
}
