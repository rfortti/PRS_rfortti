/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aula1;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio1 
{
    /*Crie um algorítmo para ler dois números e retornar a soma desses números.
    */
 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro Numero");
        int num1 = scan.nextInt();
        System.out.println("Digite o Segundo Numero");
        int num2 = scan.nextInt();
        
        int soma = num1 + num2;
        System.out.println("A soma do dois numeros eh = " + soma);
    }
}
