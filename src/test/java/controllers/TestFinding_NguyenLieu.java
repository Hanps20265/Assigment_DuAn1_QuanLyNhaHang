package controllers;

import static org.junit.Assert.assertEquals;

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
@RunWith(Parameterized.class)
public class TestFinding_NguyenLieu {
	static Login login;
	static NguyenLieuDAO dao = new NguyenLieuDAO();
	String maNgLieu;
	String expectedResult;
    NguyenLieu nguyenlieu;
	
	public TestFinding_NguyenLieu(String maNgLieu, String expectedResult) {
		super();
		this.maNgLieu = maNgLieu;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return  Arrays.asList(
					new Object[][] {
						{"NL001", "NL001"},
						{"NL002", "NL002"},
						{"NL222",null}
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
	}

	@Test
	public void test() {
		nguyenlieu= QLNguyenLieu.dao.selectById(maNgLieu);
		String result = null;
		if(nguyenlieu != null) {
			result = nguyenlieu.getMaNgLieu();		
		}
		assertEquals(expectedResult,result);
	}

}
