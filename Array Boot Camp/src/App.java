
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		//array1();
		//array2();
		array3();
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
//		int num2 = (int) (Math.random()*100);
//		int num3 = (int) (Math.random()*100);
//		int num4 = (int) (Math.random()*100);
//		int num5 = (int) (Math.random()*100);
		int [] numbers = new int[5];
		for (int i = 0; i<5; i++)
			{
				numbers[i] = num1;
				num1 = (int) (Math.random()*100);
//				if (i>0)
//					{
//						if(numbers[i] >numbers[i-1])
//							{
//								int temp = numbers[i];
//								numbers[i] = numbers[i-1];
//								numbers[i-1] = temp;
//							}
//					}
			}
		Arrays.sort(numbers);
		Arrays(numbers, Collections.reverseOrder());
		for (int i:numbers)
			{
				System.out.println(i);
			}
	}
	private static void Arrays(int[] numbers, Comparator<Object> reverseOrder)
		{
			// TODO Auto-generated method stub
			
		}
	public static void array4()
	{
		
	}
}