package CodingTest.fnCt;

import java.util.ArrayList;
import java.util.Scanner;

public class CT_2_Stalin {
    /*
    문제

    스탈린 정렬은 세상에서 가장 빠른 정렬 알고리즘입니다. 길이가 N인 수열 A[1], A[2], ... , A[N]
    이 주어졌을 때 이 수열을 스탈린 정렬하는 과정은 다음과 같습니다.
        1. A[i-1] > A[i] (2 ≤ i ≤ |A|)를 만족하는 원소 A[i]를 수열 A에서 제거합니다.
           이를 만족하는 원소가 여러 개 있다면 가장 앞서는 것을 제거합니다.
        2. 더 이상 제거할 수 있는 원소가 없을 때까지 1번 과정을 반복합니다.
    주어진 수열 A를 스탈린 정렬해서 출력하세요.

    입력

    첫째 줄에 테스트 케이스의 개수 T (1 ≤ T ≤ 100)가 주어집니다. 각 테스트 케이스의 첫째 줄에 수열의
    길이 N (1 ≤ N ≤ 50)이 주어집니다. 둘째 줄에 수열의 원소 A[1], A[2], ..., A[N]이 주어집니다.
    수열의 i번째 원소는 정수 A[i] (1 ≤ A[i] ≤ 100)입니다.

    출력

    각 테스트 케이스마다 주어진 수열을 스탈린 정렬한 결과를 출력합니다.
    테스트 1 〉	통과 (151.81ms, 66.1MB)
    테스트 2 〉	통과 (203.40ms, 67.8MB)
    테스트 3 〉	통과 (183.90ms, 71.8MB)
    테스트 4 〉	통과 (222.91ms, 69.1MB)
    테스트 5 〉	통과 (140.85ms, 66.4MB)
    테스트 6 〉	통과 (144.67ms, 72.6MB)
    테스트 7 〉	통과 (152.24ms, 66.9MB)
    테스트 8 〉	통과 (144.42ms, 69.1MB)
    테스트 9 〉	통과 (148.85ms, 70.5MB)
    테스트 10 〉	통과 (160.28ms, 65.4MB)
    효율성  테스트
    테스트 1 〉	통과 (408.68ms, 65.3MB)

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cclCnt = Integer.parseInt(sc.nextLine());  // 테스트 케이스 개수
        String[] output = new String[cclCnt];  // 결과

        for (int i = 0; i < cclCnt; i++) {
            int arrLength = Integer.parseInt(sc.nextLine());  // 각 수열의 길이
            String[] input = sc.nextLine().split(" ");
            int[] inputArr = new int[arrLength]; // 입력 수열 값
            for (int j = 0; j < arrLength; j++) {
                inputArr[j] = Integer.parseInt(input[j]);
            }
            ArrayList<String> result = new ArrayList<String>();
            result.add(String.valueOf(inputArr[0]));
            int front = inputArr[0];
            for (int j = 0; j < arrLength - 1; j++) {
                if (front <= inputArr[j + 1]) {
                    result.add(String.valueOf(inputArr[j + 1]));
                    front = inputArr[j + 1];
                }
            }
            output[i] = result.toString().replaceAll("[^0-9 ]", "");
        }
        for (int h = 0; h < cclCnt; h++) {
            System.out.println(output[h]);
        }
    }
}
