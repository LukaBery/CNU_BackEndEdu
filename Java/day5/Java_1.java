package Java.day5;

public class Java_1 {

    public int[] solution(int[][] array) {
        int[] answer = new int[array.length];
        int row = array.length;
        int col = array[0].length;

        for(int j = 0; j<row; j++){
            int max = 0;
            for(int i = 0; i<col; i++){
                if(max< array[j][i]) max =  array[j][i];
            }
            answer[j]=max;

        }
        return answer;

    }
}
