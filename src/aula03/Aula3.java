/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula03;

/**
 *
 * @author Aluno
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Atributos Pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Joao";
        p1.peso = 85;
        p1.altura = 1.80;
        //System.out.println(p1.nome);
        p1.falar("Olá, meu nome é " + p1.nome);
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Jose";
        p2.peso = 70;
        p2.altura = 1.75;
        //System.out.println(p2.nome);
        p2.falar("Prazer, meu nome é José !" );
        
        // Atributos Carro
        Carro c1 = new Carro();
        c1.marca = "Honda";
        c1.modelo = "Civic";
        c1.combustivel = "Flex";
        c1.portas = 4;
        c1.capacidade_tanque = 60;
        System.out.println(c1.marca);
        
        Carro c2 = new Carro();
        c2.marca = "VW";
        c2.modelo = "Gol";
        c2.combustivel = "Flex";
        c2.portas = 4;
        c2.capacidade_tanque = 50;
        System.out.println(c2.marca);
        
        Carro c3 = new Carro();
        c3.marca = "Chevrolet";
        c3.modelo = "Corsa";
        c2.combustivel = "Gasolina";
        c3.portas = 2;
        c3.capacidade_tanque = 50;
        System.out.println(c3.marca);
        
        Calcular c = new Calcular();
        int resultado = c.somar(120, 50);
        System.out.println("...........................");
        System.out.println("........Adição:= " + c.somar(120, 50));
        System.out.println(".....Subtração:= " + c.subtrair(120, 50));
        System.out.println(".Multiplicação:= " + c.multiplicar(120, 50));
        System.out.println(".......Divisão:= " + c.dividir(120, 50));
        System.out.println("...........................");
    } 
}
