package hw03;
import java.util.Arrays;
import java.util.Scanner;

	public class HomeWork03 {
		public static void main(String[] args) {
//			triangleSolve();
//			randomGuessPlus();
			bingo();
		}

//	測量三邊長：設三角形的三邊長分別為 (a,b,c)，且 (c) 是最長的一邊。
//	檢查是否為直角三角形：使用勾股定理，確認 (a^2+b^2=c^2) 是否成立。
//	檢查是否為等腰三角形：確認是否有兩條邊相等，也就是 (a=b)。
//	綜合判斷：如果以上兩個條件都滿足，則該三角形為等腰直角三角形。 
	public static void triangleSolve(){
		int[] array = new int[3];
		Scanner answer = new Scanner(System.in);
		System.out.println("請輸入三角形邊長X幾公分");
		int x = answer.nextInt();
		System.out.println("請輸入三角形邊長Y幾公分");
		int y = answer.nextInt();
		System.out.println("請輸入三角形邊長Z幾公分");
		int z = answer.nextInt();
		answer.close();
		array[0]=x;
		array[1]=y;
		array[2]=z;
		Arrays.sort(array);
		double sumXY2= Math.pow(array[0], 2)+Math.pow(array[1], 2);
		double z2=Math.pow(array[2],2);
		if(array[0]==array[1] && array[0]!=array[2])
			if(sumXY2==z2)System.out.println("等腰直角三角形");
			else System.out.println("等腰三角形");
		else if(array[0]==array[1] && array[0]==array[2])
			System.out.println("正三角形");
		else if(sumXY2==z2)System.out.println("直角三角形");
		else System.out.println("其他三角形");
		}
//生成 [a,b] 範圍的隨機整數：
//使用公式 (int)(Math.random() * (b - a + 1)) + a
	public static void randomGuess() {
		int answer = (int)(Math.random()*10);
		Scanner guessNum = new Scanner(System.in);
		while(true) {
			System.out.println("請輸入要猜測的數字");
			int guess = guessNum.nextInt();
			if(guess == answer) {
				System.out.println("正確");
				guessNum.close();
				break;
			}else System.out.println("猜錯了");
			
		}
	}
	
	public static void randomGuessPlus() {
		int answer = (int)(Math.random()*101);
		Scanner guessNum = new Scanner(System.in);
		while(true) {
			System.out.println("請輸入要猜測的數字");
			int guess = guessNum.nextInt();
			if(guess < answer) 
				System.out.println("你猜得比正確數字小");
			else if(guess > answer) 
				System.out.println("你猜得比正確數字大");
			else {
				System.out.println("猜對了");
				guessNum.close();
				break;
			}
		}
	}
	public static void bingo() {
		Scanner answer = new Scanner(System.in);
		System.out.println("阿文....請輸入你討厭哪個數字");
		int num = answer.nextInt();
		int count = 0;
		answer.close();
		for(int i = 1 ; i<50 ; i++) {
			if((i/10)==num || (i%10)==num)
				continue;
			System.out.print(i+" ");
			count++;
			if((count%6)==0)
				System.out.println();
		}
		System.out.println("總數"+count);
//		===============================================
//		int arrayNum = 0;
//		int[] numArray = new int[count];
//		for(int i = 1 ; i<50 ; i++) {
//			if((i/10)==num || (i%10)==num)
//				continue;
//			numArray[arrayNum]=i;
//			arrayNum++;
//		}
//		int[] bingoNum = new int[6];
//		for(int i =0 ; i<6 ; i++) {
//			bingoNum[i]=(int)(Math.random()*count)+1;
//		}
//		while(true) {
//			for(int i =0 ;i<6; i++) {
//				for(int j = 0 ; j<6; j++) {
//					if(i==j)continue;
//					if(bingoNum[i]==bingoNum[j])
//						bingoNum[i]=(int)(Math.random()*count)+1;
//				}
//			}
//		}

	}
}
