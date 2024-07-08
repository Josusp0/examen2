
package ejercicio3;

import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        while (true){
            System.out.println("Ingresa un numero");
            int numero =scanner.nextInt();
            if(numero == -1){
                break;
            }
        contador++;
        }
        System.out.println("Se introducio " + contador +" numeros");
        scanner.close();
    }
}
    
        
    




