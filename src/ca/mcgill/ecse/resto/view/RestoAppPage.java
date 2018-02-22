/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.mcgill.ecse.resto.view;

/**
 *
 * @author anudruth
 */
public class RestoAppPage extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public RestoAppPage() {
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

        app_panel = new javax.swing.JPanel();
        scroll_layout = new javax.swing.JScrollPane();
        Image_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttons_panel = new javax.swing.JPanel();
        add_table = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        app_panel.setBackground(java.awt.Color.white);

        Image_panel.setBackground(java.awt.Color.white);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resto_app/resources/Screen Shot 2018-02-20 at 1.08.07 AM.png"))); // NOI18N

        javax.swing.GroupLayout Image_panelLayout = new javax.swing.GroupLayout(Image_panel);
        Image_panel.setLayout(Image_panelLayout);
        Image_panelLayout.setHorizontalGroup(
            Image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Image_panelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(118, 118, 118))
        );
        Image_panelLayout.setVerticalGroup(
            Image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Image_panelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139))
        );

        buttons_panel.setBackground(java.awt.Color.white);

        add_table.setBackground(new java.awt.Color(0, 255, 0));
        add_table.setText("Add table");
        add_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_tableActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Reserve table");

        javax.swing.GroupLayout buttons_panelLayout = new javax.swing.GroupLayout(buttons_panel);
        buttons_panel.setLayout(buttons_panelLayout);
        buttons_panelLayout.setHorizontalGroup(
            buttons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttons_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_table, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        buttons_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add_table, jButton3});

        buttons_panelLayout.setVerticalGroup(
            buttons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttons_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(add_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout app_panelLayout = new javax.swing.GroupLayout(app_panel);
        app_panel.setLayout(app_panelLayout);
        app_panelLayout.setHorizontalGroup(
            app_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(app_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(app_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_layout, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttons_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Image_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        app_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Image_panel, scroll_layout});

        app_panelLayout.setVerticalGroup(
            app_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(app_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(app_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Image_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(app_panelLayout.createSequentialGroup()
                        .addComponent(scroll_layout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttons_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(app_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(app_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_tableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_tableActionPerformed

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
            java.util.logging.Logger.getLogger(RestoAppPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestoAppPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestoAppPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestoAppPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestoAppPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Image_panel;
    private javax.swing.JButton add_table;
    private javax.swing.JPanel app_panel;
    private javax.swing.JPanel buttons_panel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane scroll_layout;
    // End of variables declaration//GEN-END:variables
}
