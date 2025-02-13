/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author devmat
 */
public class EletricaController {

    // Lista para armazenar os objetos de Eletrica (simulando um banco de dados)
    private List<Eletrica> eletricaList = new ArrayList<>();

    // Método para listar todos os registros
    public List<Eletrica> listar() {
        return eletricaList;
    }

    // Método para cadastrar um novo registro
    public void cadastrar(Eletrica eletrica) {
        eletricaList.add(eletrica);
    }

    // Método para deletar um registro pelo ID
    public boolean deletar(int id) {
        Eletrica eletricaToDelete = eletricaList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
        
        if (eletricaToDelete != null) {
            eletricaList.remove(eletricaToDelete);
            return true;
        }
        return false;
    }

    // Método para pesquisar um registro pelo ID
    public Eletrica pesquisarPorId(int id) {
        return eletricaList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método para pesquisar por qualquer critério (exemplo: nome do projeto, data ou valor)
    public List<Eletrica> pesquisar(String criterio) {
        return eletricaList.stream()
                .filter(e -> e.getDescricao().contains(criterio) || 
                            e.getFerramentas().contains(criterio) || 
                            e.getData().contains(criterio))
                .collect(Collectors.toList());
    }
}