
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
    boolean visited;
    ArrayList<Arista> aristas;

    public Vertice() {
        this.value = "nuevo";
        aristas = new ArrayList();
        this.visited = false;
    }

    public Vertice(Object value) {
        this.value = value;
        visited = false;
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getGrade(){
        return this.aristas.size();
    }
    
    public int getDistance(Vertice destiny) {
        for (int i = 0; i < this.aristas.size(); i++) {
            if (destiny.equals(this.aristas.get(i).getDestino())) {
                return this.aristas.get(i).getPeso();
            }
        }
        return -1;
    }

    public Arista getcheapestEdge() {
       ArrayList<Arista> lista = getNonVisitedEdges();
       int value = Integer.MAX_VALUE;
       int pos = -1;
       
       for(int i = 0; i < lista.size(); i++){
           if(lista.get(i).getPeso() < value){
               pos = i;
               value = lista.get(i).getPeso();
           }
       }
       return lista.get(pos);
    }
    
    public ArrayList<Arista> getNonVisitedEdges(){
        ArrayList<Arista> retorno = new ArrayList();
        
        for(int i = 0; i < this.aristas.size(); i++){
            if(!this.aristas.get(i).getDestino().isVisited()){
                retorno.add(this.aristas.get(i));
            }
        }
        return retorno;
    }
    
    public ArrayList<Vertice> getNeighbors(){
        ArrayList<Vertice> retorno = new ArrayList();
        
        for(int i = 0; i < this.aristas.size(); i++){
            retorno.add(this.aristas.get(i).getDestino());
        }
        
        return retorno;
    }

    public ArrayList<Vertice> getNeighborsAndMe(){
        ArrayList<Vertice> retorno = new ArrayList();
        retorno.add(this);
        
        for(int i = 0; i < this.aristas.size(); i++){
            retorno.add(this.aristas.get(i).getDestino());
        }
        
        return retorno;
    }
    
    @Override
    public String toString() {
        return value + "";
    }

}
