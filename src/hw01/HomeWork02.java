package hw01;




public class HomeWork02 {
	public static void main(String[] args) {
		H2Work01 work01 = new H2Work01();
		H2Work02 work02 = new H2Work02();
		H2Work03 work03 = new H2Work03();
		H2Work04 work04 = new H2Work04();
		H2Work05 work05 = new H2Work05();
		H2work06 work06 = new H2work06();
		H2work07 work07 = new H2work07();
		
		work01.sum01();
		work02.sum02();
		work03.sum03();
		work04.printNum();
		work05.bingo();
		work06.solution();
		work07.solution();
	}

}
//• 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
class H2Work01{
	public void sum01(){
		int sum=0;
		for(int i = 2; i<=1000 ; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
//• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
class H2Work02{
	public void sum02() {
		int sum=1;
		for(int i = 1; i<=10 ; i++) {
			sum*=i;
		}
		System.out.println(sum);
	}
}
//• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
class H2Work03{
	public void sum03() {
		int sum=1;
		int i =1;
		while(i<=10) {
			sum*=i;
			i++;
		}
		System.out.println(sum);
	}
}
//• 請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100
class H2Work04{
	public void printNum() {
		int num=0;
		for(int i =1; num<100; i+=2) {
			num+=i;
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
class H2Work05{
	public void bingo() {
		int i=0;
		int count = 0;
		while(i<49) {
			i++;
			if((i%10)==4||(i/10)==4) {
				continue;
			}
			count+=1;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("共"+count+"個");
	}
}

class H2work06{
	public void solution() {
		for(int i=10; i>0;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

class H2work07{
	public void solution() {
		char word =65;
		for(int i =1; i<=6; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(word+" ");
			}
			word+=1;
			System.out.println();
		}
	}
}