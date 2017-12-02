
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
            .addGap(0, 515, Short.MAX_VALUE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(bt_addEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(bt_addVertex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_source, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_target, 0, 118, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
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
                .addGap(18, 18, 18)
                .addComponent(cb_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_target, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        this.jInternalFrame1.getContentPane().add(component);
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
                JOptionPane.showMessageDialog(this, "Vertice Creado", "Exito", JOptionPane.PLAIN_MESSAGE);
                this.tf_vertexName.setText("");
            } finally {
                component.getGraph().getModel().endUpdate();
                updateBoxes();
            }
        }else{
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
                Object edge = component.getGraph().insertEdge(parent, null, "", source, target);
                edges.add(edge);
            } finally {
                component.getGraph().getModel().endUpdate();
                JOptionPane.showMessageDialog(this, "Arista Creada", "Exito", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se puede agregar la arista", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_addEdgeMouseClicked

    public mxICell getVertexByName(String name) {
        mxICell vertex = new mxCell();
        for (int i = 0; i < vertexList.size(); i++) {
            if (((mxICell) vertexList.get(i)).getId().equals(name)) {
                vertex = ((mxICell) vertexList.get(i));
            }
        }
        return vertex;
    }

    public int generatePosition(int bound){
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
        for (int i = 0; i < vertexNames.size(); i++) {
            model1.addElement(vertexNames.get(i));
            model2.addElement(vertexNames.get(i));
        }
        this.cb_source.setModel(model1);
        this.cb_target.setModel(model2);
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
    private javax.swing.JButton bt_addEdge;
    private javax.swing.JButton bt_addVertex;
    private javax.swing.JComboBox<String> cb_source;
    private javax.swing.JComboBox<String> cb_target;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tf_vertexName;
    // End of variables declaration//GEN-END:variables
    mxGraph graph;
    Object parent;
    mxGraphComponent component;
    ArrayList<Object> vertexList;
    ArrayList<String> vertexNames;
    ArrayList<Object> edges;
}
