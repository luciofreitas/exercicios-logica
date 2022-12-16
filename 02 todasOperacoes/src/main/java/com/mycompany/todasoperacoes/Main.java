/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todasoperacoes;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {
    public static void main (String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        int a=0, b=0, soma,subtracao, mult, div;
        
        System.out.println("Informe o primeiro numero");
        a=leitor.nextInt();
        System.out.println("Informe o segundo numero");
        b=leitor.nextInt();
        soma=a+b;
        subtracao=a-b;
        mult=a*b;
        div=a/b;
        System.out.println("A soma é: "+soma);
        System.out.println("A subtração é: "+subtracao);
        System.out.println("A multiplicação é: "+mult);
        System.out.println("A divisão é: "+div);
        
    }
}
