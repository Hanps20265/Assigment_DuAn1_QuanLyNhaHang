package ui;

import controllers.QLThongKe;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JPanel;
import utils.Auth;
import utils.Entity;
import utils.MsgBox;
import utils.XColor;
import utils.XInit;

/**
 * @author hanle
 */
public class DanhMuc extends javax.swing.JFrame {
	public static String phanQuyen;
	
    public DanhMuc() {
        initComponents();
        XInit.init(this);
        // Phan Quyen
        this.phanQuyen();
        this.setColor();
    }

    void phanQuyen() {
        if (!Auth.isManager()) {
            tabs.remove(0);
            phanQuyen = "Quản lý";
            if (Auth.user.getMaCV().toString().equals("CV002")) {
                tabs.remove(1);
                phanQuyen = "Thu Ngân";
            } else if (Auth.user.getMaCV().toString().equals("CV003")) {
                tabs.remove(0);
                phanQuyen = "Đầu bếp";
            }
        } else {
            tabs.remove(1);
            tabs.remove(1);
        }
       
    }
    void setColor() {
        JComponent pnl = (JComponent) tabs.getSelectedComponent();
            pnl.setBackground(XColor.color);
            pnl.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, XColor.extraColor));
            lblWelcome.setForeground(XColor.extraColor);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        pnlDanhMuc_QuanLy = new javax.swing.JPanel();
        lblChao = new javax.swing.JLabel();
        btnDatMon_QuanLy = new javax.swing.JButton();
        btnThemMoi_QuanLy = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnDoiMatKhau_QuanLy = new javax.swing.JButton();
        btnCaNhan_QuanLy = new javax.swing.JButton();
        btnHuongDan_QuanLy = new javax.swing.JButton();
        lblSoDoBan = new javax.swing.JLabel();
        lblDatMon = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblCaTruc = new javax.swing.JLabel();
        lblCaNhan = new javax.swing.JLabel();
        lblHuongDan = new javax.swing.JLabel();
        pnlDanhMuc_ThuNgan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDatBan_ThuNgan = new javax.swing.JButton();
        btnKhuyenMai_ThuNgan = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnDoiMatKhau_ThuNgan = new javax.swing.JButton();
        btnCaNhan_ThuNgan = new javax.swing.JButton();
        btnHuongDan_ThuNgan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlDanhMuc_DauBep = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnKhoNguyenLieu = new javax.swing.JButton();
        btnThucDon = new javax.swing.JButton();
        btnPhieuNhap = new javax.swing.JButton();
        btnCaNhan_DauBep = new javax.swing.JButton();
        btnHuongDan_DauBep = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnDoiMatKhau_DauBep = new javax.swing.JButton();
        lblCaTruc1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnMauChinh = new javax.swing.JMenuItem();
        mnMauPhu = new javax.swing.JMenuItem();
        btnResetColor = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ HÀNG - DANH MỤC");

        tabs.setForeground(new java.awt.Color(255, 51, 0));
        tabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        pnlDanhMuc_QuanLy.setBackground(new java.awt.Color(255, 255, 204));
        pnlDanhMuc_QuanLy.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 102)));

        lblChao.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lblChao.setForeground(new java.awt.Color(255, 51, 0));
        lblChao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChao.setText("CHÀO MỪNG BẠN ĐẾN VỚI NHÀ HÀNG ĐẸP VÀ ĐỘC");

        btnDatMon_QuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restaurant-3-128.png"))); // NOI18N
        btnDatMon_QuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatMon_QuanLyActionPerformed(evt);
            }
        });

        btnThemMoi_QuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-128.png"))); // NOI18N
        btnThemMoi_QuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoi_QuanLyActionPerformed(evt);
            }
        });

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folder-2-128.png"))); // NOI18N
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnDoiMatKhau_QuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/change-user-128.png"))); // NOI18N
        btnDoiMatKhau_QuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhau_QuanLyActionPerformed(evt);
            }
        });

        btnCaNhan_QuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-3-128.png"))); // NOI18N
        btnCaNhan_QuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaNhan_QuanLyActionPerformed(evt);
            }
        });

        btnHuongDan_QuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help-128.png"))); // NOI18N
        btnHuongDan_QuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDan_QuanLyActionPerformed(evt);
            }
        });

        lblSoDoBan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSoDoBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoDoBan.setText("Đặt Món ");

        lblDatMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDatMon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatMon.setText("Thêm Mới");

        lblThongKe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setText("Thống Kê");

        lblCaTruc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCaTruc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaTruc.setText("Đổi Mật Khẩu");

        lblCaNhan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaNhan.setText("Cá Nhân");

        lblHuongDan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHuongDan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHuongDan.setText("Hướng Dẫn");

        javax.swing.GroupLayout pnlDanhMuc_QuanLyLayout = new javax.swing.GroupLayout(pnlDanhMuc_QuanLy);
        pnlDanhMuc_QuanLy.setLayout(pnlDanhMuc_QuanLyLayout);
        pnlDanhMuc_QuanLyLayout.setHorizontalGroup(
            pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMuc_QuanLyLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlDanhMuc_QuanLyLayout.createSequentialGroup()
                            .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDoiMatKhau_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCaNhan_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnHuongDan_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lblChao, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMuc_QuanLyLayout.createSequentialGroup()
                        .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDatMon_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoDoBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThemMoi_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDatMon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );

        pnlDanhMuc_QuanLyLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCaNhan_QuanLy, btnDatMon_QuanLy, btnDoiMatKhau_QuanLy, btnHuongDan_QuanLy, btnThemMoi_QuanLy, btnThongKe});

        pnlDanhMuc_QuanLyLayout.setVerticalGroup(
            pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMuc_QuanLyLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lblChao)
                .addGap(18, 18, 18)
                .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemMoi_QuanLy)
                    .addComponent(btnThongKe)
                    .addComponent(btnDatMon_QuanLy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoDoBan)
                    .addComponent(lblDatMon)
                    .addComponent(lblThongKe))
                .addGap(18, 18, 18)
                .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCaNhan_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoiMatKhau_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuongDan_QuanLy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDanhMuc_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaTruc)
                    .addComponent(lblCaNhan)
                    .addComponent(lblHuongDan))
                .addGap(22, 22, 22))
        );

        pnlDanhMuc_QuanLyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCaNhan_QuanLy, btnDatMon_QuanLy, btnDoiMatKhau_QuanLy, btnHuongDan_QuanLy, btnThemMoi_QuanLy, btnThongKe});

        tabs.addTab("Quản Lý", pnlDanhMuc_QuanLy);

        pnlDanhMuc_ThuNgan.setBackground(new java.awt.Color(255, 255, 204));
        pnlDanhMuc_ThuNgan.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 102)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHÀO MỪNG BẠN ĐẾN VỚI NHÀ HÀNG ĐẸP VÀ ĐỘC");

        btnDatBan_ThuNgan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table-128.png"))); // NOI18N
        btnDatBan_ThuNgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatBan_ThuNganActionPerformed(evt);
            }
        });

        btnKhuyenMai_ThuNgan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sale-128.png"))); // NOI18N
        btnKhuyenMai_ThuNgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenMai_ThuNganActionPerformed(evt);
            }
        });

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bill-128.png"))); // NOI18N
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnDoiMatKhau_ThuNgan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/change-user-128.png"))); // NOI18N
        btnDoiMatKhau_ThuNgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhau_ThuNganActionPerformed(evt);
            }
        });

        btnCaNhan_ThuNgan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-3-128.png"))); // NOI18N
        btnCaNhan_ThuNgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaNhan_ThuNganActionPerformed(evt);
            }
        });

        btnHuongDan_ThuNgan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help-128.png"))); // NOI18N
        btnHuongDan_ThuNgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDan_ThuNganActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sơ Đồ Bàn");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Khuyến Mãi");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hóa Đơn");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Đổi Mật Khẩu");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cá Nhân");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hướng Dẫn");

        javax.swing.GroupLayout pnlDanhMuc_ThuNganLayout = new javax.swing.GroupLayout(pnlDanhMuc_ThuNgan);
        pnlDanhMuc_ThuNgan.setLayout(pnlDanhMuc_ThuNganLayout);
        pnlDanhMuc_ThuNganLayout.setHorizontalGroup(
            pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMuc_ThuNganLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDanhMuc_ThuNganLayout.createSequentialGroup()
                        .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDoiMatKhau_ThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCaNhan_ThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHuongDan_ThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlDanhMuc_ThuNganLayout.createSequentialGroup()
                        .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDatBan_ThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKhuyenMai_ThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDanhMuc_ThuNganLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCaNhan_ThuNgan, btnDatBan_ThuNgan, btnDoiMatKhau_ThuNgan, btnHoaDon, btnHuongDan_ThuNgan, btnKhuyenMai_ThuNgan});

        pnlDanhMuc_ThuNganLayout.setVerticalGroup(
            pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMuc_ThuNganLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKhuyenMai_ThuNgan)
                    .addComponent(btnHoaDon)
                    .addComponent(btnDatBan_ThuNgan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCaNhan_ThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoiMatKhau_ThuNgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuongDan_ThuNgan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDanhMuc_ThuNganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlDanhMuc_ThuNganLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCaNhan_ThuNgan, btnDatBan_ThuNgan, btnDoiMatKhau_ThuNgan, btnHoaDon, btnHuongDan_ThuNgan, btnKhuyenMai_ThuNgan});

        tabs.addTab("Thu Ngân", pnlDanhMuc_ThuNgan);

        pnlDanhMuc_DauBep.setBackground(new java.awt.Color(255, 255, 204));
        pnlDanhMuc_DauBep.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 102)));

        lblWelcome.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 51, 0));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("CHÀO MỪNG BẠN ĐẾN VỚI NHÀ HÀNG ĐẸP VÀ ĐỘC");

        btnKhoNguyenLieu.setBackground(new java.awt.Color(255, 204, 102));
        btnKhoNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-4-128.png"))); // NOI18N
        btnKhoNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoNguyenLieuActionPerformed(evt);
            }
        });

        btnThucDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        btnThucDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThucDonActionPerformed(evt);
            }
        });

        btnPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-post-128.png"))); // NOI18N
        btnPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuNhapActionPerformed(evt);
            }
        });

        btnCaNhan_DauBep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-3-128.png"))); // NOI18N
        btnCaNhan_DauBep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaNhan_DauBepActionPerformed(evt);
            }
        });

        btnHuongDan_DauBep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help-128.png"))); // NOI18N
        btnHuongDan_DauBep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDan_DauBepActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Kho Nguyên Liệu");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Thực Đơn");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Gửi Mail");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cá Nhân");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Hướng Dẫn");

        btnDoiMatKhau_DauBep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/change-user-128.png"))); // NOI18N
        btnDoiMatKhau_DauBep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhau_DauBepActionPerformed(evt);
            }
        });

        lblCaTruc1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCaTruc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaTruc1.setText("Đổi Mật Khẩu");

        javax.swing.GroupLayout pnlDanhMuc_DauBepLayout = new javax.swing.GroupLayout(pnlDanhMuc_DauBep);
        pnlDanhMuc_DauBep.setLayout(pnlDanhMuc_DauBepLayout);
        pnlDanhMuc_DauBepLayout.setHorizontalGroup(
            pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMuc_DauBepLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDanhMuc_DauBepLayout.createSequentialGroup()
                        .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDoiMatKhau_DauBep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCaTruc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCaNhan_DauBep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHuongDan_DauBep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlDanhMuc_DauBepLayout.createSequentialGroup()
                        .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKhoNguyenLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlDanhMuc_DauBepLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCaNhan_DauBep, btnDoiMatKhau_DauBep, btnHuongDan_DauBep, btnKhoNguyenLieu, btnPhieuNhap, btnThucDon});

        pnlDanhMuc_DauBepLayout.setVerticalGroup(
            pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMuc_DauBepLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThucDon)
                    .addComponent(btnPhieuNhap)
                    .addComponent(btnKhoNguyenLieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDanhMuc_DauBepLayout.createSequentialGroup()
                        .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCaNhan_DauBep)
                            .addComponent(btnHuongDan_DauBep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDanhMuc_DauBepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(lblCaTruc1)))
                    .addComponent(btnDoiMatKhau_DauBep, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlDanhMuc_DauBepLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCaNhan_DauBep, btnDoiMatKhau_DauBep, btnHuongDan_DauBep, btnKhoNguyenLieu, btnPhieuNhap, btnThucDon});

        tabs.addTab("Đầu Bếp", pnlDanhMuc_DauBep);

        jMenu1.setText("File");

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel-24.png"))); // NOI18N
        mnExit.setText("Thoát");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Color");

        mnMauChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rainbow-flag.png"))); // NOI18N
        mnMauChinh.setText("Chọn màu chính");
        mnMauChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMauChinhActionPerformed(evt);
            }
        });
        jMenu2.add(mnMauChinh);

        mnMauPhu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rainbow-flag.png"))); // NOI18N
        mnMauPhu.setText("Chọn màu phụ");
        mnMauPhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMauPhuActionPerformed(evt);
            }
        });
        jMenu2.add(mnMauPhu);

        btnResetColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-24.png"))); // NOI18N
        btnResetColor.setText("Reset");
        btnResetColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetColorActionPerformed(evt);
            }
        });
        jMenu2.add(btnResetColor);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatMon_QuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatMon_QuanLyActionPerformed
        // TODO add your handling code here:
        new DatBan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatMon_QuanLyActionPerformed

    private void btnThemMoi_QuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoi_QuanLyActionPerformed
        // TODO add your handling code here:
        Entity.setNull();
        new ThemMoi().setVisible(true); // tabNhanVien
        this.dispose();
    }//GEN-LAST:event_btnThemMoi_QuanLyActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        new ThongKe().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDoiMatKhau_QuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhau_QuanLyActionPerformed
        // TODO add your handling code here:
        new DoiMatKhau().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoiMatKhau_QuanLyActionPerformed

    private void btnCaNhan_QuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaNhan_QuanLyActionPerformed
        // TODO add your handling code here:
        Entity.setNull();
        QLThongKe.indexTabThemMoi = 0;
        new ThemMoi().setVisible(true); // tabNhanVien
        this.dispose();
    }//GEN-LAST:event_btnCaNhan_QuanLyActionPerformed

    private void btnHuongDan_QuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDan_QuanLyActionPerformed
        // TODO add your handling code here:
        new HuongDan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHuongDan_QuanLyActionPerformed

    private void btnDatBan_ThuNganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatBan_ThuNganActionPerformed
        // TODO add your handling code here:
        new DatBan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatBan_ThuNganActionPerformed

    private void btnKhuyenMai_ThuNganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenMai_ThuNganActionPerformed
        // TODO add your handling code here:
        Entity.setNull();
        QLThongKe.indexTabThemMoi = 1;
        new ThemMoi().setVisible(true); // tabNhanVien
        this.dispose();
    }//GEN-LAST:event_btnKhuyenMai_ThuNganActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        QLThongKe.indexTabThongKe = 1;
        new ThongKe().setVisible(true); // tabHoaDon
        this.dispose();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnDoiMatKhau_ThuNganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhau_ThuNganActionPerformed
        // TODO add your handling code here:
        new DoiMatKhau().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoiMatKhau_ThuNganActionPerformed

    private void btnCaNhan_ThuNganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaNhan_ThuNganActionPerformed
        // TODO add your handling code here:
        Entity.setNull();
        QLThongKe.indexTabThemMoi = 0;
        new ThemMoi().setVisible(true); // tabNhanVien
        this.dispose();
    }//GEN-LAST:event_btnCaNhan_ThuNganActionPerformed

    private void btnHuongDan_ThuNganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDan_ThuNganActionPerformed
        // TODO add your handling code here:
        new HuongDan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHuongDan_ThuNganActionPerformed

    private void btnKhoNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoNguyenLieuActionPerformed
        // TODO add your handling code here:
        Entity.setNull();
        QLThongKe.indexTabThongKe = 0;
        new ThongKe().setVisible(true); // tabNguyenLieu
        this.dispose();
    }//GEN-LAST:event_btnKhoNguyenLieuActionPerformed

    private void btnThucDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThucDonActionPerformed
        // TODO add your handling code here:
        new ThucDon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThucDonActionPerformed

    private void btnPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuNhapActionPerformed
        // TODO add your handling code here:
