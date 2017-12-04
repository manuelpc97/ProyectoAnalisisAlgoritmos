
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manuelpc97
 */
public class Grafo {

    Vertice verticePrincipal;
    ArrayList<Vertice> todosVertices;

    public Grafo() {
        todosVertices = new ArrayList();
    }

    public Grafo(Vertice verticePrincipal) {
        this.verticePrincipal = verticePrincipal;
        todosVertices = new ArrayList();
    }

    public Vertice getVerticePrincipal() {
        return verticePrincipal;
    }

    public void setVerticePrincipal(Vertice verticePrincipal) {
        this.verticePrincipal = verticePrincipal;
    }

    public ArrayList<Vertice> getTodosVertices() {
        ArrayList<Vertice> retorno = new ArrayList();
        retorno.add(this.verticePrincipal);
        for (int i = 0; i < this.todosVertices.size(); i++) {
            retorno.add((this.todosVertices.get(i)));
        }
        return retorno;
    }

    public void setTodosVertices(ArrayList<Vertice> todosVertices) {
        this.todosVertices = todosVertices;
    }

    public void addVertice(Object value) {
        this.todosVertices.add(new Vertice(value));
    }

    public void addEdge(Vertice origin, Arista conexion) {
        origin.getAristas().add(conexion);
    }

    public boolean verificarExistencia(Vertice uno) {
        if (uno.equals(this.verticePrincipal)) {
            return true;
        }
        for (int i = 0; i < this.todosVertices.size(); i++) {
            if (uno.equals(this.todosVertices.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAdyacente(Vertice uno, Vertice dos) {
        if (verificarExistencia(uno) && verificarExistencia(dos)) {
            for (int i = 0; i < uno.getAristas().size(); i++) {
                if (((Arista) uno.getAristas().get(i)).getDestino().equals(dos)) {
                    return true;
                }
            }
            for (int i = 0; i < dos.getAristas().size(); i++) {
                if (((Arista) dos.getAristas().get(i)).getDestino().equals(uno)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Vertice> getAdyacentes(Vertice nodo) {
        ArrayList<Vertice> retorno = new ArrayList();

        if (verificarExistencia(nodo)) {
            for (int i = 0; i < nodo.getAristas().size(); i++) {
                retorno.add(((Arista) nodo.getAristas().get(i)).getDestino());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uno de estos vertices no existe en el grafo",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return retorno;
    }

    public void removeEdge(Vertice uno, Vertice dos) {
        if (verificarExistencia(uno) && verificarExistencia(dos)) {
            for (int i = 0; i < uno.getAristas().size(); i++) {
                if (((Arista) uno.getAristas().get(i)).getDestino().equals(dos)) {
                    uno.getAristas().remove(i);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Uno de estos vertices no existe en el grafo",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void removeVertex(Vertice borrar) {
        if (verificarExistencia(borrar)) {
            for (int i = 0; i < this.todosVertices.size(); i++) {
                for (int k = 0; k < ((Vertice) this.todosVertices.get(i)).getAristas().size(); i++) {
                    if (((Arista) ((Vertice) this.todosVertices.get(i)).getAristas().get(k)).getDestino() == borrar) {
                        ((Vertice) this.todosVertices.get(i)).getAristas().remove(k);
                    }
                }
                if (this.todosVertices.get(i) == borrar) {
                    this.todosVertices.remove(i);
                }
            }
        }
    }

    public Vertice getVertexByValue(String toCompare) {
        if (this.verticePrincipal.getValue().toString().equals(toCompare)) {
            return verticePrincipal;
        } else {
            for (int i = 0; i < this.todosVertices.size(); i++) {
                if (this.todosVertices.get(i).getValue().toString().equals(toCompare)) {
                    return this.todosVertices.get(i);
                }
            }
        }
        return new Vertice(-1);
    }

    public Grafo getComplement() {
        Grafo complement = new Grafo();
        complement.setVerticePrincipal(new Vertice(verticePrincipal.getValue().toString()));
        ArrayList<Vertice> allVertex = this.getTodosVertices();
        ArrayList<Vertice> neighbors;
        ArrayList<Vertice> notNeighbors;
        Vertice vertex = new Vertice();
        Vertice vertex2 = new Vertice();
        Arista edge = new Arista();

        for (int i = 0; i < this.todosVertices.size(); i++) {
            complement.addVertice(this.todosVertices.get(i).getValue().toString());
        }

        for (int i = 0; i < allVertex.size(); i++) {
            neighbors = allVertex.get(i).getNeighbors();
            notNeighbors = getNotNeighbors(allVertex, neighbors);
            notNeighbors.remove(allVertex.get(i));

            for (int k = 0; k < notNeighbors.size(); k++) {
                vertex = complement.getVertexByValue(allVertex.get(i).getValue().toString());
                vertex2 = complement.getVertexByValue(notNeighbors.get(k).getValue().toString());
                edge = new Arista(vertex, vertex2, 0);
                complement.addEdge(vertex, edge);
            }
        }

        return complement;
    }

    public ArrayList<Vertice> getNotNeighbors(ArrayList<Vertice> allVertex, ArrayList<Vertice> neighbors) {
        ArrayList<Vertice> notNeighbors = new ArrayList();

        for (int i = 0; i < allVertex.size(); i++) {
            if (!neighbors.contains(allVertex.get(i))) {
                notNeighbors.add(allVertex.get(i));
            }
        }

        return notNeighbors;
    }

    public ArrayList<ArrayList<Vertice>> getIndependentSets() {
        ArrayList<ArrayList<Vertice>> retorno = new ArrayList();
        ArrayList<Vertice> allVertex = this.getTodosVertices();
        ArrayList<Vertice> notNeighbors = new ArrayList();

        for (int i = 0; i < allVertex.size(); i++) {
            if (allVertex.get(i).getAristas().size() > 0) {
                notNeighbors = this.getNotNeighbors(allVertex, allVertex.get(i).getNeighbors());
                retorno.add(notNeighbors);
            }
        }
        return retorno;
    }
    
    public ArrayList<ArrayList<Vertice>> getAllVertexNeighbors(){
            ArrayList<ArrayList<Vertice>> lista = new ArrayList();
            lista.add(this.verticePrincipal.getNeighborsAndMe());
            
            for(int i = 0; i < this.todosVertices.size(); i++){
                lista.add(this.todosVertices.get(i).getNeighborsAndMe());
            }
            return lista;
    }
}
