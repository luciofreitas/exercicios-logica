/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numigualdiferente;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i, num1, num2;

        System.out.println("Informe o primeiro numero");
        num1 = leitor.nextInt();

        System.out.println("Informe o segundo numero");
        num2 = leitor.nextInt();

        if (num1 == num2) {
            System.out.println("Os numeros " + num1 + " e " + num2 + " são iguais");
        } else {
            System.out.println("Os numeros " + num1 + " e " + num2 + " são diferentes");
        }

    }

}
