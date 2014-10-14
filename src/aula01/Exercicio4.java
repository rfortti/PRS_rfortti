/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula01;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio4 
{
    /* Faça um algoritmo para ler o nome e a idade de 3 pessoas. Imprima o nome 
       dos 3 do mais novo para o mais velho.
    */
    public static void main(String[] args)
    {
        Scanner scanS = new Scanner(System.in);
        Scanner scanI = new Scanner(System.in);
        
            System.out.println("Digite o nome da pessoa 1:");
            String nome1 = scanS.nextLine();
            System.out.println("Digite a idade da pessoa 1:");
            int idade1 = scanI.nextInt();
            
            System.out.println("Digite o nome da pessoa 2:");
            String nome2 = scanS.nextLine();
            System.out.println("Digite a idade da pessoa 2:");
            int idade2 = scanI.nextInt();
            
            System.out.println("Digite o nome da pessoa 3:");
            String nome3 = scanS.nextLine();
            System.out.println("Digite a idade da pessoa 3:");
            int idade3 = scanI.nextInt();
            
        if (idade1 < idade2 && idade1 < idade3)
        {
            System.out.println(nome1);
            
            if (idade2 < idade3)
            {
                System.out.println(nome2);
                System.out.println(nome3);
            }
            else
            {
                System.out.println(nome3);
                System.out.println(nome2);
            }
        }
        
        if (idade2 < idade1 && idade2 < idade3)
        {
            System.out.println(nome2);
            
            if (idade1 < idade3)
            {
                System.out.println(nome1);
                System.out.println(nome3);
            }
            else
            {
                System.out.println(nome3);
                System.out.println(nome1);
            }
        }
        
        if (idade3 < idade1 && idade3 < idade2)
        {
            System.out.println(nome3);
            
            if (idade1 < idade2)
            {
                System.out.println(nome1);
                System.out.println(nome2);
            }
            else
            {
                System.out.println(nome2);
                System.out.println(nome1);
            }
        }
    }
}
