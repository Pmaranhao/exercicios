package if_else;

import java.util.Scanner;

/*
8 - Faça um programa que lei 2 notas de um aluno, verifique se as notas são válidas e exiba
na tela a média destas nostas. Uma nota válida deve ser, obrigatóriamente, um valor entre 0.0 e 10.0,
onde caso a nota não possua um valor válido, este fato deve ser informado ao usuário e o programa termina.
*/
public class Exercico8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota1, nota2;

        System.out.println("Digite a nota 1:");
        nota1 = scan.nextFloat();
        if (nota1 < 0.0 || nota1 > 10.0) {
            System.out.println("Nota inválida");
        }else {
            System.out.println("Digite a nota 2:");
            nota2 = scan.nextFloat();
        }
    }
}
