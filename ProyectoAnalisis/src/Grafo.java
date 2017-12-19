
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

        for (int i = 0; i < this.verticePrincipal.aristas.size(); i++) {
            if (((Arista) ((Vertice) this.verticePrincipal).getAristas().get(i)).getDestino().equals(borrar)) {
                ((Vertice) this.verticePrincipal).getAristas().remove(i);
            }
        }

        if (this.verticePrincipal.equals(borrar)) {
            if (this.todosVertices.size() > 0) {
                this.verticePrincipal = this.todosVertices.get(0);
                this.todosVertices.remove(0);
            } else {
                this.verticePrincipal = new Vertice("-1");
            }
        }

        for (int i = 0; i < this.todosVertices.size(); i++) {
            for (int k = 0; k < ((Vertice) this.todosVertices.get(i)).getAristas().size(); k++) {
                if (((Arista) ((Vertice) this.todosVertices.get(i)).getAristas().get(k)).getDestino().equals(borrar)) {
                    ((Vertice) this.todosVertices.get(i)).getAristas().remove(k);
                }
            }
            if (this.todosVertices.get(i).equals(borrar)) {
                this.todosVertices.remove(i);
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

    public ArrayList<ArrayList<Vertice>> getAllVertexNeighbors() {
        ArrayList<ArrayList<Vertice>> lista = new ArrayList();
        lista.add(this.verticePrincipal.getNeighborsAndMe());

        for (int i = 0; i < this.todosVertices.size(); i++) {
            lista.add(this.todosVertices.get(i).getNeighborsAndMe());
        }
        return lista;
    }

    public Grafo getCopy() {
        Grafo copy = new Grafo();
        copy.setVerticePrincipal(new Vertice(this.verticePrincipal.getValue().toString()));

        for (int i = 0; i < this.todosVertices.size(); i++) {
            copy.todosVertices.add(new Vertice(this.todosVertices.get(i).getValue().toString()));
        }

        ArrayList<Vertice> originalVertex = this.getTodosVertices();
        ArrayList<Vertice> copyVertex = copy.getTodosVertices();
        Arista temp = new Arista();
        String value = "";

        for (int i = 0; i < originalVertex.size(); i++) {
            for (int k = 0; k < originalVertex.get(i).aristas.size(); k++) {
                value = originalVertex.get(i).aristas.get(k).getDestino().getValue().toString();
                temp = new Arista(copyVertex.get(i), copy.getVertexByValue(value), originalVertex.get(i).aristas.get(k).getPeso());
                copy.addEdge(copyVertex.get(i), temp);
            }
        }

        return copy;
    }

    public ArrayList<Vertice> getOrderedVertex() {
        ArrayList<Vertice> ordered = new ArrayList<Vertice>();
        ArrayList<Vertice> disordered = this.getTodosVertices();

        for (int i = 0; i < disordered.size(); i++) {
            ordered = insertVertex(ordered, disordered.get(i), findPosition(disordered.get(i), ordered));
        }
        return ordered;
    }

    public int findPosition(Vertice toInsert, ArrayList<Vertice> ordered) {
        for (int i = 0; i < ordered.size(); i++) {
            if (ordered.get(i).getGrade() > toInsert.getGrade()) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Vertice> insertVertex(ArrayList<Vertice> ordered, Vertice toInsert, int position) {
        ArrayList<Vertice> toReturn = new ArrayList();
        if (position == -1) {
            ordered.add(toInsert);
            return ordered;
        } else {
            for (int i = 0; i < position; i++) {
                toReturn.add(ordered.get(i));
            }
            toReturn.add(toInsert);
            for (int i = position; i < ordered.size(); i++) {
                toReturn.add(ordered.get(i));
            }
        }
        return toReturn;
    }
}
