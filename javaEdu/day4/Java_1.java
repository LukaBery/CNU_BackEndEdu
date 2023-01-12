package javaEdu.day4;

public class Java_1  extends Car {
    public static void main(String[] args) {
        // GenesisCar 클래스로부터 인스턴스를 생성해서 변수로 선언합니다.
        Java_1  car = new Java_1();

        // 상속받은 부모클래스의 turnOn메소드를 호출합니다.
        car.turnOn();
    }
}

class Car {
    void turnOn() {
        System.out.println("엔진을 켰습니다");
    }

    void turnOff() {
        System.out.println("엔진을 껐습니다");
    }
}