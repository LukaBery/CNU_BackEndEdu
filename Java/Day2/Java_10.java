package Java.Day2;

public class Java_10 {
    /**
     2차원 배열을 만들어보세요.
     - 배열 형태는 [5 X 10]이고, 각 행은 열의 길이만큼 2부터 짝수인 값을 저장합니다.
     - for문을 사용해서 초기화해보세요.
     */
    public int solution(int x, int y) {
        // 코드를 작성하세요
        int[][] array = new int[5][10];
        for(int i=0; i<5; i++){
            for(int j=0; j<10; j++){
                int a = 0;
                if(j>1){
                    for(int h = 0; h<j; h++){
                        if(h%2 ==0 ) a += h;
                    }
                    array[i][j] = a;
                }
                else{
                    array[i][j] = 0;
                }
            }
        }

        return array[x][y];
    }
}
