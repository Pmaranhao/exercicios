package if_else;

/*
19 - Faça um programa para verificar se um determinado número inteiro e
divisível por 3 ou 5, mas não simultaneamente pelos dois.
*/

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        float numero = scan.nextFloat();

        if((numero == (int)numero && numero % 3 == 0)){
            if (numero % 5 != 0){
                System.out.println("Número inteiro e divisível por 3 ou por 5");
            }
        } else if ((numero == (int)numero && numero % 5 == 0)){
            if (numero % 3 != 0){
                System.out.println("Número inteiro e divisível por 3 ou por 5");
            } else {
                System.out.println("Número não é inteiro ou é divisível por 3 e 5 ao mesmo tempo.");
            }
        }
    }
}
