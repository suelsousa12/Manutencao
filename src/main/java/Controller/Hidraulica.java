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

public class HidraulicaController {

    // Lista para armazenar os objetos de Hidraulica (simulando um banco de dados)
    private List<Hidraulica> hidraulicaList = new ArrayList<>();

    // Método para listar todos os registros
    public List<Hidraulica> listar() {
        return hidraulicaList;
    }

    // Método para cadastrar um novo registro
    public void cadastrar(Hidraulica hidraulica) {
        hidraulicaList.add(hidraulica);
    }

    // Método para deletar um registro pelo ID
    public boolean deletar(int id) {
        Hidraulica hidraulicaToDelete = hidraulicaList.stream()
                .filter(h -> h.getId() == id)
                .findFirst()
                .orElse(null);
        
        if (hidraulicaToDelete != null) {
            hidraulicaList.remove(hidraulicaToDelete);
            return true;
        }
        return false;
    }

    // Método para pesquisar um registro pelo ID
    public Hidraulica pesquisarPorId(int id) {
        return hidraulicaList.stream()
                .filter(h -> h.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método para pesquisar por qualquer critério (exemplo: nome da ferramenta, descrição, valor, manutenção ou instalação)
    public List<Hidraulica> pesquisar(String criterio, Boolean manutencao, Boolean instalacao) {
        return hidraulicaList.stream()
                .filter(h -> (h.getDescricao().contains(criterio) || 
                            h.getFerramentas().contains(criterio) || 
                            h.getData().contains(criterio) ||
                            String.valueOf(h.getValor()).contains(criterio)) &&
                            (manutencao == null || h.getManutencao() == manutencao) && 
                            (instalacao == null || h.getInstalacao() == instalacao))
                .collect(Collectors.toList());
    }
}

