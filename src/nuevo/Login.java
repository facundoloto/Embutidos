/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;
import Sonidos.Sonidos;
import Conectar.Conectar;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Login extends javax.swing.JFrame {
Conectar con=new Conectar();
Sonidos s=new Sonidos();
Connection conection;
Statement st;
ResultSet rs;
String usuario;
String contraseña;
String use;
String co;
    /**
     * Creates new form Usuario
     */
    public Login() {
   initComponents(); 
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    login();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        cont = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Frank Ruhl Hofshi", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Frank Ruhl Hofshi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 200, -1));

        entrar.setBackground(new java.awt.Color(0, 1, 165));
        entrar.setFont(new java.awt.Font("Frank Ruhl Hofshi", 1, 12)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-key-24.png"))); // NOI18N
        entrar.setText("  Entrar");
        entrar.setBorderPainted(false);
        entrar.setContentAreaFilled(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 120, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-customer-26.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 90, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-emergency-exit-24.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, 20));

        text.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 30));

        cont.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contActionPerformed(evt);
            }
        });
        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper_azul_oscuro_1920x1200_124.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
use=text.getText();
co= new String(cont.getPassword());
 if (use.equals(usuario)){ // si los datos que se ingresa en el jtexfield es el mismo que que la variable usuario pasa por verdadero para comprobar si la contraseña es correcta
 s.Correcto(); // un metodo de sonido es recomendable que vaya arriba de la linea de algun mensaje
 JOptionPane.showMessageDialog(null, "usuario correcto");
 if(co.equals(contraseña)){
 s.Correcto();
 JOptionPane.showMessageDialog(null,"contraseña correcta");
 Menu m=new Menu();
 m.setVisible(true);
 s.Inicio();
 dispose();
  }
 else {
 s.Error();
 JOptionPane.showMessageDialog(null, "contraseña incorrecta");
  }
  }
 else {
 s.Error();
 JOptionPane.showMessageDialog(null, "usuario incorrecto");
   }
    }//GEN-LAST:event_entrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 s.Salir();
 JOptionPane.showMessageDialog(null,"cerrando programa");
 System.exit(0);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_textActionPerformed

    private void contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_contActionPerformed

    
    
    
    
    
    
    
    
 public void login(){
String sql="select*from login ";
try {
conection=con.getConnection();
st=conection.createStatement();
st.execute(sql);
rs=st.getResultSet();
while (rs.next()){
usuario=rs.getString("Usuario");
contraseña=rs.getString("Contraseña");
}

}
catch (Exception e){
System.out.println(e);
        }
con.Cerrar();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cont;
    private javax.swing.JButton entrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
