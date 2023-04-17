/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author Cuong
 */
public class CreateQRCode {

    /**
     * @param args the command line arguments
     */


    public static final String output ="D:\\QRnew.png";
    private static void CreateQRcode(String text,int width,int hight,String filepath) throws WriterException
    {
         QRCodeWriter QR = new QRCodeWriter();
        BitMatrix bm = QR.encode(text, BarcodeFormat.QR_CODE, width, hight);
        Path a = FileSystems.getDefault().getPath(filepath);
        try {
            MatrixToImageWriter.writeToPath(bm, "PNG", a);
            System.out.println("Thanh Cong");
        } catch (Exception e) {
            System.out.println("Loi");
        }
    }
    public static void main(String[] args) throws WriterException {
        CreateQRcode("Cuong Ne", 1250, 1250, output);
    }
    
}
