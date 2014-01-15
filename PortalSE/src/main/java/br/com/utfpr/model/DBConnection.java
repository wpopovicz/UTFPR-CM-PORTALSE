/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import br.com.utfpr.config.DatabaseConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author willian
 */
public class DBConnection {



    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                // carrega definicoes estaticas do driver JDBC
                Class.forName(DatabaseConfig.DATABASE_DRIVER);
                // cria conexao
                con = DriverManager.getConnection(DatabaseConfig.DATABASE_URL , DatabaseConfig.DATABASE_USER, DatabaseConfig.DATABASE_PASSWORD);
            }
            return con;
        } catch (Exception ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static ResultSet executeSQL(String sql) {
        try {
            if (con == null) {
                con = getConnection();
            }
            // cria objeto que executa comandos SQL
            Statement stm = con.createStatement();
            // executa SQL
            return stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

   
}
