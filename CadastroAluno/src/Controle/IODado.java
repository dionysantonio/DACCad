/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import java.io.RandomAccessFile;
import java.io.IOException;
import Dado.Aluno;

/**
 *
 * @author d119322
 */
public class IODado {
    private RandomAccessFile arquivo;
    
    public IODado(String caminho){
        try{
        RandomAccessFile file = new RandomAccessFile(caminho, "rw");
        arquivo = file;
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    
    public void escrever(String s, int pos){
        try{
            arquivo.seek(pos);
            arquivo.writeChars(s);
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    
    public void finalizar(){
        try{
          arquivo.close();
        }catch(IOException e){
            System.out.println(e.getCause());
        }
        
    }
    
    public Aluno ler( int pos){
        
        Aluno aluno = new Aluno();
        String aux;
        String[] dado;
                
            aux = lerLinha(pos);
            dado = aux.split("|");
            
            aluno.setNome(dado[0]);
            aluno.setRA(Integer.parseInt(dado[1]));
            aluno.setIdade(Integer.parseInt(dado[2]));
            aluno.setCPF(Integer.parseInt(dado[3]));
            
        return aluno;
        
    }
    
    private String lerLinha(int pos){
        String aux = new String();
        char n;
        
        try{
            arquivo.seek(pos);
            for(n = arquivo.readChar();n!='#';)
                aux = aux + arquivo.readChar();
        }catch(IOException e){
            System.out.println(e.getCause());
        }
        return aux;
    }
    
    
}
