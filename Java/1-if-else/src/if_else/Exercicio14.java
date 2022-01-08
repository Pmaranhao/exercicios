package if_else;

/*
14 - A nota final de um estudante é calculada a partir de três notas atribuídas entre o intervalo de 0 até 10,
respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a exame final. A média das três notas
mencionadas anteriormente obedece aos pesos: Trabalho de Laboratório: 2; Avaliação Semestral: 3; Exame Final: 5.
De acordo com o resultado, mostre na tela se o aluno está reprovado (média entre 0 e 2,9), de recuperação
(entre 3 e 4,9) ou se foi aprovado. Faça todas as verificações necessárias.
*/

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho: ");
        float notaTrabalho = scan.nextFloat();

        System.out.println("Digite a nota da avaliação: ");
        float notaAvaliacao = scan.nextFloat();

        System.out.println("Digite a nota do exame: ");
        float notaExame = scan.nextFloat();

        float media = (notaTrabalho * 2 + notaAvaliacao * 3 + notaExame * 5) / 10;

        if(media >= 0.0 && media < 3.0){
            System.out.println("Reprovado");
        }
        else if (media >= 3 && media < 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }

        System.out.println(media);
    }
}
