
import java.util.Arrays;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		array1();
		//array2();
	}
	public static void array1()
	{
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("How many favorite candies do you have?");
		int number = input.nextInt();
		String[] candies = new String [number];
		System.out.println(candies.length);
		for (int i = 0; i<candies.length;)
		{
			int sweetNumber = i + 1;
			System.out.println("What is sweet #" + sweetNumber);
			String candy = input2.nextLine();
			candies[i] = candy;
			i = i+1;
		}
		int j = 0;
		for (String s : candies)
		{
			System.out.println(s);
		}
	}
	public static void array2()
	{
		Scanner input = new Scanner(System.in);
		int [] array = new int [8];
		System.out.println("Type in 8 numbers");
		int odds = 0;
		int evens = 0;
		for (int i = 0; i<8; i++)
			{
				array[i] = input.nextInt();
			}
		for (int j = 0; j<8; j++)
			{
				if(array[j]%2 == 0)
					{
						evens += array[j];
					}
				else
					{
						odds += array[j];
					}
			}
		System.out.println("The evens add up to " + evens);
		System.out.println("The odds add up to " + odds);
	}
	public static void array3()
	{
		
	}
	public static void array4()
	{
		
	}
}