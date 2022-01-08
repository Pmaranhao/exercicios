package if_else;
/*
18 - Faça um programa que mostre ao usuário um menu com 4 opções de operações matemáticas (as básicas, por exemplo). O
usuário escolhe uma das opções e o seu programa então pede dois valores numéricos e realiza a operação, mostrando
o resultado e saindo.
*/
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opação:");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        String operacao = scan.next();

        System.out.println("Digite o primeiro valor: ");
        float numero1 = scan.nextFloat();

        System.out.println("Digite o segundo valor: ");
        float numero2 = scan.nextFloat();

        switch (operacao){
            case "+":
                System.out.println(numero1 + numero2);
                break;
            case "-":
                System.out.println(numero1 - numero2);
                break;
            case "*":
                System.out.println(numero1 * numero2);
                break;
            case "/":
                System.out.println(numero1 / numero2);
                break;
            default:
                System.out.println("Operação não existe");
        }
    }
}
