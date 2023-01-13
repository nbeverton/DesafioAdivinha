package br.com.Controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
    public static void main(String[] args) {

        Random gerador = new Random();
        int numeroDaSorte = gerador.nextInt(100);
        System.out.println(numeroDaSorte);
        Scanner entrada = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Digite um número de 0 a 99: ");
//            int numero = entrada.nextInt();
//
//            if (numero > numeroDaSorte) {
//                System.out.println("Tente um valor menor!");
//            } else if (numero < numeroDaSorte) {
//                System.out.println("Dica: tente um valor maoir!");
//            } else if ((numero == numeroDaSorte)) {
//                System.out.println("Parabéns!!! Você acertou o número");
//                break;
//            }
//        }

        System.out.print("Digite um número de 0 a 99: ");
        int numero = entrada.nextInt();
        int i = 0;

        do {
            System.out.println("Escolha");
        } while (i < 3);


        entrada.close();
    }
}
