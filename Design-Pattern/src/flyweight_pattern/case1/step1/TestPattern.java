package flyweight_pattern.case1.step1;

public class TestPattern {
    public static void main(String[] args)  {
        String str1 = new String("홍길동");
        String str2 = new String("홍길동");
        String str3 = "홍길동";
        String str4 = "홍길동";
        // str3, str4는 하나의 id를 가지는 "홍길동" 을 가지고 있음

        System.out.println("Flyweight Pattern");
    }
}
