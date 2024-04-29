
package com.mycompany.libropoo;

public class Libro {
    // Atributos de la clase Libro
    private String titulo;          // O(1) 
    private String autor;           // O(1) 
    private String genero;          // O(1) 
    private int anoPublicacion;     // O(1) 
    boolean leido;                  // O(1) 

    // Constructor de la clase Libro
    public Libro(String titulo, String autor, String genero, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.leido = false;
    }

    // Método para mostrar la información del libro
    public String mostrarInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año publicación: " + anoPublicacion + ", Género: " + genero;
    }

    // Método para marcar el libro como leído
    public void marcarLeido() {
        this.leido = true;  // O(1) 
    }

    // Método para verificar si el libro es antiguo (más de 50 años de publicación)
    public boolean esAntiguo() {
        int anoActual = java.time.Year.now().getValue();  // O(1) 
        return (anoActual - anoPublicacion) > 50;         // O(1) 
    }

    // Método para verificar si el libro ha sido leído
    public boolean isLeido() {
        return leido;  // O(1) 
    }
}//Cierre class