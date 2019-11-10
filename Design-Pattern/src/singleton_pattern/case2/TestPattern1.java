package singleton_pattern.case2;

public class TestPattern1 {
    public static void main(String[] args)  {
        LogWriter logger;

        logger = LogWriter.getInstance();
        logger.log("홍길동");

        logger = LogWriter.getInstance();
        logger.log("전우치");
    }
}
