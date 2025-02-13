/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author devmat
 */
public class Materiais {
    
    private int id;
    private int quantidades;
    private String data;
    private double valor;
    private String descricao;
    private int projetoId; // Nova coluna para a chave estrangeira

    // Construtores
    public Materiais() {}

    public Materiais(int id, int quantidades, String data, double valor, String descricao, int projetoId) {
        this.id = id;
        this.quantidades = quantidades;
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

    public int getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(int quantidades) {
        this.quantidades = quantidades;
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

    // Método toString para fácil visualização do objeto
    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", quantidades=" + quantidades +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", projetoId=" + projetoId +
                '}';
    }
}
