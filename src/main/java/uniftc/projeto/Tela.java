/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uniftc.projeto;

/**
 *
 * @author Mateus Santos
 */
public class Tela {
    private String descricao;
    private double metro_rolo;
    private double valor_rolo;
    private double valor_metro;
    
    public Tela(String descricao, double valor_rolo, double metro_rolo) {
        this.metro_rolo = metro_rolo;
        this.descricao = descricao;
        this.valor_rolo = valor_rolo;
    }
    
    public double valor_metro(){
        this.valor_metro = this.valor_rolo/this.metro_rolo;
        return this.valor_metro;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getMetro_rolo() {
        return metro_rolo;
    }

    public void setMetro_rolo(double metro_rolo) {
        this.metro_rolo = metro_rolo;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor_rolo() {
        return valor_rolo;
    }

    public void setValor_rolo(double valor_rolo) {
        this.valor_rolo = valor_rolo;
    }
    
}
