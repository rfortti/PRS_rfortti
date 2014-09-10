/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio4;

/**
 *
 * @author Aluno
 */
public class Aluno 
{
    public String nomeAluno;
    public double notaExercicio;
    public double notaTrabalho;
    public double notaProva;
    
    public void CalculaMedia(double pe, double pt, double pp)
    {
        if (pe + pt + pp != 1)
        {
            System.out.println("Os pesos devem ter soma 1");
        }
        else
        {
            double mediaFinal = (notaExercicio * pe) + (notaTrabalho * pt) + (notaProva * pp);
            System.out.println("A media do aluno " + nomeAluno + " é " + mediaFinal);
        }
    }
}
