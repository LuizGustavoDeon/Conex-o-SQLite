
package br.com.ifprbiopark.sqlite;
import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    public static void main(String[] args) {
        conect();
        
    }
    public static void conect(){
        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:tds.db");
            Statement stm = c.createStatement();
            // criando uma tabela
            stm.execute("CREATE TABLE IF NOT EXISTS ALUNO(ID INTEGER, NOME VARCHAR(50)");
            
            // inserindo registros
            stm.execute("INSERT INTO ALUNO(ID, NOME)VALUES(1, 'LUIZ'), (2, 'GUSTAVO')");
                    
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        
    }
}
