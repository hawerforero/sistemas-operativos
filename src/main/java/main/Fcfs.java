/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hawerforero
 */
public class Fcfs extends Thread{
    
    protected List<Proceso> procesos;
    
    public Fcfs(List<Proceso> procesos){
        this.procesos = procesos;
    }
    
    //Ejecutar hilo 
    public void run(){
        
        System.out.println("Inicio hilo");
        
        Simulacion simulacion = new Simulacion();
        
        long tiempo_llegada_hilo = System.currentTimeMillis();
        for(int i=0; i<procesos.size(); i++ )
        {
            long tiempo_inicio_ejecucion = System.currentTimeMillis();
            long tiempo_espera = tiempo_inicio_ejecucion - tiempo_llegada_hilo;
            Proceso proceso = new Proceso();
            proceso.setId(procesos.get(i).getId());
            proceso.setNombre(procesos.get(i).getNombre());
            proceso.setTiempoLlegada(procesos.get(i).getTiempoLlegada());
            proceso.setTiempoEspera(tiempo_espera);
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fcfs.class.getName()).log(Level.SEVERE, null, ex);
            }
            long tiempo_final_ejecucion = System.currentTimeMillis();
            proceso.setTiempoCPU(tiempo_final_ejecucion-tiempo_inicio_ejecucion);
            simulacion.procesos_execute_fscs.add(proceso);
        }
      
    }
}
