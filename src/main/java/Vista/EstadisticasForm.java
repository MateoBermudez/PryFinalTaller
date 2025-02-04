/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.SeguridadArchivos;
import Modelo.VentasCRUD;
import Modelo.mdVentas;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class EstadisticasForm extends javax.swing.JFrame {

    /**
     * Creates new form EstadisticasForm
     */
    int xMouse, yMouse;
    int id;

    public EstadisticasForm() {
        initComponents();
        setTime();
        initChart(true);
    }

    public void InitEstadisticas(int id) {
        this.id = id;
        this.setSize(806, 641);
        this.setMaximumSize(this.getSize());
        this.setMinimumSize(this.getSize());
        this.setPreferredSize(this.getSize());
        this.setLocationRelativeTo(null);
        this.setCloseOperation();
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);

        // Obtén las dimensiones del contenedor principal
        Dimension mainPanelSize = getContentPane().getSize();

        // Establece las dimensiones del panel gráfico para que se ajuste al contenedor principal
        Chart.setPreferredSize(new Dimension(mainPanelSize.width - 40, mainPanelSize.height - 40));
        Chart.revalidate();
    }

    private void setCloseOperation() {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                SeguridadArchivos.EncriptarArchivos();
                System.exit(0);
            }
        });
    }

    private void initChart(boolean libros) {
        VentasCRUD ventasCRUD = new VentasCRUD();
        List<mdVentas> ventas = ventasCRUD.getVentas();
        AjustarTotal(ventas);
        if (libros) {
            Chart.removeAll();
            Chart.revalidate();
            Chart.repaint();


            //Inicializar el chart por defecto en Libros mas vendidos

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            //Añadir datos al dataset (En este caso libros mas vendidos)

            for (mdVentas venta : ventas) {
                dataset.addValue(venta.getCantidadvendida(), "Ventas", venta.getObra());
            }


            //Crear el grafico

            JFreeChart chart = ChartFactory.createBarChart(
                    "Libros mas vendidos",
                    "Libros",
                    "Cantidad vendida",
                    dataset
            );

            //Crear el panel del grafico y agregarlo al panel Chart
            ChartPanel chartPanel = new ChartPanel(chart);
            Chart.setLayout(new java.awt.BorderLayout());
            Chart.add(chartPanel, BorderLayout.CENTER);
            Chart.validate();
        }
        else {
            Chart.removeAll();
            Chart.revalidate();
            Chart.repaint();


            //Inicializar el chart por defecto en Libros mas vendidos

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            //Añadir datos al dataset (En este caso libros mas vendidos)

            for (mdVentas venta : ventas) {
                dataset.addValue(venta.getPreciovendidos(), "Ingresos", venta.getObra());
            }


            //Crear el grafico

            JFreeChart chart = ChartFactory.createBarChart(
                    "Libros mas vendidos",
                    "Libros",
                    "Ingresos por Obra",
                    dataset
            );

            //Crear el panel del grafico y agregarlo al panel Chart
            ChartPanel chartPanel = new ChartPanel(chart);
            Chart.setLayout(new java.awt.BorderLayout());
            Chart.add(chartPanel, BorderLayout.CENTER);
            Chart.validate();
        }
    }

    private void AjustarTotal(List<mdVentas> ventas) {
        double total = 0;
        String ingresos;
        for (mdVentas venta : ventas) {
            total += venta.getPreciovendidos();
        }
        ingresos = String.valueOf(total);
        for (int i = ingresos.length() - 1; i >= 0; i--) {
            if (ingresos.charAt(i) == '.') {
                ingresos = ingresos.substring(0, i);
                break;
            }
        }
        for (int i = ingresos.length() - 3; i > 0; i -= 3) {
            ingresos = ingresos.substring(0, i) + "," + ingresos.substring(i);
        }
        lblIngresos.setText("Total de ingresos: " + ingresos + "$");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        Chart = new javax.swing.JPanel();
        btnIngresos = new javax.swing.JButton();
        btnMasVendidos = new javax.swing.JButton();
        lblIngresos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Xexit = new javax.swing.JLabel();
        jTxtime = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER AL MENÚ DE INVENTARIO");
        btnVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 547, 200, 40));

        javax.swing.GroupLayout ChartLayout = new javax.swing.GroupLayout(Chart);
        Chart.setLayout(ChartLayout);
        ChartLayout.setHorizontalGroup(
            ChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        ChartLayout.setVerticalGroup(
            ChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(Chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 410));

        btnIngresos.setBackground(new java.awt.Color(51, 51, 51));
        btnIngresos.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btnIngresos.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresos.setText("INGRESOS");
        btnIngresos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnIngresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresosMouseClicked(evt);
            }
        });
        getContentPane().add(btnIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 547, 105, 40));

        btnMasVendidos.setBackground(new java.awt.Color(51, 51, 51));
        btnMasVendidos.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btnMasVendidos.setForeground(new java.awt.Color(255, 255, 255));
        btnMasVendidos.setText("VENTA DE LIBROS");
        btnMasVendidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnMasVendidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasVendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasVendidosMouseClicked(evt);
            }
        });
        getContentPane().add(btnMasVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 547, 105, 40));

        lblIngresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 547, 263, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTADISTICAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 45));

        Xexit.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        Xexit.setForeground(new java.awt.Color(255, 255, 255));
        Xexit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Xexit.setText("Cerrar");
        Xexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Xexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XexitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XexitMousePressed(evt);
            }
        });
        jPanel1.add(Xexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        jTxtime.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jTxtime.setForeground(new java.awt.Color(255, 255, 255));
        jTxtime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jTxtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 123, 45));

        jTxtDate.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jTxtDate.setForeground(new java.awt.Color(255, 255, 255));
        jTxtDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jTxtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 167, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/analitica.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 30, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 83));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
        dispose();
        InventarioForm inventarioForm = new InventarioForm();
        inventarioForm.InitInventario(this.id);
    }//GEN-LAST:event_btnVolverMouseClicked

    private void XexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XexitMouseClicked
        SeguridadArchivos.EncriptarArchivos();
        System.exit(0);
    }//GEN-LAST:event_XexitMouseClicked

    private void XexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XexitMousePressed

    }//GEN-LAST:event_XexitMousePressed

    private void btnIngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosMouseClicked
        // TODO add your handling code here:
        initChart(false);
    }//GEN-LAST:event_btnIngresosMouseClicked

    private void btnMasVendidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasVendidosMouseClicked
        // TODO add your handling code here:
        initChart(true);
    }//GEN-LAST:event_btnMasVendidosMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse =evt.getX();
        yMouse =evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(EstadisticasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadisticasForm().setVisible(true);
            }
        });
    }

    public void setTime(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException ex){
                        Logger.getLogger(libreriaForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss a");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                    jTxtime.setText(time.split(" ")[0]+" " + time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));
                }
            }
        }).start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chart;
    private javax.swing.JLabel Xexit;
    private javax.swing.JButton btnIngresos;
    private javax.swing.JButton btnMasVendidos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTxtDate;
    private javax.swing.JLabel jTxtime;
    private javax.swing.JLabel lblIngresos;
    // End of variables declaration//GEN-END:variables
}
