package ru.geekbrains.java_core2.lesson1;

public class HomeWorkApp1 {
    public static void main (String[] args) {

        Movin movins [] = {
                new Cat("Cat","Tom",200,10),
                new Cat("Cat","Baris",100,5),
                new Human("Human","Boris",300,6),
                new Human("Human","Ivan",500,10),
                new Robot("Robot", "Android_93465", 500, 20),
                new Robot("Robot", "Android_87546", 1000, 50)
        };

//        for (Movin movin : movins) {
//            movin.jump(3);
//            movin.run(50);

        Obstaclable [] obstaclables = {
                new Treadmill(100),
                new Wall(5),
                new Treadmill(300),
                new Wall(10),
                new Treadmill(500),
                new Wall(50)
        };
        //У меня почему-то не все выполняют задание, почему?
//        Как остановить прохождение препятсвия, если не смог пройти?
        for (Movin movin : movins) {
            for (Obstaclable obstaclable : obstaclables) {
                movin.run(obstaclable.getLength());
                movin.jump(obstaclable.getHeight());
            }
        }

    }

}




