package Homework;

public class Homework_2 {
    public static void main(String[] args) {
        int flag = 0;
        System.out.print(" |");
        for(int i = 1; i < 13; i++)
            System.out.printf("%4d", i);
        System.out.println("");
        for(int i = 1; i < 13; i++)
            System.out.printf("____ ");
        System.out.print('\n');
    long startTime =System.nanoTime();
        for(int i = 1; i < 13; i++){

            for(int j = i; j <= 12 ; j++){
                if(flag == 0)
                    System.out.print(1 + "|");
                flag = 1;
                System.out.printf("%4d", i * j);
            }

            System.out.println("");
            if(flag == 1)
                if(i+1 != 13)
                    System.out.print(i+1 + "|");
            flag = 1;
            for(int k = 0; k < i; ++k){

                System.out.printf("    ");
            }


        }
        long endTime = System.nanoTime();

    }
}
