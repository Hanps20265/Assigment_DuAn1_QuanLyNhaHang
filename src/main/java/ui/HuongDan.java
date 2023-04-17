package ui;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import utils.Auth;
import utils.MsgBox;
import utils.XColor;
import utils.XInit;

public class HuongDan extends javax.swing.JFrame {

    public HuongDan() {
        initComponents();
        XInit.init(this);
        if (!Auth.isManager()) {
            tabs.remove(0);
            if (Auth.user.getMaCV().toString().equals("CV002")) {
                tabs.remove(1);
            } else if (Auth.user.getMaCV().toString().equals("CV003")) {
                tabs.remove(0);
            }
        }
        this.setColor();
    }

    void setColor() {
        JComponent pnl = (JComponent) tabs.getSelectedComponent();
        pnl.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, XColor.extraColor));
        tabs.setBackground(XColor.color);
        pnlHuongDan.setBackground(XColor.color);
        pnlHuongDan.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, XColor.extraColor));
        btnDanhMuc.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 3, XColor.extraColor));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHuongDan = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnDanhMuc = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnMauChinh = new javax.swing.JMenuItem();
        mnMauPhu = new javax.swing.JMenuItem();
        btnResetColor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("QUẢN LÝ NHÀ HÀNG - HƯỚNG DẪN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMixingCutoutShape(null);

        pnlHuongDan.setBackground(new java.awt.Color(255, 255, 204));
        pnlHuongDan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(255, 204, 102)));

        tabs.setBackground(new java.awt.Color(255, 204, 102));
        tabs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabs.setForeground(new java.awt.Color(0, 153, 255));
        tabs.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 204, 51));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("* Lưu ý: với vai trò là quản lý bạn có thao tác toàn bộ các chức năng có trong ứng dụng.\nĐặt món:\nKhi nhấp chọn “Đặt Món” sẽ đưa người dùng đến trang sơ đồ bàn. \nĐể thêm bàn vào trong nhà hàng nhấn chọn vào nút “THÊM BÀN” ở trên khu vực menu.\nĐể kiểm tra tình trạng bàn dựa vào màu sắc của bàn: còn trống (màu xanh), đã đặt bàn (màu vàng), đã đặt món (màu đỏ).\nĐể đặt bàn nhấp chọn 1 lần để đặt, nhấp lần 2 để chuyển sang đặt món cho bàn đó.\nĐặt món:\nKhi chưa chọn bàn để vào trang đặt món thì sẽ hiển thị 1 thông báo vui lòng nhập vào “mã hóa đơn” để hiển thị thông tin hóa đơn đó.\nKhi đã đặt bàn thì vào trang đặt món:\nMón ăn, thức uống: khi chọn 1 loại món bất kì theo yêu cầu khách hàng thì các món có trong thực đơn sẽ được hiển thị dưới bảng thực đơn.\nKhung khách hàng:\n\t. Tìm kiếm: để tìm kiếm thông tin khách hàng đã từng ghé nhà hàng vui lòng nhấp vào “Tìm Kiếm” trong khung khách hàng, khi đó sẽ hiển thị 1 thông báo để kiểm tra vui lòng nhập “số điện thoại” khách hàng, nếu có sẽ hiển thị thông tin của khách hàng đó lên hóa đơn.\n\t. Cập nhật: để cập nhật thông tin khách hàng đã lưu trong nhà hàng vui lòng nhấp vào “Tìm Kiếm” trong khung khách hàng, khi đó sẽ hiển thị 1 thông báo để kiểm tra vui lòng nhập số điện thoại khách hàng, nếu có sẽ hiển thị thông tin của khách hàng đó lên hóa đơn và nhấp vào “Cập Nhật” để tùy chỉnh các thông tin muốn thay đổi.\n\t. Làm mới: dùng để xóa trắng các văn bản có trên thông tin khách hàng vui lòng nhấp vào “Làm Mới”.\n\t. Lưu khách hàng: dùng để lưu khách hàng mới vào trong lịch sử ghé đến nhà hàng vui lòng nhấp vào “Lưu KH”.\n\nKhung Hóa Đơn: \n\t. Tìm kiếm: để tìm kiếm toàn bộ thông tin khách hàng và hóa đơn đã từng ghé nhà hàng vui lòng nhấp vào “Tìm Kiếm” trong khung hóa đơn, khi đó sẽ hiển thị 1 thông báo để kiểm tra vui lòng nhập mã hóa đơn nếu có sẽ hiển thị toàn bộ thông tin của khách hàng và hóa đơn đó lên hóa đơn.\n\t. Cập nhật: để cập nhật thông tin hóa đơn đã lưu trong nhà hàng vui lòng nhấp vào “Tìm Kiếm” trong khung hóa đơn, khi đó sẽ hiển thị 1 thông báo để kiểm tra vui lòng nhập “mã hóa đơn” của khách hàng, nếu có sẽ hiển thị thông tin của hóa đơn đó lên hóa đơn và nhấp vào “Cập Nhật” để tùy chỉnh các thông tin muốn thay đổi.\n\t. Làm mới: dùng để reset thông tin hóa đơn vui lòng nhấp vào “Làm Mới”.\n. Lưu HĐ: dùng để lưu thông tin hóa đơn mới vào trong lịch sử nhà hàng vui lòng nhấp vào “Lưu HĐ”.\n\nKhung thêm món: \n\t. Thêm: nhấp chọn món ăn muốn thêm và nhấp vào “THÊM” để thêm món ăn đó vào hóa đơn của khách hàng.\n\t. Xóa: nhấp chọn món ăn đã thêm vào hóa đơn trước đó và nhấp vào “XÓA” để xóa món đó khỏi hóa đơn của khách hàng.\n\t. Tăng: nhấp chọn vào món ăn đã thêm vào hóa đơn trước đó và nhấp vào “TĂNG” để tăng số lượng món ăn đó.\n\t. Giảm: nhấp chọn vào món ăn đã thêm vào hóa đơn trước đó và nhấp vào “GIẢM” để giảm số lượng món ăn đó.\n\nKhung hóa đơn: nhấp đầy đủ thông tin khách hàng và các món ăn theo yêu cầu, chọn khuyến mãi phù hợp với chương trình, chọn loại hình “thanh toán” theo nhu cầu của khách hàng. Nhấp chọn “Thanh Toán” để thanh toán cho khách hàng và đồng thời lưu hóa đơn vào lịch sử nhà hàng.\n\nThêm mới:\nNgười dùng là quản lý được quyền kiểm tra thông tin cá nhân của mình và sử dụng tất cả các chức năng khác có trong “Thêm Mới”: Nhân viên, Ca trực, Món ăn, Công thức, Khuyến mãi, Phiếu nhập, Nguyên liệu\nKhi nhấp vào bạn sẽ xem được thông tin cá nhân của bản thân hoặc toàn bộ các nhân viên khác trong nhà hàng và có thể thao tác được các chức năng cơ bản (thêm, xóa, sửa).\nCa trực: dùng để phân lịch chi tiết cho các nhân viên.\nMón ăn: dùng để thêm, xóa, sửa một món mới vào trong menu nhà hàng.\nCông thức: dùng để thêm, xóa, sửa công thức của món ăn có trong menu nhà hàng.\nKhuyến mãi: dùng để thêm, xóa, sửa khuyến mãi của một hóa đơn hay khuyến mãi chi tiết cho một món.\nPhiếu nhập: dùng để thêm, xóa, sửa các loại hàng hóa vào nhà hàng.\nNguyên liệu: dùng để thêm, xóa, sửa các loại nguyên liệu đã nhập vào nhà hàng.\n\nHóa Đơn: \nKhi đăng nhập vào với vai trò của “Quản lý” được sử dụng toàn bộ các thống kê: nhân viên, ca trực, khách hàng, hóa đơn, nguyên liệu, phiếu nhập, phiếu nhập chi tiết, khuyến mãi.\nThống kê khách hàng:\n. Để tìm kiếm \nĐổi mật khẩu:\nĐể đổi mật khẩu hiện tại vui lòng nhấp vào “Đổi Mật Khẩu”. \nNhập mật khẩu hiện tại, nhập mật khẩu mới, xác nhận lại mật khẩu mới vừa nhập. Nếu nhập sai các thông tin sẽ báo lỗi “đổi không thành công”\n\nCá nhân:\nNgười dùng không phải là quản lý chỉ được kiểm tra thông tin cá nhân của mình và không được sử dụng các chức năng khác.\n\nGiao diện quên mật khẩu:\n+ Sau khi chạy form login nếu người dùng quên mật khẩu đăng nhập => click vào nút quên mật khẩu sẽ chuyển sang form quên mật khẩu\n+ Người dùng phải nhập đầy đủ thông tin nếu muốn lấy lại mật khẩu mới.\n+ Người dùng phải nhập đúng thông tin bao gồm Tài khoản ( Mã Nhân Viên) và email khi đăng ký \n+ Nếu được thông báo ( Mật khẩu mới của bạn đã được gửi qua mail) thì bạn vui lòng vào email của mình để check email từ Nhà Hàng để nhận thông tin về mật khẩu mới.\n+ Sau nghi nhập được mật khẩu mới bạn vui lòng vào phần đổi mật khẩu để đổi lại mật khẩu mới.\n\n\nMail Sinh Nhật:\n+ Khi mở form login Các khách hàng có tháng sinh trước tháng hiện tại 1 tháng sẽ được gửi mail mời đến email khách hàng.\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        tabs.addTab("Quản lý", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 204, 51));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Sơ đồ bàn: \nĐể thêm bàn vào trong nhà hàng nhấn chọn vào nút “THÊM BÀN” ở trên khu vực menu.\nĐể kiểm tra tình trạng bàn dựa vào màu sắc của bàn: còn trống (màu xanh), đã đặt bàn (màu vàng), đã đặt món (màu đỏ).\nĐể đặt bàn nhấp chọn 1 lần để đặt, nhấp lần 2 để chuyển sang đặt món cho bàn đó.\n\nĐặt món:\nKhi chưa chọn bàn để vào trang đặt món thì sẽ hiển thị 1 thông báo vui lòng nhập vào “mã hóa đơn” để hiển thị thông tin hóa đơn đó.\nKhi đã đặt bàn thì vào trang đặt món:\nMón ăn, thức uống: khi chọn 1 loại món bất kì theo yêu cầu khách hàng thì các món có trong thực đơn sẽ được hiển thị dưới bảng thực đơn.\nKhung khách hàng:\n\t. Tìm kiếm: để tìm kiếm thông tin khách hàng đã từng ghé nhà hàng vui lòng nhấp vào “Tìm Kiếm” trong khung khách hàng, khi đó sẽ hiển thị 1 thông báo để kiểm tra vui lòng nhập “số điện thoại” khách hàng, nếu có sẽ hiển thị thông tin của khách hàng đó lên hóa đơn.\n\t. Cập nhật: để cập nhật thông tin khách hàng đã lưu trong nhà hàng vui lòng nhấp vào “Tìm Kiếm” trong khung khách hàng, khi đó sẽ hiển thị 1 thông báo để kiểm tra vui lòng nhập số điện thoại khách hàng, nếu có sẽ hiển thị thông tin của khách hàng đó lên hóa đơn và nhấp vào “Cập Nhật” để tùy chỉnh các thông tin muốn thay đổi.\n\t. Làm mới: dùng để xóa trắng các văn bản có trên thông tin khách hàng vui lòng nhấp vào “Làm Mới”.\n\t. Lưu khách hàng: dùng để lưu khách hàng mới vào trong lịch sử ghé đến nhà hàng vui lòng nhấp vào “Lưu KH”.\n\nKhung Hóa Đơn: \n\t. Tìm kiếm: để tìm kiếm toàn bộ thông tin khách hàng và hóa đơn đã từng ghé nhà hàng vui lòng nhấp vào “Tìm Kiếm” trong khung hóa đơn, khi đó sẽ hiển thị 1 thông báo để kiểm tra vui lòng nhập mã hóa đơn nếu có sẽ hiển thị toàn bộ thông tin của khách hàng và hóa đơn đó lên hóa đơn.\n\t. Cập nhật: để cập nhật thông tin hóa đơn đã lưu trong nhà hàng vui lòng nhấp vào “Tìm Kiếm” trong khung hóa đơn, khi đó sẽ hiển thị 1 thông báo để kiểm tra vui lòng nhập “mã hóa đơn” của khách hàng, nếu có sẽ hiển thị thông tin của hóa đơn đó lên hóa đơn và nhấp vào “Cập Nhật” để tùy chỉnh các thông tin muốn thay đổi.\n\t. Làm mới: dùng để reset thông tin hóa đơn vui lòng nhấp vào “Làm Mới”.\n. Lưu HĐ: dùng để lưu thông tin hóa đơn mới vào trong lịch sử nhà hàng vui lòng nhấp vào “Lưu HĐ”.\n\nKhung thêm món: \n\t. Thêm: nhấp chọn món ăn muốn thêm và nhấp vào “THÊM” để thêm món ăn đó vào hóa đơn của khách hàng.\n\t. Xóa: nhấp chọn món ăn đã thêm vào hóa đơn trước đó và nhấp vào “XÓA” để xóa món đó khỏi hóa đơn của khách hàng.\n\t. Tăng: nhấp chọn vào món ăn đã thêm vào hóa đơn trước đó và nhấp vào “TĂNG” để tăng số lượng món ăn đó.\n\t. Giảm: nhấp chọn vào món ăn đã thêm vào hóa đơn trước đó và nhấp vào “GIẢM” để giảm số lượng món ăn đó.\n\nKhung hóa đơn: nhấp đầy đủ thông tin khách hàng và các món ăn theo yêu cầu, chọn khuyến mãi phù hợp với chương trình, chọn loại hình “thanh toán” theo nhu cầu của khách hàng. Nhấp chọn “Thanh Toán” để thanh toán cho khách hàng và đồng thời lưu hóa đơn vào lịch sử nhà hàng.\nHóa Đơn: \nKhi đăng nhập vào với vai trò của “Thu Ngân” được sử dụng thống kê: khách hàng, hóa đơn, nguyên liệu.\nThống kê khách hàng:\n. Tại khung tìm kiếm cho bạn thấy các số điện thoại của khách hàng đã từng đến nhà hàng.\n. Tại khung sắp xếp: có thể sắp xếp, giới tính, ngày sinh, số điện thoại, email, địa chỉ.\n. Chọn sắp xếp theo: tăng dần hoặc giảm dần.\n. Có thể sử dụng các chức năng khác như thêm, chi tiết, xem file, xuất file.\n.  \nĐổi mật khẩu:\nĐể đổi mật khẩu hiện tại vui lòng nhấp vào “Đổi Mật Khẩu”. \nNhập mật khẩu hiện tại, nhập mật khẩu mới, xác nhận lại mật khẩu mới vừa nhập. Nếu nhập sai các thông tin báo lỗi “đổi không thành công”\n\nCá nhân:\nNgười dùng không phải là quản lý chỉ được kiểm tra thông tin cá nhân của mình và không được sử dụng các chức năng khác.");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        tabs.addTab("Thu Ngân", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(255, 204, 51));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Kho nguyên liệu:\nđầu bếp sau khi ấn vào kho nguyên liệu, chương trình sẽ chuyển đến form thống kê nguyên liệu cho đầu bếp. Tại đây đầu bếp có thể xem được toàn bộ nguyên liệu đang có và số lượng của nguyên liệu tại thời điểm đó. Ngoài ra đầu bếp còn có thể sử dụng các chức năng như: Tìm kiếm nguyên liệu muốn xem, Sắp xếp theo số lượng tăng dần hoặc giảm dần, Thêm nguyên liệu, Xuất file excel cho nguyên liệu.\nThực đơn:\nĐầu bếp có thể thêm, xóa, sửa các món ăn trong phần thực đơn đã có sẵn của nhà hàng.\nPhiếu nhập:\nĐầu bếp có thẻ xem toàn bộ phiếu nhập, người nhập hàng và tổng chi cho lần nhập hàng đó để đối chiếu với kho nguyên liệu. Ngoài ra đầu bếp còn có thể sử dụng các chức năng như: Tìm kiếm phiếu nhập muốn xem, Sắp xếp theo số lượng tăng dần hoặc giảm dần, Thêm phiếu nhập, Xuất file excel cho phiếu nhập. Trong đó đầu bếp còn có thể lọc các phiếu nhập theo ngày, theo người lập, theo nguyên liệu nhập.\nĐổi mật khẩu:\nĐể đổi mật khẩu hiện tại vui lòng nhấp vào “Đổi Mật Khẩu”. \nNhập mật khẩu hiện tại, nhập mật khẩu mới, xác nhận lại mật khẩu mới vừa nhập. Nếu nhập sai các thông tin sẽ báo lỗi “đổi không thành công”\nCá nhân:\nNgười dùng là đầu bếp chỉ được kiểm tra thông tin cá nhân của mình và được sử dụng các chức năng khác.\n\nMail cho nhà cung cấp:\n+ Đầu bếp khi cần cung ứng nguyên liệu sẽ gửi mail cho nhà cung cấp để được cung ứng hàng hóa\n+ Đầu Bếp nhập mail của nhà cung cấp và nhập nguyên liệu cho nhà cung cấp\n+ Sau ghi nhập đầu đủ thông tin người dùng bấm vào nút gửi mail, email của bạn sẽ được gửi cho nhà cung cấp\n\n\nGiao diện quên mật khẩu:\n+ Sau khi chạy form login nếu người dùng quên mật khẩu đăng nhập => click vào nút quên mật khẩu sẽ chuyển sang form quên mật khẩu\n+ Người dùng phải nhập đầy đủ thông tin nếu muốn lấy lại mật khẩu mới.\n+ Người dùng phải nhập đúng thông tin bao gồm Tài khoản ( Mã Nhân Viên) và email khi đăng ký \n+ Nếu được thông báo ( Mật khẩu mới của bạn đã được gửi qua mail) thì bạn vui lòng vào email của mình để check email từ Nhà Hàng để nhận thông tin về mật khẩu mới.\n+ Sau nghi nhập được mật khẩu mới bạn vui lòng vào phần đổi mật khẩu để đổi lại mật khẩu mới.\n");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabs.addTab("Đầu Bếp", jPanel5);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hướng Dẫn Sử Dụng Phần Mềm");

        btnDanhMuc.setBackground(new java.awt.Color(255, 255, 204));
        btnDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDanhMuc.setForeground(new java.awt.Color(0, 204, 255));
        btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/purchase-order-32.png"))); // NOI18N
        btnDanhMuc.setText("Danh Mục");
        btnDanhMuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102), 3));
        btnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhMucActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close-window-32.png"))); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHuongDanLayout = new javax.swing.GroupLayout(pnlHuongDan);
        pnlHuongDan.setLayout(pnlHuongDanLayout);
        pnlHuongDanLayout.setHorizontalGroup(
            pnlHuongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuongDanLayout.createSequentialGroup()
                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlHuongDanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHuongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabs, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        pnlHuongDanLayout.setVerticalGroup(
            pnlHuongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuongDanLayout.createSequentialGroup()
                .addGroup(pnlHuongDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        jMenu3.setText("Color");

        mnMauChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rainbow-flag.png"))); // NOI18N
        mnMauChinh.setText("Chọn màu chính");
        mnMauChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMauChinhActionPerformed(evt);
            }
        });
        jMenu3.add(mnMauChinh);

        mnMauPhu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rainbow-flag.png"))); // NOI18N
        mnMauPhu.setText("Chọn màu phụ");
        mnMauPhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMauPhuActionPerformed(evt);
            }
        });
        jMenu3.add(mnMauPhu);

        btnResetColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/available-updates-24.png"))); // NOI18N
        btnResetColor.setText("Reset");
        btnResetColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetColorActionPerformed(evt);
            }
        });
        jMenu3.add(btnResetColor);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHuongDan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHuongDan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        // TODO add your handling code here:
        String maCV = Auth.user.getMaCV();
        if (!Auth.isLogin()) {
            new Login().setVisible(true);
            MsgBox.alert(null, "Vui lòng đăng nhập!");
        } else {
            new DanhMuc().setVisible(true);
        }
            this.dispose();
        
    }//GEN-LAST:event_btnDanhMucActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void mnMauChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMauChinhActionPerformed
        // TODO add your handling code here:g
        XColor.color = XColor.chonMau(pnlHuongDan);
        this.setColor();
    }//GEN-LAST:event_mnMauChinhActionPerformed

    private void mnMauPhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMauPhuActionPerformed
        // TODO add your handling code here:
        XColor.extraColor = XColor.chonMau(pnlHuongDan);
        this.setColor();
    }//GEN-LAST:event_mnMauPhuActionPerformed

    private void btnResetColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetColorActionPerformed
        // TODO add your handling code here:
        XColor.resetColor();
        this.setColor();
    }//GEN-LAST:event_btnResetColorActionPerformed

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
            java.util.logging.Logger.getLogger(HuongDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuongDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuongDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuongDan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!Auth.isLogin()) {
                    new Login().setVisible(true);
                    MsgBox.alert(null, "Vui lòng đăng nhập!");
                } else {
                    new HuongDan().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnExit;
    private javax.swing.JMenuItem btnResetColor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JMenuItem mnMauChinh;
    private javax.swing.JMenuItem mnMauPhu;
    private javax.swing.JPanel pnlHuongDan;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
