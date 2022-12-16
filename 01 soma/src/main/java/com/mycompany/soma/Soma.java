/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soma;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Soma {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        
        int a=0,b=0,soma;
        
        System.out.println("Informe o primeiro numero da soma");
        a=leitor.nextInt();
        System.out.println("Informe o segundo numero da soma");
        b=leitor.nextInt();
        soma=a+b;
        System.out.println("A soma é igual a : "+soma);
               
               
    }
}
