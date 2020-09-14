
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
public class You {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int altura = obj.nextInt();
        System.out.println("Su numero es " + altura);

        for (int i = altura; i >= 1; i = i - 1) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
