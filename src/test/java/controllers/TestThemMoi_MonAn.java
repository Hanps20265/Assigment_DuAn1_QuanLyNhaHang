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
public class TestThemMoi_MonAn {
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
    
	public TestThemMoi_MonAn(String maMon, String tenMon, float donGia, String donVi, String hinhMA,
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
			{ "KV150", "Cua Hoàng Đế hấp sả", 120000, "Dĩa","DuyAnh.jpg", "LM01", "KV150"},
			{ "KV02", "Cua Hoàng Đế hấp sả", 120000, "Dĩa","DuyAnh.jpg", "LM01", null}
			
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
	public void testInsert() {
		monan = new MonAn(maMon, tenMon, donGia, donVi, hinhMA, maLoaiMon);
		QLMonAn.insert(monan);
//		System.out.println(monan.getMaMon());
		String result = null;
		if (QLMonAn.alert.equals("Thêm mới thành công!")) {
			result = dao.selectById(maMon).getMaMon();
			System.out.print(result);
			
		}
		
		assertEquals(expectedResult, result);
			if(result != null) {
				QLMonAn.detele(maMon);
			}
	}

}
