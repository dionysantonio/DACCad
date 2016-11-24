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
    private int idade;
    private int CPF;
    
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
    
    public void setCPF(int numero){
        CPF = numero;
    }
    
    public void setIdade(int numero){
        idade = numero;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int getCPF(){
        return CPF;
    }
    
}