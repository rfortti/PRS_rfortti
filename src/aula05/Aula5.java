/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula05;

/**
 *
 * @author Aluno
 */
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*
        Carro c = new Carro(45);
        c.abastecer(30);
        c.abastecer(10);
        c.abastecer(10);
        c.abastecer(5);
        */
        /*
        Usuario u1 = new Usuario();
        u1.setNome("Roberto");
        u1.setLogin("Roberto");
        u1.setSenha("12345678");
        
        System.out.println(u1.getNome());
        System.out.println(u1.getLogin());
        System.out.println(u1.getSenha());
        */
        Cliente c = new Cliente();
        Endereco e = new Endereco();
        
        e.setRua("Rua X");
        e.setNumero("12345");
        
        c.setNome("Fulano de Tal");
        c.setIdade(30);
        c.setEndereco(e);
        
        System.out.println(c.getEndereco().getRua() + ", " + c.getEndereco().getNumero());
    }
    
}
