import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Data {
    private String name;
    private int english;
    private int math;

    // (a) 有引數的建構子
    public Data(String str, int e, int m) {
        name = str;
        english = e;
        math = m;
    }

    // (b) 寫入資料到檔案
    public void writeData() {
        try (FileWriter writer = new FileWriter("A_student.txt", true)) {
            writer.write(name + " " + english + " " + math + "\n");
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤：" + e.getMessage());
            e.printStackTrace();
        }
    }

    // (c) 顯示資料
    public void show() {
        System.out.println("姓名: " + name);
        System.out.println("英文成績: " + english);
        System.out.println("數學成績: " + math);
        System.out.println("平均: " + ((english + math) / 2.0));
    }

    // (d) 讀取資料
    public static void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("A_student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];
                int english = Integer.parseInt(data[1]);
                int math = Integer.parseInt(data[2]);

                // 建立 Data 物件
                Data student = new Data(name, english, math);

                // 顯示資料
                student.show();
                System.out.println("--------");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 建立 Data 物件
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);

        // (b) 寫入資料
        stu1.writeData();
        stu2.writeData();

        // (c) 顯示資料
        System.out.println("學生1的資料:");
        stu1.show();

        System.out.println("學生2的資料:");
        stu2.show();


    }
}
