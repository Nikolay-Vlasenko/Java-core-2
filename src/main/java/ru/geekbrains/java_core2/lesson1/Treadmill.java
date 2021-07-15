package ru.geekbrains.java_core2.lesson1;

public class Treadmill implements Obstaclable {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getLength() {
        return length;
    }
}
