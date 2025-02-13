/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author devmat
 */
import Model.Ferramentas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FerramentasController {

    // Lista para armazenar os objetos de Ferramentas (simulando um banco de dados)
    private List<Ferramentas> ferramentasList = new ArrayList<>();

    // Método para listar todos os registros
    public List<Ferramentas> listar() {
        return ferramentasList;
    }

    // Método para cadastrar um novo registro
    public void cadastrar(Ferramentas ferramenta) {
        ferramentasList.add(ferramenta);
    }

    // Método para deletar um registro pelo ID
    public boolean deletar(int id) {
        Ferramentas ferramentaToDelete = ferramentasList.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElse(null);
        
        if (ferramentaToDelete != null) {
            ferramentasList.remove(ferramentaToDelete);
            return true;
        }
        return false;
    }

    // Método para pesquisar um registro pelo ID
    public Ferramentas pesquisarPorId(int id) {
        return ferramentasList.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método para pesquisar por qualquer critério (exemplo: nome da ferramenta, descrição, valor ou data)
    public List<Ferramentas> pesquisar(String criterio) {
        return ferramentasList.stream()
                .filter(f -> f.getDescricao().contains(criterio) || 
                            f.getFerramentas().contains(criterio) || 
                            f.getData().contains(criterio) ||
                            String.valueOf(f.getValor()).contains(criterio))
                .collect(Collectors.toList());
    }
}

