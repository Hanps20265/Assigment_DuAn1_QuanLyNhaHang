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

import dao.HoaDonDAO;
import model.HoaDon;
import ui.Login;
import utils.Auth;

@RunWith(Parameterized.class)
public class TestInsert_HoaDon {

static Login login;
	int maHoaDon;
	Date ngayLapHD;
	String hinhThucTT;
	String nhanVienLap;
	String nhanVienTT;
	String maKH;
	String maKhuyenMai;
	int expectedResult;
    
    HoaDon hoadon;
    static HoaDonDAO dao = new HoaDonDAO();
    
    public TestInsert_HoaDon(int maHoaDon, Date ngayLapHD, String hinhThucTT, String nhanVienLap, String nhanVienTT,
			String maKH, String maKhuyenMai, int expectedResult) {
		this.maHoaDon = maHoaDon;
		this.ngayLapHD = ngayLapHD;
		this.hinhThucTT = hinhThucTT;
		this.nhanVienLap = nhanVienLap;
		this.nhanVienTT = nhanVienTT;
		this.maKH = maKH;
		this.maKhuyenMai = maKhuyenMai;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return  Arrays.asList(
					new Object[][] {
						{13, new Date(), "Chuyển khoản", "NV001", "NV001","0881385771", "SINHNHAT",13 },
						{10, new Date(), "Chuyển khoản", "NV001", "NV001","0881385771", "SINHNHAT", 10 }
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
		hoadon = new HoaDon(maHoaDon,ngayLapHD, hinhThucTT, nhanVienLap, nhanVienTT, maKH, maKhuyenMai);
		QLHoaDon.insert(hoadon);
		
		int result = -1;
		if(QLHoaDon.alert.equals("Thêm mới thành công!")) {
			result = dao.selectById(String.valueOf(hoadon.getMaHoaDon())).getMaHoaDon();
		}
		assertEquals(expectedResult,result);
//		if(hoadon!=null){
//			QLHoaDon.detele(String.valueOf(maHoaDon));
//		}
		
	}
}
