package thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    System.out.println("Hallo");
                }
            }
        });

        thread.start();

        for(int i = 0; i < 10; i++) {
            System.out.println("Servus");
        }
    }

}
