/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnDRoller;
import javax.swing.SpinnerNumberModel;
/**
 *
 * @author ascott
 */
public class RollUI extends javax.swing.JFrame {
    int tempInt;
    int newVal;
    int rollCount = 0;
    int d4, d6, d8, d10, d12, d20;
    
    
    
    /**
     * Creates new form RollUI
     */
    public RollUI() {
        initComponents();
        showReRoll(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        primaryContainer = new javax.swing.JPanel();
        d4Button = new javax.swing.JButton();
        d6Button = new javax.swing.JButton();
        d10Button = new javax.swing.JButton();
        d8Button = new javax.swing.JButton();
        d12Button = new javax.swing.JButton();
        d20Button = new javax.swing.JButton();
        rollButton = new javax.swing.JButton();
        d6Quantity = new javax.swing.JSpinner();
        d8Quantity = new javax.swing.JSpinner();
        d10Quantity = new javax.swing.JSpinner();
        d12Quantity = new javax.swing.JSpinner();
        d20Quantity = new javax.swing.JSpinner();
        d4Quantity = new javax.swing.JSpinner();
        resultsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultOutputArea = new javax.swing.JTextArea();
        reRollButton = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        d4Button.setBackground(new java.awt.Color(255, 255, 255));
        d4Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d4Button.setLabel("d4");
        d4Button.setName("d4Button"); // NOI18N
        d4Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d4ButtonMouseClicked(evt);
            }
        });

        d6Button.setBackground(new java.awt.Color(255, 255, 255));
        d6Button.setText("d6");
        d6Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d6Button.setName("d4Button"); // NOI18N
        d6Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d6ButtonMouseClicked(evt);
            }
        });

        d10Button.setBackground(new java.awt.Color(255, 255, 255));
        d10Button.setText("d10");
        d10Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d10Button.setName("d4Button"); // NOI18N
        d10Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d10ButtonMouseClicked(evt);
            }
        });

        d8Button.setBackground(new java.awt.Color(255, 255, 255));
        d8Button.setText("d8");
        d8Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d8Button.setName("d4Button"); // NOI18N
        d8Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d8ButtonMouseClicked(evt);
            }
        });

        d12Button.setBackground(new java.awt.Color(255, 255, 255));
        d12Button.setText("d12");
        d12Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d12Button.setName("d4Button"); // NOI18N
        d12Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d12ButtonMouseClicked(evt);
            }
        });

        d20Button.setBackground(new java.awt.Color(255, 255, 255));
        d20Button.setText("d20");
        d20Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d20Button.setName("d4Button"); // NOI18N
        d20Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d20ButtonMouseClicked(evt);
            }
        });

        rollButton.setText("ROLL!");
        rollButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rollButtonMouseClicked(evt);
            }
        });

        d6Quantity.setModel(new SpinnerNumberModel(0, 0, 10, 1));

        d8Quantity.setModel(new SpinnerNumberModel(0, 0, 10, 1));

        d10Quantity.setModel(new SpinnerNumberModel(0, 0, 10, 1));

        d12Quantity.setModel(new SpinnerNumberModel(0, 0, 10, 1));

        d20Quantity.setModel(new SpinnerNumberModel(0, 0, 10, 1));

        d4Quantity.setModel(new SpinnerNumberModel(0, 0, 10, 1));

        resultsLabel.setText("Results:");
        resultsLabel.setToolTipText("");

        resultOutputArea.setEditable(false);
        resultOutputArea.setBackground(new java.awt.Color(212, 208, 200));
        resultOutputArea.setColumns(2);
        resultOutputArea.setRows(5);
        jScrollPane2.setViewportView(resultOutputArea);

        reRollButton.setText("Re-Roll");
        reRollButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reRollButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout primaryContainerLayout = new javax.swing.GroupLayout(primaryContainer);
        primaryContainer.setLayout(primaryContainerLayout);
        primaryContainerLayout.setHorizontalGroup(
            primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primaryContainerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rollButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, primaryContainerLayout.createSequentialGroup()
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(primaryContainerLayout.createSequentialGroup()
                                .addComponent(d4Quantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d6Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(primaryContainerLayout.createSequentialGroup()
                                .addComponent(d4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d8Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d8Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(primaryContainerLayout.createSequentialGroup()
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d10Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d10Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d12Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d12Quantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d20Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d20Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reRollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        primaryContainerLayout.setVerticalGroup(
            primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primaryContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(primaryContainerLayout.createSequentialGroup()
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d6Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d8Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d4Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d12Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d20Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d10Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d12Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d20Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(primaryContainerLayout.createSequentialGroup()
                        .addComponent(resultsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(primaryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rollButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(reRollButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(primaryContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(primaryContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showReRoll(Boolean vis) {
        reRollButton.setVisible(vis);
    }
    
    private void d4ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d4ButtonMouseClicked
        newVal = incrementSpinnerValue("d4");
        d4Quantity.setValue(newVal);
    }//GEN-LAST:event_d4ButtonMouseClicked

    private void d6ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d6ButtonMouseClicked
        newVal = incrementSpinnerValue("d6");
        d6Quantity.setValue(newVal);
    }//GEN-LAST:event_d6ButtonMouseClicked

    private void d8ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d8ButtonMouseClicked
        newVal = incrementSpinnerValue("d8");
        d8Quantity.setValue(newVal);
    }//GEN-LAST:event_d8ButtonMouseClicked

    private void d10ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d10ButtonMouseClicked
        newVal = incrementSpinnerValue("d10");
        d10Quantity.setValue(newVal);
    }//GEN-LAST:event_d10ButtonMouseClicked

    private void d12ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d12ButtonMouseClicked
        newVal = incrementSpinnerValue("d12");
        d12Quantity.setValue(newVal);
    }//GEN-LAST:event_d12ButtonMouseClicked

    private void d20ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d20ButtonMouseClicked
        newVal = incrementSpinnerValue("d20");
        d20Quantity.setValue(newVal);
    }//GEN-LAST:event_d20ButtonMouseClicked

    private void rollButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rollButtonMouseClicked

            d4 = (Integer) d4Quantity.getValue();
            d6 = (Integer) d6Quantity.getValue();
            d8 = (Integer) d8Quantity.getValue();
            d10 = (Integer) d10Quantity.getValue();
            d12 = (Integer) d12Quantity.getValue();
            d20  = (Integer) d20Quantity.getValue();

                Roll myRoll = new Roll(d4, d6, d8, d10, d12, d20);                
                myRoll.addDiceToRoll();
                String rollResultMsg = myRoll.rollThemDiiice();
                rollCount++;     
                resultOutputArea.setText(rollResultMsg);
                
                showReRoll(true);
                
            d4Quantity.setValue(0);
            d6Quantity.setValue(0);
            d8Quantity.setValue(0);
            d10Quantity.setValue(0);
            d12Quantity.setValue(0);
            d20Quantity.setValue(0);
            
                
    }//GEN-LAST:event_rollButtonMouseClicked

    private void reRollButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reRollButtonMouseClicked
                Roll myRoll = new Roll(d4, d6, d8, d10, d12, d20);                
                myRoll.addDiceToRoll();
                String rollResultMsg = myRoll.rollThemDiiice();
                rollCount++;     
                resultOutputArea.setText(rollResultMsg);
    }//GEN-LAST:event_reRollButtonMouseClicked

    
    private int incrementSpinnerValue(String button) {
        Integer currentVal;
        switch(button) 
        {
            case "d4": currentVal = (Integer) d4Quantity.getValue(); break;
            case "d6": currentVal = (Integer) d6Quantity.getValue(); break;
            case "d8": currentVal = (Integer) d8Quantity.getValue(); break;
            case "d10": currentVal = (Integer) d10Quantity.getValue(); break;
            case "d12": currentVal = (Integer) d12Quantity.getValue(); break;
            case "d20": currentVal = (Integer) d20Quantity.getValue(); break;
            default: System.out.println("Failed to find object");
                     currentVal = 0;
        }   
        tempInt = currentVal + 1;
            if(tempInt > 10) {
                tempInt = 10;  //SpinnerModel will not increment past 10, but button can force value above 
            }
        return tempInt;
    }       
    
    /*@param args the command line arguments*/
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
            java.util.logging.Logger.getLogger(RollUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RollUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RollUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RollUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RollUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton d10Button;
    private javax.swing.JSpinner d10Quantity;
    private javax.swing.JButton d12Button;
    private javax.swing.JSpinner d12Quantity;
    private javax.swing.JButton d20Button;
    private javax.swing.JSpinner d20Quantity;
    private javax.swing.JButton d4Button;
    private javax.swing.JSpinner d4Quantity;
    private javax.swing.JButton d6Button;
    private javax.swing.JSpinner d6Quantity;
    private javax.swing.JButton d8Button;
    private javax.swing.JSpinner d8Quantity;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel primaryContainer;
    private javax.swing.JButton reRollButton;
    private javax.swing.JTextArea resultOutputArea;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JButton rollButton;
    // End of variables declaration//GEN-END:variables
}
