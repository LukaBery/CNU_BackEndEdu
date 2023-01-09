package CodingTest.OneDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ant4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = Integer.parseInt(sc.nextLine());
        List<String> output = new ArrayList<String>();

        for(int i = 0; i<testNum; i++){

            String[] firstInput  = sc.nextLine().split(" ");  // 첫번째 줄 벽 개수, 부술수 있는 벽
            int wallNum = Integer.parseInt(firstInput[0]);
            int ableWall = Integer.parseInt(firstInput[1]);
            String wall = sc.nextLine();   // 두번째 줄 -  O -> 탈출구, @-> 준식이 & -> 몬스터 . ->빈 칸 # -> 벽
            String[] secondInput  = sc.nextLine().split(" ");
            int atkJ = Integer.parseInt(secondInput[0]);
            int hpJ = Integer.parseInt(secondInput[1]);
            String[] thirdInput  = sc.nextLine().split(" ");
            int atkM = Integer.parseInt(thirdInput[0]);
            int hpM = Integer.parseInt(thirdInput[1]);
            List<Integer> zeroList = countChar(wall, 'O');
            int zeroCnt = zeroList.size();
            int jPos = wall.indexOf("@");
            int mPos = wall.indexOf("&");
            int[] result = new int[zeroCnt];
            String fnResult ="";
            for(int j = 0; j<zeroCnt; j++){

                int zeroPos = wall.indexOf("O", j);
                int startIdx = Math.min(jPos, zeroPos);
                int endIdx = Math.max(jPos, zeroPos);
                int wallCnt=0;
                int restHpJ = hpJ;
                int restHpM = hpM;
                String combatResult="";
                for(int h = startIdx; h<endIdx; h++){
                    if(String.valueOf(wall.charAt(h)).equals("#")){
                        wallCnt++;
                    }
                    if (String.valueOf(wall.charAt(h)).equals("&")) {
                       while(restHpM>=0 && restHpJ >=0){
                           restHpM -= atkJ;
                           if(restHpM<0) break;
                           restHpJ -= atkM;
                       }


                    }


                }
                if(restHpJ<0){
                    result[j] = 1;

                } else if (restHpM<0 && wallCnt<=ableWall) {
                    result[j] = 2;
                } else if (restHpM == hpM && wallCnt <=ableWall) {
                    result[j] = 3;


                }


            }
            for(int f = 0; f<zeroCnt; f++)
            {
                if(result[f]>= 2){
                    fnResult = "HAHA!";
                    break;

                }else {
                    fnResult = "HELP!";
                }
            }
            output.add(fnResult);

        }
        for(int y = 0; y<testNum; y++){
            System.out.println(output.get(y));

        }

    }
    public static List<Integer> countChar(String str, char ch) {
        int count = 0;
        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                arr.add(i);
            }
        }
        return arr;
    }

}
