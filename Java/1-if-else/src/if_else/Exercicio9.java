package if_else;

/*
9 - Leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a presteção for maior que
20% do salário imprima: Empréstimo não concedido, caso contrário imprima: Empréstimo concedido
*/

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salario, valorDaPrestacao;

        System.out.println("Digite seu salário: ");
        salario = scan.nextFloat();

        System.out.println("Digite o valor da parcela: ");
        valorDaPrestacao = scan.nextFloat();

        float emprestimo =  salario * 0.2f;

        if (valorDaPrestacao > emprestimo){
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido!");
        }




    }
}
