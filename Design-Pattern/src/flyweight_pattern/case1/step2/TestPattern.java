package flyweight_pattern.case1.step2;

public class TestPattern {
    public static void main(String[] args)  {
        MyData md1 = new MyData();
        md1.xPos = 10;
        md1.yPos = 11;
        md1.name = "홍길동";

        MyData md2 = new MyData();
        md2 = md1;  // 같은 객체를 md1, md2가 공유

        MyData md3 = new MyData();
        md3.xPos = 20;
        md3.yPos = 21;
        md3.name = "손오공";

        md2.name = "전우치";   // md1의 값도 변경됨
        md2.xPos = 5;
    }
}

class MyData    {
    int xPos;
    int yPos;
    String name;
}
