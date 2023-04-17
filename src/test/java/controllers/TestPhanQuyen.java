package controllers;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import ui.Login;
import utils.Auth;

@RunWith(Parameterized.class)
public class TestPhanQuyen {

	static Login login;
	String user;
	String pass;
	String expectedResult;
	
	public TestPhanQuyen(String user, String pass, String expectedResult) {
		this.user = user;
		this.pass = pass;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(
					new Object[][] {
						{"NV001","Maiyeuem","CV001"},
						{"NV003","ChiDai","CV002"},
						{"NV004","kiet6mui","CV003"},
						{"NV006","123yo","CV004"}
					}
				);
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		login = new Login();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
//		Auth.user = null;
	}
	
	@Test
	public void testLogin() {
		login.login(user, pass);
		String maCV = null;
		if(Auth.user!=null) {
			maCV = Auth.user.getMaCV();
		}
		assertEquals(expectedResult, maCV);
		Auth.user = null;
	}
}
