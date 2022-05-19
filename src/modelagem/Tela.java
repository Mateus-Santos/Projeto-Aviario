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
	
	private double metro_comprimento_rolo; //Comprimento total do rolo.
	private double metro_altura_rolo; //Altura total da tela.
	private double metro_quadrado; //Metro quadrado do rolo.
	private double valor_rolo; //Valor unitario.

	//Contrutor para todos os atributos.
	public Tela(double metro_comprimento_rolo, double metro_altura_rolo, double valor_rolo) {
		this.metro_comprimento_rolo = metro_comprimento_rolo;
		this.metro_altura_rolo = metro_altura_rolo;
		this.valor_rolo = valor_rolo;
		this.metro_quadrado = metro_altura_rolo*metro_comprimento_rolo;
	}
	
	//Construtor para apenas o valor do rolo.
	public Tela(double valor_rolo) {
		this.valor_rolo = valor_rolo;
	}
	
	//Getts E setts
	
	
	/* OBS: NESSE CASO PRECISAMOS QUE O OBJETO JA POSSUA 
	 * VALORES NO ATRIBUTO DE COMPRIMENTO E ALTURA DO ROLO DA TELA
	*/
	
	public void setMetro_quadrado() {
		if(this.metro_altura_rolo == 0 && this.metro_comprimento_rolo != 0) {
			this.metro_quadrado = this.metro_comprimento_rolo*this.metro_altura_rolo;
		}
		else {
			System.out.printf("Os valores da altura e comprimento do rolo precisam ser maiores que zero.");
		}
	}
	
	public double getMetro_quadrado() {
		return this.metro_quadrado;
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
	
	public double getValor_rolo() {
		return this.valor_rolo;
	}
	
	public void setValor_rolo(double valor_rolo) {
		this.valor_rolo = valor_rolo;
	}
}
