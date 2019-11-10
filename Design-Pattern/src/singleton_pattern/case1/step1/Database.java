package singleton_pattern.case1.step1;

public class Database {

    private static Database singleton;
    private String name;

    private Database(String name) {     // 사용자가 유틸리티 메서드(getInstance)를 사용하지 않고
//        super();                        // 임의로 객체를 생성하는 것을 방지하기 위해 private으로 변경
//        this.name = name;
        try {
            Thread.sleep(100);
            this.name = name;
        }
        catch (Exception e) {

        }
    }

    public static Database getInstance(String name) {
        if(singleton == null)
            singleton = new Database(name);
        return singleton;
    }

    public String getName() {
        return name;
    }

}
