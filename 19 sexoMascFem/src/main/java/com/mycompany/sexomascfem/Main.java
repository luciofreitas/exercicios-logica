/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sexomascfem;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = 75, j = 0;
        String nome[] = new String[n];
        char sexo[] = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da pessoa");
            nome[i] = leitor.next();
            System.out.println("Digite o sexo da pessoa");
            System.out.println("M - Masculino");
            System.out.println("F - Feminino");
            System.out.println("");
            sexo[i] = leitor.next().charAt(0);
            if (sexo[i] == 'M' || sexo[i] == 'm') {
                j++;
                
                System.out.println("O " + nome[i] + " é do sexo " + sexo[i]+"asculino");
                System.out.println("");
            } else {
                System.out.println("A " + nome[i] + " é do sexo " + sexo[i]+"eminino");
                System.out.println("");
            }
        }

    }

}
