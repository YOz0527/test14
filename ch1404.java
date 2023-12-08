import java.io.FileReader;
import java.io.IOException;

public class ch1404 {
    public static void main(String[] args) {
        String fileName = "donkey.txt";

        try (FileReader fileReader = new FileReader(fileName)) {
            int charCount = 0;
            int data;

            while ((data = fileReader.read()) != -1) {
                charCount++;
                System.out.print((char) data);
            }

            System.out.println("\n字元數: " + charCount);
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
