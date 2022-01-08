/*
2 – Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes.
A primeira vez deve usar a estrutura de programação for, a segunda while, e a
terceira do while. */
public class Exercicio2 {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++){
            System.out.println("Rodada " + (i+1));
            for (int j = 1; j < 101; j++){
                System.out.println(j);
            }
        }

        int i = 1;
        int j = 1;
        while (i  < 4){
            System.out.println("Rodada" + i);
            j = 1;
            while (j < 101){
                System.out.println(j);
                j++;
            }
            i++;
        }

        do {
            System.out.println("Rodada " + i);
            do{
                System.out.println(j);
                j++;
            }while (j < 101);
            i++;
            j = 1;
        }while(i < 4);
    }
}
