package hw05;
import java.util.Scanner;
public class HomeWork05 {
	public static void main(String[] args) {
//		============問題一============
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("請輸入多寬");
//		int width = scanner.nextInt();
//		System.out.println("請輸入多高");
//		int height = scanner.nextInt();
//		scanner.close();
//		starSquare(width,height);
//		============問題二============
//		randAvg();
//		============問題三============
//		int[][] intArray = {{1, 6, 3},{9, 5, 2}};
//		double[][] doubleArray = {{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};
//		System.out.println(maxElement(intArray));
//		System.out.println(maxElement(doubleArray));
//		============問題四============
//		MyRectangle ww = new MyRectangle(10,10);
//		System.out.println(ww.getArea());
//		MyRectangle xx = new MyRectangle();
//		xx.setDepth(2);
//		xx.setWidth(2);
//		System.out.println(xx.getArea());
//		============問題五============
		System.out.println(genAuthCode());
	}

	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void randAvg() {
		int count=0;
		int[] array= new int[10];
		for (int i = 0 ; i<array.length; i++) {
			array[i]=(int)(Math.random()*101);
			System.out.print(array[i]+" ");
			count+=array[i];
		}
		System.out.print("\n"+count/10);
	}
	public static int maxElement(int x[][]) {
		int maxElement = 0;
		for(int i =0; i<x.length; i++) {
			for(int j =0; j< x[i].length;j++) {
				if(maxElement<x[i][j])
					maxElement=x[i][j];
			}
		}
		return maxElement;
	}
	public static double maxElement(double x[][]) {
		double maxElement = 0;
		for(int i =0; i<x.length; i++) {
			for(int j =0; j< x[i].length;j++) {
				if(maxElement<x[i][j])
					maxElement=x[i][j];
			}
		}
		return maxElement;
	}
	public static String genAuthCode() {
		String genAuthCode = "";
		String x = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for(int i =0; i<10;i++) {
			int index = (int)(Math.random()*x.length());
			genAuthCode+=x.charAt(index);
		}
		return genAuthCode;
	}
}
	class MyRectangle{
		private double width;
		private double depth;
		public MyRectangle() {
			
		}
		public MyRectangle(double width, double depth) {
			this.setWidth(width);
			this.setDepth(depth);
			
		}
		void setWidth(double width) {
			this.width=width;
		}
		void setDepth(double depth) {
			this.depth=depth;
		}
		double getArea() {	
			return depth*width;
		}
}
