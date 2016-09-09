
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		array1();
		array2();
		array3();
		array4();
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
		int num1 = (int) (Math.random()*100);
		int [] numbers = new int[5];
		for (int i = 0; i<5; i++)
			{
				numbers[numbers.length - i - 1] = num1;
				num1 = (int) (Math.random()*100);
			}
		for (int i:numbers)
			{
				System.out.println(i);
			}
	}
	public static void array4()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Type in a 4 digit number");
		int number = input.nextInt();
		int[] digits = new int[4];
		for (int i = 4; i>0; i--)
			{
				int mod = number%10;
				digits[i-1] = mod;
				number = number/10;
			}
		for (int a: digits)
			{
				System.out.print(a);
			}
	}
}