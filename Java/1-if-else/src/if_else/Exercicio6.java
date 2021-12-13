package if_else;

import java.util.Scanner;

/*
6 - Escreva um programa que, dados dois números inteiros. Mostre na tela o maior deles,
assim como a diferença existente entre ambos

*/
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o 1⁰ número: ");
        numero1 = scan.nextInt();

        System.out.println("Digite o 2⁰ número: ");
        numero2 = scan.nextInt();

        if(numero1 > numero2){
            System.out.println("1⁰ número é maior");
            System.out.println("A diferença entre eles: " + (numero1 - numero2));
        }else {
            System.out.println("2⁰ número é maior");
            System.out.println("A diferença entre eles: " + (numero2 - numero1));
        }
    }
}
