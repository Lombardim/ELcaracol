package elcaracol;
import java.util.Scanner;

public class Sobre {
    Scanner lea = new Scanner (System.in);
    String nombre, direccion, ciudad, pais;
    int codigopostal, ancho, alto;
    Tamaño tamaño;
    Destino destino;
    Origen origen;

    public Sobre(String nombre, String direccion, String ciudad, String pais, int codigopostal) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigopostal = codigopostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(int codigopostal) {
        this.codigopostal = codigopostal;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    
    
}
