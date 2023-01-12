package javaEdu.day2;

public class Java_5 {
    // [자동차 현재 속도] 필드를 선언하고 정수값 10을 저장합니다.
    int speed = 10;

    // [운행 가능 여부] 필드를 선언하고 boolean값 true를 저장합니다.
    boolean operable= true;

    // [자동차 등급] 필드를 선언하고 char값 'A'를 저장합니다.
    char grade = 'A';

    public static void main(String[] args) {
        Java_5 car = new Java_5();

        // 빈 칸에 car인스턴스의 [자동차 현재 속도] 필드를 호출합니다.
        System.out.println(car.speed);

        // 빈 칸에 car인스턴스의 [운행 가능 여부] 필드를 호출합니다.
        System.out.println(car.operable);

        // 빈 칸에 car인스턴스의 [자동차 등급] 필드를 호출합니다.
        System.out.println(car.grade);
    }
}
