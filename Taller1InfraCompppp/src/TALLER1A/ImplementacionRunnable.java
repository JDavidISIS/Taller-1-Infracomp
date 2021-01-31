package TALLER1A;
import java.util.Scanner;;

public class ImplementacionRunnable implements Runnable{



	public String name;
	public static int numeroMax = 0;


	public ImplementacionRunnable(String name)
	{
		this.name = name;

	}
	public static void main(String[] args)
	{
		System.out.println("Ingrese un numero");
		Scanner numUsuario =  new Scanner(System.in);
		numeroMax = Integer.parseInt(numUsuario.next());
		Thread t1 = new Thread(new ImplementacionRunnable("Thread"+1));
		Thread t2 = new Thread(new ImplementacionRunnable("Thread"+2));

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


