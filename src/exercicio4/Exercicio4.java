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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Aluno a1 = new Aluno();
        a1.nomeAluno = "Pedro";
        a1.notaExercicio = 5;
        a1.notaTrabalho = 8;
        a1.notaProva = 7.5;
        
        Aluno a2 = new Aluno();
        a2.nomeAluno = "Ana";
        a2.notaExercicio = 10;
        a2.notaTrabalho = 9;
        a2.notaProva = 8;
        
        double pe = 0.2, pt = 0.3, pp = 0.5;
        
        a1.CalculaMedia(pe, pt, pp);
        a2.CalculaMedia(pe, pt, pp);
    } 
}
