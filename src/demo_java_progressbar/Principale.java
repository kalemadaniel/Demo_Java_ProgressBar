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
                    Barlog.setText("_____");
                    Run.setText("Running  ●");
                     sleep(400);
                   Run.setText("Running  ●●");
                     sleep(500);
                    Barlog.setText("_______");
                    Run.setText("Running  ●●●");
                    sleep(600);
                   Run.setText("Running  ●");
                     sleep(700);
                    Barlog.setText("_________");
                     Run.setText("Running  ●●");
                     sleep(500);
                    Barlog.setText("___________");
                       Run.setText("Running  ●●●");
                     sleep(500);
                        Run.setText("Running  ●");
                    Barlog.setText("________________");
                    sleep(600);
                   Run.setText("Running  ●●");
                     sleep(700);
                        Run.setText("Running  ●●●");
                    Barlog.setText("____________________");
                     sleep(700);
                    Barlog.setText("__________________________");
                    Run.setText("Running  ");
                     sleep(700);
                    Barlog.setText("___________________________________");
                    Run.setText("Running  ●");
                     sleep(800);
                    Barlog.setText("________________________________________________________");
                    Run.setText("Running  ●●");
                    sleep(900);
                    Barlog.setText("____________________________________________________________");
                    Run.setText("Running  ●●●");
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
        Barlog = new javax.swing.JLabel();
        Run = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Java Démo ProgressBar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 40));

        Barlog.setText("jLabel4");
        jPanel1.add(Barlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 430, 30));

        Run.setText("jLabel1");
        jPanel1.add(Run, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoJava.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 210, 150));

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
    private javax.swing.JLabel Barlog;
    private javax.swing.JLabel Run;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
