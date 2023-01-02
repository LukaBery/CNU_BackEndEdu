public class Java1_7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        //c는 a와 b의 합
        int c = a + b;

        //d는 a와 b의 차
        int d = a - b;

        //e는 a와 b의 곱
        int e = a*b;

        //f는 a를 b로 나눈 나머지
        int f = a%b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // (아래부터는 복합 대입 연산자를 사용하세요)
        // a를 b로 나눈 값을 a에 대입
        a = a/b;
        System.out.println(a);

        // a를 b로 더한 값을 a에 대입
        a += b;
        System.out.println(a);

        // a를 b로 곱한 값을 a에 대입
        a = a*b;
        System.out.println(a);
    }
}
