
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuelpc97
 */
public class Vertice {
    Object value;
    ArrayList<Arista> aristas;

    public Vertice() {
        aristas = new ArrayList();
    }

    public Vertice(Object value) {
        this.value = value;
        this.aristas = new ArrayList();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista> aristas) {
        this.aristas = aristas;
    }

    @Override
    public String toString() {
        return value+"";
    }
    
}
