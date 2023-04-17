package ui;

import java.io.File;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utils.Auth;
import utils.CheckInput;
import utils.MsgBox;
import utils.XColor;
import utils.XInit;

public class MailNhaCC extends javax.swing.JFrame {

    public MailNhaCC() {
        initComponents();
        XInit.init(this);
        this.setColor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMailNhaCC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlSend = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        pnlReceive = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBCC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        txtCC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSub = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMailNhaCC.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAIL ĐẶT NGUYÊN LIỆU");

        pnlSend.setBackground(new java.awt.Color(255, 204, 102));
        pnlSend.setBorder(javax.swing.BorderFactory.createTitledBorder("SEND"));

        jLabel4.setText("Username: ");
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 30));
        jLabel4.setSize(new java.awt.Dimension(80, 30));

        jLabel5.setText("Password:");
        jLabel5.setPreferredSize(new java.awt.Dimension(80, 30));
        jLabel5.setSize(new java.awt.Dimension(80, 30));

        txtUser.setText("kietvtps20582@fpt.edu.vn");
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUser.setPreferredSize(new java.awt.Dimension(300, 30));
        txtUser.setSize(new java.awt.Dimension(300, 30));

        txtPass.setText("Kietvo2003");
        txtPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPass.setPreferredSize(new java.awt.Dimension(300, 30));
        txtPass.setSize(new java.awt.Dimension(300, 30));

        javax.swing.GroupLayout pnlSendLayout = new javax.swing.GroupLayout(pnlSend);
        pnlSend.setLayout(pnlSendLayout);
        pnlSendLayout.setHorizontalGroup(
            pnlSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSendLayout.createSequentialGroup()
                .addGroup(pnlSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSendLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSendLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlSendLayout.setVerticalGroup(
            pnlSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSendLayout.createSequentialGroup()
                .addGroup(pnlSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlReceive.setBackground(new java.awt.Color(255, 204, 102));
        pnlReceive.setBorder(javax.swing.BorderFactory.createTitledBorder("Receive"));

        jLabel6.setText("To:");
        jLabel6.setPreferredSize(new java.awt.Dimension(80, 30));
        jLabel6.setSize(new java.awt.Dimension(80, 30));

        txtTo.setText("hanlnnps20265@fpt.edu.vn");
        txtTo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTo.setPreferredSize(new java.awt.Dimension(300, 30));
        txtTo.setSize(new java.awt.Dimension(300, 30));

        jLabel7.setText("BCC:");
        jLabel7.setPreferredSize(new java.awt.Dimension(80, 30));
        jLabel7.setSize(new java.awt.Dimension(80, 30));

        txtBCC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBCC.setPreferredSize(new java.awt.Dimension(300, 30));
        txtBCC.setSize(new java.awt.Dimension(300, 30));

        jLabel8.setText("Message:");
        jLabel8.setPreferredSize(new java.awt.Dimension(80, 30));
        jLabel8.setSize(new java.awt.Dimension(80, 30));

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        txtMessage.setText("TEST");
        txtMessage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMessage.setPreferredSize(new java.awt.Dimension(300, 100));
        txtMessage.setSize(new java.awt.Dimension(300, 100));
        jScrollPane1.setViewportView(txtMessage);

        btnSend.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 102, 0));
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/send-file-32.png"))); // NOI18N
        btnSend.setText("Gửi Mail");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtCC.setText("lnnhan130191@gmail.com");
        txtCC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCC.setPreferredSize(new java.awt.Dimension(300, 30));
        txtCC.setSize(new java.awt.Dimension(300, 30));

        jLabel9.setText("CC:");
        jLabel9.setPreferredSize(new java.awt.Dimension(80, 30));
        jLabel9.setSize(new java.awt.Dimension(80, 30));

        txtSub.setText("Yêu Cầu Cung Ứng Hàng Hóa");
        txtSub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSub.setPreferredSize(new java.awt.Dimension(300, 30));
        txtSub.setSize(new java.awt.Dimension(300, 30));

        jLabel10.setText("Subject:");
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 30));
        jLabel10.setSize(new java.awt.Dimension(80, 30));

        btnAttach.setText("File attachment");
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(51, 153, 255));
        btnCancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 102, 0));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel-32.png"))); // NOI18N
        btnCancel.setText("Hủy bỏ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlReceiveLayout = new javax.swing.GroupLayout(pnlReceive);
        pnlReceive.setLayout(pnlReceiveLayout);
        pnlReceiveLayout.setHorizontalGroup(
            pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceiveLayout.createSequentialGroup()
                .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReceiveLayout.createSequentialGroup()
                        .addComponent(btnSend)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlReceiveLayout.createSequentialGroup()
                        .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlReceiveLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlReceiveLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReceiveLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlReceiveLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancel, btnSend});

        pnlReceiveLayout.setVerticalGroup(
            pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReceiveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMailNhaCCLayout = new javax.swing.GroupLayout(pnlMailNhaCC);
        pnlMailNhaCC.setLayout(pnlMailNhaCCLayout);
        pnlMailNhaCCLayout.setHorizontalGroup(
            pnlMailNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMailNhaCCLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlMailNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlReceive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlMailNhaCCLayout.setVerticalGroup(
            pnlMailNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMailNhaCCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlReceive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMailNhaCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMailNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        String path = "";
        boolean edit = true;
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (CheckInput.checkTextFieldEmpty(txtUser, "Chưa nhập Mail người nhập")
                        || CheckInput.checkTextFieldEmpty(txtPass, "Chưa nhập mật khẩu!")
                        || CheckInput.checkTextFieldEmpty(txtTo, "Chưa nhập người nhận!")
                        || CheckInput.checkTextFieldEmpty(txtSub, "Chưa nhập tiêu đề!")) {
                    return;
                }
                String message = txtMessage.getText();
                if (message.length() == 0) {
                    if (!MsgBox.confirm(null, "Mail chưa có nội dung, bạn có muốn tiếp tục gửi?")) {
                        return;
                    }
                }
                edit = false;
                
                final String from = txtUser.getText();
                final String pass = String.valueOf(txtPass.getPassword());
                String to = txtTo.getText();
                String ccEmails = txtCC.getText();
                String bccEmails = txtBCC.getText();
                String sub = txtSub.getText();

                try {
                    Properties p = new Properties();
                    p.put("mail.smtp.auth", "true");
                    p.put("mail.smtp.starttls.enable", "true");
                    p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
                    p.put("mail.smtp.ssl.protocols", "TLSv1.2");
                    p.put("mail.smtp.host", "smtp.gmail.com");
                    p.put("mail.smtp.port", 587);

                    Session s = Session.getInstance(p,
                            new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(from, pass);
                        }
                    });

                    Message msg = new MimeMessage(s);

                    msg.setFrom(new InternetAddress(from));
                    msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                    msg.addRecipients(Message.RecipientType.CC, InternetAddress.parse(ccEmails));
                    msg.addRecipients(Message.RecipientType.BCC, InternetAddress.parse(bccEmails));
                    msg.setSubject(sub);
                    msg.setText(message);

                    if (!path.equals("")) {
                        MimeBodyPart content = new MimeBodyPart();
                        content.setContent(message, "text/html; charset=utf-8");

                        MimeBodyPart filePart = new MimeBodyPart();
                        File file = new File(path);
                        FileDataSource fds = new FileDataSource(file);
                        filePart.setDataHandler(new DataHandler(fds));
                        filePart.setFileName(file.getName());

                        MimeMultipart multiPart = new MimeMultipart();
                        ((Multipart) multiPart).addBodyPart(content);
                        ((Multipart) multiPart).addBodyPart(filePart);

                        msg.setContent((Multipart) multiPart);
                    }

                    Transport.send(msg);
                    JOptionPane.showMessageDialog(null, "Mail was sent successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                    btnSend.setEnabled(true);
                } catch (Exception ex) {
                    MsgBox.alert(null, "Chưa thiết lập quyền truy cập!!!"
                            + "\nVui lòng thiết lập tại https://www.google.com/settings/security/lesssecureapps");
                    Logger.getLogger(MailNhaCC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
        btnSend.setEnabled(edit);
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            path = chooser.getSelectedFile().getAbsolutePath();
        }
        String[] temp = path.split("/");
        btnAttach.setText(temp[temp.length - 1]);
    }//GEN-LAST:event_btnAttachActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new DanhMuc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new MailNhaCC().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMailNhaCC;
    private javax.swing.JPanel pnlReceive;
    private javax.swing.JPanel pnlSend;
    private javax.swing.JTextField txtBCC;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSub;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void setColor() {
        pnlMailNhaCC.setBackground(XColor.color);
        pnlSend.setBackground(XColor.extraColor);
        pnlReceive.setBackground(XColor.extraColor);
    }
}
