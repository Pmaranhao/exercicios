package if_else;
/*
Leia um número fornecido pelo usuário. Se esse número for positivo, calcule a raiz quadrada do número.
Se o número for negativo, mostre uma mensagem dizendo que o número é inválido.
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número: ");
        numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println(Math.sqrt(numero));
        }else {
            System.out.println("Número é inválido");
        }
    }
}
