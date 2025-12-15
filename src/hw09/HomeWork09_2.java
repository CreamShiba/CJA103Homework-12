package hw09;

public class HomeWork09_2 {
	
    public static void main(String[] args) {
        // 建立共用的帳戶物件
        Account sharedAccount = new Account();

        // 建立媽媽與熊大的執行緒
        Mom mom = new Mom(sharedAccount);
        Bear bear = new Bear(sharedAccount);

        System.out.println("=== 匯款提款模擬開始 ===");
        mom.start();
        bear.start();
    }

}
class Account {
    private int balance = 0; // 帳戶餘額，初始為 0

    // 媽媽匯款的方法
    public synchronized void deposit(int amount) {
        // 規則：如果餘額超過 3000，媽媽停止匯款 (進入等待狀態)
        while (balance > 3000) {
            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            try {
                wait(); // 媽媽等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 執行匯款
        balance += amount;
        System.out.println("媽媽存了" + amount + "，帳戶共有：" + balance);

        // 匯款後，喚醒熊大 (如果熊大正在等錢)
        notifyAll();
        System.out.println("熊大被媽媽告知帳務已經有錢");
    }

    // 熊大提款的方法 (消費者)
    public synchronized void withdraw(int amount) {
        // 如果餘額不足以提款，熊大暫停提款 (進入等待狀態)
        while (balance < amount) {
        	System.out.println("熊大看到帳戶沒錢，暫停提款");
            try {
                wait(); // 熊大等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 執行提款
        balance -= amount;
        System.out.println("熊大領了" + amount + "，帳戶共有:" + balance);

        // 規則：如果餘額在 2000 以下，熊大要求匯款 (其實就是喚醒媽媽去檢查是否該匯款)
        if (balance <= 2000) {
        	System.out.println("熊大看到餘額在2000以下，要求匯款");
            notifyAll(); // 喚醒媽媽
            System.out.println("媽媽被熊大要求匯款!");
        }
    }
}

// 媽媽執行緒
class Mom extends Thread {
    Account account;

    public Mom(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            // 媽媽一次匯款 2000
            account.deposit(2000);
        }
    }
}

// 熊大執行緒
class Bear extends Thread {
    Account account;

    public Bear(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            // 熊大一次提款 1000
            account.withdraw(1000);
        }
    }
}