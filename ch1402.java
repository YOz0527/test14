import java.util.Scanner;

public class ch1402 {
    public static void main(String[] args) {
        // 使用 Scanner 來讀取鍵盤輸入
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入字串: ");

        // 讀取字串
        String inputString = scanner.nextLine();

        // 關閉 Scanner
        scanner.close();

        // 使用 toUpperCase() 將字串轉換成大寫
        String upperCaseString = inputString.toUpperCase();

        // 印出結果
        System.out.println("轉換成大寫的字串: " + upperCaseString);
    }
}
