/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdnay
 */
public class Calculator extends javax.swing.JFrame {

    int num, result, calculation;

    public Calculator() {
        initComponents();
        Display.setEnabled(false);
    }

    public void MyCalculator() {
        switch (calculation) {
            case 1:
                result = num + Integer.parseInt(Display.getText());
                Display.setText(Integer.toString(result));
                break;
            case 2:
                result = num - Integer.parseInt(Display.getText());
                Display.setText(Integer.toString(result));
                break;
            case 3:
                result = num / Integer.parseInt(Display.getText());
                Display.setText(Integer.toString(result));
                break;
            case 4:
                result = num * Integer.parseInt(Display.getText());
                Display.setText(Integer.toString(result));
                break;
            case 5:
                result = num % Integer.parseInt(Display.getText());
                Display.setText(Integer.toString(result));
                break;
            default:
                Display.setText("Error");
        }
    }

    public void disable() {
        Display.setEnabled(false);
        B0.setEnabled(false);
        B1.setEnabled(false);
        B2.setEnabled(false);
        B3.setEnabled(false);
        B4.setEnabled(false);
        B5.setEnabled(false);
        B6.setEnabled(false);
        B7.setEnabled(false);
        B8.setEnabled(false);
        B9.setEnabled(false);
        SUM.setEnabled(false);
        SUB.setEnabled(false);
        DIV.setEnabled(false);
        MULTI.setEnabled(false);
        EQUAL.setEnabled(false);
        Pars.setEnabled(false);
        C.setEnabled(false);
        BACK.setEnabled(false);
        ON.setEnabled(true);
        OFF.setEnabled(false);
    }

    public void enable() {
        Display.setEnabled(true);
        B0.setEnabled(true);
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        B6.setEnabled(true);
        B7.setEnabled(true);
        B8.setEnabled(true);
        B9.setEnabled(true);
        SUM.setEnabled(true);
        SUB.setEnabled(true);
        DIV.setEnabled(true);
        MULTI.setEnabled(true);
        EQUAL.setEnabled(true);
        Pars.setEnabled(true);
        C.setEnabled(true);
        BACK.setEnabled(true);
        ON.setEnabled(false);
        OFF.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextField();
        OFF = new javax.swing.JRadioButton();
        ON = new javax.swing.JRadioButton();
        BACK = new javax.swing.JButton();
        C = new javax.swing.JButton();
        SUM = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        SUB = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        DIV = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        MULTI = new javax.swing.JButton();
        EQUAL = new javax.swing.JButton();
        Pars = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        LABEL = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        Display.setEditable(false);
        Display.setBackground(new java.awt.Color(204, 255, 255));
        Display.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        buttonGroup1.add(OFF);
        OFF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OFF.setForeground(new java.awt.Color(255, 0, 0));
        OFF.setText("OFF");
        OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFActionPerformed(evt);
            }
        });

        buttonGroup1.add(ON);
        ON.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ON.setForeground(new java.awt.Color(0, 204, 0));
        ON.setText("ON");
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(0, 255, 51));
        BACK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BACK.setText("<--");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(255, 0, 0));
        C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        SUM.setBackground(new java.awt.Color(102, 102, 255));
        SUM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUM.setText("+");
        SUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUMActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(0, 204, 0));
        B9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(0, 204, 0));
        B7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(0, 204, 0));
        B8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        SUB.setBackground(new java.awt.Color(102, 102, 255));
        SUB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SUB.setText("-");
        SUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 204, 0));
        B5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(0, 204, 0));
        B4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 204, 0));
        B6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        DIV.setBackground(new java.awt.Color(102, 102, 255));
        DIV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DIV.setText("/");
        DIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(0, 204, 0));
        B1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(0, 204, 0));
        B2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(0, 204, 0));
        B3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        MULTI.setBackground(new java.awt.Color(102, 102, 255));
        MULTI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MULTI.setText("*");
        MULTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIActionPerformed(evt);
            }
        });

        EQUAL.setBackground(new java.awt.Color(0, 51, 255));
        EQUAL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EQUAL.setText("=");
        EQUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUALActionPerformed(evt);
            }
        });

        Pars.setBackground(new java.awt.Color(0, 204, 0));
        Pars.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Pars.setText("%");
        Pars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParsActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(0, 204, 0));
        B0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        LABEL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        LABEL.setForeground(new java.awt.Color(0, 204, 0));
        LABEL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Display)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pars, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EQUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(OFF)
                                .addComponent(ON, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SUM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SUB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DIV, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MULTI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OFF))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SUM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SUB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DIV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MULTI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pars, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EQUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFActionPerformed
        disable();
    }//GEN-LAST:event_OFFActionPerformed

    private void ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONActionPerformed
        enable();
    }//GEN-LAST:event_ONActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        int length = Display.getText().length();
        int number = Display.getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(Display.getText());
            back.deleteCharAt(number);
            store = back.toString();
            Display.setText(store);

        }
    }//GEN-LAST:event_BACKActionPerformed

    private void SUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUMActionPerformed
        num = Integer.parseInt(Display.getText());
        calculation = 1;
        Display.setText("");
        LABEL.setText(num + "+");
    }//GEN-LAST:event_SUMActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        Display.setText(Display.getText() + "9");
    }//GEN-LAST:event_B9ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        Display.setText(Display.getText() + "7");
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        Display.setText(Display.getText() + "8");
    }//GEN-LAST:event_B8ActionPerformed

    private void SUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBActionPerformed
        num = Integer.parseInt(Display.getText());
        calculation = 2;
        Display.setText("");
        LABEL.setText(num + "-");
    }//GEN-LAST:event_SUBActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        Display.setText(Display.getText() + "5");
    }//GEN-LAST:event_B5ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        Display.setText(Display.getText() + "4");
    }//GEN-LAST:event_B4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        Display.setText(Display.getText() + "6");
    }//GEN-LAST:event_B6ActionPerformed

    private void DIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVActionPerformed
        num = Integer.parseInt(Display.getText());
        calculation = 3;
        Display.setText("");
        LABEL.setText(num + "/");
    }//GEN-LAST:event_DIVActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        Display.setText(Display.getText() + "1");
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        Display.setText(Display.getText() + "2");
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        Display.setText(Display.getText() + "3");
    }//GEN-LAST:event_B3ActionPerformed

    private void MULTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIActionPerformed
        num = Integer.parseInt(Display.getText());
        calculation = 4;
        Display.setText("");
        LABEL.setText(num + "*");
    }//GEN-LAST:event_MULTIActionPerformed

    private void EQUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUALActionPerformed
        MyCalculator();
        LABEL.setText("");
    }//GEN-LAST:event_EQUALActionPerformed

    private void ParsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParsActionPerformed
        num = Integer.parseInt(Display.getText());
        calculation = 5;
        Display.setText("");
        LABEL.setText(num + "*");
    }//GEN-LAST:event_ParsActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        Display.setText(Display.getText() + "0");
    }//GEN-LAST:event_B0ActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        Display.setText("");
    }//GEN-LAST:event_CActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BACK;
    private javax.swing.JButton C;
    private javax.swing.JButton DIV;
    private javax.swing.JTextField Display;
    private javax.swing.JButton EQUAL;
    private javax.swing.JLabel LABEL;
    private javax.swing.JButton MULTI;
    private javax.swing.JRadioButton OFF;
    private javax.swing.JRadioButton ON;
    private javax.swing.JButton Pars;
    private javax.swing.JButton SUB;
    private javax.swing.JButton SUM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
