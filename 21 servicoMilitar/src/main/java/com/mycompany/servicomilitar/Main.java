/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicomilitar;

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

        int i;

        System.out.println("Informe a quantidade de pessoas que deseja cadastrar");
        int n = leitor.nextInt();

        List<String> nome = new ArrayList<>();

        List<Integer> idade = new ArrayList<>();

        List<Character> sexo = new ArrayList<>();

        List<Integer> saude = new ArrayList<>();

        List<String> res = new ArrayList<>();

        for (i = 0; i < n; i++) {
            System.out.println("Informe o nome");
            nome.add(leitor.next());
            System.out.println("Informe a idade");
            idade.add(leitor.nextInt());
            System.out.println("Informe o sexo: M - Masculino / F - Feminino");
            sexo.add(leitor.next().charAt(0));
            System.out.println("Informe de 0-10 o nível de saúde da pessoa");
            saude.add(leitor.nextInt());

        }

        System.out.println("Informações cadastradas");
        for (i = 0; i < n; i++) {
            res.add("Nome: " + nome.get(i) + ", Idade: " + idade.get(i) + ", Sexo: " + sexo.get(i) + " e o Nível da Saude é: " + saude.get(i));
            System.out.println(res.get(i));
            System.lineSeparator();
            if (saude.get(i) >= 7) {
                System.out.println("");
                System.out.println("O "+nome.get(i)+" está apto(a) a cumprir o serviço militar obrigatório");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("O "+nome.get(i)+" não está apto(a) a cumprir o serviço militar obrigatório");
                System.out.println("");
            }
        }

    }
}
