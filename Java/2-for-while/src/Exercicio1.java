/*
1 – Faça um programa que determine o mostre os cinco primeiros múltiplos de 3,
considerando números maiores que 0.
*/

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("Digite o número: ");
        int numero = 3;

        if (numero > 0){
            for(int i = 0; i < 5; i++){
                System.out.println(numero = numero + 3);
            }
        }
    }
}
