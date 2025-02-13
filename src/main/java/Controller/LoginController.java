package Controller;

import Model.ConexaoBancoDeDados;
import Model.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {
    
    // metodo de autenticar usuário
   public Usuario authenticate(String email, String senha) {
        String query = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        
        try (Connection connection = ConexaoBancoDeDados.getConnection();// conexão com banco de dados
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {// mandar o comando select para ser executado no BD
            
            // substitui a ? pela variavel que o usuario informou
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, senha);
            
            // resultset recebe o retorno do comando sql 
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()){
                
                // captura do banco de dados os dados do usuário
                int id = resultSet.getInt("id_cliente");
                String nome = resultSet.getString("nome");
                String senhausuario = resultSet.getString("senha");
                String emailusuario = resultSet.getString("email");
                String cpf = resultSet.getString("cpf");
                Date data = resultSet.getDate("data_nascimento");
                // mandando um usuário para a tela de login
                return new Usuario(id, emailusuario, senhausuario,  cpf, 
                        nome, data);
                }// fim do if
                
            }
        } catch (SQLException e) {
            System.err.println("Erro ao autenticar o usuário: " + e.getMessage());
            return null; // retorna falso caso não ache o usuário
        }
        return null;
    }
}