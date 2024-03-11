package com.mycompany.questao2;
import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (funcaoFibonacci(numero)) {
            System.out.println("O número " +numero+ " pertence à sequência de fibonacci.");
        } else {
            System.out.println("O número " +numero+ " não pertence à sequência de fibonacci.");
        }

    }
    public static boolean funcaoFibonacci(int numero) {
        int primeiro = 0;
        int segundo = 1;
        
        if (numero == primeiro || numero == segundo) {
            return true;
        }
        
        int proximo = primeiro + segundo;
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }
        
        return false;
    }
}
