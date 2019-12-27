package Homework;
import java.lang.reflect.Array;
import java.util.*;
public class Homework_3 {

    public static void main(String[] args) {
//        int[] a = {2, 4, 6, 8, 1, 4, 56, 7, 9, 0, 3, 2, 4, 6, 8, 1, 2, 8, 5, 9};
        System.out.println("大小10的数组");
        int[] a = new int[100];
        Arrays.fill(a, 10);
        long start_time = System.nanoTime();
        quick_sort(0, a.length-1, a);
        long end_time = System.nanoTime();
        System.out.println("快排"+String.valueOf(end_time-start_time)+"ns");
        long cs = System.nanoTime();
        Arrays.sort(a);
        long ce = System.nanoTime();
        System.out.println("本地"+String.valueOf(ce - cs) + "ns");
        long css = System.nanoTime();
        bubble_sort(a);
        long cee = System.nanoTime();
        System.out.println("冒泡"+String.valueOf(cee - css) + "ns");
        long csss = System.nanoTime();
        shell_sort(a);
        long ceee = System.nanoTime();
        System.out.println("希尔"+String.valueOf(ceee - csss) + "ns");
        long cssss = System.nanoTime();
        merge_sort(0, a.length-1, a);
        long ceeee = System.nanoTime();
        System.out.println("归并"+String.valueOf(ceeee - cssss) + "ns");
        long csssss = System.nanoTime();
        Heap(a);
        long ceeeee = System.nanoTime();
        System.out.println("堆排"+String.valueOf(ceeeee - csssss) + "ns");
        long cssssss = System.nanoTime();
        int max = Arrays.stream(a).min().getAsInt();
        counting_sort(a,max);
        long ceeeeee = System.nanoTime();
        System.out.println("计数"+String.valueOf(ceeeeee - cssssss) + "ns");
    }
    public static void counting_sort(int[] a, int MAXvalue){
        int[] b = new int[MAXvalue + 1];
        Arrays.fill(b, MAXvalue+1);
        for(int i = 0; i < a.length; i++){
            if(b[a[i]] == MAXvalue+1)
                b[a[i]] = 0;
            b[a[i]]++;
        }
        int j = 0;
        for(int i = 0; i < b.length; i++){
            while (b[i] != MAXvalue + 1 && b[i] > 0){
                a[j++] = i;
                b[i]--;
            }
        }
    }
    public static void Heap_sort(int[] a, int len, int start) {
        if(len < start || len >= a.length)
            return;;
        int k = len / 2 - 1 + start;
        while (k >= start) {
            if (k * 2 + 2 - start < len) {
                if (a[k] < a[2 * k + 1])
                    change(a, k, 2*k + 1);
                if (a[k] < a[2 * k + 2])
                  change(a, k, 2*k + 2);
            } else if(k * 2 + 1 - start < len){
                if (a[k] < a[2 * k + 1]) {
                    if (a[k] < a[2 * k + 1])
                       change(a, k, 2*k + 1);
                }
            }
            k--;
        }
        Heap_sort(a,len - 2*start - 1,2* start + 1);

    }
    public static void Heap(int[] a){
        int i = 1;
        while (a.length-i > 0){
            Heap_sort(a, a.length-i, 0);
            change(a, 0, a.length-i);
            i++;
        }


    }
    public static void change(int[] a, int p, int q){
        int t = a[p];
        a[p] = a[q];
        a[q] = t;
    }

    public static void merge_sort(int l, int r, int[] a) {
        if (l != r) {
            int mid = (l + r) / 2;
            merge_sort(l, mid, a);
            merge_sort(mid + 1, r, a);
            merge(l, r, mid, a);
        } else return;
        ;

    }

    public static void merge(int l, int r, int mid, int[] a) {
        int[] la = new int[mid - l + 1];
        int[] ra = new int[r - mid];
        for (int i = l; i < mid + 1; i++)
            la[i - l] = a[i];
        for (int i = mid + 1; i < r + 1; i++) {
            ra[i - mid - 1] = a[i];
        }
        int k = l, i = 0, j = 0;
        while (k <= r && i < la.length && j < ra.length) {
            if (la[i] <= ra[j]) {
                a[k++] = la[i++];
            } else {
                a[k++] = ra[j++];
            }
        }
        while (i < la.length) a[k++] = la[i++];
        while (j < ra.length) a[k++] = ra[j++];
    }

    public static void shell_sort(int[] a) {
        for (int j = (int) (a.length / 2); j > 0; j = (int) (j / 2)) {
            for (int i = j; i < a.length && i - j >= 0; i++) {
                int current = a[i];
                int k = i;
                while (k - j >= 0 && current < a[k - j]) {
                    a[k] = a[k - j];
                    k -= j;
                }
                a[k] = current;
            }
        }
    }

    public static void bubble_sort(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
    }

    public static void quick_sort(int low, int high, int[] array) {
        int i, j, index;
        if (low > high)
            return;
        ;
        i = low;
        j = high;
        index = array[i];
        while (i < j) {
            while (array[j] >= index && i < j) {
                j--;
            }
            if (j > i && array[j] < index) {
                array[i++] = array[j];
            }
            while (array[i] <= index && i < j) {
                i++;
            }
            if (i < j && array[i] > index) {
                array[j--] = array[i];
            }
        }
        array[i] = index;
        quick_sort(low, i - 1, array);
        quick_sort(i + 1, high, array);
    }
}
