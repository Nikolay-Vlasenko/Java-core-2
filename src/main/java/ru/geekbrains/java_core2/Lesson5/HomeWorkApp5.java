package ru.geekbrains.java_core2.Lesson5;

import java.util.Arrays;

public class HomeWorkApp5 {
    private static final int size = 10000000;
    private static final int h = size / 2;


    public static void main(String[] args) throws InterruptedException {
        firstСalculation();
        secondСalculation();

    }
    private static void firstСalculation () {
        int SIZE = 10_000_000;
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    private static void secondСalculation() throws InterruptedException {
        float [] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        long split = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния разделения массива %s" + " ms", String.valueOf(split - start)));

        Thread thread1 = new Thread(() ->methodTwoInternal(arr1, 1));
        Thread thread2 = new Thread(() ->methodTwoInternal(arr2, 2));

        thread1.start();
        thread2.start();


        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println(String.format("Исключение в потоках. %s" + " ms", e.getMessage()));
        }

        long connect = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния склейки массива %s" + " ms", String.valueOf(end - connect)));
        System.out.println(String.format("Завершение метода 2. Время выполнения %s" + " ms", String.valueOf(end - start)));
        System.out.println("Два массива одинаковые аrr1 и аrr2 " + Arrays.equals (arr1, arr2));
    }

    private static void methodTwoInternal(float[] arr, int number){
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния потока %d равно %s" + " ms", number, String.valueOf(end - start)));
    }
}
