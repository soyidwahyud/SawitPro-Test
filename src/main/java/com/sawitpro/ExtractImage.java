package com.sawitpro;

//import com.aspose.ocr.AsposeOCR;
//import com.aspose.ocr.License;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ExtractImage {
    public static void main(String[] args) throws TesseractException {
        Tesseract tesseract = getTesseract();
        File file = new File("D:\\jetbrain\\Project\\Java\\BelajarJava\\SawitPro-Test\\src\\main\\resources\\download\\drivetest-ImageWithWords4.jpg");
        String result = tesseract.doOCR(file);
        System.out.println(result);
    }
    private static Tesseract getTesseract(){
        Tesseract instance = new Tesseract();
        instance.setDatapath("D:\\jetbrain\\Project\\Java\\BelajarJava\\SawitPro-Test\\tessdata-main");
        instance.setLanguage("chi_sim");
        instance.setHocr(false);
        return instance;
    }
}
