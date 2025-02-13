/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// @author jhessikkaelly
 
public class ConexaoBancoDeDados {
    // conectando com sql server
    /* CRIANDO UMA VARIAVEL PARA CAPTURAR O ENDEREÇO DE CONEXÃO
    COM O BANCO DE DADOS.
    JDBC:SQLSERVER - É O DRIVE
    LOCALHOST- SERVIDOR   1433 - PORTA UTILIZADA
    DATABASENAME=  NOME DO SEU BANCO DE DADOS
    INTEGRATEDSECURITY E TRUSTSERVERCERTIFICATE É PARA LOGAR*/
   private static final String URL=
           "jdbc:sqlserver://localhost:1433;databaseName=ManutencaoPredial;"
           + "integratedSecurity=true;"
           + "trustServerCertificate=true";
   
   public static Connection getConnection(){
       // criando um objeto do tipo Connection
       Connection conection = null;
       try{ // se não der erro nenhum
           // estabeleça a conexão com o banco de dados
           conection= DriverManager.getConnection(URL);
           System.out.println("Conexão bem sucedida!");
       }catch(SQLException e){ // caso dê algum erro
           System.out.println("Erro de Conexao"+ e);
       }// final do try catch
       return conection;
   }// final do getConnection 
}// final do public class