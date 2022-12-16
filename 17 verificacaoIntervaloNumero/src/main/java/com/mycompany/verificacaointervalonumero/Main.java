/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificacaointervalonumero;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int j = 0, n = 5;
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o numero desejado");
            num[i] = leitor.nextInt();
            if (num[i] >= 10 && num[i] <= 150) {
                j++;
                System.out.println("Foram digitados " + j + " que estão entre 10 e 150");
                System.out.println("");
                
            } else {
                System.out.println("Esse numero não está entre 10 e 150");
                System.out.println("");
            }

        }

    }
}
