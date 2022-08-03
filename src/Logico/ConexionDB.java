/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author lmari
 */
public class ConexionDB {
    //base de datos global

    //base de datos local
    String dbL = "lmcserver"; //nombre de db
    String urlL = "jdbc:mysql://127.0.0.1:3306/";
    String userL = "root";
    String passwordL = "mario_cs3103";

    //variables Globales
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public ConexionDB(){
        //constructor
    }

    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(urlL+dbL, userL, passwordL);
            System.out.println("Se conecto a la db");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return cx;
    }
    

}
