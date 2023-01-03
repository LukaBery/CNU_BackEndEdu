package Java.day3;

public class Java_1 {
    /**
     Car 생성자를 선언하고 매개변수을 받아 해당하는 필드를 초기화합니다.
     - 정수타입 변수는 speed 필드를 초기화
     - boolean타입 변수는 operable 필드를 초기화
     - char타입 변수는 grade필드를 초기화
     */

        int speed;
        boolean operable;
        char grade;

        public Java_1(int speed,  boolean operable, char grade){
            this.speed = speed;
            this.operable = operable;
            this.grade = grade;
        }
        // this를 사용해서 생성자를 작성하세요. 매개변수명은 speed, operable, grade로 선언합니다.



        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        public static void main(String[] args) {
            Java_1 car = new Java_1(10, true, 'A');

            System.out.println(car.speed);
            System.out.println(car.operable);
            System.out.println(car.grade);
        }

}
