package com.sawitpro;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public String getImgText(String imageLocation) {
        Tesseract iT = new Tesseract();
        try
        {
            iT.setDatapath("D:\\jetbrain\\Project\\Java\\BelajarJava\\SawitPro-Test\\tessdata-main");
            String imgText = iT.doOCR(new File(imageLocation));
            return imgText;
        }
        catch (TesseractException e)
        {
            e.getMessage();
            return "Error while reading image";
        }
    }
    public static void main ( String[] args) throws IOException {
        App app = new App();
        File output = new File("ExtractText-4.txt");
        FileWriter writer = new FileWriter(output);
        writer.write(app.getImgText("D:\\jetbrain\\Project\\Java\\BelajarJava\\SawitPro-Test\\src\\main\\resources\\download\\drivetest-ImageWithWords4.jpg"));
        writer.flush();
        writer.close();
        System.out.println(app.getImgText("D:\\jetbrain\\Project\\Java\\BelajarJava\\SawitPro-Test\\src\\main\\resources\\download\\drivetest-ImageWithWords4.jpg"));
//        D:\jetbrain\Project\Java\BelajarJava\SawitPro-Test\src\main\resources\download\drivetest-ImageWithWords1.jpg
    }
}
