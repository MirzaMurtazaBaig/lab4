package runable;

class Main implements Runnable{
public void run(){
System.out.println("thread is running...");
}

public static void main(String args[]){
Main m1=new Main();
m1.start();
 }
}