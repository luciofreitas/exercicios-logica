/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.positivoneutonegativo;

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

        int contNum = 0, i;

        List<Integer> num = new ArrayList<>();

        System.out.println("Informe quantos numeros deseja cadastrar");
        contNum = leitor.nextInt();

        for (i = 0; i < contNum; i++) {
            System.out.println("Informe o numero desejado");
            num.add(leitor.nextInt());

        }
        for (i = 0; i < contNum; i++) {
            if (num.get(i) > 0) {
                System.out.println("O numero " + num.get(i) + " é positivo");
            } else if (num.get(i) == 0) {
                System.out.println("O numero " + num.get(i) + " é zero");
            } else {
                System.out.println("O numero " + num.get(i) + " é negativo");
            }
        }
    }
}
