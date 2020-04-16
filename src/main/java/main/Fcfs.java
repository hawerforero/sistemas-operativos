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
public class Fcfs extends Thread{
    
    protected Proceso proceso;
    
    public Fcfs(Proceso proceso){
        this.proceso = proceso;
    }
    
     public void executeProcess(Proceso proceso){

        System.out.println("Execute process "+ proceso);
    }
    
    //Ejecutar hilo 
    public void run(){
        this.executeProcess(proceso);
    }
}
