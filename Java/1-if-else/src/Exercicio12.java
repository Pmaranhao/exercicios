import java.util.Scanner;

/*
12 - Ler um número inteiro. Se o número lido for negativo, escreva a mensagem "número inválido". Se o número
for positivo, calcular o logaritmo deste número.
*/
public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if (numero <= 0){
            System.out.println("Sistema inválido");
        } else {
            System.out.println(Math.log10(3));
        }
    }
}
