/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dado;

/**
 *
 * @author d119322
 */
public class Aluno {
    private int RA;
    private String nome;
    
    public String getNome(){
        return nome;
    }
    
    public int getRA(){
        return RA;
    }
    
    public void setRA(int numero){
        RA = numero;
    }
    
    public void setNome(String name){
        nome = name;
    }
    
}