//        Entity.setNull();
//        QLThongKe.indexTabThongKe = 1;
//        new ThongKe().setVisible(true); // tabPhieuNhap
        new MailNhaCC().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPhieuNhapActionPerformed

    private void btnCaNhan_DauBepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaNhan_DauBepActionPerformed
        // TODO add your handling code here:
        Entity.setNull();
        QLThongKe.indexTabThemMoi = 0;
        new ThemMoi().setVisible(true); // tabNhanVien
        this.dispose();
    }//GEN-LAST:event_btnCaNhan_DauBepActionPerformed

    private void btnHuongDan_DauBepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDan_DauBepActionPerformed
        // TODO add your handling code here:
        new HuongDan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHuongDan_DauBepActionPerformed

    private void btnDoiMatKhau_DauBepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhau_DauBepActionPerformed
        new DoiMatKhau().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoiMatKhau_DauBepActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnExitActionPerformed


    private void mnMauChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMauChinhActionPerformed
        // TODO add your handling code here:g
        XColor.color = XColor.chonMau((JComponent) tabs.getSelectedComponent());
        this.setColor();
    }//GEN-LAST:event_mnMauChinhActionPerformed

    private void mnMauPhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMauPhuActionPerformed
        // TODO add your handling code here:
        XColor.extraColor = XColor.chonMau((JComponent) tabs.getSelectedComponent());
        this.setColor();
    }//GEN-LAST:event_mnMauPhuActionPerformed

    private void btnResetColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetColorActionPerformed
        // TODO add your handling code here:
        XColor.resetColor();
        this.setColor();
    }//GEN-LAST:event_btnResetColorActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new DanhMuc().setVisible(true);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaNhan_DauBep;
    private javax.swing.JButton btnCaNhan_QuanLy;
    private javax.swing.JButton btnCaNhan_ThuNgan;
    private javax.swing.JButton btnDatBan_ThuNgan;
    private javax.swing.JButton btnDatMon_QuanLy;
    private javax.swing.JButton btnDoiMatKhau_DauBep;
    private javax.swing.JButton btnDoiMatKhau_QuanLy;
    private javax.swing.JButton btnDoiMatKhau_ThuNgan;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnHuongDan_DauBep;
    private javax.swing.JButton btnHuongDan_QuanLy;
    private javax.swing.JButton btnHuongDan_ThuNgan;
    private javax.swing.JButton btnKhoNguyenLieu;
    private javax.swing.JButton btnKhuyenMai_ThuNgan;
    private javax.swing.JButton btnPhieuNhap;
    private javax.swing.JMenuItem btnResetColor;
    private javax.swing.JButton btnThemMoi_QuanLy;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnThucDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCaNhan;
    private javax.swing.JLabel lblCaTruc;
    private javax.swing.JLabel lblCaTruc1;
    private javax.swing.JLabel lblChao;
    private javax.swing.JLabel lblDatMon;
    private javax.swing.JLabel lblHuongDan;
    private javax.swing.JLabel lblSoDoBan;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnMauChinh;
    private javax.swing.JMenuItem mnMauPhu;
    private javax.swing.JPanel pnlDanhMuc_DauBep;
    private javax.swing.JPanel pnlDanhMuc_QuanLy;
    private javax.swing.JPanel pnlDanhMuc_ThuNgan;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
