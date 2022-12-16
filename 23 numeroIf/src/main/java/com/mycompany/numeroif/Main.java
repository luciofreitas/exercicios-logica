/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeroif;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> num1 = new ArrayList<>();
        int contNum = 0, i;

        System.out.println("Informe a quantidade de numeros que deseja informar");
        contNum = leitor.nextInt();

        for (i = 0; i < contNum; i++) {

            System.out.println("Informe o numero desejado");
            num1.add(leitor.nextInt());

        }
        for (i = 0; i < contNum; i++) {
            if (num1.get(i) >= 80) {
                System.out.println("O numero " + num1.get(i) + " é maior ou igual a 80");
            } else if (num1.get(i) == 40) {
                System.out.println("O numero " + num1.get(i) + " é igual a 40");
            } else if (num1.get(i) <= 25) {
                System.out.println("O numero " + num1.get(i) + " é menor ou igual a 25");
            }

        }

    }
}
