/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula4;

import exercicio1.Carro;
import exercicio1.Moto;

/**
 *
 * @author Aluno
 */
public class Aula4 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Funcionario f = new Funcionario();
        f.nome = "João";
        f.salario = 1500;
        f.horasExtras = 0;
        
        Gerente g = new Gerente();
        g.nome = "Paulo";
        g.salario = 1500;
        g.horasExtras = 0;
        g.bonus = 500;
        
        f.calcularSalarioTotal();
        g.calcularSalarioTotal();
    }  
}
