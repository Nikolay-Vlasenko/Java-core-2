package ru.geekbrains.java_core2.lesson1;

public interface Movin {
//    void run();
//    void jump();

    String getType();
    String getName();
    int getMaxrun();
    int getMaxjump();


    default boolean run (int length) {
        if (length <= getMaxrun()) {
            System.out.printf("%s %s пробежал по беговой дорожке %d метров\n",getType(),getName(),length);
            return true;
        } else {
            System.out.printf("%s %s не смог пробежать %d метров\n", getType(),getName(),length);
            return false;
        }
    }

    default boolean jump (int heigth) {
        if (heigth <= getMaxjump()) {
            System.out.printf("%s %s прыгнул на %d метров\n",getType(),getName(),heigth);
            return true;
        } else {
            System.out.printf("%s %s не смог прыгнуть %d метров\n", getType(),getName(),heigth);
            return false;
        }
    }

}
