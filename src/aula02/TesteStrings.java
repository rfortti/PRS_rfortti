/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula02;

/**
 *
 * @author Aluno
 */
public class TesteStrings 
{
    public static void main(String[] args)
    {
        String teste = "Instituto Federal de Sao Paulo";
        System.out.println(teste.charAt(10));
        System.out.println(teste.concat(" - Campus Capivari"));
        
        if (teste.equalsIgnoreCase("INSTITUTO FEDERAL DE SAO PAULO"))
        {
            System.out.println("As duas strings sao iguais");
        }
        
        System.out.println(teste.length());
        System.out.println(teste.replace(" ",""));
        System.out.println(teste.substring(0,9));
        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());
        
        String teste2 = "   IFSP Capivari   ";
        System.out.println(teste2);
        System.out.println(teste2.trim());
    }
}
