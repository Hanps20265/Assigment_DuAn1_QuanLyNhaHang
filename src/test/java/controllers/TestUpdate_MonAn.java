package controllers;

import static org.junit.Assert.*;

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
public class TestUpdate_MonAn {
	static Login login;
	String maMon;
    String tenMon;
    float donGia;
    String donVi;
    String hinhMA;
    String maLoaiMon;
    String expectedResult;
    static MonAn monan;
	static MonAnDAO dao = new MonAnDAO();
    
	public TestUpdate_MonAn(String maMon, String tenMon, float donGia, String donVi, String hinhMA,
			String maLoaiMon, String expectedResult) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.donGia = donGia;
		this.donVi = donVi;
		this.hinhMA = hinhMA;
		this.maLoaiMon = maLoaiMon;
		this.expectedResult = expectedResult;
	}
	

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { 
			{ "KV150", "Cua Hoàng Đế hấp sả", 200000, "Dĩa","DuyAnh.jpg", "LM01", 200000},
			{ "KV130", "Cua Hoàng Đế hấp sả", 200000, "Dĩa","DuyAnh.jpg", "LM01", null}
			
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
		monan = new MonAn(maMon, tenMon, donGia, donVi, hinhMA, maLoaiMon);
		QLMonAn.update(monan);
		float result = -1;		
		if (QLMonAn.alert.equals("Cập nhật thành công!")) {
//			System.out.print(result);
			 result = dao.selectById(maMon).getDonGia();
		}
		assertEquals(expectedResult, result);
		
	}

}
