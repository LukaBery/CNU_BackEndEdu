package Java.day3;

public class Java_4 {
    /**
     1. 정적 필드를 선언합니다.
     - 필드명은 unit이고 String클래스로 선언하세요.
     - 필드값은 "rpm" 문자열로 초기화하세요.
     */
    static String unit = "rpm";


    /**
     2. 정적 메소드를 선언합니다.
     - 메소드명은 getUnit이고 매개변수 없이 선언하세요.
     - 메소드에서는 1번에서 선언한 필드를 결과값으로 반환합니다.
     */
    static String getUnit(){
        return unit;
    }


    public static void main(String[] args) {
        // Car 클래스의 정적 필드 unit을 출력합니다.
        System.out.println(Java_4.unit);

        // Car 클래스의 정적 메소드를 호출해서 반환되는 결과값을 출력합니다.
        System.out.println(Java_4.getUnit());
    }
}
