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
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        try
        {
            String x = "10";
            String y = "XV";
            System.out.println(x + y);
        
            int w = Integer.parseInt(x);
            int z = Integer.parseInt(y);
            System.out.println(w + z);
        }
        catch (NumberFormatException e)
        {
             System.out.println("Nao foi possivel converter ! " + e.getMessage());       
        }
    }
    
}
