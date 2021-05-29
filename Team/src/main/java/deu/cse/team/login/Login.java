/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.login;

import deu.cse.team.source.Login_Source;
import deu.cse.team.source.LogindataInfo;
import deu.cse.team.mainmenu.*;
import deu.cse.team.source.Check_BlackList;
import deu.cse.team.source.SignUp;
import deu.cse.team.source.SignUpdataInfo;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BON
 */
public class Login extends javax.swing.JFrame {
    ArrayList<LogindataInfo> logininfo = new ArrayList<>();
    ArrayList<SignUpdataInfo> signupinfo = new ArrayList<>();
    ArrayList<SignUpdataInfo> blacklistinfo = new ArrayList<>();
    Boolean a, black;
    
    /**
     * Creates new form NewJFrame
     */
    public Login() {
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

        SignUp = new javax.swing.JDialog();
        SingUp_Check_Button = new javax.swing.JButton();
        residenceComboBox = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        residenceLabel = new javax.swing.JLabel();
        birthLabel = new javax.swing.JLabel();
        birthTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        pwcheckPasswordField = new javax.swing.JPasswordField();
        pwcheckLabel = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        pwPasswordField = new javax.swing.JPasswordField();
        idTextField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PW_Field = new javax.swing.JPasswordField();
        ID_Field = new javax.swing.JTextField();
        SignUp_Button = new javax.swing.JButton();
        Login_Button = new javax.swing.JButton();

        SignUp.setMinimumSize(new java.awt.Dimension(384, 520));
        SignUp.setName("SignUp"); // NOI18N
        SignUp.setPreferredSize(new java.awt.Dimension(384, 520));

        SingUp_Check_Button.setText("확인");
        SingUp_Check_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingUp_Check_ButtonActionPerformed(evt);
            }
        });

        residenceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "세종특별자치시", "경기도", "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주특별자치도" }));
        residenceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residenceComboBoxActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        cancelButton.setText("취소");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        residenceLabel.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        residenceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        residenceLabel.setText("거주지역");

        birthLabel.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        birthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        birthLabel.setText("생년월일");

        birthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthTextFieldActionPerformed(evt);
            }
        });

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        phoneLabel.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneLabel.setText("전화번호");

        emailLabel.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("이메일");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        pwcheckPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwcheckPasswordFieldActionPerformed(evt);
            }
        });

        pwcheckLabel.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        pwcheckLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pwcheckLabel.setText("비밀번호 확인");

        pwLabel.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        pwLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pwLabel.setText("비밀번호");

        pwPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwPasswordFieldActionPerformed(evt);
            }
        });

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("아이디");

        nameLabel.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("이름");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        titleLabel.setText("회원가입");

        javax.swing.GroupLayout SignUpLayout = new javax.swing.GroupLayout(SignUp.getContentPane());
        SignUp.getContentPane().setLayout(SignUpLayout);
        SignUpLayout.setHorizontalGroup(
            SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpLayout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(147, 147, 147))
            .addGroup(SignUpLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SignUpLayout.createSequentialGroup()
                        .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwcheckLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(residenceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(birthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(residenceComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTextField)
                            .addComponent(emailTextField)
                            .addComponent(phoneTextField)
                            .addComponent(birthTextField)
                            .addComponent(pwPasswordField)
                            .addComponent(pwcheckPasswordField)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SignUpLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SingUp_Check_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SignUpLayout.setVerticalGroup(
            SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwLabel)
                    .addComponent(pwPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwcheckLabel)
                    .addComponent(pwcheckPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthLabel)
                    .addComponent(birthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residenceLabel)
                    .addComponent(residenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(SingUp_Check_Button))
                .addGap(64, 64, 64))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("나눔고딕코딩", 0, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("나눔고딕코딩", 0, 12)); // NOI18N
        jLabel2.setText("PW");

        ID_Field.setToolTipText("");
        ID_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_FieldActionPerformed(evt);
            }
        });

        SignUp_Button.setFont(new java.awt.Font("나눔고딕코딩", 0, 12)); // NOI18N
        SignUp_Button.setText("회원가입");
        SignUp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_ButtonActionPerformed(evt);
            }
        });

        Login_Button.setFont(new java.awt.Font("나눔고딕코딩", 0, 12)); // NOI18N
        Login_Button.setText("로그인");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ID_Field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(PW_Field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SignUp_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PW_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUp_Button)
                    .addComponent(Login_Button))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_FieldActionPerformed

    private void SignUp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_ButtonActionPerformed
        SignUp.setVisible(true);
    }//GEN-LAST:event_SignUp_ButtonActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        Login_Source lg = new Login_Source();
        lg.FRead();
        lg.Split();
        
        Check_BlackList cb = new Check_BlackList();
        cb.FRead();
        cb.Split();
        
        try{
            logininfo = lg.returnLogininfo();
            blacklistinfo = cb.returnBlackListInfo();
        } catch (IOException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        String time = format1.format(new Date());
        
        String id;
        String pw;

        id = ID_Field.getText();
        pw = PW_Field.getText();

        a = false;
        black = true;
        
        for (int i = 0; i < logininfo.size(); i++) {
            if (logininfo.get(i).getId().equals(id) && logininfo.get(i).getPw().equals(pw)) {
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "관리자 로그인 성공");
                    try {
                        lg.FWrite(id);
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AdminMenu next = new AdminMenu();
                    next.setVisible(true);
                    dispose();
                    a = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "로그인 성공");
                    try {
                        lg.FWrite(id);
                        lg.LWrite(id+"\t"+pw+"\t"+time);
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    MainMenu next = new MainMenu();
                    next.setVisible(true);
                    dispose();
                    a = true;
                    break;
                }
            }
        }
        if (a == false) {
            for(int i = 0; i < blacklistinfo.size(); i++){
                if (blacklistinfo.get(i).getId().equals(id) && blacklistinfo.get(i).getPw().equals(pw)){
                    black = false;
                    break;
                }
            }            
            if(black == true){
                JOptionPane.showMessageDialog(null, "로그인 실패");
            } else {
                JOptionPane.showMessageDialog(null, "차단된 회원입니다.");
            }
        }
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void SingUp_Check_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingUp_Check_ButtonActionPerformed
        SignUp create = new SignUp();
        create.FRead();
        create.Split();
        
        Check_BlackList cb = new Check_BlackList();
        cb.FRead();
        cb.Split();
        
        try {
            blacklistinfo = cb.returnBlackListInfo();
            signupinfo = create.returnSignUpInfo();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String sid = idTextField.getText();
        String spw = pwPasswordField.getText();
        String sname = nameTextField.getText();
        String semail = emailTextField.getText();
        String sphone = phoneTextField.getText();
        String sbirth = birthTextField.getText();
        String sresidence = residenceComboBox.getSelectedItem().toString();
        
        String b = sid+"\t"+spw+"\t"+ sname+"\t"+ semail+"\t"+ sphone+"\t"+ sbirth+"\t"+ sresidence;
        black = false;
        
        int count = 1;
        for (int j = 0; j < signupinfo.size(); j++) {
            if (signupinfo.get(j).getId().equals(sid)) {
                JOptionPane.showMessageDialog(null, "중복아이디입니다.");
                idTextField.setText("");
                count = 0;
                break;
            }
        }
        try {
            if (!"".equals(sid) && !"".equals(spw) && !"".equals(sname) && !"".equals(sphone)) {
                for (int i = 0 ; i < blacklistinfo.size() ; i++) {
                    if (blacklistinfo.get(i).getName().equals(sname) && blacklistinfo.get(i).getPhonenum().equals(sphone)){
                        black = true;
                        break;
                    }
                }
                if (black){
                    JOptionPane.showMessageDialog(null, "차단된 회원입니다.\n 회원가입이 제한됩니다.");
                    idTextField.setText("");
                    pwPasswordField.setText("");
                    nameTextField.setText("");
                    phoneTextField.setText("");
                    pwcheckPasswordField.setText("");
                    emailTextField.setText("");
                    birthTextField.setText("");                        
                    SignUp.dispose();
                } else{
                    if (!spw.equals(pwcheckPasswordField.getText())){
                        JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다\n 다시입력해주세요.");
                        pwPasswordField.setText("");
                        pwcheckPasswordField.setText("");
                    } else if( "admin".equals(sid)){
                        JOptionPane.showMessageDialog(null, "사용불가능한 아이디입니다.");
                        idTextField.setText("");
                    } else{
                        if (count == 1) {
                            create.FWrite(b);
                            JOptionPane.showMessageDialog(null, "회원 가입 완료");
                            idTextField.setText("");
                            pwPasswordField.setText("");
                            nameTextField.setText("");
                            phoneTextField.setText("");
                            pwcheckPasswordField.setText("");
                            emailTextField.setText("");
                            birthTextField.setText("");                        
                            SignUp.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "아이디를 다시 입력해주세요.");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "모든 항목을 입력해주세요");
            }
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SingUp_Check_ButtonActionPerformed

    private void residenceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residenceComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_residenceComboBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        SignUp.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void birthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void pwcheckPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwcheckPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwcheckPasswordFieldActionPerformed

    private void pwPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwPasswordFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

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
    private javax.swing.JTextField ID_Field;
    private javax.swing.JButton Login_Button;
    private javax.swing.JPasswordField PW_Field;
    private javax.swing.JDialog SignUp;
    private javax.swing.JButton SignUp_Button;
    private javax.swing.JButton SingUp_Check_Button;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JTextField birthTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JPasswordField pwPasswordField;
    private javax.swing.JLabel pwcheckLabel;
    private javax.swing.JPasswordField pwcheckPasswordField;
    private javax.swing.JComboBox<String> residenceComboBox;
    private javax.swing.JLabel residenceLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
