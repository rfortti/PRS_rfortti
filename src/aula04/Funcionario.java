/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula04;

/**
 *
 * @author Aluno
 */
public class Funcionario 
{
    public String nome;
    public double salario;
    public double horasExtras;
            
    public void calcularSalarioTotal()
    {
        double salarioTotal = salario + (horasExtras * 10);
        System.out.println("Salario total de " + nome + ": " + salarioTotal);
    }
}
