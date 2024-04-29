package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el título del libro
        System.out.println("Ingrese el título: ");
        String titulo = sc.nextLine(); // O(1) 

        // Solicitar al usuario que ingrese el autor del libro
        System.out.println("Ingrese el autor del libro: ");
        String autor = sc.nextLine(); // O(1) 

        // Solicitar al usuario que ingrese el año de publicación del libro
        System.out.println("Ingrese el año de publicación: ");
        int anoPublicacion = sc.nextInt(); // O(1) 

    
        sc.nextLine(); // O(1) 

        // Solicitar al usuario que ingrese el género del libro
        System.out.println("Ingrese el género del libro: ");
        String genero = sc.nextLine(); // O(1) 

        // Crear un objeto Libro con la información proporcionada por el usuario
        Libro libro1 = new Libro(titulo, autor, genero, anoPublicacion); // O(1) 

        // Mostrar la información del libro creado
        System.out.println(libro1.mostrarInformacion()); // O(1) 

        // Marcar el libro como leído
        libro1.marcarLeido(); // O(1) 

        // Verificar si el libro es antiguo (más de 50 años de publicación)
        System.out.println(libro1.esAntiguo()); // O(1) 

        // Verificar si el libro ha sido leído y mostrar un mensaje adecuado
        boolean esLeido = libro1.isLeido(); // O(1) 
        if (esLeido == true) { // O(1) 
            System.out.println("El libro ya fue leído"); // O(1)
        } else {
            System.out.println("El libro no ha sido leído"); // O(1) 
        }

        // Cerrar el objeto Scanner
        sc.close(); // O(1) 
    }
}
