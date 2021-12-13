package if_else;

import java.util.Scanner;

/*
4 - Faça um programa que leia um número e, caso ele seja positivo, calcule e mostre:
- o número digitado ao quadrado
- a raiz do número ao quadrado
*/
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float numero;

        System.out.println("Digite o número: ");
        numero = scan.nextFloat();

        if (numero > 0){
            System.out.println(Math.sqrt(numero));
            System.out.println(Math.pow(numero, 2));
        }

    }
}
