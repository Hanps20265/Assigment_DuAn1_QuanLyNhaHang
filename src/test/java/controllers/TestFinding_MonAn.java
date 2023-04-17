package controllers;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import dao.MonAnDAO;
import model.MonAn;
import ui.Login;
import utils.Auth;
@RunWith(Parameterized.class)
public class TestFinding_MonAn {
	static Login login;	
	static MonAnDAO dao = new MonAnDAO();
	String maMon;
	String expectedResult;
	MonAn monan;
	
	public TestFinding_MonAn(String maMon, String expectedResult) {
		super();
		this.maMon = maMon;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return  Arrays.asList(
					new Object[][] {
						{"KV01", "KV01"},
						{"KV02", "KV02"}
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
		monan= QLMonAn.dao.selectById(maMon);
		String result = null;
		if(monan != null) {
			result = monan.getMaMon();		
		}
		assertEquals(expectedResult,result);
	}

}
