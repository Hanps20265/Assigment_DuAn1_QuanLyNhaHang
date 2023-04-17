package controllers;

import dao.MonAnDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.MonAn;
import utils.MsgBox;

public class QLMonAn {

    public static MonAnDAO dao = new MonAnDAO();
    public static String alert = "";

    public static void insert(MonAn entity) {
        if (dao.insert(entity) > 0) {
        	alert =  "Thêm mới thành công!";
        } else {
        	alert =  "Thêm mới thất bại!";
        }
        MsgBox.alert(null, alert);
    }

    public static void update(MonAn entity) {
        if (dao.update(entity) > 0) {
        	alert = "Cập nhật thành công!";
        } else {
        	alert = "Cập nhật thất bại!";
        }
        MsgBox.alert(null, alert);
    }

    public static boolean detele(String... id) {
        if (dao.delete(id) > 0) {
            MsgBox.alert(null, "Xóa thành công!");
            return true;
        } else {
            MsgBox.alert(null, "Xóa thất bại!");
        }
        return false;
    }

    public static void fillToCbo(JComboBox<String> cbo) {
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbo.getModel();
        model.removeAllElements();
        List<MonAn> list = dao.selectAll();
        model.addElement("Chưa chọn");
        for (MonAn entity : list) {
            model.addElement(entity.getTenMon());
        }
    }

    public static void fillToCboTenMonByLoaiMon(JComboBox<String> cbo, String maLoai) {
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbo.getModel();
        model.removeAllElements();
        List<MonAn> list = dao.selectByMaLoai(maLoai);
        if (list != null) {
            model.addElement("Chưa chọn");
            for (MonAn entity : list) {
                model.addElement(entity.getTenMon());
            }
        }

    }
    
    public static void fillToCboMaMonByLoaiMon(JComboBox<String> cbo, String maLoai) {
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbo.getModel();
        model.removeAllElements();
        List<MonAn> list = dao.selectByMaLoai(maLoai);
        if (list != null) {
            model.addElement("Chưa chọn");
            for (MonAn entity : list) {
                model.addElement(entity.getMaMon());
            }
        }
    }
}
