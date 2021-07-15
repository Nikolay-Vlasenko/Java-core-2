package ru.geekbrains.java_core2.lesson1;

public class Robot implements Movin {

    private static String type;
    private static String name;
    private static int maxrun;
    private static int maxjump;

    public Robot (String type, String name, int maxrun, int maxjump) {
        this.type = "Robot";
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }

//    @Override
//    public void run () {
//        System.out.println("Robot run");
//    }
//
//    @Override
//    public void jump () {
//        System.out.println("Robot jump");
//    }

    @Override
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
