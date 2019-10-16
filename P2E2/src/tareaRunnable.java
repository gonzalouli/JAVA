
public class tareaRunnable implements Runnable{
	critica c;
	
public tareaRunnable(critica c) {
	this.c= c;
}

public void run(){
	
	for(int i=0; i<10000; i++)c.inc();
	
}

}
   


