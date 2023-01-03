package Java.day4;

public class Java_7 {
    // Practice클래스는 결과 평가를 위한 코드입니다. 수정하지 마세요.

        public static void main(String[] args) {
            TV tv = new LedTV();
            tv.on();
            tv.off();
            System.out.println(TV.UNIT);
        }
    }


    /**
     TV 인터페이스를 구현하세요 (문제 설명에 있는 내용대로 구현합니다)
     */
    interface TV{
        public String UNIT = "inch";

        public abstract void on();
        public abstract void off();

    }



    // LedTV클래스는 결과 평가를 위한 코드입니다. 수정하지 마세요.
    class LedTV implements TV{
        @Override
        public void on(){
            System.out.println("켜다");
        }
        @Override
        public void off(){
            System.out.println("끄다");
        }
    }

