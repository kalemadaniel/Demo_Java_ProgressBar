/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_java_progressbar;

import java.security.Principal;

/**
 *
 * @author dan
 */
public class Principale extends javax.swing.JFrame {

    /**
     * Creates new form progressBar
     */
    public Principale() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        bar();
    }
    
      void bar(){
    
    Thread ss=new Thread(){
        public void run(){
            try {
                for(int i=0;i<1;i++){
                    sleep(300);
                    txtbarlog.setText("_____");
                    txtProgressBoule.setText("Running  ●");
                     sleep(400);
                   txtProgressBoule.setText("Running  ●●");
                     sleep(500);
                    txtbarlog.setText("_______");
                    txtProgressBoule.setText("Running  ●●●");
                    sleep(600);
                   txtProgressBoule.setText("Running  ●");
                     sleep(700);
                    txtbarlog.setText("_________");
                     txtProgressBoule.setText("Running  ●●");
                     sleep(500);
                    txtbarlog.setText("___________");
                       txtProgressBoule.setText("Running  ●●●");
                     sleep(500);
                        txtProgressBoule.setText("Running  ●");
                    txtbarlog.setText("________________");
                    sleep(600);
                   txtProgressBoule.setText("Running  ●●");
                     sleep(700);
                        txtProgressBoule.setText("Running  ●●●");
                    txtbarlog.setText("____________________");
                     sleep(700);
                    txtbarlog.setText("__________________________");
                    txtProgressBoule.setText("Running  ");
                     sleep(700);
                    txtbarlog.setText("___________________________________");
                    txtProgressBoule.setText("Running  ●");
                     sleep(800);
                    txtbarlog.setText("________________________________________________________");
                    txtProgressBoule.setText("Running  ●●");
                    sleep(900);
                    txtbarlog.setText("____________________________________________________________");
                    txtProgressBoule.setText("Running  ●●●");
                  close();
                }
            } catch (Exception e) {
            }
        }
    };ss.start();
      }
      
      void close(){
          this.setVisible(false);
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtbarlog = new javax.swing.JLabel();
        txtProgressBoule = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtloading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Java Démo ProgressBar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 40));

        txtbarlog.setText("jLabel4");
        jPanel1.add(txtbarlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 430, 30));

        txtProgressBoule.setText("jLabel1");
        jPanel1.add(txtProgressBoule, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoJava.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 210, 130));

        txtloading.setText("jLabel2");
        jPanel1.add(txtloading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 430, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principale().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtProgressBoule;
    private javax.swing.JLabel txtbarlog;
    private javax.swing.JLabel txtloading;
    // End of variables declaration//GEN-END:variables
}
