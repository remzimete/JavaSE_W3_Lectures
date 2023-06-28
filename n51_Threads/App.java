package n51_Threads;

public class App {


//    public static class Main extends Thread{
//
//        public void run() {
//            System.out.println("sout in a thread");
//        }
//
//    }




    public static void main(String[] args) {


        Thread t = new Thread(){
          public void run(){
              for (int i = 0; i < 100; i++) {
                  System.out.println("1");
              }
          }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100;  i++) {
                    System.out.println("2");
                }
            }
        };

        t.start();
        t2.start();




    }




}
