/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.product_registration;

import deu.cse.team.mainmenu.MainMenu;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author qjqmf
 */
public class RegistrationProduct_Frame extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationProduct_Frame
     */
    public RegistrationProduct_Frame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Product Registration Page");
        cmbList();
    }
    
    // 콤보박스에 카테고리를 불러옴
    public void cmbList() {
        DefaultComboBoxModel model = new DefaultComboBoxModel<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\DB\\category.txt"));
            int val = Integer.parseInt(br.readLine());
            for (int i=0; i<val; i++) {
                String line = br.readLine();
                model.addElement(line);
                kategorie_product.setModel(model);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        statusButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_product = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kategorie_product = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        price_product = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantity_product = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        explanation_product = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        trandingarea_product = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        unopened_radio = new javax.swing.JRadioButton();
        almostnew_radio = new javax.swing.JRadioButton();
        used_radio = new javax.swing.JRadioButton();
        appointment_button = new javax.swing.JButton();
        filechooser_button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 48)); // NOI18N
        jLabel1.setText("제품 등록");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel2.setText("제품명 :");

        name_product.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        name_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_productActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel3.setText("카테고리 :");

        kategorie_product.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        kategorie_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));
        kategorie_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategorie_productActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel4.setText("판매 가격 :");

        price_product.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        price_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_productActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel5.setText("사진");

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel6.setText("제품 수량 :");

        quantity_product.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        quantity_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_productActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel7.setText("제품 설명 :");

        explanation_product.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        explanation_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explanation_productActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel8.setText("거래 희망 지역 :");

        trandingarea_product.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        trandingarea_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "세종특별자치시", "경기도", "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주특별자치도" }));
        trandingarea_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trandingarea_productActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        jLabel9.setText("제품 상태 :");

        statusButtonGroup.add(unopened_radio);
        unopened_radio.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        unopened_radio.setText("미개봉");
        unopened_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unopened_radioActionPerformed(evt);
            }
        });

        statusButtonGroup.add(almostnew_radio);
        almostnew_radio.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        almostnew_radio.setText("거의새것");
        almostnew_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almostnew_radioActionPerformed(evt);
            }
        });

        statusButtonGroup.add(used_radio);
        used_radio.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        used_radio.setText("중고");
        used_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                used_radioActionPerformed(evt);
            }
        });

        appointment_button.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        appointment_button.setText("등록완료");
        appointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointment_buttonActionPerformed(evt);
            }
        });

        filechooser_button.setText("파일 찾기");
        filechooser_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filechooser_buttonActionPerformed(evt);
            }
        });

        Back_Button.setText("이전");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unopened_radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(almostnew_radio)
                        .addGap(18, 18, 18)
                        .addComponent(used_radio)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(name_product)
                                .addComponent(quantity_product)
                                .addComponent(price_product)
                                .addComponent(kategorie_product, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(explanation_product, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(trandingarea_product, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(78, 78, 78)))
                            .addComponent(filechooser_button))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(appointment_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Button)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kategorie_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(filechooser_button))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(quantity_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(explanation_product, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(trandingarea_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(almostnew_radio)
                            .addComponent(used_radio)
                            .addComponent(unopened_radio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointment_button)
                    .addComponent(Back_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_productActionPerformed

    private void appointment_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointment_buttonActionPerformed
        // TODO add your handling code here:
        String name = name_product.getText();
        String kategorie = kategorie_product.getSelectedItem().toString();
        String price = price_product.getText();
        String quantity = quantity_product.getText();
        String explanation = explanation_product.getText();
        String trandingarea = trandingarea_product.getSelectedItem().toString();
        String status = statusButtonGroup.getSelection().getActionCommand();
        
        try {
            File f1 = new File("C:\\DB\\RegistrationProduct.txt");
            FileWriter writer = new FileWriter(f1, true);
            writer.write(name + '/');
            writer.write(kategorie + '/');
            writer.write(price + '/');
            writer.write(quantity + '/');
            writer.write(explanation + '/');
            writer.write(trandingarea + '/');
            writer.write(status + "\n");
            // 라디오 버튼 선택된거에 따라 파일에 저장해야함
            
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("오류발생");
        }
        
        // 정보 입력하지 않았을 시 등록 불가 기능 추가해야함
        JOptionPane.showMessageDialog(null, "등록이 완료 되었습니다."); // 메시지 창
        
    }//GEN-LAST:event_appointment_buttonActionPerformed

    private void price_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_productActionPerformed

    private void quantity_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_productActionPerformed

    private void explanation_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explanation_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explanation_productActionPerformed

    private void trandingarea_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trandingarea_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trandingarea_productActionPerformed

    private void unopened_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unopened_radioActionPerformed
        // TODO add your handling code here:
        unopened_radio.setActionCommand("미개봉");
    }//GEN-LAST:event_unopened_radioActionPerformed

    private void filechooser_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filechooser_buttonActionPerformed
        // TODO add your handling code here:
        JFrame fchoose = new JFrame(); // 새 창
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fchoose);

        String selectedFile = fileChooser.getSelectedFile().toString(); // 파일 경로
        
        try {
            File f2 = new File("C:\\DB\\RegistrationProduct_Image.txt");
            FileWriter writer = new FileWriter(f2, true);
            writer.write(selectedFile + '\n');
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("오류발생");
        }
    }//GEN-LAST:event_filechooser_buttonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void kategorie_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategorie_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategorie_productActionPerformed

    private void almostnew_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almostnew_radioActionPerformed
        // TODO add your handling code here:
        almostnew_radio.setActionCommand("거의새것");
    }//GEN-LAST:event_almostnew_radioActionPerformed

    private void used_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_used_radioActionPerformed
        // TODO add your handling code here:
        used_radio.setActionCommand("중고");
    }//GEN-LAST:event_used_radioActionPerformed
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
            java.util.logging.Logger.getLogger(RegistrationProduct_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationProduct_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationProduct_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationProduct_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationProduct_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JRadioButton almostnew_radio;
    private javax.swing.JButton appointment_button;
    private javax.swing.JTextField explanation_product;
    private javax.swing.JButton filechooser_button;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JComboBox<String> kategorie_product;
    private javax.swing.JTextField name_product;
    private javax.swing.JTextField price_product;
    private javax.swing.JTextField quantity_product;
    private javax.swing.ButtonGroup statusButtonGroup;
    private javax.swing.JComboBox<String> trandingarea_product;
    private javax.swing.JRadioButton unopened_radio;
    private javax.swing.JRadioButton used_radio;
    // End of variables declaration//GEN-END:variables
}
