package hw04;
import java.util.Scanner;
public class HomeWork04 {
	public static void main(String[] args) {
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//		question01(array);
//		question02();
//		question03();
//		question04();
//		question05();
//		question06();
		}
//	============================問題一============================
	public static void question01(int[] array){
		int temp = 0;
		for(int i =0 ; i<array.length ; i++) {
			temp += array[i];
		}
		int avg = temp/9;
		System.out.println("====平均值====");
		System.out.println(avg);
		System.out.println("====大於平均值====");
		for(int i = 0 ; i<array.length; i++) {
			if(array[i]>avg)
				System.out.print(array[i]+" ");
		}
	}
//	============================問題二============================
	public static void question02() {
		String result="";
		String s = "Hello World";
		for(int i=s.length();i>0; i--) {
			result+=s.charAt(i-1);
		}
		System.out.println(result);
	}
//	============================問題三============================
	public static void question03() {
		String[] planet= {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		char[] word= {'a', 'e', 'i', 'o', 'u'};
		int maxcount = 0;
		System.out.println("====母音共有====");
		for(int i = 0; i<word.length; i++) {
			int count = 0;
			count+=count(planet,word[i]);
			maxcount+=count;
			System.out.print(word[i]+"有 "+count+" 個, ");
		}
		System.out.println();
		System.out.println("總共 "+maxcount+" 個");
	}
	public static int count(String[] planet,char xxx) {
		int count = 0;
		for(int i = 0;i<planet.length;i++) 
			for(int j=0;j<planet[i].length();j++) 
				if(planet[i].charAt(j)==xxx) 
					count++;
		return count;
	}
//	============================問題四============================
	public static void question04() {
		int[][] array = {{25, 32, 8, 19, 27},{2500, 800, 500, 1000, 1200}};
		Scanner want = new Scanner(System.in);
		System.out.println("請輸入要借的金額");
		int money=want.nextInt();
		want.close();
		int count=0;
		System.out.println("====可借的員工編號有====");
		for(int i =0; i<array[1].length; i++) {
			if(array[1][i]>=money) {
				System.out.print(array[0][i]+" ");
				count++;
			}
		}
		System.out.println("共 "+count+" 人");
		
	}
//	============================問題五============================
//	世紀年規則：能被100整除的年份，必須也能被400整除，才是閏年。
//	閏年：例如2000年（能被400整除）。
//	平年：例如1900年（能被100整除但不能被400整除）。
//	月份共有7大5小，其中二月只有28閏年29天
	public static void question05(){
		Scanner scanner = new Scanner(System.in);
		int[][] md = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
						{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
					   };
		int years=0, month=0, days=0,total=0;
		System.out.println("請輸入年份yyyy");
		years=scanner.nextInt();
		System.out.println("請輸入月份mm");
		month=scanner.nextInt();
		System.out.println("請輸入幾日dd");
		days=scanner.nextInt();
		while((years%400)!=0 && (years%100)!=0 && month ==2 && days > 28) {
			System.out.println("錯誤!!  非閏年而無法填入超過28日，請再次輸入日期");
			days=scanner.nextInt();
		}
		while(month==4 || month==6 || month==9|| month==11 && days>30 ) {
			System.out.println("該月份無法輸入超過30日，請再次輸入月份");
			days=scanner.nextInt();
		}
		while(month==2 && days > 29 ) {
			System.out.println("該月份無法輸入超過29日，請再次輸入月份");
			days=scanner.nextInt();
		}
		while(days>31 ) {
			System.out.println("無法輸入超過31日，請再次輸入月份");
			days=scanner.nextInt();
		}
		scanner.close();
		if((years%400)!=0 && (years%100)!=0) {
			for(int i = 0; i<month-1; i++)
				total+=md[0][i];
		}else {
			for(int i = 0; i<month-1; i++)
				total+=md[1][i];
		}
		total+=days;
		System.out.println("輸入的日期為該年的"+total+"天");
	}
//	============================問題六============================
	public static void question06(){
		int[][] array = {{10, 35, 40, 100, 90, 85, 75, 70},
						 {37, 75, 77, 89, 64, 75, 70, 95},
						 {100, 70, 79, 90, 75, 70, 79, 90},
						 {77, 95, 70, 89, 60, 75, 85, 89},
						 {98, 70, 89, 90, 75, 90, 89, 90},
						 {90, 80, 100, 75, 50, 20, 99, 75}
						};
		int[] students =new int[8] ;
		String[] num = {"1號","2號","3號","4號","5號","6號","7號","8號",};
		int[] maxScord = new int[6];

//		=============紀錄每次最高分=============
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j]>maxScord[i]) {
					maxScord[i] = array[i][j];
				}
			}
		}
//		=============紀錄每位同學每次最高分次數=============
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j]==maxScord[i]) {
					students[j]+=1;
				}
			}
		}
		System.out.println("=====每位同學考最高分的次數====");
		for(int i = 0 ; i< students.length; i++) 
			System.out.print(num[i]+students[i]+"次 ");
		
	}
//	===============================================================
}
