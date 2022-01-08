package if_else;

/*
17 - Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:
A = (basemaior + basemenor) * altura / 2
Lembre-se a base maior e a base menor devem ser números maiores que zero
*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base:");
        float base1 = scan.nextFloat();

        System.out.println("Digite a base:");
        float base2 = scan.nextFloat();

        System.out.println("Digite a altura:");
        float altura = scan.nextFloat();

        float area = (base1 + base2) * altura / 2;

        if (base1 > 0 && base2 > 0){
            System.out.println("Área do trapézio: " + area);
        }
    }
}
