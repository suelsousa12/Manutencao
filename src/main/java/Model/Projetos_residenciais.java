/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author devmat
 */
public class Projetos_residenciais {
    
    public class ProjetoResidencial {

    private int id;
    private String nome;
    private String dataInicio;
    private String dataFim;
    private String descricao;
    private Integer eletricaId; // Chave estrangeira para a tabela eletrica
    private Integer hidraulicaId; // Chave estrangeira para a tabela hidraulica
    private Integer ferramentasId; // Chave estrangeira para a tabela ferramentas
    private Integer materiaisId; // Chave estrangeira para a tabela materiais
    private Integer pinturaId; // Chave estrangeira para a tabela pintura

    // Construtores
    public ProjetoResidencial() {}

    public ProjetoResidencial(int id, String nome, String dataInicio, String dataFim, String descricao,
                               Integer eletricaId, Integer hidraulicaId, Integer ferramentasId, Integer materiaisId, Integer pinturaId) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
        this.eletricaId = eletricaId;
        this.hidraulicaId = hidraulicaId;
        this.ferramentasId = ferramentasId;
        this.materiaisId = materiaisId;
        this.pinturaId = pinturaId;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getEletricaId() {
        return eletricaId;
    }

    public void setEletricaId(Integer eletricaId) {
        this.eletricaId = eletricaId;
    }

    public Integer getHidraulicaId() {
        return hidraulicaId;
    }

    public void setHidraulicaId(Integer hidraulicaId) {
        this.hidraulicaId = hidraulicaId;
    }

    public Integer getFerramentasId() {
        return ferramentasId;
    }

    public void setFerramentasId(Integer ferramentasId) {
        this.ferramentasId = ferramentasId;
    }

    public Integer getMateriaisId() {
        return materiaisId;
    }

    public void setMateriaisId(Integer materiaisId) {
        this.materiaisId = materiaisId;
    }

    public Integer getPinturaId() {
        return pinturaId;
    }

    public void setPinturaId(Integer pinturaId) {
        this.pinturaId = pinturaId;
    }

    // Método toString para fácil visualização do objeto
    @Override
    public String toString() {
        return "ProjetoResidencial{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", descricao='" + descricao + '\'' +
                ", eletricaId=" + eletricaId +
                ", hidraulicaId=" + hidraulicaId +
                ", ferramentasId=" + ferramentasId +
                ", materiaisId=" + materiaisId +
                ", pinturaId=" + pinturaId +
                '}';
    }
}   
}
