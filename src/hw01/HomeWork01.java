package hw01;

public class HomeWork01 {
	// • 請設計一隻Java程式，計算12，6這兩個數值的和與積
	public static void main(String[] args) {
		Work01 work01 = new Work01();
		Work02 work02 = new Work02();
		Work03 work03 = new Work03();
		Work04 work04 = new Work04();
		Work05 work05 = new Work05();
		Work06 work06 = new Work06();

		work01.solution();
		work02.eggsum();
		work03.time();
		work04.circle();
		work05.money();
		work06.solution();
	}

}
//• 請設計一隻Java程式，計算12，6這兩個數值的和與積
class Work01 {
	public void solution() {
		int x, y, sum, sum2;
		x = 12;
		y = 6;
		sum = x + y;
		sum2 = x * y;
		System.out.println("12和6的和為" + sum + "積為" + sum2);
	}
}
//• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
class Work02 {
	public void eggsum() {
		int egg, sum, sumMod;
		egg = 200;
		sum = egg / 12;
		sumMod = egg % 12;
		System.out.println(egg + "顆蛋" + "共是" + sum + "打又" + sumMod + "顆蛋");
	}
}
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
class Work03{
	public void time() {
		int time,day,hour,minute,second;
		time=256559;
		day=time/86400;
//		簡化hour=(time-(day*86400))/3600;
		hour=(time%86400)/3600;
//		簡化minute=(time-(hour*3600)-(day*86400))/60;
		minute=(time%3600)/60;
//		簡化second=time-(hour*3600)-(day*86400)-(minute*60);
		second=time%60;
		System.out.println(time+"秒為"+day+"天"+hour+"小時"+minute+"分"+second+"秒");
	}
}
//• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
class Work04 {
	public void circle() {
		final double PI = 3.1415;
		int radius = 5;
		int circleArea, circumference;
		circleArea = (int)(Math.pow(radius, 2) * PI);
		circumference = (int)((radius * 2) * PI);
		System.out.println("半徑" + radius + "的圓面積 = " + circleArea + " 圓周長 = " + circumference);
	}
}
//• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，
//本金加利息共有多少錢(用複利計算，公式請自行google)
class Work05 {
	public void money() {
		double fv, pv, r;
		int year;
		pv = 1500000;
		r = 0.02;
		year = 10;
		fv = pv * Math.pow(1 + r, year);
		System.out.println("本金加利息共" + fv + "元");

	}
}
//• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
class Work06{
	public void solution(){
		//5+5為兩個預設整數型態int的值，回傳值10給println的方法並印出來。
		System.out.println(5+5);
		//=========================================================
		//預設整數型態int的5和型態char的5，相加預設型態為int，
		//回傳值為型態int的5和型態char的5轉unicode的十進位的值，型態int給println的方法印出來。
		System.out.println(5+'5');
		//=========================================================
        //預設整數int型態的5和字符串"5"相加後串聯為55。
		System.out.println(5+"5");
	}
}