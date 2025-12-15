package hw09;

public class HomeWork09 implements Runnable{
	    private String name;

	    public HomeWork09(String name) {
	        this.name = name;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            try {
	                int sleepTime = (int) (Math.random() * 2501) + 500;
	                Thread.sleep(sleepTime);
	                System.out.println(name + "吃第" + i + "碗飯");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        
	        System.out.println("----- " + name + " 吃完了！ -----");
	    }

	    public static void main(String[] args) {
	        System.out.println("===== 大胃王比賽開始 =====");

	        // 建立兩個 Runnable 物件
	        HomeWork09 contestant1 = new HomeWork09("饅頭人");
	        HomeWork09 contestant2 = new HomeWork09("詹姆士");

	        // 建立執行緒 (Thread) 並將 Runnable 放入
	        Thread t1 = new Thread(contestant1);
	        Thread t2 = new Thread(contestant2);

	        // 啟動執行緒
	        t1.start();
	        t2.start();
	        try {
	            // join() 的意思是：「主執行緒請停在這裡等待，直到 t1 執行結束」
	            t1.join();
	            // 當 t1 結束後，主執行緒繼續等到 t2 結束 (如果 t2 早就結束，這裡會瞬間通過)
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // 只有當 t1 和 t2 都跑完 run() 方法後，程式才會執行到這一行
	        System.out.println("===== 大胃王比賽結束！ =====");
	    }
}
