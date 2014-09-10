/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula3;

/**
 *
 * @author Aluno
 */
public class Pessoa 
{
    public String nome;
    public double peso;
    public double altura;
    
    public void falar(String mensagem)
    {
        System.out.println(nome + " disse: " + mensagem);
    }
}
