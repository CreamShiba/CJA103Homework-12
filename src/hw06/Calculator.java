package hw06;

public class Calculator {
	public void powerXY(int x, int y) throws CalException{
		if(x != 0 && y > 0)
			System.out.println(x+"的"+y+"次方等於"+(int)Math.pow(x,y));
		else if(x>0 && y==0)
			System.out.println(x+"的"+y+"次方等於"+1);
		else if(x==0 && y==0) 
			throw new CalException("0的0次方沒有意義!");
		else if(y < 0)
			throw new CalException("次方為負值，結果回傳不為整數!");
		else
			throw new CalException("輸入格式不正確");
	}
}
