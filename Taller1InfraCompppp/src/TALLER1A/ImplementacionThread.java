package TALLER1A;
import java.util.Scanner;;


public class ImplementacionThread extends Thread{
	public String name;
	public static int numeroMax = 0;
	

	public ImplementacionThread(String name)
	{
		this.name = name;

	}
	public static void main(String[] args)
	{
		System.out.println("Ingrese un numero");
		Scanner numUsuario =  new Scanner(System.in);
		numeroMax = Integer.parseInt(numUsuario.next());
		ImplementacionThread t1 = new ImplementacionThread("Thread"+1);
		ImplementacionThread t2 = new ImplementacionThread("Thread"+2);

		t1.start();
		t2.start();
	}
	public void run()
	{
		try{
			if(name.equals("Thread1"))
			{
				for (int i = 1; i <= numeroMax; i++)
				{
					if(i%2 == 0)
					{
						System.out.println(i);
						Thread.sleep(500);
					}

				}
				Thread.sleep(20);
			}
			if(name.equals("Thread2"))
			{
				Thread.sleep(2500);
				
				for(int i = 1; i <= numeroMax; i++)
				{
					if(i%2 == 1)
					{
						System.out.println(i);
					}
				}
			}
		}
		catch(Exception e)
		{
		}

	}

}

