/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Unidad3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        /*
        for(int i=0; i<cadena1.length(); i++){                  
            if(cadena1.charAt(i) != (' ')){ 
                if(i%2==0){
                System.out.print(cadena1.toUpperCase().charAt(i));
                }else { 
                System.out.print(cadena1.toLowerCase().charAt(i));
                }
            } else { 
                System.out.print(cadena1.charAt(i));
            }                      
        }        
        System.out.println("");
        */
        
        /*
        do{             
            indice = cadena1.indexOf('o', indice+1);
            if(indice>=0){
            System.out.println(indice);    
            }          
        }
        while(indice != -1);
        */
        
        
        
        /*
        2.-Eliminar Espacios en Blanco: Pide al usuario que ingrese una 
        frase y elimina todos los espacios en blanco de la cadena
        */     
        /*
        String cadena1;
        int indice=-1;
        int auxiliar;
        System.out.println("Introduzca su String, se lo voya mostrar por pantala sin espacios");
        cadena1=sc.nextLine();
        System.out.println("Su String es: " + cadena1);
        do{
                auxiliar=indice;
                auxiliar++;
                indice = cadena1.indexOf(" " , indice+1);
                if (indice != -1){ 
                System.out.print(cadena1.substring(auxiliar, indice));     
                } else { 
                    System.out.print(cadena1.substring(auxiliar));
                } 
                
        }
        while(indice!=-1);
        */
        
        /*
        
        String cadena= "Hola mundo Hola";
        String subcadena="";
        int indice=0;
        
        while(cadena.contains(" ")){ 
           indice = cadena.indexOf(" ", 0);
           subcadena = subcadena + cadena.substring(0, indice);
           cadena= cadena.substring(indice + 1);
        }
           subcadena= subcadena + cadena;
           System.out.println(subcadena);
        
        */
        /*
        3.- Contar Ocurrencias:  Solicita al usuario que ingrese una cadena y una subcadena, 
        luego cuenta cuántas veces aparece la subcadena en la cadena principal.
        */   
        
        /*
        String cadena= "HolamundoHomunlamundoHolamundo mun";
        String subcadena=" ";
        int indice=-1;
        int contador=-1;
        
        do{
        indice = cadena.indexOf(subcadena, indice+1);
        contador++;
        }
        while (indice != -1);
        
        System.out.println(contador);       
        */
        
        /*
        4.-Formato de Nombre: Pide al usuario que ingrese su nombre 
        completo en formato "Nombre Apellido" y luego imprime 
        el nombre en formato "Apellido, Nombre".
        */
        /*
        String nombreyapellidos="Francisco Rodriguez";
        String nombre;
        String apellidos;
        int indice=0;
        indice = nombreyapellidos.indexOf(" ", indice+1);
        nombre= nombreyapellidos.substring(0, indice);
        apellidos= nombreyapellidos.substring(indice+1,nombreyapellidos.length());
        System.out.println(apellidos + "," + nombre + ".");
        */
        
        /*
        5.-Validación de Contraseña:  Solicita al usuario que ingrese una contraseña y 
        verifica si cumple con ciertos criterios, como tener al menos 8 caracteres, incluir 
        al menos una letra mayúscula, una letra minúscula y un número. Para ello investiga 
        el método matches().
        */
        
        /*
        String contraseña="Hola Mundo 45";
        boolean bandera;
        do{
            bandera=contraseña.matches("")
        }
        while(!bandera);
        */
        
        /*
        1.- Codificación: Codifica una frase dada por el usuario poniendo 
        cambiando los caracteres según lo siguiente:
        2.- Codificación plus: Partiendo de lo anterior pon la frase al revés:
        */
        
        /*
        String entrada="hola carabola";
        int indice;
        char auxiliar;
        String completa="";
        String alreves="";
        entrada=entrada.toUpperCase();
        
        for(int i = 0; i<entrada.length(); i++){
            auxiliar = entrada.charAt(i);
            switch (auxiliar){ 
                case 'A':
                    indice = entrada.indexOf('A', 0);
                    completa= entrada.substring(0, indice) + "4" + entrada.substring(indice+1);
                    entrada=completa;
                    break;
                case 'E':
                    indice = entrada.indexOf('E', 0);
                    completa= entrada.substring(0, indice) + "3" + entrada.substring(indice+1);
                    entrada=completa;
                    break;
                case 'I':
                    indice = entrada.indexOf('I', 0);
                    completa= entrada.substring(0, indice) + "1" + entrada.substring(indice+1);
                    entrada=completa;
                    break;
                case 'O':
                    indice = entrada.indexOf('O', 0);
                    completa= entrada.substring(0, indice) + "0" + entrada.substring(indice+1);
                    entrada=completa;
                    break;
                case 'S':
                    indice = entrada.indexOf('S', 0);
                    completa= entrada.substring(0, indice) + "5" + entrada.substring(indice+1);
                    entrada=completa;
                    break;    
            }           
        }
        System.out.println(completa);
        for(int j = completa.length(); j>0; j--){ 
            alreves= alreves + completa.charAt(j-1);
        }
        System.out.println(alreves);
        
        */
        /*
        3.- Ahorcado: Crea el juego del ahorcado. El usario 2 deberá adivinar una 
        palabra introducida por el usuario 1. Deberá ir mostrando la palabra según se va formando:
        */
        
        
        String palabra;
        String resta;
        String auxiliar="";
        String introducido;
        int indice;
        int intentos = 3;
        int volverjugar;
        do{
        System.out.println("Jugador 1, por favor introduzca la palabra para que el jugador 2 lo adivine.");
        palabra = sc.nextLine();
        resta=palabra;
        auxiliar="";
        for (int i = 0; i<palabra.length(); i++){ 
            auxiliar = auxiliar + "-";//Axuliar va valer la misma cantidad de caracteres pero van a valer "-"
        }
        System.out.println(auxiliar); // Muestro por primera vez las posiciones vacias para que el jugador 2 vea cuantas letras tiene la palabra
        do{
        System.out.println("Introduzca letra"); // Aqui vamos a ir introduciento las letras hasta que nuestro while salga "false"
        introducido=sc.next();
        if (resta.contains(introducido)){ // Valoro si la letra introducida esta dentro de la copia de la palabra introducida por jugador 1 
            System.out.println("Enhorabuena! la letra que ha introducido aparece en la palabra!");
            while(resta.contains(introducido)){ // Si la contiene vamos a entrar en un bucle hasta que no contenta la letra
            indice = resta.indexOf(introducido); //devuelve la posicion de donde esta la letra introducida
            auxiliar = auxiliar.substring(0, indice) + introducido + auxiliar.substring(indice+1); //for mi palabra final, la que voy mostrando al usuario
            resta = resta.substring(0, indice) + "-" + resta.substring(indice+1); // resto la palabra introducida de la copia de la palabra introducida por el jugador 1, asi elimino la palabra que he sacado.     
        }
        } else { // Aqui entro si la letra que ha introducida no aparece en la palabra, lo uso para restar el numero de intentos, si los intentos llegan a 0 saldra del dowhile
            System.out.println("La letra que ha introducido no aparece en la palabra");
            intentos--;
            System.out.println("Le quedan " + intentos + " intentos");
        }
        System.out.println(auxiliar); // Aqui vou mostrando el resultado final de como va quedando nuestra palabra
        }
        while (!palabra.equals(auxiliar) && intentos!=0); // Seguiremos dentro del bucle hasta que la palabra introducida por el usuario se igual a nuestra palabra que vamos introduciendo letras o hasta que el contador llegue a 0
        if(palabra.equals(auxiliar)){ //Fuera del do while mostraremos al usuario si ha salido por que ha averiguado la palabra o se ha quedado sin intentos
            System.out.println("Ha acertado usted!");
        } else if (intentos==0) { 
            System.out.println("Se ha quedado usted sin intentos");
        }
        
        System.out.println("¿Quiere volver a jugar?");
        System.out.println("1.SI");
        System.out.println("2.NO");
        volverjugar = sc.nextInt();
        sc.nextLine();
        }
        while(volverjugar==1);       
        
    }
}

