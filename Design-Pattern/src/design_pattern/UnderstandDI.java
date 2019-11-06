package design_pattern;

import java.util.Date;

public class UnderstandDI {
    public static void main(String[] args)  {
        // 강한 결합 -> 날짜를 구하기 위해서는 Date 클래스에 의존해야 한다.
        Date date = new Date();
        System.out.println(date);
    }

    public static void getDate(Date d)  {
        // 약한 결합
        Date date = d;
        System.out.println(date);
    }


    public static void memberUse1() {
        // 강한 결합 : 직접생성
        // Member 클래스의 생성자가 private 일 경우 강한 결합에서 에러가 발생
        Member m1 = new Member();
    }

    public static void memberUse2(Member m) {
        // 약한 결합 : 생성된 것을 주입 받음 - 의존 주입(DI)
        Member m2 = m;
    }
}

// Member를 사용한다 -> Member의 기능에 의존한다 라는 의미
class Member    {
    String name;
    String nickname;

    public Member() {}
}
