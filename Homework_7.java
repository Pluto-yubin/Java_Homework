package Homework;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Throwable{
    MyException(String s) {
        System.out.println(s);
    }

}

public class Homework_7{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String c = bufferedReader.readLine();
            int len = c.length();
            for(int i = 0; i < len; i++)
            if (c.charAt(i) > 'z' || c.charAt(i) < 'A')
                throw new MyException("You are wrong in index " + (i+1));
        }catch (MyException e) {
            e.printStackTrace();
        }
    }
}

