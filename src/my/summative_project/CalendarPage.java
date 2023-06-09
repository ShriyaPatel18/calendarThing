/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.summative_project;
import javax.swing.JLabel;

/**
 *
 * @author spate8
 */
public class CalendarPage extends javax.swing.JFrame {

    /**
     * Creates new form CalendarPage
     */
    private int month;
    private int year;
    
    public CalendarPage(int m, int y) {
        initComponents();
        init();
        month = m;
        year = y;
        
    }
    private void init(){
        setDate();
    }
    private void setDate(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendarPanel = new javax.swing.JPanel();
        calendarGrid = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calendarPanel.setBackground(new java.awt.Color(249, 240, 230));
        calendarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calendar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        calendarGrid.setBackground(new java.awt.Color(207, 226, 243));
        calendarGrid.setLayout(new java.awt.GridLayout(5, 7));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        calendarGrid.add(jButton1);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton2);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton3);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton4);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        calendarGrid.add(jButton5);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton6);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton7);

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton8);

        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton9);

        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton10);

        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton11);

        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton12);

        jButton13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton13);

        jButton14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton14);

        jButton15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton15);

        jButton16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton16);

        jButton17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton17);

        jButton18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton18);

        jButton19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton19);

        jButton20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton20);

        jButton21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton21);

        jButton22.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton22);

        jButton23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton23);

        jButton24.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton24);

        jButton25.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton25);

        jButton26.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton26);

        jButton27.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton27);

        jButton28.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton28);

        jButton29.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton29);

        jButton30.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton30);

        jButton31.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton31);

        jButton32.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton32);

        jButton33.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton33);

        jButton34.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton34);

        jButton35.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calendarGrid.add(jButton35);

        jLabel1.setText("Sun");

        jLabel2.setText("Mon");

        jLabel3.setText("Tue");

        jLabel4.setText("Wed");

        jLabel5.setText("Thu");

        jLabel6.setText("Fri");

        jLabel7.setText("Sat");

        javax.swing.GroupLayout calendarPanelLayout = new javax.swing.GroupLayout(calendarPanel);
        calendarPanel.setLayout(calendarPanelLayout);
        calendarPanelLayout.setHorizontalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addComponent(calendarGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(39, 39, 39))
        );
        calendarPanelLayout.setVerticalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addGroup(calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendarGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(207, 226, 243));

        home.setBackground(new java.awt.Color(234, 153, 153));
        home.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        home.setText("Main Menu\n");
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(home)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 157, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 419, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        MainPage main = new MainPage();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CalendarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel calendarGrid;
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
