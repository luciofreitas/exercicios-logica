/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendedorsalario;

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double salario=0d,comissao=0.15d,totalVendas=0d, totalVendasC=0d,salarioFinal=0d;
        String nome;
        
        System.out.println("Informe o nome do vendedor");
        nome=leitor.next();
        System.out.println("Informe o salario fixo");
        salario=leitor.nextDouble();
        System.out.println("Informe o total de vendas");
        totalVendas=leitor.nextDouble();
        totalVendasC=totalVendas*comissao;
        salarioFinal=salario+totalVendasC;
        System.out.println("O salario final do "+ nome+" é de R$ "+salarioFinal);
        
    }
           
}
