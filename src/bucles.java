
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class bucles {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int intentos = 0;
        System.out.println("Comencemos a jugar adivina el numero entre 1 y 100");

        //90=(maximovalor-minimovalor de la secuencia)
        //10=minimovalor
        int randon = (int) (Math.random() * 90 + 10);

        int num = 0;
        while (randon != num) {
            intentos++;
            System.out.println("Introduce un numero");
            num = obj.nextInt();
            if (num > randon) {
                System.out.println("Mas bajo");
            } else if (num < randon) {
                System.out.println("Mas alto");
            }
        }
        System.out.println("Correcto\nLo has conseguido en " + intentos + " intentos");
        /*
        cambiando a bulce
        
        do {
            intentos++;
            System.out.println("Introduce un numero");
            num = obj.nextInt();
            if (num > randon) {
                System.out.println("Mas bajo");
            } else if (num < randon) {
                System.out.println("Mas alto");
            }
        }while (randon != num) ;
     /*   String clave = "manolito";
        String pass = "";
        int aux = 1;
        String mensaje = "";
        while (!(clave.equals(pass))) {
            if (aux <= 5) {
                pass = JOptionPane.showInputDialog("Ingresa tu contrasena");
                System.out.println("Numero de intentos restantes: "+(5-aux));
                aux++;
                mensaje="Acceso permitido";
            }else{
                pass="";
                clave="";
                mensaje="Acceso denegado";
            }
            
        }
        System.out.println(mensaje);*/

    }

}
