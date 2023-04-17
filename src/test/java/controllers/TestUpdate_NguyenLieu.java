package controllers;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import dao.NguyenLieuDAO;
import model.NguyenLieu;
import ui.Login;
import utils.Auth;

@RunWith(Parameterized.class)
public class TestUpdate_NguyenLieu {
	static Login login;
	String maNgLieu;
	String tenNgLieu;
	String donVi;
	float soLuong;
	String hinhNL;
	String maLoaiNgLieu;
	String expectedResult;
	static NguyenLieu nguyenlieu;
	static NguyenLieuDAO dao = new NguyenLieuDAO();

	public TestUpdate_NguyenLieu(String maNgLieu, String tenNgLieu, String donVi, float soLuong, String hinhNL,
			String maLoaiNgLieu, String result) {
		super();
		this.maNgLieu = maNgLieu;
		this.tenNgLieu = tenNgLieu;
		this.donVi = donVi;
		this.soLuong = soLuong;
		this.hinhNL = hinhNL;
		this.maLoaiNgLieu = maLoaiNgLieu;
		this.expectedResult = result;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { 
			{ "NL105", "Ớt hiểm", "kg", 10, "ot.jpg", "LNL01", "NL105" },
			{ "NL110", "Ớt hiểm", "kg", 10, "ot.jpg", "LNL01", null }
			
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
		nguyenlieu = new NguyenLieu(maNgLieu, tenNgLieu, donVi, soLuong, hinhNL, maLoaiNgLieu);
		QLNguyenLieu.update(nguyenlieu);
		
		String result = null;
		if (QLNguyenLieu.alert.equals("Cập nhật thành công!")) {
			System.out.print(result);
			result = dao.selectById(maNgLieu).getMaNgLieu();
		}
		 
		assertEquals(expectedResult, result);
		
	}

}
