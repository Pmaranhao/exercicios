package if_else;

/*
 11 - Escreva um programa que leia um número inteiro maior do que zero e devolva, na tela, a soma de todos os seus
algarismos. Por exemplo, ao número 251 corresponderá o valor 8(2+5+1). Se o número lido não for maior do que zero,
o programa terminará com a mensagem "Número inválido".
*/

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        String numero = scan.next();

        Integer soma = 0;
        int j = 0;

        if (Integer.parseInt(numero) < 0){
            System.out.println("Número inválido");
        } else {

            for (int i = 1; i < numero.length() + 1; i++, j++) {
                int valor = Integer.parseInt(numero.substring(j, i));
                soma = soma + valor;
            }
            System.out.println(soma);
        }
     }
}
