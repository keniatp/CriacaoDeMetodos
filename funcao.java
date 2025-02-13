package org.example;

import java.util.Random;
import java.util.Scanner;
public class funcao {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- FUNÇÕES ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5" + "\nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.println("Definir se um numero é par ou impar");
                    parOuimpar();
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    System.out.println("Verifique se um nome digitado começa com a letra 'A'.");
                    comecaComA();
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    System.out.println("Receba dois números e indique se um é divisível pelo outro.");
                    isDivisivel();
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.println("Determine se um horário está no período da manhã, tarde ou noite.");
                    periodoDia();
                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    System.out.println("Determine se o usuário acertou um número entre 1 e 10 sorteado pelo programa.");
                    numSecreto();
                    break;

                default:
                    System.out.println("Valor inválido!\n");
                    break;
            }

        }

    }
    public static void parOuimpar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = sc.nextInt();
        if (x%2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }

    public static void comecaComA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String nome = sc.nextLine();
        char letraNome = nome.charAt(0);
        if (letraNome == 'A' || letraNome == 'a'){
            System.out.println("O nome começa com A");
        }else{
            System.out.println("O nome não começa com A");
        }
    }

    public static void isDivisivel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o 1° número: ");
        double n1 = sc.nextDouble();

        System.out.print("Insira o 2° número: ");
        double n2 = sc.nextDouble();

        if (n1 % n2 == 0){
            System.out.print("\nO número é divisível pelo outro!");
        } else {
            System.out.print("\nO número não é divisível pelo outro!");
        }
    }

    public static void periodoDia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a hora: ");
        double horario = sc.nextDouble();

        if (horario >= 0 && horario <= 12){
            System.out.print("Período da manhã!");
        } else if (horario >= 13 && horario <= 17){
            System.out.print("Período da tarde");
        }else if(horario > 17 && horario <= 23) {
            System.out.print("Periodo da noite!");
        }else{
            System.out.print("Horário inválido!");
        }
    }

    public static void numSecreto(){
        Scanner sc = new Scanner(System.in);
        Random sorteio = new Random();
        int numeroSorteado = sorteio.nextInt(10) + 1;
        System.out.print("Digite um numero de 1 a 10: ");
        int tentativa = sc.nextInt();

        if (tentativa == numeroSorteado) {
            System.out.println("Você acertou!!");
        } else {
            System.out.println("Você errou! \nNumero sorteado: " + numeroSorteado);
        }
    }

}