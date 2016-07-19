
public class Ticket extends Thread{
	private int num = 100;
	public void run(){
		while(true){
			if(num > 0){
				System.out.println(num--);
				System.out.println(Thread.currentThread().getName()+"....sale...."+num--);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1 = new Ticket();
        Thread s1 = new Thread(t1);
        s1.start();
	}

}
