
import java.util.Scanner;

public class PrimeraClase {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        //conversor de numero decimales a binarios casero
        System.out.println("Ingrese un numero a convertir en binario");
        int num = obj.nextInt();
        char v = '1', f = '0';
        String s = " ";
        String bin = "";
        int aux = 1;
      while(num>=aux){
      aux=aux*2;
      }
        for (int i = 0; i < 2; i--) {
            if (aux != 0) {
                if (num >= aux) {
                    num = num - aux;
                    bin = bin + v + s;
                } else {
                    bin = bin + f + s;
                }
                aux = aux / 2;
            } else {
                i = 4;
                System.out.println(bin);
            }
        }

    }

}
