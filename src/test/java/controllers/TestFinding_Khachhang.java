package controllers;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import dao.KhachHangDAO;
import model.KhachHang;
import ui.Login;
import utils.Auth;
@RunWith(Parameterized.class)
public class TestFinding_Khachhang {
	static Login login;
	static KhachHangDAO dao = new KhachHangDAO();
  
    String soDT;   
    String expectedResult;
    KhachHang khachhang;

	
	public TestFinding_Khachhang( String soDT, String expectedResult) {
		super();

		this.soDT = soDT;
		this.expectedResult = expectedResult;
	}
@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return  Arrays.asList(
					new Object[][] {
						{"0881385771", "0881385771"},
						{"0123456780", null}
					}
				);
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		String user = "NV001";
		String pass = "Maiyeuem";
		login = new Login();
		login.login(user,pass);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Auth.user = null;
	}

	@Test
	public void test() {
//		khachhang = new KhachHang(hoTenKH, gioiTinh, ngaySinh, soDT, email, diaChi);
//		QLKhachHang.insert(khachhang);
		khachhang= QLKhachHang.dao.selectById(soDT);
		String result = null;
		if(khachhang != null) {
			result = khachhang.getSoDT();		
		}
		assertEquals(expectedResult,result);
//		khachhang = new KhachHang(hoTenKH, gioiTinh, ngaySinh, soDT, email, diaChi);
//		QLKhachHang.insert(khachhang);
//		
//		String result = null;
//		if(QLKhachHang.alert.equals("Thêm mới thành công!")) {
//			result = dao.selectById(soDT).getSoDT();
//			System.out.print(result);
//		}
//		assertEquals(expectedResult,result);
//		if(result != null) {
//			QLKhachHang.detele(soDT);
//		}
	}

}
