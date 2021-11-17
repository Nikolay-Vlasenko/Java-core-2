package ru.geekbrains.java_core2.lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        String array [][] = new String[][] {
                {"1","2","3","4"}, {"4","3","s","1"}, {"3","2","1","4","5"}, {"2","1","4","3"}
        };
        try {
            try {
                int result = testMyArray(array);
                System.out.println(result);
            }
            catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Не верные данные в массиве!");
        }
}


    public static int testMyArray (String [][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 3;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return count;
    }
}
