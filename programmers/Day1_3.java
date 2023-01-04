package programmers;

public class Day1_3 {
    public  static void main(String[] args){
        Car car = new Car();  // 자동차 객체를 생성
        car.ride();
    }


}
class Car {// 자동차 객체를 만들 수 있게 설명해둔, 완성되었을 때 기능을 말해주는 설계도
    int wheel = 4;

    void ride(){ // 자동차가 객체가 되면, 이 기능을 가지는 거예요.
        System.out.println("씽씽씽");
    }
}
