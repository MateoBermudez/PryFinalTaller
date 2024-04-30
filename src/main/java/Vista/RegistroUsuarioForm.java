/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.CtrlRegistro;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class RegistroUsuarioForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuarioForm
     */
    RegistroUsuarioForm registroUsuario;
    
    
    public RegistroUsuarioForm() {
        initComponents();
    }
    
    
    public void InitRegister() {
        registroUsuario = new RegistroUsuarioForm();
        registroUsuario.setSize(1000, 800);
        registroUsuario.setMaximumSize(registroUsuario.getSize());
        registroUsuario.setMinimumSize(registroUsuario.getSize());
        registroUsuario.setPreferredSize(registroUsuario.getSize());
        registroUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroUsuario.setLocationRelativeTo(null);
        registroUsuario.getContentPane().setBackground(Color.GRAY);
        registroUsuario.setVisible(true);
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftSide = new javax.swing.JPanel();
        RightSide = new javax.swing.JPanel();
        upIngresar = new javax.swing.JLabel();
        upRegistrarse = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        correoField = new javax.swing.JTextField();
        contraseña = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        apellidos = new javax.swing.JLabel();
        apellidosField = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(LeftSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 530, 590));

        RightSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upIngresar.setText("Ingresar");
        upIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upIngresarMouseClicked(evt);
            }
        });
        RightSide.add(upIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        upRegistrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upRegistrarse.setText("Registrarse");
        RightSide.add(upRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Ingrese su Nombre:");
        RightSide.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, -1));

        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }
        });
        RightSide.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, -1));

        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("Ingrese su ID:");
        RightSide.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, -1));

        idField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idFieldKeyPressed(evt);
            }
        });
        RightSide.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, -1));

        correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correo.setText("Ingrese su correo: ");
        RightSide.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 200, -1));

        correoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correoFieldKeyPressed(evt);
            }
        });
        RightSide.add(correoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, -1));

        contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contraseña.setText("Ingrese su contraseña:");
        RightSide.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 200, -1));

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        RightSide.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 200, -1));

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseClicked(evt);
            }
        });
        RightSide.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 170, -1));

        apellidos.setText("Ingrese sus Apellidos");
        RightSide.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        apellidosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                apellidosFieldKeyPressed(evt);
            }
        });
        RightSide.add(apellidosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 200, -1));

        telefono.setText("Ingrese su telefono");
        RightSide.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        telefonoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoFieldKeyPressed(evt);
            }
        });
        RightSide.add(telefonoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, -1));

        getContentPane().add(RightSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 290, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upIngresarMouseClicked
        // TODO add your handling code here:
        dispose();
        InicioUsuarioForm inicioUsuario = new InicioUsuarioForm();
        inicioUsuario.InitLogin();
    }//GEN-LAST:event_upIngresarMouseClicked

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nameField.setEnabled(false);
        }
    }//GEN-LAST:event_nameFieldKeyPressed

    private void idFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            idField.setEnabled(false);
        }
    }//GEN-LAST:event_idFieldKeyPressed

    private void correoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            correoField.setEnabled(false);
        }
    }//GEN-LAST:event_correoFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passwordField.setEnabled(false);
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseClicked
        // TODO add your handling code here:
        ValidarRegistro();
    }//GEN-LAST:event_btnRegistrarseMouseClicked

    private void apellidosFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            apellidosField.setEnabled(false);
        }
    }//GEN-LAST:event_apellidosFieldKeyPressed

    private void telefonoFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telefonoField.setEnabled(false);
        }
    }//GEN-LAST:event_telefonoFieldKeyPressed

    
    private void ValidarRegistro() {
        boolean sesionIniciada;
        CtrlRegistro controladorRegistroUsuario = new CtrlRegistro();
        String Contrasena = capturarContrasena();
        sesionIniciada = controladorRegistroUsuario.CapturarDatos(nameField.getText(), apellidosField.getText(), idField.getText(), 
                correoField.getText(), telefonoField.getText(), Contrasena);
        if (sesionIniciada) {
            dispose();
            //Llamar a la ventana que sigue del inicio de sesion con este formato
            /*
            RegistroUsuarioForm registroUsuario = new RegistroUsuarioForm();
            registroUsuario.InitRegister();
            */
        }
        //No se valida si los datos son incorrectos o si el usuario no existe, ya que se le avisa al usuario desde controlador
        HabilitarCampos();
    }
    
    private String capturarContrasena() {
        String Contrasena = "";
        for (int i = 0; i < passwordField.getPassword().length; i++) {
            Contrasena += passwordField.getPassword()[i];
        }
        return Contrasena;
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
            java.util.logging.Logger.getLogger(RegistroUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuarioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftSide;
    private javax.swing.JPanel RightSide;
    private javax.swing.JLabel apellidos;
    private javax.swing.JTextField apellidosField;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField correoField;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nombre;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JLabel upIngresar;
    private javax.swing.JLabel upRegistrarse;
    // End of variables declaration//GEN-END:variables

    private void HabilitarCampos() {
        passwordField.setEnabled(true);
        idField.setEnabled(true);
        nameField.setEnabled(true);
        correoField.setEnabled(true);
        telefonoField.setEnabled(true);
        apellidosField.setEnabled(true);
    }

}
