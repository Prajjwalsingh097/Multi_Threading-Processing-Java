package MultiThreading;
import java.util.*;

class Booking{
	
	int ticket=100;
	
	public void Book(String name) {
		if (ticket>0)
		System.out.println("Ticket Number "+(ticket--)+" Booked for "+name);
		else
			System.out.println("All Tickets Booked");
	}
	
	
}

public class Threading_1 {
	
	public static void main(String []ar) throws Exception{
		Booking b=new Booking();
		
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for (int i=1;i<=100;i++)
				b.Book("Prajjwal");
				
		
	}
	});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for (int i=1;i<=100;i++)
				b.Book("Riya");
				
		
	}
	});
	
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	

	}
}
