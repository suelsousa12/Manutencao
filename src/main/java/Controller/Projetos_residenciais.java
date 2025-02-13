/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author devmat
 */
import Model.Projetos_residenciais.ProjetoResidencial;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjetoResidencialController {

    // Lista para armazenar os objetos de ProjetoResidencial (simulando um banco de dados)
    private List<ProjetoResidencial> projetosResidenciais = new ArrayList<>();

    // Método para listar todos os registros
    public List<ProjetoResidencial> listar() {
        return projetosResidenciais;
    }

    // Método para cadastrar um novo registro
    public void cadastrar(ProjetoResidencial projetoResidencial) {
        projetosResidenciais.add(projetoResidencial);
    }

    // Método para deletar um registro pelo ID
    public boolean deletar(int id) {
        ProjetoResidencial projetoToDelete = projetosResidenciais.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (projetoToDelete != null) {
            projetosResidenciais.remove(projetoToDelete);
            return true;
        }
        return false;
    }

    // Método para pesquisar um registro pelo ID
    public ProjetoResidencial pesquisarPorId(int id) {
        return projetosResidenciais.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método para pesquisar por qualquer critério (nome, descrição, data, etc.)
    public List<ProjetoResidencial> pesquisar(String criterio) {
        return projetosResidenciais.stream()
                .filter(p -> p.getNome().contains(criterio) ||
                            p.getDescricao().contains(criterio) ||
                            p.getDataInicio().contains(criterio) ||
                            p.getDataFim().contains(criterio))
                .collect(Collectors.toList());
    }

    // Método para pesquisar por ID de qualquer componente relacionado (Eletrica, Hidraulica, Ferramentas, Materiais, Pintura)
    public List<ProjetoResidencial> pesquisarPorComponentes(Integer eletricaId, Integer hidraulicaId, Integer ferramentasId,
                                                            Integer materiaisId, Integer pinturaId) {
        return projetosResidenciais.stream()
                .filter(p -> (eletricaId == null || p.getEletricaId().equals(eletricaId)) &&
                            (hidraulicaId == null || p.getHidraulicaId().equals(hidraulicaId)) &&
                            (ferramentasId == null || p.getFerramentasId().equals(ferramentasId)) &&
                            (materiaisId == null || p.getMateriaisId().equals(materiaisId)) &&
                            (pinturaId == null || p.getPinturaId().equals(pinturaId)))
                .collect(Collectors.toList());
    }
}
