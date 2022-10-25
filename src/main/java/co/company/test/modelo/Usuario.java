/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.company.test.modelo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jesus
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {
    
    private Integer id;
    private String nombre;
    private String email;
    private String pais;

    public Usuario(String nombre, String email, String pais) {
        this.nombre = nombre;
        this.email = email;
        this.pais = pais;
    }
    
    
}
