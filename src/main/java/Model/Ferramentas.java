/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author devmat
 */
public class Ferramentas {
    
    private int id;
    private String ferramentas;
    private String data;
    private double valor;
    private String descricao;
    private int projetoId;

    // Construtor padrão
    public Ferramentas() {}

    // Construtor com parâmetros
    public Ferramentas(int id, String ferramentas, String data, double valor, String descricao, int projetoId) {
        this.id = id;
        this.ferramentas = ferramentas;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.projetoId = projetoId;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(String ferramentas) {
        this.ferramentas = ferramentas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(int projetoId) {
        this.projetoId = projetoId;
    }

    @Override
    public String toString() {
        return "Ferramentas{" +
                "id=" + id +
                ", ferramentas='" + ferramentas + '\'' +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", projetoId=" + projetoId +
                '}';
    }
  
}
