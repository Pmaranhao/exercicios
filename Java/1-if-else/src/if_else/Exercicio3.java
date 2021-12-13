package if_else;

import java.util.Scanner;

/*
Leia um número real. Se o número for positivo imprima a raiz quadrada.
do contrário, imprima o número ao quadrado.
*/
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float numero;

        System.out.println("Digite um número: ");
        numero = scan.nextFloat();

        if (numero % 2 == 0){
            System.out.println(Math.sqrt(numero));
        }else {
            System.out.println(Math.pow(numero, 2));
        }
    }
}
