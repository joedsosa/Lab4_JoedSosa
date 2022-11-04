/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_joedsosa;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author joeds
 */
public class Lab4_JoedSosa {

    public static void main(String[] args) {
        Scanner cathy = new Scanner(System.in);
        Scanner ola = new Scanner(System.in);
        int opciones = 1;
        while (opciones >= 1 && opciones <= 3) {

            System.out.println("..............................");
            System.out.println("Bienvenido al Menu Principal ");
            System.out.println("Opciones Disponibles: ");
            System.out.println("1. Fallout Words");
            System.out.println("2. Rodatcripne");
            System.out.println("3. Alpha");
            System.out.println("Seleccione la Opcion que desee porfavor");
            opciones = cathy.nextInt();

            if (opciones == 1) {

                System.out.println("_________________________________________________________");
                System.out.println("Bienvenido al Ejercicio Fallout Words");
                System.out.println("Ingrese la palabra que selecciono");
            } else if (opciones == 2) {
                System.out.println("_________________________________________________________");
                System.out.println("Bienvenido al Ejercicio Rodatcripne");
                System.out.println("Ingrese su contrasena porfavor ");
                String passcode = ola.nextLine();
                encryptPass(passcode);
            } else if (opciones == 3) {
                System.out.println("_________________________________________________________");
                System.out.println("Bienvenido al Ejercicio Alpha");
                System.out.println("Ingrese una palabra o frase");
                String nombre = ola.nextLine();
                System.out.println(Alpha(nombre));

            } else {
                System.out.println("Opcion invalida");

            }
        }
    }

   public static void Fallout(String cadena) {
    
}
    

    public static void encryptPass(String cadena) {
        Random r = new Random();
        String passEncrypt = "";
        boolean colocarChar = true;
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            int aleatorio = r.nextInt(10);
            if (colocarChar) {
                passEncrypt += cadena.charAt(indice);
            } else {
                passEncrypt += aleatorio;
            }
            colocarChar = !colocarChar;
        }
        System.out.println(passEncrypt);
    }

    public static String Alpha(String cadena) {
        String respuesta = "";
        boolean algunaLetra = false;
        for (int i = 0; i < cadena.length(); i++) {
            algunaLetra = false;
            char c = cadena.charAt(i);
            // segun tabla ascii de 65 al 90 son letras minusculas
            for (int j = 65; j <= 90; j++) {
                String convertedChar = Character.toString((char) j);
                if (String.valueOf(c).equals(convertedChar)) {
                    algunaLetra = true;
                }
            }
            // segun tabla ascii de 97 al 122 son letras minusculas
            for (int k = 97; k <= 122; k++) {
                String convertedChar = Character.toString((char) k);
                if (String.valueOf(c).equals(convertedChar)) {
                    algunaLetra = true;
                }
            }
        }
        if (algunaLetra) {
            respuesta = "La cadena solo contiene letras";
        } else {
            respuesta = "La cadena contiene caracteres que no son letras";
        }
        return respuesta;
    }
}
