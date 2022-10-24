/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.company.test.modelo;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author jesus
 */
@Data
public class usuario implements Serializable {
    
    private Integer id;
    private String nombre;
    private String email;
    private String pais;
    
    
}
