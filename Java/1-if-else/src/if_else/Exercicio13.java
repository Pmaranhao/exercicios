package if_else;

/*
13 - Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A primeira e a segunda prova têm
peso 1 e a terceira tem peso 2. Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado.
A nota para aprovação deve ser igual ou superior a 60 pontos.
*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a nota 1: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a nota 1: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 * 2) / 4;

        if (media >= 6.0){
            System.out.println("Aprovado!");
        } else{
            System.out.println("Reprovado!");
        }
    }
}
