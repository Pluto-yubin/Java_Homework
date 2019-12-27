package Homework;

import java.io.*;

public class Homework_9 {
    private static int length = 0;
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\CASTLE\\src\\Homework\\Homework_9.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created successfully");
        }
        FileReader fileReader = new FileReader(file);
        String str = new String();
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while ((str = in.readLine()) != null) {
            length += str.length();
        }
        File file1 = new File("D:\\CASTLE\\src\\Homework\\Homework__9.txt");
        file1.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(file1));
        out.write(length);
    }
}