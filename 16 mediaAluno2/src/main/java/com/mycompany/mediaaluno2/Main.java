/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediaaluno2;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        double nota1, nota2, nota3, media;

        System.out.println("Informe, por favor, o nome do aluno");
        nome = leitor.next();

        System.out.println("Informe a primeira nota");
        nota1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota");
        nota2 = leitor.nextDouble();

        System.out.println("Informe a terceira nota");
        nota3 = leitor.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media do aluno é " + media);

        if (media >= 7) {
            System.out.println("Parabéns, voce passou de ano");
        } else if (media <= 5) {
            System.out.println("Voce foi reprovado");
        } else if (media > 5 && media < 7) {
            System.out.println("Você está em recuperação");
        }
    }
}
