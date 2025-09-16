

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.helloworld;
import javax.swing.JOptionPane;

/**
 *
 * @author deivi
 */


public class HelloWorld {

   public static void main(String[] args) {
        /*System.out.println("Hello World!");
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        System.out.println("O resultado da soma dos numeros = " + result);
        if(result == 30){
            System.out.println("A soma foi feita corretamente");
        }else{
            System.out.println("Resultado inorreto");
        }*/
        
        Aluno a = new Aluno("Deivison", 10, 2.5, 5.5);
        
        System.out.println(a.getNome());
        System.out.println(a.calcularMedia());
        System.out.println(a.verificarSituacao());
        
        a.exibirDados();
        
        
    }
}
