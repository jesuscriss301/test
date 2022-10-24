package co.company.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jesus
 */
public class Conexion {
    
    private Connection con = null;
    private PreparedStatement preparedStatement;
    
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String bdName = "test";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "";
    
    public Conexion(){
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url+bdName, username, password);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
