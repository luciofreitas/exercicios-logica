/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioif;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double media, nota1, nota2;
        
        System.out.println("Informe a primeira nota");
        nota1=leitor.nextDouble();
        
        System.out.println("Informe a segunda nota");
        nota2=leitor.nextDouble();
        
        media=(nota1+nota2)/2;
        
        if(media==10){
            System.out.println("Parabéns, tirou nota maxima");
        }else if(media >=7){
            System.out.println("Parabéns voce passou");
        }else{
            System.out.println("Infelizmente voce nao passou");
        }
        
    }
    
}
