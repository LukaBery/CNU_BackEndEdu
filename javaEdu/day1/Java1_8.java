package javaEdu.day1;

public class Java1_8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        //a가 b보다 큰지 비교한 결과를 c에 저장하세요.
        boolean c = a>b;

        //a가 b와 같은지 비교한 결과를 d에 저장하세요.
        boolean d = a ==b;

        //a가 b보다 크거나 같은지 비교한 결과를 e에 저장하세요.
        boolean e = a>=b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //(아래부터는 논리 연산자를 사용하세요)
        //c와 d이 모두 참인지 아닌지 비교한 결과를 f에 저장하세요.
        boolean f = c &&d;

        //d와 e가 1개라도 참인지 비교한 결과를 g에 저장하세요.
        boolean g = d || e;

        System.out.println(f);
        System.out.println(g);
    }
}
