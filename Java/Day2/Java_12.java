package Java.Day2;

public class Java_12 {

    /**
     String클래스의 equals 메소드를 사용해서, 문자열을 비교하는 메소드를 완성해보세요.
     - 비교한 결과는 result변수에 저장합니다.
     - 단, a 매개변수에는  null이 전달될 수 있습니다
     */
    public static boolean isEquals(String a, String b) {
        boolean result = a.equals(b); return result;}
    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("a");
        System.out.println(isEquals(a, b));
        System.out.println(a ==b);
        System.out.println(isUnEquals(a, b));
    }    public static boolean isUnEquals(String a, String b) {
        boolean result =  !a.equals(b);
        return result;
    }
}
