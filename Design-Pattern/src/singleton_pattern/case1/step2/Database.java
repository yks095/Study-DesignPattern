package singleton_pattern.case1.step2;

public class Database { // DB에 접속을 하고 DB에 있는 내용을 query를 하는 등 DAO의 역할을 하는 기능

    private static Database singleton;
    private String name;

    private Database(String name) {     // 사용자가 유틸리티 메서드(getInstance)를 사용하지 않고
//        super();                        // 임의로 객체를 생성하는 것을 방지하기 위해 private으로 변경
//        this.name = name;
        try {
            Thread.sleep(100);      // 실제 DB에 접속을 하는거 처럼 약간의 시간을 줌
            this.name = name;
        }
        catch (Exception e) {

        }
    }

    public synchronized static Database getInstance(String name) {  // 여러 쓰레드가 접근해도 순서대로 먼저 온 쓰레드가 끝나기를 기다림
                                                                    // 항상 1번째가 아니라 다른 숫자를 가진 쓰레드가 먼저 올 수 있음
                                                                    // 그러나 'synchronized' 사용하게 되면 병목현상이 일어남
                                                                    // singleton이 null인지에 대한 검사는 최초에만 필요하고 그 이후엔 필요하지 않음
        if(singleton == null)
            singleton = new Database(name);
        return singleton;
    }

    public String getName() {
        return name;
    }

}
