/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio1;

import aula4.*;
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
        Carro c = new Carro();
        c.marca = "Honda";
        c.modelo = "Civic";
        c.quantCombustivel = 50;
        c.Andar(200, 120);
        
        Moto m = new Moto();
        m.marca = "Honda";
        m.modelo = "CG 125";
        m.quantCombustivel = 15;
        m.Andar(100, 110);
    }  
}
