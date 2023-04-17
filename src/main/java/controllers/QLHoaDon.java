
package controllers;

import dao.HoaDonDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.HoaDon;
import utils.MsgBox;

public class QLHoaDon{
    
    public static HoaDonDAO dao = new HoaDonDAO();
    public static boolean reset = false;
    public static String alert = "";

    public static void insert(HoaDon entity) {
        if (dao.insert(entity) > 0) {
        	alert =  "Thêm mới thành công!";
            reset = true;
        } else {
        	alert =  "Thêm mới thất bại!";
        }
        MsgBox.alert(null, alert);
    }

    public static void update(HoaDon entity) {
        if (dao.update(entity) > 0) {
            MsgBox.alert(null, "Cập nhật Hóa đơn thành công!");
        } else {
            MsgBox.alert(null, "Cập nhật Hóa đơn thất bại!");
        }
    }

    public static boolean detele(String...id) {
        if (dao.delete(id) > 0) {
            MsgBox.alert(null, "Xóa Hóa đơn thành công!");
            return true;
        } else {
            MsgBox.alert(null, "Xóa Hóa đơn thất bại!");
        }
        return false;
    }

    public static void fillAllToCbo(JComboBox cbo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo.getModel();
        model.removeAllElements();
        List<HoaDon> list = dao.selectAll();
        model.addElement("Chưa chọn hóa đơn");
        for (HoaDon entity : list) {
            model.addElement(entity.getMaHoaDon());
        }
    }

    public static void fillPaymentMethodToCbo(JComboBox<String> cbo) {
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbo.getModel();
        model.removeAllElements();
        List<String> list = dao.selectPaymentBySql();
        model.addElement("Chọn phương thức thanh toán");
        for (String payment : list) {
            model.addElement(payment);
        }
    }
    
}
