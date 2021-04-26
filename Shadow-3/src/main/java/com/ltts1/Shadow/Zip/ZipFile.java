package com.ltts1.Shadow.Zip;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipFile {
	
	public static void zip_one_file() {
    	byte[] buffer = new byte[1024];
    	try{
    	FileOutputStream fos = new FileOutputStream("D:\\log\\spring.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);
    	ZipEntry ze= new ZipEntry("spring1.log");
    	zos.putNextEntry(ze);
    	FileInputStream in = new FileInputStream("D:\\log\\spring.log");
    	int len;
    	while ((len = in.read(buffer)) > 0) {
    		zos.write(buffer, 0, len);
    	}
    	in.close();
    	zos.closeEntry();
    	zos.close();
    	}catch(IOException ex){
    	   ex.printStackTrace();
    	}
	}

}
