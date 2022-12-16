/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciometodobolha;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int a, b, auxA;

        System.out.println("Informe o primeiro numero");
        a = leitor.nextInt();
        System.out.println("Informe o segundo numero");
        b = leitor.nextInt();

        if (a > b) {
            System.out.println("O valor " + a + " é maior que o valor " + b);

        } else {
            System.out.println("O valor " + b + " é maior que o valor " + a);
        }

    }

}
