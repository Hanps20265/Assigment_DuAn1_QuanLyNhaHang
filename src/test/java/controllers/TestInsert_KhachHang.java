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

import dao.KhachHangDAO;
import model.KhachHang;
import ui.Login;
import utils.Auth;

@RunWith(Parameterized.class)
public class TestInsert_KhachHang {
	static Login login;
	
    String hoTenKH;
    String gioiTinh;
    Date ngaySinh;
    String soDT;
    String email;
    String diaChi;
    String expectedResult;
    
    KhachHang khachhang;
    
    static KhachHangDAO dao = new KhachHangDAO();
	

	public TestInsert_KhachHang(String hoTenKH, String gioiTinh, Date ngaySinh, String soDT, String email,
			String diaChi, String expectedResult) {
		this.hoTenKH = hoTenKH;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.soDT = soDT;
		this.email = email;
		this.diaChi = diaChi;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return  Arrays.asList(
					new Object[][] {
						{"Ớt hiểm","Nam",new Date(),"0123456780","ot@gmail.com","Trường Chinh","0123456780"},
						{"Ớt hiểm","Nam",new Date(),"0881385771","ot@gmail.com","Trường Chinh",null}
					}
				);
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
		Auth.user = null;
	}

	@Test
	public void test() {
		khachhang = new KhachHang(hoTenKH, gioiTinh, ngaySinh, soDT, email, diaChi);
		QLKhachHang.insert(khachhang);
		
		String result = null;
		if(QLKhachHang.alert.equals("Thêm mới thành công!")) {
			result = dao.selectById(soDT).getSoDT();
			System.out.print(result);
		}
		assertEquals(expectedResult,result);
		if(result != null) {
			QLKhachHang.detele(soDT);
		}
	}

}
