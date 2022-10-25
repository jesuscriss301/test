/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.company.test.dao;

import co.company.test.modelo.Usuario;
import co.company.test.util.Conexion;
import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus
 */
public class UsuarioDao {

    private Conexion conexion;
    private static final String INCERTAR_USUARIO_SQL = "INSERT INTO usuario (nombre, email, pais) VALUES (?,?,?); ";
    private static final String DELATE_USUARIO_SQL = "DELATE FROM usuario WHERE id=?;";
    private static final String UPDATE_USUARIO_SQL = "UPDATE usuario SET nombre = ?, email = ?, pais = ? WHERE id = ?; ";
    private static final String SELECT_USUARIO_BY_ID = "SELECT * FROM usuario WHERE id=?; ";
    private static final String SELECT_ALL_USUARIOS = "SELECT * FROM usuario; ";

    public UsuarioDao() {
        this.conexion = Conexion.getConexion();
    }

    public void inset(Usuario usu) {
        try {
            PreparedStatement preparedStatement = conexion.setPreparedStatement(INCERTAR_USUARIO_SQL);
            preparedStatement.setString(1, usu.getNombre());
            preparedStatement.setString(2, usu.getEmail());
            preparedStatement.setString(3, usu.getPais());
            conexion.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {

        try {
            PreparedStatement preparedStatement = conexion.setPreparedStatement(DELATE_USUARIO_SQL);
            preparedStatement.setString(1, id + "");
            conexion.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Usuario usu) {
        try {
            PreparedStatement preparedStatement = conexion.setPreparedStatement(UPDATE_USUARIO_SQL);
            preparedStatement.setString(1, usu.getNombre());
            preparedStatement.setString(2, usu.getEmail());
            preparedStatement.setString(3, usu.getPais());
            preparedStatement.setString(4, usu.getId().toString());
            conexion.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectById(int id) {
        try {
            PreparedStatement preparedStatement = conexion.setPreparedStatement(SELECT_USUARIO_BY_ID);
            preparedStatement.setString(1, id + "");
            conexion.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Usuario> selectAll() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            PreparedStatement preparedStatement = conexion.setPreparedStatement(SELECT_ALL_USUARIOS);
            ResultSet rs = conexion.query();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String pais = rs.getString("pais");
                Usuario usu = new Usuario(id, nombre, email, pais);
                usuarios.add(usu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
