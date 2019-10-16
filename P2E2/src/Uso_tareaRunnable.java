////Reescribir utilizando runnable

public class Uso_tareaRunnable 
{   private tareaRunnable  c;

    public Uso_tareaRunnable(tareaRunnable  c)
    {this.c=c;}

    /*public void run()
    {
      for(int i=0; i<10000; i++)c.inc();
    }*/
    
    
    public static void main(String[] args)throws Exception
    {
    	critica c =new critica();
    	
    	Runnable p  = new tareaRunnable(c); //referencia a objeto comun...
    	Runnable q  = new tareaRunnable(c);
    	
      Thread h1 =new Thread(q);
      Thread h2 =new Thread(p);
      
      
      new Thread(h1).start();
      new Thread(h2).start();
      
      
     /// hConcu  h1 = new hConcu(p); //ambos hilos comparten el acceso a p
      ///hConcu  h2 = new hConcu(p); // a traves de la referencia
     /// h1.start(); h2.start();
      ///h1.join(); h2.join();
      System.out.println(c.vDato());
    }
}