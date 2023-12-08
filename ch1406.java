import java.io.FileWriter;
import java.io.IOException;

public class ch1406 {
    public static void main(String[] args) {
        // 定義字元陣列 hi
        char[] hi = {'H', 'e', '1', '1', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        // 指定檔案名稱
        String fileName = "hello.txt";

        try {
            // 建立 FileWriter 物件，並指定檔案名稱
            FileWriter fileWriter = new FileWriter(fileName);

            // 使用 write 方法將字元陣列寫入檔案
            fileWriter.write(hi);

            // 關閉 FileWriter
            fileWriter.close();

            System.out.println("成功寫入檔案 " + fileName);
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
