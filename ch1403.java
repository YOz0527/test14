import java.util.Scanner;

public class ch1403 {
    public static void main(String[] args) {
        // 使用 Scanner 來讀取鍵盤輸入
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個整數 n: ");

        // 讀取整數
        int n = scanner.nextInt();

        // 關閉 Scanner
        scanner.close();

        // 計算1+2+...+n的總和
        int sum = calculateSum(n);

        // 印出結果
        System.out.println("1+2+...+" + n + " 的總和為: " + sum);
    }

    // 計算1+2+...+n的總和的方法
    private static int calculateSum(int n) {
        // 使用等差數列的公式計算總和
        return n * (n + 1) / 2;
    }
}
