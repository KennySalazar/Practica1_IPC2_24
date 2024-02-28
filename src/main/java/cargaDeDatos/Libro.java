/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargaDeDatos;

/**
 *
 * @author DAVID
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private String codigo;
    private String cantidad;

    public Libro(String titulo, String autor, String codigo, String cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }
    
    

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", codigo=" + codigo + ", cantidad=" + cantidad + '}';
    }
    
    

}
