package if_else;

/*
10 Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal, utilizando
as seguintes fórmulas (onde h corresponde à altura)
- Homens: (72.7 * h) - 58
- Mulheres: (62.1 * h) - 44.7
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();

        System.out.println("Digite seu sexo (h) ou (m): ");
        String sexo = scan.next();

        if (sexo == "h"){
            float homem = (float) ((72.7 * altura) - 58.0);
            System.out.println("Seu peso ideal é " + homem);
        } else {
            float mulher = (float) ((62.1 * altura) - 44.7);
            System.out.println("Seu peso ideal é " + mulher);
        }
    }
}
