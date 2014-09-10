/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula4;

/**
 *
 * @author Aluno
 */
public class Gerente extends Funcionario //herda todos os atributos da classe Funcionario
{
    public double bonus;
    
    public void calcularSalarioTotal() // Overload (Sobrescreve) do método criado na classe Funcionario 
    {
        double salarioTotal = salario + (horasExtras * 10) + bonus;
        System.out.println("Salario total de " + nome + ": " + salarioTotal);
    }
}
