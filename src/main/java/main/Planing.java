/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author hawerforero
 */
public class Planing extends Thread{
    
    //Atributes
    private int idProcess;
    
    //Constructor
    public Planing(int idProcess) {
        this.idProcess = idProcess;   
    }
    
    //Metodos
    public void executeProcess(){
        if(this.idProcess == 3){
            for(int i=0; i<100000; i++){
                
            }
        }
        System.out.println("Execute process "+ this.idProcess);
    }
    
    //Ejecutar hilo 
    public void run(){
        this.executeProcess();
    }
        
}
