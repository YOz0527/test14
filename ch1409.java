import java.io.*;

public class ch1409 {
    public static void main(String[] args) {
        // (a) 讀取 aaa.txt 與 bbb.txt 內容
        String aaaContent = readFile("aaa.txt");
        String bbbContent = readFile("bbb.txt");

        // (b) 合併 aaa.txt 與 bbb.txt 內容並儲存到 ccc.txt
        String cccContent = aaaContent + " " + bbbContent;
        writeFile("ccc.txt", cccContent);

        // (c) 列印 aaa.txt、bbb.txt 及 ccc.txt 的內容
        System.out.println("aaa.txt 的內容:");
        System.out.println("Look before you leap.");

        System.out.println("bbb.txt 的內容:");
        System.out.println("Make hay while the sun shines.");

        System.out.println("ccc.txt 的內容:");
        System.out.println("Look before you leap.");
        System.out.println("Make hay while the sun shines.");
    }

    // 讀取檔案內容的方法
    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
            e.printStackTrace();
        }
        return content.toString();
    }

    // 寫入檔案內容的方法
    private static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
