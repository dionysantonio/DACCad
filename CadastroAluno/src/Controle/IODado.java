/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import java.io.RandomAccessFile;
import java.io.IOException;
/**
 *
 * @author d119322
 */
public class IODado {
    private RandomAccessFile arquivo;
    
    IODado(String caminho){
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
        arquivo.close();
    }
            
    
    
}
