package Homework;

import java.util.Arrays;

public class Homework_8 implements Runnable {
    int[] number;
    int left;
    int right;
    Homework_8(int[] a, int l, int r)
    {
        number=a;
        left=l;
        right=r;
    }
    @Override
    public void run() {
        if (left == right)
            return;
        else
        {
            int length = right - left + 1;
            int mid = (left + right) / 2;
            int[] tem = new int[length];
            Thread thread1=new Thread(new Homework_8(number, left, mid));
            Thread thread2=new Thread(new Homework_8(number, mid + 1, right));
            thread1.start();
            thread2.start();
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0;i<length;++i)
                tem[i]=number[i+left];
            for(int i=left,j=mid+1,curr=left;curr<=right;++curr)
            {
                if(i>mid)
                    number[curr]=tem[j++-left];
                else if(j>right)
                    number[curr]=tem[i++-left];
                else
                {
                    if(tem[i-left]<tem[j-left])
                        number[curr]=tem[i++-left];
                    else
                        number[curr]=tem[j++-left];
                }
            }
        }
    }
    static public void main(String[] args) throws InterruptedException {
  //获取开始时间
        int[] numbers= new int[10000];
        Arrays.fill(numbers, 10);
        Homework_8 a=new Homework_8(numbers,0,7);
        long startTime=System.nanoTime();
        a.run();
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }
}

