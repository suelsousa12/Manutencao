/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ConexaoBancoDeDados;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */
public class UsuarioController{
    
    // criando metodo de inserir usuario no banco de dados
    
    public boolean cadastrandoUsuario(Usuario user){
        // comando do banco de dados para inserir
        String query = 
         "INSERT INTO Usuarios(nome,cpf,senha,email,data_nascimento)"
                + "VALUES(?,?,?,?,?);";
        
        // Connection - conecta-se ao banco de dados
        // PreparedStatement manda o comando sql para executar no BD
        try(Connection conection = ConexaoBancoDeDados.getConnection();
        PreparedStatement preparedStatement =
                conection.prepareStatement(query)){       
            
            // mandar os dados para dentro do insert
            preparedStatement.setString(1,user.getNome());
            preparedStatement.setString(2, user.getCpf());
            preparedStatement.setString(3,user.getSenha());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setDate(5, user.getDataNascimento());
            
            /*try(ResultSet resultSet = preparedStatement.executeQuery()){
                return resultSet.next();
            }// final do segundo try*/
            // verifica se o insert foi executado
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
            
        }catch(SQLException e){
            // imprimindo erro que deu ao inserir usuário
            System.err.print("Erro ao Inserir Dados!" + e);
            return false;
        }// final do try catch
        
    }// fim do metodo cadastrandoUsuario()
    
    public boolean atualizarUsuario(Usuario user) {
    // Comando SQL para atualizar o usuário
    String query = 
        "UPDATE Usuarios SET nome = ?, senha = ?, email = ?, data_nascimento = ? WHERE cpf = ?;";
    
    try (Connection conection = ConexaoBancoDeDados.getConnection();
         PreparedStatement preparedStatement = conection.prepareStatement(query)) {

        // Configurando os valores dos campos
        preparedStatement.setString(1, user.getNome());
        preparedStatement.setString(2, user.getSenha());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setDate(4, user.getDataNascimento());
        preparedStatement.setString(5, user.getCpf());

        // Executa o comando e verifica se houve alterações
        int rowsAffected = preparedStatement.executeUpdate();
        return rowsAffected > 0;

    } catch (SQLException e) {
        // Imprime o erro no console
        System.err.println("Erro ao atualizar dados do usuário! " + e);
        return false;
    }
}
    
    public boolean deletarUsuario(int idusuario){
        // comando sql para deletar usuarios
        String query="DELETE FROM Usuarios WHERE id_cliente= ?;";        
        // conectando ao banco de dados e mandando o comando delete
        try(Connection conection = ConexaoBancoDeDados.getConnection();
            PreparedStatement preparedstatement 
                    = conection.prepareStatement(query) ){
           // mandando o idusuario para dentro do comando sql
            preparedstatement.setInt(1,idusuario);
            
            int resultado = preparedstatement.executeUpdate();
            return resultado > 0;
            
        }catch(SQLException e){ //se der erro
            System.err.print("Exclusão não realizada!"+e);
            return false;
        }// final do catch        
    }// fim do metodo de deletar
    
    
}// final da classe
