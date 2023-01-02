package Java.Day1;

public class Java1_11 {
    /**
     switch문을 사용해서 value에 따른 a와 b의 연산을 합니다.
     결과값은 result 변수에 저장하세요.

     아래의 조건을 switch문으로 작성하면 됩니다.
     - value가 1인 경우, a와 b를 더한 결과를 result에 저장하세요
     - value가 2인 경우, a와 b를 뺀 결과를 result에 저장하세요
     - value가 3인 경우, a와 b를 곱한 결과를 result에 저장하세요
     - value가 4인 경우, a와 b를 나눈 결과를 result에 저장하세요
     - 그 외, a와 b를 나눈 나머지 결과를 result에 저장하세요
     */
    public int solution(int value) {
        int a = 10;
        int b = 5;
        int result = 0;

        // 코드를 작성하세요
        switch(value){
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            case 4:
                result = a/b;
                break;
            default:
                result = a%b;

        }


        return result;
    }
}
