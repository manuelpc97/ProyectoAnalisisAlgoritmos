
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.Color;
import java.awt.Container;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.jgraph.JGraph;
import org.jgraph.graph.DefaultCellViewFactory;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;
import org.jgraph.graph.DefaultPort;
import org.jgraph.graph.Edge;
import org.jgraph.graph.GraphConstants;
import org.jgraph.graph.GraphLayoutCache;
import org.jgraph.graph.GraphModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manuelpc97
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        tf_vertexName = new javax.swing.JTextField();
        bt_addVertex = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_source = new javax.swing.JComboBox<>();
        bt_addEdge = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cb_target = new javax.swing.JComboBox<>();
        tf_peso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bt_TSP = new javax.swing.JButton();
        cb_TSP = new javax.swing.JComboBox<>();
        bt_complemento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jLabel1.setText("Vertice");

        bt_addVertex.setText("Agregar");
        bt_addVertex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addVertexMouseClicked(evt);
            }
        });

        jLabel2.setText("Arista");

        bt_addEdge.setText("Agregar");
        bt_addEdge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addEdgeMouseClicked(evt);
            }
        });

        jButton1.setText("Nuevo Grafo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel3.setText("Peso");

        bt_TSP.setText("TSP");
        bt_TSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_TSPMouseClicked(evt);
            }
        });

        bt_complemento.setText("Complemento");
        bt_complemento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_complementoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_vertexName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(bt_addEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(bt_addVertex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(bt_complemento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_source, 0, 118, Short.MAX_VALUE)
                                            .addComponent(cb_target, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_TSP, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt_TSP)
                                            .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(19, 19, 19))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(bt_addVertex))
                .addGap(18, 18, 18)
                .addComponent(tf_vertexName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addEdge)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cb_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_target, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_TSP)
                    .addComponent(cb_TSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(bt_complemento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        graph = new mxGraph();
        parent = graph.getDefaultParent();
        component = new mxGraphComponent(graph);
        component.setSize(this.jInternalFrame1.getSize());
        vertexList = new ArrayList();
        edges = new ArrayList();
        vertexNames = new ArrayList();
        myGraph = new Grafo();
        this.jInternalFrame1.getContentPane().add(component);
        this.repaint();
    }//GEN-LAST:event_jButton1MouseClicked

    private void bt_addVertexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addVertexMouseClicked
        // TODO add your handling code here:
        if (validVertexName(this.tf_vertexName.getText())) {
            component.getGraph().getModel().beginUpdate();
            try {
                Object v1 = component.getGraph().insertVertex(parent, this.tf_vertexName.getText(), this.tf_vertexName.getText(),
                        generatePosition(400), generatePosition(400), 80, 30);
                vertexList.add(v1);
                vertexNames.add(this.tf_vertexName.getText());
                if (vertexList.size() == 1) {
                    myGraph.setVerticePrincipal(new Vertice(this.tf_vertexName.getText()));
                } else {
                    myGraph.addVertice(this.tf_vertexName.getText());
                }
                JOptionPane.showMessageDialog(this, "Vertice Creado", "Exito", JOptionPane.PLAIN_MESSAGE);
                this.tf_vertexName.setText("");
            } finally {
                component.getGraph().getModel().endUpdate();
                updateBoxes();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se puede agregar el vertice", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bt_addVertexMouseClicked

    private void bt_addEdgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addEdgeMouseClicked
        // TODO add your handling code here:
        mxICell source = getVertexByName(this.cb_source.getSelectedItem().toString());
        mxICell target = getVertexByName(this.cb_target.getSelectedItem().toString());

        if (!source.equals(target) && verifyEdges(source, target)) {
            component.getGraph().getModel().beginUpdate();
            try {
                Object edge = component.getGraph().insertEdge(parent, this.tf_peso.getText(), this.tf_peso.getText(), source, target);
                edges.add(edge);
                edge = component.getGraph().insertEdge(parent, this.tf_peso.getText(), this.tf_peso.getText(), target, source);
                edges.add(edge);
                myEdge = new Arista(myGraph.getVertexByValue(source.getValue().toString()), myGraph.getVertexByValue(target.getValue().toString()),
                        Integer.parseInt(this.tf_peso.getText()));
                myGraph.addEdge(myGraph.getVertexByValue(source.getValue().toString()), myEdge);
                myEdge = new Arista(myGraph.getVertexByValue(target.getValue().toString()), myGraph.getVertexByValue(source.getValue().toString()),
                        Integer.parseInt(this.tf_peso.getText()));
                myGraph.addEdge(myGraph.getVertexByValue(target.getValue().toString()), myEdge);
            } finally {
                component.getGraph().getModel().endUpdate();
                JOptionPane.showMessageDialog(this, "Arista Creada", "Exito", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se puede agregar la arista", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_addEdgeMouseClicked

    private void bt_TSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_TSPMouseClicked
        // TODO add your handling code here:
        ArrayList<Vertice> path = new ArrayList();
        Vertice vertex = new Vertice();
        vertex = myGraph.getVertexByValue(this.cb_TSP.getSelectedItem().toString());

        if (this.applyForTSP()) {
            path = this.cheapestInsertion(vertex);
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i).getValue().toString() + " , ");
            }
            System.out.println("");
        } else {
            JOptionPane.showMessageDialog(this, "Grafo no aplica para TSP", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_TSPMouseClicked

    private void bt_complementoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_complementoMouseClicked
        // TODO add your handling code here:
        ArrayList<ArrayList<Vertice>> cliques = this.Clique();

        System.out.println("Todos los cliques");
        for (int i = 0; i < cliques.size(); i++) {
            System.out.println(cliques.get(i).toString());
        }
        System.out.println("El clique mas grande es: " + this.getMaxClique(cliques).toString());
    }//GEN-LAST:event_bt_complementoMouseClicked

    public mxICell getVertexByName(String name) {
        mxICell vertex = new mxCell();
        for (int i = 0; i < vertexList.size(); i++) {
            if (((mxICell) vertexList.get(i)).getId().equals(name)) {
                vertex = ((mxICell) vertexList.get(i));
            }
        }
        return vertex;
    }

    public int generatePosition(int bound) {
        Random r = new Random();
        return r.nextInt(bound) + 1;
    }

    public boolean validVertexName(String name) {
        for (int i = 0; i < vertexNames.size(); i++) {
            if (vertexNames.get(i).equals(name)) {
                return false;
            }
        }
        return true;
    }

    public boolean verifyEdges(mxICell source, mxICell target) {
        for (int i = 0; i < edges.size(); i++) {
            if (((mxCell) edges.get(i)).getSource().equals(source) && ((mxCell) edges.get(i)).getTarget().equals(target)) {
                return false;
            }
        }
        return true;
    }

    public void updateBoxes() {
        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> model3 = new DefaultComboBoxModel();

        for (int i = 0; i < vertexNames.size(); i++) {
            model1.addElement(vertexNames.get(i));
            model2.addElement(vertexNames.get(i));
            model3.addElement(vertexNames.get(i));
        }

        this.cb_source.setModel(model1);
        this.cb_target.setModel(model2);
        this.cb_TSP.setModel(model3);
    }

    public boolean applyForTSP() {
        myVertex = myGraph.getTodosVertices();

        for (int i = 0; i < myVertex.size(); i++) {
            if (myVertex.get(i).getAristas().size() != myVertex.size() - 1) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Vertice> cheapestInsertion(Vertice origin) {
        ArrayList<Vertice> cheapestPath = new ArrayList();
        Vertice temp = new Vertice();
        origin.setVisited(true);
        cheapestPath.add(origin);
        cheapestPath.add(origin);

        while (cheapestPath.size() <= myVertex.size()) {
            temp = nearestVertexToPath(cheapestPath);
            temp.setVisited(true);

            if (cheapestPath.size() <= 3) {
                cheapestPath = insertVertex(1, temp, cheapestPath);
            } else {
                cheapestPath = insertVertex(getBestPosition(cheapestPath, temp), temp, cheapestPath);
            }
        }
        return cheapestPath;
    }

    public ArrayList<Vertice> insertVertex(int position, Vertice vertex, ArrayList<Vertice> path) {
        ArrayList<Vertice> retorno = new ArrayList();
        for (int i = 0; i < position; i++) {
            retorno.add(path.get(i));
        }
        retorno.add(vertex);

        for (int i = position; i < path.size(); i++) {
            retorno.add(path.get(i));
        }
        return retorno;
    }

    public int getBestPosition(ArrayList<Vertice> path, Vertice vertex) {
        int value = Integer.MAX_VALUE;
        int pos = 0;
        int currentValue = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            currentValue = getValue(path.get(i), path.get(i + 1), vertex);
            if (currentValue < value) {
                value = currentValue;
                pos = i + 1;
            }
        }
        return pos;
    }

    public Vertice nearestVertexToPath(ArrayList<Vertice> path) {
        Vertice retorno = new Vertice();
        ArrayList<Arista> cheapestEdges = new ArrayList();
        int value = 0;

        if (path.size() == 2) {
            retorno = path.get(0).getcheapestEdge().getDestino();
        } else if (path.size() > 2) {
            for (int i = 1; i < path.size(); i++) {
                cheapestEdges.add(path.get(i).getcheapestEdge());
            }

            value = Integer.MAX_VALUE;

            for (int i = 0; i < cheapestEdges.size(); i++) {
                if (cheapestEdges.get(i).getPeso() < value) {
                    value = cheapestEdges.get(i).getPeso();
                    retorno = cheapestEdges.get(i).getDestino();
                }
            }
        }
        return retorno;
    }

    public int getValue(Vertice left, Vertice right, Vertice middle) {
        return left.getDistance(middle) + middle.getDistance(right) - left.getDistance(right);
    }

    public ArrayList<ArrayList<Vertice>> Clique() {
        ArrayList<ArrayList<Vertice>> cliques = new ArrayList();
        ArrayList<Vertice> myVertex = myGraph.getTodosVertices();
        ArrayList<Vertice> temp = new ArrayList();

        for (int i = 0; i < myVertex.size(); i++) {
            temp = new ArrayList();
            temp.add(myVertex.get(i));
            temp = getClique(myVertex.get(i).getNeighborsAndMe(), 1, myVertex.get(i).getAristas().size() + 1, temp);
            cliques.add(temp);
        }
        return cliques;
    }

    public boolean isSubset(ArrayList<Vertice> set, ArrayList<Vertice> subset) {
        if (subset.size() > set.size()) {
            return false;
        }

        for (int i = 0; i < subset.size(); i++) {
            if (!set.contains(subset.get(i))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Vertice> getClique(ArrayList<Vertice> list, int position, int size, ArrayList<Vertice> retorno) {
        if (position == size - 1) {
            if (isSubset(list.get(position).getNeighborsAndMe(), list)) {
                retorno.add(list.get(position));
            }
        } else {
            if (isSubset(list.get(position).getNeighborsAndMe(), list)) {
                retorno.add(list.get(position));
                getClique(list, position + 1, size, retorno);
            } else {
                list.remove(list.get(position));
                getClique(list, position, size - 1, retorno);
            }
        }
        return retorno;
    }

    public ArrayList<Vertice> getMaxClique(ArrayList<ArrayList<Vertice>> list) {
        ArrayList<Vertice> retorno = new ArrayList();

        retorno = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() > retorno.size()) {
                retorno = list.get(i);
            }
        }
        return retorno;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_TSP;
    private javax.swing.JButton bt_addEdge;
    private javax.swing.JButton bt_addVertex;
    private javax.swing.JButton bt_complemento;
    private javax.swing.JComboBox<String> cb_TSP;
    private javax.swing.JComboBox<String> cb_source;
    private javax.swing.JComboBox<String> cb_target;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tf_peso;
    private javax.swing.JTextField tf_vertexName;
    // End of variables declaration//GEN-END:variables
    mxGraph graph;
    Object parent;
    mxGraphComponent component;
    ArrayList<Object> vertexList;
    ArrayList<String> vertexNames;
    ArrayList<Object> edges;
    Grafo myGraph = new Grafo();
    Arista myEdge = new Arista();
    ArrayList<Vertice> myVertex = new ArrayList();
}
