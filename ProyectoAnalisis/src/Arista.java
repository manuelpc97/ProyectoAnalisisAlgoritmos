/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuelpc97
 */
public class Arista {
    Vertice destino;
    Vertice origen;
    int peso;
    int eliminado=1;

    public Arista() {
        destino = new Vertice();
        origen = new Vertice();
    }

    public Arista(Vertice origin, Vertice destiny, int peso) {
        this.destino = destiny;
        this.origen = origin;
        this.peso = peso;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public Vertice getOrigen() {
        return origen;
    }

    public void setOrigen(Vertice origen) {
        this.origen = origen;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    

    @Override
    public String toString() {
        return origen.getValue() + " <--> " + destino.getValue();
    }
    
    
}
