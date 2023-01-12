package javaEdu.day1;

public class Java1_14 {
    /**
     break문과 continue문을 활용하여 코드를 추가 작성하세요.
     */
    public static void main(String[] args) {
        int result = 0;

        for (int i=1; i<=30; i++) {
            // 숫자 15는 더하지 않고 넘어가게 해보세요.
            if (i == 15) continue;

                // 숫자 20에서 for문이 멈추도록 해보세요.
            else if(i == 20) break;
            if(i % 3 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
