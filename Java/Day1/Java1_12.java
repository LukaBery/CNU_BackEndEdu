package Java.Day1;

public class Java1_12 {
    /**
     변수 i와 while문을 이용해서 0부터 10까지 중 홀수들의 합을 구해보세요.
     - while문을 사용해서 반복하고, 홀수를 판단할 때는 if문을 사용합니다.
     - 결과값은 result 변수에 저장합니다.
     */
    public static void main(String[] args) {
        int i = 0;
        int result = 0;

        // 0부터 10까지 중 홀수들의 합을 구하세요.
        while(i < 10 ){
            if(i%2 ==1){
                result  += i;

            }
            i ++;
        }

        System.out.println(result);
    }
}
