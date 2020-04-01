package 配列の操作;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[10]; // 大きさだけを指定
        int[] array2 = {1, 2, 3, 4, 5}; // 初期値を指定
        int[] array3 = new int[] {10, 9, 8, 7, 6}; // 初期値と型を指定

        int[] array4;
        array4 = new int[] {1, 2, 3, 4, 5};
        // array4 = {1, 2, 3, 4, 5}; これはコンパイルエラー

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
