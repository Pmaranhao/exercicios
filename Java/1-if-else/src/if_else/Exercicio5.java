package if_else;

import java.util.Scanner;

/*
5 - Faça um programa que receba um número inteiro e verifique se este número é par ou ímpar
*/
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("Número é par!");
        }else {
            System.out.println("Número é ímpar!");
        }
    }
}
