package ru.geekbrains.java_core2.lesson1;

public class Human implements Movin {

    private static String type;
    private static String name;
    private static int maxrun;
    private static int maxjump;

    public Human(String type, String name, int maxrun, int maxjump) {
        this.type = "Human";
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }

    //        @Override
//        public void run () {
//            System.out.println("Human run");
//        }
//
//        @Override
//        public void jump () {
//            System.out.println("Human jump");
//        }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getMaxrun() {
        return maxrun;
    }

    public int getMaxjump() {
        return maxjump;
    }
}
