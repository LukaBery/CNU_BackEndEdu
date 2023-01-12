package javaEdu.day2;

public class Java_3 {
        /**
         1. 매개변수가 있고 결과값을 반환하는 메소드를 선언하세요.
         - 메소드명 : methodA
         - 매개변수 : 정수 값을 받고, 변수명은 a
         - 결과값 반환 : boolean타입 값 true를 반환
         */
        public boolean methodA(int a){
            return true;
        }


        /**
         2. 매개변수가 있는 메소드를 선언하세요. (결과값은 반환하지 않습니다)
         - 메소드명 : methodB
         - 매개변수 : 정수 값을 받고, 변수명은 a
         */
        public void methodB(int a){

        }


        /**
         3. 매개변수가 없는 메소드를 선언하세요. (결과값은 반환하지 않습니다)
         - 메소드명 : methodC
         */
        public void methodC(){

        }


        public static void main(String[] args) {
            Java_3 practice = new Java_3();
            System.out.println(practice.methodA(2));
            practice.methodB(10);
            practice.methodC();
        }

}
