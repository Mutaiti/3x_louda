//Alternative Runnable Interface implementation
public class RunnableHelloCount implements Runnable {
    //properties
    private Thread thread1;
    private Thread thread2;

    public static void main(String[] args) {
        RunnableHelloCount threadDemo = new RunnableHelloCount();
    }
    public RunnableHelloCount(){
        //Since current object implements Runnable,it can be used as the argument to the Thread constructor for each of the member threads
        thread1 = new Thread(this);
        thread2 = new Thread(this);

        thread1.start();
        thread2.start();
    }
    public void run(){
        int pause;

        for(int i = 0; i < 5; i++){
            try{
                System.out.println(Thread.currentThread().getName() + "being executed.");
                pause = (int)(Math.random() * 3000);
                //call the static method sleep
                Thread.sleep(pause);
            }
            catch(InterruptedException interExce){
                System.out.println(interExce);
            }
        }
    }
}
