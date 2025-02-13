/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author devmat
 */
public class Pintura {

    private int id;
    private boolean pintura; // Tipo BIT será mapeado para booleano
    private boolean retoque; // Tipo BIT será mapeado para booleano
    private String data;
    private double valor; // Tipo DECIMAL será mapeado para double
    private String descricao;
    private int projetoId; // Nova coluna para a chave estrangeira

    // Construtores
    public Pintura() {}

    public Pintura(int id, boolean pintura, boolean retoque, String data, double valor, String descricao, int projetoId) {
        this.id = id;
        this.pintura = pintura;
        this.retoque = retoque;
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

    public boolean isPintura() {
        return pintura;
    }

    public void setPintura(boolean pintura) {
        this.pintura = pintura;
    }

    public boolean isRetoque() {
        return retoque;
    }

    public void setRetoque(boolean retoque) {
        this.retoque = retoque;
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
        return "Pintura{" +
                "id=" + id +
                ", pintura=" + pintura +
                ", retoque=" + retoque +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", projetoId=" + projetoId +
                '}';
    }
}
