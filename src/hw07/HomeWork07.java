package hw07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

public class HomeWork07 {
	final public static void main(String[] args) {
//		qs01();
//		qs02();
		
	}
	public static void qs01() {
		String str;
		int charCount = 0;
		int lineCount = 0;
		
		try {
		File fis = new File(".\\Sample.txt");
//		File fis = new File(".\\D:\\\\CJA103Homework-12\\\\Sample.txt");
		BufferedReader bf = new BufferedReader(new FileReader(fis));
		long bytes = fis.length();
		while ((str = bf.readLine()) !=null) {
			lineCount++;
			charCount += str.length();
		}
		bf.close();
		System.out.println("Sample.txt 檔案共有"+bytes+"個位元組"+charCount+"個字元"+lineCount+"列資料");
//=====================================================================		
//		File fis = new File("c:\\\\JAVA資料和作業題目\\\\Sample.txt");
//		BufferedReader bf = new BufferedReader(new FileReader(fis));
//		int i = 0;
//        while ((i = bf.read()) != -1)
//            System.out.print((char)i);
//		bf.close();
//==============================================================
//		File fis = new File("c:\\\\JAVA資料和作業題目\\\\Sample.txt")
//		BufferedReader bf = new BufferedReader(
//				new InputStreamReader(new FileInputStream(fis),"Big5")
//				);
//		while((str = bf.readLine()) != null) {
//			System.out.println(str);
//		}
//		bf.close();
//==============================================================	
//		FileInputStream fis = new FileInputStream("c:\\JAVA資料和作業題目\\Sample.txt");
//		BufferedInputStream bf = new BufferedInputStream(fis);
//		int i = 0;
//		while ((i = bf.read()) !=-1)
//			System.out.print((char)i);
//		bf.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void qs02() {
		int[] temp = new int[10];
		File myFile = new File(".\\myFile.txt");
		try {
			FileOutputStream fos = new FileOutputStream(myFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			for (int i = 0; i < temp.length; i++) {
				temp[i]= (int)(Math.random()*1000)+1;
				ps.print(temp[i]+" ");
			}
			ps.close();
			bos.close();
			fos.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void qs3(String aPath,String bPath) {
		File aFile = new File(aPath);
		File bFile = new File(bPath);
		String str;
		try {
			BufferedReader bf = new BufferedReader(
					new InputStreamReader(new FileInputStream(aFile),"Big5")
					);
			FileOutputStream fos = new FileOutputStream(bFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			while((str = bf.readLine()) != null) {
			ps.print(str);
		}
		bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
