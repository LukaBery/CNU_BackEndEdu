package Java.Day1;

public class Java1_13 {
    /**
     for문을 이용해서 1부터 30까지 중에서 3의 배수 숫자들의 합을 구해보세요.
     - 결과값은 result 변수에 저장하세요.
     */
    public static void main(String[] args) {
        int result = 0;

        // for문을 작성하세요.
        for(int num = 1; num <=30; num++)
        {
            if(num % 3 == 0)
                result += num;
        }

        System.out.println(result);
    }
}
