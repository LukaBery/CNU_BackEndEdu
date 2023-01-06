package CodingTest.fnCt;

import java.util.Arrays;
import java.util.Scanner;

public class CT_1_Tasu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cclCnt = Integer.parseInt(sc.nextLine());  // 테스트 케이스 개수
        String[] output = new String[cclCnt];  // 결과

        for (int i = 0; i < cclCnt; i++) {
            int depositNum = Integer.parseInt(sc.nextLine());  // 보관소 개수
            String[] input = sc.nextLine().split(" ");
            int inputLth = input.length;
            int[] inputArr = new int[inputLth]; // 보관소 별 자전거 개수 현황
            for (int j = 0; j < inputLth; j++) {
                inputArr[j] = Integer.parseInt(input[j]);
            }
            int rentInfo = Integer.parseInt(sc.nextLine());  // 대여 자전거 개수
            for (int k = 0; k < rentInfo; k++) {
                String[] input1 = sc.nextLine().split(" ");
                int minBc = Integer.parseInt(input1[0]) - 1;
                int plusBc = Integer.parseInt(input1[1]) - 1;
                inputArr[minBc]--;
                inputArr[plusBc]++;
            }
            output[i] = Arrays.toString(inputArr).replaceAll("[^0-9 ]", "");
        }
        for (int h = 0; h < cclCnt; h++) {
            System.out.println(output[h]);
        }
    }
}