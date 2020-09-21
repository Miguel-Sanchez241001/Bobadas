
import java.util.Scanner;

public class PrimeraClase {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        //conversor de numero decimales a binarios casero
        System.out.println("Ingrese un numero a convertir en binario");
        int num = obj.nextInt();
        System.out.println(binario(num));
    }

 private static String binario(int num) {
        char v = '1', f = '0';
        String bin = "";
        int aux = 1;
        while(num>=aux){
            aux*=2;
        }
        while (aux != 0){
            if (num >= aux) {
                num-=aux;
                bin = bin + v + " ";
            } else {
                bin = bin + f + " ";
            }
                aux/=2;
        }


        return bin;
    } 
}
