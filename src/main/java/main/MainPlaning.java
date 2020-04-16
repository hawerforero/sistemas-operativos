/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author hawerforero
 */
public class MainPlaning {
    
    public static void main(String[] args){
        
        ArrayList<Proceso> procesos = new ArrayList<Proceso>();
        //Agregar procesos
        for(int i=0; i<5; i++){
            Proceso proceso = new Proceso();
            proceso.setId(i);
            proceso.setNombre("Nombre"+i);
        
            procesos.add(proceso);
        }
        
       //Ejecutar proceso
       for(int i=0; i<procesos.size(); i++){
           System.out.println("Init process "+ procesos.get(i).getId());
           Fcfs fcfs = new Fcfs(procesos.get(i));
           fcfs.start();        
       }
          
    }
}


