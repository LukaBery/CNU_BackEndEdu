package codingTest.fnCt;

import java.util.Arrays;
import java.util.Scanner;

public class CT_1_Tasu {
/*
    문제

    타슈는 대전 시민들이 무료로 사용 가능한 공용 자전거입니다. 타슈를 이용하기 위해서는
    대전 유성구 곳곳에 위치하는 N개의 대여소에 위치한 타슈를 대여하고, 이용이 끝나면
    다시 대여소에 반납해야합니다. 반드시 대여했던 대여소에 반납할 필요는 없습니다.

    대여소 별 타슈의 개수와 하루 동안의 타슈 이용 기록이 주어집니다. 모든 이용이 끝난
    후에 각 대여소에 위치한 타슈의 개수를 출력하세요.

    입력

    첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 100)가 주어집니다.  각 테스트 케이스의
    첫째 줄에 대여소의 개수 N(1 ≤ N ≤ 50)이 주어집니다. 둘째 줄에 A[1], A[2], ...,
    A[N]이 주어집니다. 초기에 i번째 대여소에 위치한 자전거의 개수는 A[i](0 ≤ A[i] ≤ 10)
    입니다.셋째 줄에 이용 기록의 개수 M(1 ≤ M ≤ 50)이 주어집니다. 넷째 줄부터 M개의 줄에
    타슈 이용 기록이 순서대로 주어집니다. 각각의 타슈 이용 기록은 두 개의 정수 U,
    V(1 ≤ U, V ≤ N)로 이루어져 있고, 이는 U번째 대여소에서 타슈를 빌린 후에 V번째 대여소
    에 반납했다는 의미입니다. 이 때, A[u] ≠ 0임이 보장됩니다.

    출력

    각 테스트 케이스마다 모든 이용이 끝난 후에 각 대여소에 위치한 타슈의 개수를 출력하세요.
*/
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