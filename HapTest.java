package iducs.java.w01;

public class HapTest {
    // 자바 애플리케이션을 실행할 때 가장 먼저 호출되는 메소드
    public static void main(String[] args){ // configuration 메인 메소드 가지고 있는 녀석을 찾는다.
    int start = 1; // 정수형 변수 선언하면서 초기화
    int end = 100;
    int total = 0;
        Hap hap = new Hap(); // 객체 참조 변수를 선언, 객체를 생성해서 배정 Hap() 생성자 호출
        System.out.println(hap.getFrom() + "부터" + hap.getTo() + "의 합계 : "   + hap.sum());
        hap = new Hap(start, end); // hap 은 객체를 참조하는 변수 Hap(start, end) 생성자  호출
        System.out.println(hap.getFrom() + "부터" + hap.getTo() + "의 합계 : "   + hap.sum());
        System.out.println(hap.getFrom() + "부터" + hap.getTo() + "의 합계 : "   + hap.gaussian());


    }
}
