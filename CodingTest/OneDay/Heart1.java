package CodingTest.OneDay;

import java.util.Scanner;

public class Heart1 {/*

    중요한 것은 꺾이지 않는 마음 1

        문제

    팔기 전까진 손해가 아니다. 중요한 것은 꺾이지 않는 마음.
    주식 거래를 즐겨하는 현진이가 마음에 새겨 두고 사는 명언이다. 현진이는 어느 날 테슬라 주식을 한 주 구매했다.
    현진이는 이 주식의 가격이 구매했던 가격보다 M 원 이상 올라가면 즉시 판매한다. 이 매매법에 따르면 절대로 손
    해를 보지 않는 것은 증명되어 있다. 앞으로 N 일간의 테슬라 주가가 주어질 때, 현진이가 K 번째 날에 테슬라를
    한 주 구매했다면 몇 번째 날에 다시 팔게 될까?

        입력

    첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에 세 정수 N (1 ≤ N ≤ 10) 과 M
    (1 ≤ M ≤ 100) 과 K (1 ≤ K ≤ N) 가 주어진다. 둘째 줄에 정수 A[1], A[2], ..., A[N] 이 주어진다. i
    (1 ≤ i ≤ N) 번째 날 테슬라의 주가는 A[i] (1 ≤ A[i] ≤ 100) 이다.

        출력

    현진이의 매매법에 따르면 현진이가 K 번째 날에 구매한 테슬라 한 주를 몇 번째 날에 다시 팔게 되는지 출력한다.
    만약 N 번째 날이 지나도 현진이가 테슬라 한 주를 팔지 못한다면 JB 를 출력한다.

   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = Integer.parseInt(sc.nextLine());
        String[] output = new String[testNum];

        for (int i = 0; i < testNum; i++) {
            String[] input = sc.nextLine().split(" ");
            int n = Integer.parseInt(input[0]); //총 테슬라 주식 정보 제공 일 수
            int m = Integer.parseInt(input[1]); // 목표 차익 금액
            int k = Integer.parseInt(input[2]);   // 테슬라 주식 구입 일자
            String[] price = sc.nextLine().split(" ");
            int buyPrice = Integer.parseInt(price[k - 1]);
            int targetPrice = buyPrice + m;
            String sellDate = "JB";
            for (int j = k - 1; j < n; j++) {
                if (Integer.parseInt(price[j]) >= targetPrice) {
                    sellDate = String.valueOf(j + 1);
                    break;
                }
            }
            output[i] = sellDate;
        }
        for (int h = 0; h < testNum; h++) {

            System.out.println(output[h]);
        }

    }
}
