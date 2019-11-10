package singleton_pattern.case1.step3;

public class Database {

    private static Database singleton = new Database("products");   // static 변수는 프로그램이 실행하고 가장 먼저 생김
                                                                           // 이미 생성되었기 때문에 null 비교를 해주지 않아도 됨
    private String name;

    private Database(String name) {
        try {
            Thread.sleep(100);
            this.name = name;
        }
        catch (Exception e) {

        }
    }

    public static Database getInstance(String name) {
        return singleton;
    }

    public String getName() {
        return name;
    }

}
