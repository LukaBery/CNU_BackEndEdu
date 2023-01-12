package javaEdu.day4;

public class Java_4 {
        public static void main(String[] args) {
            Car3 car = new Car3(150, true, 'B');

            System.out.println(car.speed);
            System.out.println(car.operable);
            System.out.println(car.grade);
            car.run();
        }
    }

    class Car3 {
        public int speed;
        public boolean operable;
        public char grade;

        Car3(int speed, boolean operable, char grade) {
            this.speed = speed;
            this.operable = operable;
            this.grade = grade;
        }

        public void run() {
            System.out.println("차가 달립니다.");
        }
    }

