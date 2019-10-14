import java.util.concurrent.atomic.AtomicInteger;
import java.lang.*;



public class ParkingCounter extends AtomicInteger {

	private final int maxNumber;
	public ParkingCounter(int maxNumber){
		set(0);
		this.maxNumber=maxNumber;
	}
	
	
	public boolean carIn() {
		for (;;) {
		int value=get();
		if (value==maxNumber) {
			System.out.printf("ParkingCounter: The parking lot is full.\n");
			return false;
		} else {
			int newValue=value+1;
			boolean changed=compareAndSet(value,newValue);
			if (changed) {
			System.out.printf("ParkingCounter: A car has entered.\n");
			return true;
			}
			}
			}
			}
	
	public boolean carOut() {
		for (;;) {
		int value=get();
		if (value==0) {
		System.out.printf("ParkingCounter: The parking lot isempty.\n");
		return false;
		} else {
			int newValue=value-1;
			boolean changed=compareAndSet(value,newValue);
			if (changed) {
			System.out.printf("ParkingCounter: A car has gone out.\n");
			return true;
			}
			}
			}
			}
		
	

public class Sensor1 implements Runnable {
	private final ParkingCounter counter;
	public Sensor1(ParkingCounter counter) {
		this.counter=counter;
		}public void run() {
			counter.carIn();
			counter.carIn();
			counter.carIn();
			counter.carIn();
			counter.carOut();
			counter.carOut();
			counter.carOut();
			counter.carIn();
			counter.carIn();
			counter.carIn();
			}
}


public class Sensor2 implements Runnable {
	private ParkingCounter counter;
	public Sensor2(ParkingCounter counter) {
		this.counter=counter;
		}
	public void run() {
		counter.carIn();
		counter.carOut();
		counter.carOut();
		counter.carIn();
		counter.carIn();
		counter.carIn();
		counter.carIn();
		counter.carIn();
		counter.carIn();
		}
}



}