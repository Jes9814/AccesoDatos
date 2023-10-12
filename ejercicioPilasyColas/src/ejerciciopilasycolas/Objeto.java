/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopilasycolas;

/**
 *
 * @author jeslo
 */
public class Objeto {
    
    private String Nombre;
    private int Edad;

    public Objeto() {
        this.Edad = 10;
        this.Nombre = "Juan";
    }
    
     public Objeto(String nombre, int edad) {
        this.Nombre = nombre;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Objeto{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }
    
    
    
}
