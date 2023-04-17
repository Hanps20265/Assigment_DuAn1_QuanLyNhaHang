package ui;

import controllers.QLNhanVien;
import utils.XInit;
import java.awt.event.KeyEvent;

import org.apache.poi.hssf.record.chart.AxisUsedRecord;

import model.NhanVien;
import utils.Auth;
import utils.MsgBox;
import utils.XColor;

public class Login extends javax.swing.JFrame {

     public String alert;
    public Login() {
        initComponents();
        XInit.init(this);
        pnlForm.setBackground(XColor.color);
        pnlNoiDung.setBackground(XColor.color);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForm = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        pnlNoiDung = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnThoat = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnQuenMatKhau = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ HÀNG - ĐĂNG NHẬP");

        pnlForm.setBackground(new java.awt.Color(255, 204, 102));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restaurant-login-256.png"))); // NOI18N

        pnlNoiDung.setBackground(new java.awt.Color(255, 204, 102));

        lblMaNV.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(51, 51, 255));
        lblMaNV.setText("Username");

        txtMaNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMaNV.setText("NV003");
        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaNVKeyPressed(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPass.setForeground(new java.awt.Color(51, 51, 255));
        lblPass.setText("Password");

        txtPass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPass.setText("ChiDai");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 153, 51));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel-32.png"))); // NOI18N
        btnThoat.setText("Cancel");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        btnThoat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnThoatKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 153, 51));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login-32.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnQuenMatKhau.setText("Quên Mật Khẩu");
        btnQuenMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnQuenMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMatKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNoiDungLayout = new javax.swing.GroupLayout(pnlNoiDung);
        pnlNoiDung.setLayout(pnlNoiDungLayout);
        pnlNoiDungLayout.setHorizontalGroup(
            pnlNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNoiDungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNoiDungLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPass)
                    .addGroup(pnlNoiDungLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThoat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNoiDungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuenMatKhau)
                .addGap(61, 61, 61))
        );
        pnlNoiDungLayout.setVerticalGroup(
            pnlNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNoiDungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(btnQuenMatKhau)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnlNoiDungLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMaNV, txtPass});

        pnlNoiDungLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogin, btnThoat});

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ĐĂNG NHẬP");

        btnColor.setText("Đổi màu");
        btnColor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnColor)
                        .addContainerGap())))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(pnlNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    	String user = txtMaNV.getText();
    	String pass = String.valueOf(txtPass.getPassword());
        this.login(user, pass);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.cancel();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        	String user = txtMaNV.getText();
        	String pass = String.valueOf(txtPass.getPassword());
        	this.login(user, pass);
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        	String user = txtMaNV.getText();
        	String pass = String.valueOf(txtPass.getPassword());
        	this.login(user, pass);
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtMaNVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNVKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        	String user = txtMaNV.getText();
        	String pass = String.valueOf(txtPass.getPassword());
        	this.login(user, pass);
        }
    }//GEN-LAST:event_txtMaNVKeyPressed

    private void btnThoatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThoatKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.cancel();
        }
    }//GEN-LAST:event_btnThoatKeyPressed

    private void btnQuenMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMatKhauActionPerformed
        // TODO add your handling code here:
        new QuenMatKhau().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuenMatKhauActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        // TODO add your handling code here:
        XColor.color = XColor.chonMau(pnlForm);
        pnlForm.setBackground(XColor.color);
        pnlNoiDung.setBackground(XColor.color);
        
    }//GEN-LAST:event_btnColorActionPerformed

  
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuenMatKhau;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlNoiDung;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
  
    
   public void login(String user, String pass ) {
	   
        NhanVien nv = QLNhanVien.dao.selectById(user);
        if (nv == null) {
        	alert = "Tên đăng nhập không chính xác!";
        } else if (!pass.equals(nv.getMatKhau())) {
        	alert = "Mật khẩu chưa chính xác";
        } else {
            Auth.user = nv;
            alert = "Đăng nhập thành công!";
            String maCV = Auth.user.getMaCV();
            if (Auth.isLogin()) {
                if (null != maCV) {
                    new DanhMuc().setVisible(true);
                }
            }
            this.dispose();
        }
        MsgBox.alert(this, alert);
    }

   void cancel() {
	   String message = "Bạn đã thoát!";
        if (MsgBox.confirm(this, "Bạn có muốn thoát khỏi ứng dụng không?" )) {
        	MsgBox.alert(this, message);
            System.exit(0);
        }
    }

}
