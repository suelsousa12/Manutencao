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

public class PinturaController {

    // Lista para armazenar os objetos de Pintura (simulando um banco de dados)
    private List<Pintura> pinturaList = new ArrayList<>();

    // Método para listar todos os registros
    public List<Pintura> listar() {
        return pinturaList;
    }

    // Método para cadastrar um novo registro
    public void cadastrar(Pintura pintura) {
        pinturaList.add(pintura);
    }

    // Método para deletar um registro pelo ID
    public boolean deletar(int id) {
        Pintura pinturaToDelete = pinturaList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        
        if (pinturaToDelete != null) {
            pinturaList.remove(pinturaToDelete);
            return true;
        }
        return false;
    }

    // Método para pesquisar um registro pelo ID
    public Pintura pesquisarPorId(int id) {
        return pinturaList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método para pesquisar por qualquer critério (exemplo: descrição, valor, pintura, retoque ou data)
    public List<Pintura> pesquisar(String criterio, Double valor, Boolean pintura, Boolean retoque) {
        return pinturaList.stream()
                .filter(p -> (p.getDescricao().contains(criterio) || 
                            p.getData().contains(criterio) ||
                            String.valueOf(p.getValor()).contains(criterio)) &&
                            (valor == null || p.getValor() == valor) && 
                            ((pintura == null && retoque == null) || 
                            (pintura != null && p.isPintura() == pintura) ||
                            (retoque != null && p.isRetoque() == retoque)))
                .collect(Collectors.toList());
    }
}

