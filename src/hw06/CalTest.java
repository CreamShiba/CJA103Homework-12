package hw06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator test = new Calculator();
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入x的值");
			int x = scanner.nextInt();
			System.out.println("請輸入y的值");
			int y = scanner.nextInt();
			test.powerXY(x, y);
		}catch(InputMismatchException e) {
			System.out.println("輸入格式不正確");
		}catch(CalException e) {
			e.printStackTrace();
		}
	}
	

}
