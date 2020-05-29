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
public class Proceso {
    
    private String id;
    private String nombre;
    private String tipo;
    private String estado;
    private long tiempoLlegada; 
    private long tiempoEspera; 
    private long tiempoCPU; 
    private int prioridad;   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getTiempoCPU() {
        return tiempoCPU;
    }

    public void setTiempoCPU(long tiempoCPU) {
        this.tiempoCPU = tiempoCPU;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(long tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public long getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(long tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    @Override
    public String toString() {
        return "Proceso{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", estado=" + estado + ", tiempoLlegada=" + tiempoLlegada + ", tiempoEspera=" + tiempoEspera + ", tiempoCPU=" + tiempoCPU + ", prioridad=" + prioridad + '}';
    }
    

    void setTiempo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
