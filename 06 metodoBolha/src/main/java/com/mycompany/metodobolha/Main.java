/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodobolha;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int A, B, auxA;

        System.out.println("Informe o valor de A: ");
        A = leitor.nextInt();

        System.out.println("Informe o valor de B: ");
        B = leitor.nextInt();

        if (A != B) {
            auxA = A;
            A = B;
            B = auxA;
        }

        System.out.println("O valor de A agora é: " + A + " e o valor de B agora é: " + B);
    }
}
