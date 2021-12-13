package if_else;

import java.util.Scanner;

/*
7- Faça um programa que receba dois números e mostre o maior. Se por acaso, os dois números
forem iguais, imrpima números iguais.
*/
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = scan.nextInt();
        System.out.println("Digite o primeiro número: ");
        numero2 = scan.nextInt();

        if (numero1 == numero2){
            System.out.println("Números são iguais");
        } else if (numero1 > numero2){
            System.out.println("Número 1 é o maior");
        } else {
            System.out.println("Número 2 é o maior");
        }
    }
}
