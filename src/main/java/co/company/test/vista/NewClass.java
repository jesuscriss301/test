/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.company.test.vista;

import co.company.test.dao.UsuarioDao;
import co.company.test.modelo.Usuario;

/**
 *
 * @author jesus
 */
public class NewClass {
    public static void main(String[] args) {
        try {
            
        Usuario usu = new Usuario("Manuel","manuel_12_2013@hotmail.com", "Colombia");
        UsuarioDao usuDao = new UsuarioDao();
        usuDao.inset(usu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
