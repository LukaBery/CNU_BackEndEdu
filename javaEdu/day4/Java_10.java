package javaEdu.day4;

public class Java_10 {
    public static void main(String[] args) {
        TV3 tv = new SmartTV3();

        // default 메소드 describe를 호출하세요. 인자로 문자열 "Smart"를 넣습니다.
        tv.describe("Smart");

        // static 메소드 showSize를 호출하세요. 인자로 숫자 10을 넣습니다.
        TV3.showSize(10);
    }
}

interface TV3{
    public static final String UNIT = "inch";

    // default 메소드를 선언하세요.
    default void describe(String name) {
        //  빈칸에 private 메소드 getName을 호출하세요.
        System.out.println(getName(name) + " 입니다.");
    }

    // private 메소드를 선언하세요.
    private String getName(String name) {
        return name + " TV";
    }

    // static 메소드를 선언하세요.
    static void showSize(int inch) {
        // 빈칸에 private static 메소드 getSize를 호출하세요.
        System.out.println("TV 사이즈는 " + getSize(inch) + " 입니다.");
    }

    // private static 메소드를 선언하세요.
    private static String getSize(int inch) {
        return inch + UNIT;
    }

}

// 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
class SmartTV3 implements TV3{

}
