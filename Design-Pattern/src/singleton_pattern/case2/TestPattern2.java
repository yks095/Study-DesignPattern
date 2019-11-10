package singleton_pattern.case2;

public class TestPattern2 {
    public static void main(String[] args)  {
        for (int i = 0; i < 50; i++)    {
            // 쓰레드마다 구분되는 로그작성용 파라미터
            Thread t = new ThreadSub(i);
            t.start();
        }
    }
}

class ThreadSub extends Thread  {
    int num;

    public ThreadSub(int num)   {
        this.num = num;
    }

    @Override
    public void run() {
        LogWriter logger = LogWriter.getInstance();
        if(num < 10)
            logger.log("*** 0" + num + " ***");
        else
            logger.log("*** " + num + " ***");

    }
}
