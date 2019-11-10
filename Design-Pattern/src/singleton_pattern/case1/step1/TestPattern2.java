package singleton_pattern.case1.step1;

public class TestPattern2 {

    static int nNum = 0;

    public static void main(String[] args)  {

        Runnable task = () ->   {
            try {
                nNum++;
                Database database = Database.getInstance(nNum + "번째 DB");   // 10개의 쓰레드가 거의 동시에 요청하므로 각각의 쓰레드에 객체 생성
                System.out.println("This is the " + database.getName() + " !!!");
            }
            catch (Exception e)    {

            }
        };

        for(int i = 0; i < 10; i++) {       // thread 10개를 시작
            Thread t = new Thread(task);
            t.start();
        }
    }
}
