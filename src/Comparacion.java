
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Comparacion {
    
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int menor = menor(a, b, c);
        String mens = comparacionDiferentes(a, b, c);
        if (a == b && b == c) {
            System.out.println("Su numero se repite");
        }else if (a != b && a != c) {
            if (b != c) {
                System.out.println("Los tres numeros son diferentes");
                System.out.println(mens);
            } else {
                if (a > b) {
                    System.out.println("el numero repetido es: " + b);
                    System.out.println("el mayor es " + a + " y el menor es el numero repetido " + b);
                } else {
                    System.out.println("el numero repetido es: " + b);
                    System.out.println("el mayor es el numero repetido " + b + " y el menor es el numero " + a);
                }
            }
        } else if (a == b) {
            if (c > b) {
                System.out.println("el numero repetido es: " + b);
                System.out.println("el mayor es " + c + " y el menor es el numero repetido " + b);
            } else {
                System.out.println("el numero repetido es: " + b);
                System.out.println("el mayor es el numero repetido " + b + " y el menor es el numero " + c);
            }
        } else {
            if (b > a) {
                System.out.println("el numero repetido es: " + a);
                System.out.println("el mayor es " + b + " y el menor es el numero repetido " + a);
            } else {
                System.out.println("el numero repetido es: " + a);
                System.out.println("el mayor es el numero repetido " + a + " y el menor es el numero " + b);
            }

        }

        //System.out.println("el numero menor es: " + menor);
    }

    private static int menor(int a, int b, int c) {
        int minimo = 0;
        while (a != 0 && b != 0 && c != 0) {
            a--;
            b--;
            c--;
            minimo++;
        }

        return minimo;

    }

    private static String comparacionDiferentes(int a, int b, int c) {

        int mayor = 0, min = 0, menor = 0;
        if (a > b && a > c) {
            mayor = a;
            if (b > c) {
                min = b;
                menor = c;
            } else {
                min = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            mayor = b;
            if (a > c) {
                min = a;
                menor = c;
            } else {
                menor = a;
                min = c;
            }
        } else if (c > a && c > b) {
            mayor = c;
            if (a > b) {
                min = a;
                menor = b;
            } else {
                menor = a;
                min = b;
            }
        }
        String mensaje = "el numero mayor es " + mayor + " el numero menor es " + menor + " el numero intermedio es " + min;

        return mensaje;

    }
}
