import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ch1407 {
    public static void main(String[] args) {
        // 定義字元陣列 hi
        char[] hi = {'H', 'e', '1', '1', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        // 指定檔案名稱
        String fileName = "hello.txt";

        try {
            // 以附加模式開啟 FileWriter，第二個參數為 true 代表附加至檔案末尾
            FileWriter fileWriter = new FileWriter(fileName, true);

            // 使用 write 方法將字元陣列寫入檔案
            fileWriter.write(hi);

            // 附加字串"Welcome!"並插入換行符號
            fileWriter.write("\r\nWelcome!");

            // 關閉 FileWriter
            fileWriter.close();

            // 讀取並印出整個檔案內容
            readAndPrintFile(fileName);
        } catch (IOException e) {
            System.out.println("處理檔案時發生錯誤：" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void readAndPrintFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
