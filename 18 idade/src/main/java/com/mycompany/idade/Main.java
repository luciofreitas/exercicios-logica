/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.idade;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        int j=0, n=75;
        int idade[] = new int[n];
        
        for(int i=0;i <=75;i++){
            System.out.println("");
            System.out.println("Qual a idade deseja registrar? ");
            idade[i]=leitor.nextInt();
            if(idade[i]>=18){
                j++;
                System.out.println("A pessoa é maior de idade");
                System.out.println("");
            } else{
                System.out.println("A pessoa é menor de idade");
                System.out.println("");
            }
        }
    }
}
