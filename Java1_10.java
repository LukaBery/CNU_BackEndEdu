public class Java1_10 {
    /**
     아래 코드는 score에 따른 grade를 정하는 코드입니다.
     if, else if, else문을 활용해서 코드를 완성하세요.
     등급 결과값은 grade 변수에 저장하면 됩니다.
     */
    public int solution(int score) {
        int grade = 0;

        // if문 : 90보다 크거나 같으면, 1
        if(score >= 90){
            grade = 1;
        }
        // else if문 : 80보다 크거나 같고 ~ 90보다 작으면, 2
        else if(score >= 80 && score <90){
            grade = 2;
        }
        // else문 : 80보다 작으면, 3
        else if  (score < 80){
            grade = 3;
        }
        return grade;
    }
}
