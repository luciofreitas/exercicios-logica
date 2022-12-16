/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeroentreintervalo;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i, numero;

        System.out.println("Informe o numero que deseja");
        numero = leitor.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O numero está entre 100 e 200");
        } else {
            System.out.println("O numero não está entre 100 e 200");
        }

    }

}
