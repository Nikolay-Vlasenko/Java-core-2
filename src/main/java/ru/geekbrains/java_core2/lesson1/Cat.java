package ru.geekbrains.java_core2.lesson1;

public class Cat implements Movin {

    private static String type;
    private static String name;
    private static int maxrun;
    private static int maxjump;

    public Cat(String type, String name, int maxrun, int maxjump) {
        this.type = "Cat";
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }


//    @Override
//    public boolean run () {
//        System.out.println("Cat run");
//    }

//    @Override
//    public void jump () {
//        System.out.println("Cat jump");
//    }

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
