package controllers;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import ui.Login;
import utils.Auth;

@RunWith(Parameterized.class)
public class TestLogin {

	static Login login = new Login();;
	String user;
	String pass;
	String expectedResult;
	
	public TestLogin(String user, String pass, String expectedResult) {
		this.user = user;
		this.pass = pass;
		this.expectedResult = expectedResult;
	}
	

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(
					new Object[][] {
						{"NV001","Maiyeuem","NV001"},
						{"NV000","Maiyeuem",null},
						{"NV001","Maiyeu",null},
						{"NV003","ChiDai","NV003"},
						{"NV003","chiDai",null},
						{"NV000","ChiDai",null},
						{"NV004","kiet6mui","NV004"},
						{"NV000","kiet6mui",null},
						{"NV004","kietmui",null}
					}
				);
	}
	
	@Test
	public void testLogin() {
		login.login(user, pass);
		
		String maNV = null;
		
		if(Auth.user!=null) {
			maNV = Auth.user.getMaNV();
		}
		assertEquals(expectedResult, maNV);
		Auth.user = null;
	}

}

