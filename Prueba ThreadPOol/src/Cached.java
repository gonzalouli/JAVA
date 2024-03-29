import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Cached 
{
	
	static int iNumero = 0;
	
	public static void main(String[]args)
	{
		
		long iTiempoIni = System.currentTimeMillis();
		
		ExecutorService oExecutor = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 10; i++)
			//Lanzamos un nuevo task
			oExecutor.execute(new Incremento());
		
		
		//No enviamos más tareas
		oExecutor.shutdown();
		
		try
		{
			//Esperamos con el método bloqueante a que acabe o no todas las tareas
			oExecutor.awaitTermination(1000L, TimeUnit.MILLISECONDS);
		}
		catch(Exception ex) {}
		
		long iTiempoFin = System.currentTimeMillis();
		
		System.out.println("Incremento: " + iNumero);
		
		System.out.println("Ejecutado en un tiempo total de: " + (iTiempoFin - iTiempoIni) + "ms");
		
	}

	
	public static class Incremento implements Runnable
	{
		public Incremento() {}
		
		@Override
		public void run()
		{
			System.out.println("Hebra " + Thread.currentThread().getId());
			
			for (int i = 0; i < 1000; i++)
					iNumero++;//Entrelazado patológico
		}
	}
}
