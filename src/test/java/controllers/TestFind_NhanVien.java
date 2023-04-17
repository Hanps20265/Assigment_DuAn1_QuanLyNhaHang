package controllers;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

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
public class TestFind_NhanVien {
	static Login login;
	static NhanVienDAO dao = new NhanVienDAO();
	String maNV;
	String expectedResult;
	NhanVien nhanvien;
	
	public TestFind_NhanVien(String maNV, String expectedResult) {
		super();
		this.maNV = maNV;
		this.expectedResult = expectedResult;
	}
@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return  Arrays.asList(
					new Object[][] {
						{"NV001", "NV001"},
						{"NV002", "NV002"}
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
		nhanvien = QLNhanVien.dao.selectById(maNV);
		String result = null;
		if(nhanvien != null) {
			result = nhanvien.getMaNV();		
		}
		assertEquals(expectedResult,result);
	}

}
