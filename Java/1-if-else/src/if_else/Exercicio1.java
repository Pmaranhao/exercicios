package if_else;

import java.util.Scanner;

//Faça um programa que receba dois números e mostre qual deles é o maior.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = scan.nextInt();

        System.out.println("Digite o segundo número");
        numero2 = scan.nextInt();

        if(numero1 > numero2){
            System.out.println("Número 1 maior que número 2");
        } else if (numero1 == numero2){
            System.out.println("Números são iguais");
        } else {
            System.out.println("Número 2 maior que número 1");
        }
    }
}
