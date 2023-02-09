public class EvenThread extends Thread{
    @Override
    public void run()
    {
        try {
            for(int i =2;i<=10;i+=2)
            {
                System.out.println(i);
                try {
                    Thread.sleep(15);
                }catch (InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
