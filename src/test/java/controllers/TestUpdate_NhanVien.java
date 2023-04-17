package controllers;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import dao.NhanVienDAO;
import model.NhanVien;
import ui.Login;
import utils.Auth;


@RunWith(Parameterized.class)
public class TestUpdate_NhanVien {
	static Login login;
	String maNV;
    String matKhau;
    String hoTenNV;
    String gioiTinh;
    Date ngaySinh;
    String soDT;
    String email;
    String diaChi;
    String hinhNV;
    String maCV;
    String expectedResult;
    static NhanVien nhanvien;
	static NhanVienDAO dao = new NhanVienDAO();
	
	
	public TestUpdate_NhanVien(String maNV, String matKhau, String hoTenNV, String gioiTinh, Date ngaySinh,
			String soDT, String email, String diaChi, String hinhNV, String maCV, String expectedResult) {
		super();
		this.maNV = maNV;
		this.matKhau = matKhau;
		this.hoTenNV = hoTenNV;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.soDT = soDT;
		this.email = email;
		this.diaChi = diaChi;
		this.hinhNV = hinhNV;
		this.maCV = maCV;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { 
			{ "NV150", "abc", "Ớt hiểm", "Nam", new Date(), "0987654321", "othiem@gmail.com", "Tây Thạnh", "ot.jpg", "CV004", "NV150" },
			{ "NV200", "abc", "Ớt hiểm", "Nam", new Date(), "0987654321", "othiem@gmail.com", "Tây Thạnh", "ot.jpg", "CV004", null }
			
		});
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String user = "NV001";
		String pass = "Maiyeuem";
		login = new Login();
		login.login(user, pass);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Auth.user=null;
	}

	@Test
	public void test() {
		nhanvien = new NhanVien(maNV, matKhau, hoTenNV, gioiTinh, ngaySinh, soDT, email, diaChi, hinhNV, maCV);
		QLNhanVien.update(nhanvien);
		
		String result = null;
		if (QLNhanVien.alert.equals("Cập nhật thành công!")) {
			System.out.print(result);
			result = dao.selectById(maNV).getMaNV();
		}
		 
		assertEquals(expectedResult, result);
		
	}

}
