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
    public void atualiza(long posIni){
        long i;
        long posFim;
        String aux;
        
        try{
            //le a proxima linha
            aux = lerLinha(posIni);
            posFim = arquivo.getFilePointer();
            i= posIni;
            arquivo.seek(posIni);
            while(i<=posFim){
                arquivo.writeBytes(" ");
                i++;
            }
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    public long getTam(){
        try{
            return arquivo.length();
        }catch(IOException e){
            System.out.println(e.getCause());
            return 0;
        }
    }
    
   // public void escrever(String s, int pos){
    public void escrever(String s){
        try{
            if(arquivo.length()>0)
                arquivo.seek(arquivo.length());
            arquivo.writeBytes(s);
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
    
    public Aluno ler( long pos){
        
        Aluno aluno = new Aluno();
        String aux;
        String[] dado;  
            aux = lerLinha(pos);
            dado = aux.split("\\|");
            
            aluno.setRA(dado[0]);
            aluno.setNome(dado[1]);
            aluno.setIdade(dado[2]);
            aluno.setCPF(dado[3]);
            
        return aluno;
        
    }
    
    private String lerLinha(long pos){
        String aux = new String();
        byte n;
        
        try{
            arquivo.seek(pos);
            for(n = arquivo.readByte();n!='#';n = arquivo.readByte()){
                aux = aux + (char) n;
            }
            
        }catch(IOException e){
            System.out.println(pos + " "+ aux);
        }
        return aux;
    }
    
    
}
