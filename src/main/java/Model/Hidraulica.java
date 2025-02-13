/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author devmat
 */
public class Hidraulica {
    
    private int id;
    private Boolean manutencao;
    private Boolean instalacao;
    private String ferramentas;
    private String data;
    private double valor;
    private String descricao;
    private int projetoId;

    // Construtor padrão
    public Hidraulica() {}

    // Construtor com parâmetros
    public Hidraulica(int id, Boolean manutencao, Boolean instalacao, String ferramentas, String data, double valor, String descricao, int projetoId) {
        this.id = id;
        this.manutencao = manutencao;
        this.instalacao = instalacao;
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

    public Boolean getManutencao() {
        return manutencao;
    }

    public void setManutencao(Boolean manutencao) {
        this.manutencao = manutencao;
    }

    public Boolean getInstalacao() {
        return instalacao;
    }

    public void setInstalacao(Boolean instalacao) {
        this.instalacao = instalacao;
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
        return "Hidraulica{" +
                "id=" + id +
                ", manutencao=" + manutencao +
                ", instalacao=" + instalacao +
                ", ferramentas='" + ferramentas + '\'' +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", projetoId=" + projetoId +
                '}';
    }   
}
