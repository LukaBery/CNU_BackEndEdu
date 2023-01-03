package Java.day3;

public class Java_2 {
    void run() {
    }
    // 1. 정수 타입 매개변수 하나를 받는 메소드 run을 추가해보세요.
    void run(int a){

    }
    // 2. 정수 타입, boolean타입 매개변수 두개를 받는 메소드 run을 추가해보세요.


    void run(int a, boolean b){

    }

    // 3. String클래스 타입 매개변수 하나를 받고,
    //    결과값으로 boolean타입 false를 반환하는 메소드 run을 추가해보세요.

    public boolean run(String a){
        return false;
    }

    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Java_2 car = new Java_2();
        car.run(10);
        car.run(10, true);
        boolean result = car.run("테스트");

        System.out.println(result);
    }
}
