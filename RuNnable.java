//progarm of implementing by runnable interface
class ama implements Runnable
{
    //Runnable method only consists one method i.e run
    public void run()
    {
        System.out.println("Runnable method only consists one method i.e run");
    }
}
class RuNnable 
{
    public static void main(String[]abc)
    {
        ama a=new ama(); // to call the method of ama by implementing Runnable interface we have to make the object of thread class
        Thread t= new Thread(a);//to call the method of ama we have to pass the reference object of class ama i.e a
        t.start();
    }
}