package ru.geekbrains.java_core2.lesson1;

public class Wall implements Obstaclable {
    private int height;

    public Wall(int height) {
        this.height = height;
    }
@Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return 0;
    }

}
