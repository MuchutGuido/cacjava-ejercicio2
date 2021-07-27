/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guidomuchut.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Guido
 */
public class DatosUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso = new Scanner(System.in);
        String nombre;
        String apellido;
        String edad;
        String hobbie;
        String editorCodigo;
        String sistemaOperativo;

        System.out.println("--------------------------------------------------");
        System.out.println("******************* BIENVENIDO *******************");
        System.out.println("--------------------------------------------------\n");
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("    * Nombre: ");
        nombre = ingreso.nextLine();

        System.out.println("    * Apellido: ");
        apellido = ingreso.nextLine();

        System.out.println("    * Edad: ");
        edad = ingreso.nextLine();

        System.out.println("    * Hobbie: ");
        hobbie = ingreso.nextLine();

        System.out.println("    * Editor de Código favorito: ");
        editorCodigo = ingreso.nextLine();

        System.out.println("    * Sistema Operativo que usa: ");
        sistemaOperativo = ingreso.nextLine();

        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("**************** DATOS INGRESADOS ****************");
        System.out.println("--------------------------------------------------");
        System.out.println("|    * Nombre: " + nombre);
        System.out.println("|    * Apellido: " + apellido);
        System.out.println("|    * Edad: " + edad);
        System.out.println("|    * Hobbie: " + hobbie);
        System.out.println("|    * Editor de Código favorito: " + editorCodigo);
        System.out.println("|    * Sistema Operativo que usa: " + sistemaOperativo);
        System.out.println("--------------------------------------------------");
    }

}
