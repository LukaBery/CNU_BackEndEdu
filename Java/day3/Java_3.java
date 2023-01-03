package Java.day3;

public class Java_3 {
    int speed;
    boolean operable;
    char grade;

    Java_3(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }

    /**
     1. 매개변수를 받지 않는 생성자를 작성합니다.
     - speed는 10, operable은 true, grade는 'B' 값으로 초기화하세요
     */
    Java_3(){
        this(10, true, 'B');
    }

    /**
     2. 매개변수를 speed 하나만 받는 생성자를 작성합니다.
     - operable은 true, grade는 'B' 값으로 초기화하세요
     */
    Java_3(int a){
        this(a, true, 'B');

    }
    /**
     3. 매개변수를 speed와 operable 두개를 받는 생성자를 작성합니다.
     - grade는 'B' 값으로 초기화하세요
     */
    Java_3(int a, boolean b){
        this(a, b, 'B');

    }


    // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    public static void main(String[] args) {
        Java_3 car1 = new Java_3();
        Java_3 car2 = new Java_3(20);
        Java_3 car3 = new Java_3(20, false);
        Java_3 car4 = new Java_3(20, true, 'A');

        System.out.println(car3.speed);
        System.out.println(car3.operable);
        System.out.println(car3.grade);
    }

}
