/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elcaracol;

/**
 *
 * @author lombardim
 */
public class Lugar {
    private String nombre, direccion, ciudad, pais;
    private int codigop;

    public Lugar(String nombre, String direccion, String ciudad, String pais, int codigop) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigop = codigop;
    }
    
}
