/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeroextenso;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Menu numero extenso");
            System.out.println("Qual numero voce deseja saber como ele se escreve?");
            System.out.println("1 - Para escrever o numero 1");
            System.out.println("2 - Para escrever o numero 2");
            System.out.println("3 - Para escrever o numero 3");
            System.out.println("4 - Para escrever o numero 4");
            System.out.println("5 - Para escrever o numero 5");
            System.out.println("6 - Para sair do programa");
            System.out.println("");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Um");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Dois");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Três");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Quatro");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Cinco");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Numero inválido");
                    System.out.println("");
                    break;
            }
        } while (opcao != 6);
    }

}
