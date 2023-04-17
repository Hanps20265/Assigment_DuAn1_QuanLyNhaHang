package controllers;

import static org.junit.Assert.*;

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
public class TestFind_KhachHang {
	static Login login;
    String soDT;
    String expectedResult;
    KhachHang khachhang;
    static KhachHangDAO dao = new KhachHangDAO();

	public TestFind_KhachHang(String soDT, String expectedResult) {
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
		login.login(user, pass);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Auth.user = null;
	}

	@Test
	public void test() {
		khachhang = QLKhachHang.dao.selectById(soDT);
		String result = null;
		if(khachhang!=null) {
			result = khachhang.getSoDT();
		}
		assertEquals(expectedResult,result);
	}
}
