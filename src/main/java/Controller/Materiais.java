/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author devmat
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MateriaisController {

    // Lista para armazenar os objetos de Materiais (simulando um banco de dados)
    private List<Materiais> materiaisList = new ArrayList<>();

    // Método para listar todos os registros
    public List<Materiais> listar() {
        return materiaisList;
    }

    // Método para cadastrar um novo registro
    public void cadastrar(Materiais material) {
        materiaisList.add(material);
    }

    // Método para deletar um registro pelo ID
    public boolean deletar(int id) {
        Materiais materialToDelete = materiaisList.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
        
        if (materialToDelete != null) {
            materiaisList.remove(materialToDelete);
            return true;
        }
        return false;
    }

    // Método para pesquisar um registro pelo ID
    public Materiais pesquisarPorId(int id) {
        return materiaisList.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método para pesquisar por qualquer critério (exemplo: descrição, valor, quantidade ou data)
    public List<Materiais> pesquisar(String criterio, Double valor, Integer quantidade) {
        return materiaisList.stream()
                .filter(m -> (m.getDescricao().contains(criterio) || 
                            m.getData().contains(criterio) ||
                            String.valueOf(m.getValor()).contains(criterio)) &&
                            (valor == null || m.getValor() == valor) && 
                            (quantidade == null || m.getQuantidades() == quantidade))
                .collect(Collectors.toList());
    }
}
