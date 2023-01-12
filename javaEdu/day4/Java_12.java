package javaEdu.day4;

public class Java_12 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        /*
            1. 아래 코드를 예외처리합니다.
            2. catch문에는 예외내용을 출력합니다
                - e 매개변수를 받아 System.out.println으로 출력하세요
        */
        try{
            int k = divide(i, j);
        } catch(ArithmeticException  e){
            System.out.println(e);

        } finally {

        }
    }

    /*
        3. 아래 메소드에서 발생하는 오류를 throws 해보세요.
            - ArithmeticException 예외가 발생할 수 있는 코드입니다.
    */
    public static int divide(int i, int j) throws  ArithmeticException{
        int k = i / j;
        return k;
    }
}
