package hw10;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;
import java.text.DecimalFormat;

public class HomeWork10 {
	public static void main(String[] args) {
//		qs01();//質數判斷
//		qs02();//數學記號轉換
//		qs03();//正規法 日期格式轉換
	}
	
    public static void qs01() {
        for (int i = 1; i <= 5; i++) {
            int num = (int) (Math.random() * 100) + 1;
            //判斷是否為質數
            boolean isPrime = checkPrime(num);

            //輸出結果
            if (isPrime) {
                System.out.println(num + "是質數");
            } else {
                System.out.println(num + "不是質數");
            }
        }
    }
    // 判斷質數的方法
    public static boolean checkPrime(int n) {
        // 1 不是質數
        if (n == 1) {
            return false;
        }
        // 判斷演算法：檢查從 2 到 n 的平方根
        // 這裡使用了 Math.sqrt()，因為如果一個數 n 不是質數，
        // 它一定有一個因數小於或等於它的平方根。這能大幅減少迴圈次數，提高效率。
        int limit = (int) Math.sqrt(n);

        for (int j = 2; j <= limit; j++) {
            if (n % j == 0) {
                // 如果能被整除，代表不是質數
                return false;
            }
        }
        // 如果迴圈跑完都沒有被整除，代表是質數
        return true;
    }
	
    public static void qs02() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入一個任意數：");
        String inputStr = scanner.next();

        // 1. 使用正規表示法判斷輸入是否為數字
        // -?       代表負號可有可無
        // \\d+     代表至少有一個數字
        // (\\.\\d+)? 代表小數點及其後的數字可有可無
        if (!inputStr.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("輸入格式錯誤！請輸入數字格式 (如: 123, 123.45, -100)。");
            scanner.close();
            return; // 結束程式
        }

        // 2. 將字串轉換為 double
        double number = Double.parseDouble(inputStr);

        // 3. 顯示選單
        System.out.println("想要以下列何種表示方法顯示：");
        System.out.println("(1) 千分位");
        System.out.println("(2) 百分比");
        System.out.println("(3) 科學記號");
        System.out.print("請輸入選項 (1-3)：");

        int choice = -1;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("選項輸入錯誤。");
            return;
        }

        // 4. 根據選項進行格式化
        DecimalFormat df = null;

        switch (choice) {
            case 1:
                // 千分位格式：每三位數加一個逗號
                df = new DecimalFormat("#,###.##");
                System.out.println("千分位表示： " + df.format(number));
                break;
            case 2:
                // 百分比格式：會自動乘以 100 並加上 %
                df = new DecimalFormat("#.##%");
                System.out.println("百分比表示： " + df.format(number));
                break;
            case 3:
                // 科學記號格式：E 代表指數
                df = new DecimalFormat("0.###E0");
                System.out.println("科學記號表示： " + df.format(number));
                break;
            default:
                System.out.println("無效的選項，請重新執行。");
                break;
        }
        
        scanner.close();
    }

    public static void qs03() {
        Scanner scanner = new Scanner(System.in);

        // 1. 請求使用者輸入日期
        System.out.print("請輸入日期(年月日，例如:20110131): ");
        String inputStr = scanner.next();

        // 2. 使用正規表示法 (Regex) 判斷格式
        // \\d{8} 代表必須是連續 8 個數字 (0-9)
        while (!inputStr.matches("\\d{8}")) {
            System.out.println("日期格式不正確，請再輸入一次");
            System.out.print("請輸入日期(年月日，例如:20110131): ");
            inputStr = scanner.next();
        }

        // 3. 嘗試解析字串為日期物件 (驗證日期是否真實存在，例如排除 20230230)
        LocalDate date = null;
        try {
            // 使用 STRICT 模式，確保日期是存在的 (例如不會自動把 2/30 轉成 2/28)
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("uuuuMMdd")
                    .withResolverStyle(ResolverStyle.STRICT);
            date = LocalDate.parse(inputStr, inputFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("該日期並不存在 (月份錯誤或該月沒有這一天)。");
            return; // 結束程式
        }

        // 4. 顯示選單讓使用者選擇格式
        System.out.println("\n請選擇輸出格式:");
        System.out.println("(1) 年/月/日");
        System.out.println("(2) 月/日/年");
        System.out.println("(3) 日/月/年");
        System.out.print("請輸入選項 (1-3): ");

        int choice = -1;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("輸入錯誤，請輸入數字 1~3。");
            return;
        }

        // 5. 根據選擇進行格式化輸出
        DateTimeFormatter outputFormatter = null;

        switch (choice) {
            case 1:
                // 年/月/日
                outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                break;
            case 2:
                // 月/日/年
                outputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                break;
            case 3:
                // 日/月/年
                outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                break;
            default:
                System.out.println("無效的選項，請重新執行並輸入 1、2、3。");
                return;
        }

        // 6. 輸出結果
        if (outputFormatter != null) {
            System.out.println("轉換結果: " + date.format(outputFormatter));
        }
        
        scanner.close();
    }
}