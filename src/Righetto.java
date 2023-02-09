import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Righetto
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
					es1();
				break;
				case 2:
					//Inserire metodo statico
				break;
				case 3:
					//Inserire metodo statico
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
	}
	static void swap(int v[],int a , int b)
	{
		int temp = v [a];
		v [a] = v [b];
		v [b] = temp;
	}
	static void es1()
	{
		int[] array1 = new int[5];
		int[] array2 = new int [5];
		int[] array3 = new int [array1.length + array2.length];
		for(int i = 0; i < array1.length; i++)
		{
			System.out.print( " inserisci valori" );
			array1[i]= Integer.parseInt(in.nextLine());
		}
		for(int j = 0; j < array2.length ; j++)
		{
			System.out.print( "inserisci valori" );
			array2[j]= Integer.parseInt(in.nextLine());
		} 
		for(int i = 0; i < array1.length; i++)
		{
			array3[i] = array1[i];
		}
	    for(int j = 0; j < array2.length ; j++)
	    {
	    	array3[array1.length + j] = array2[j];
	    }
		for (int j=0 ; j < array3.length ; j++)
		{
			for (int i = 0 ; i<array3.length -1 ; i++)
			{
				if(array3[i]>array3[i + 1])
					swap(array3,i,i + 1);
			}
		}
		for (int i = 0; i<array3.length;i++)
		{
			System.out.println(array3[i]);
		}
	}
}
