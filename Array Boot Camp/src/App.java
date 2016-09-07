import java.util.Scanner;
public class App {
	public static void main(String[] args) {
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
			candies[i] = "1";
			i = i+1;
		}
		int k = 0;
		int j = 0;
		for (j = 0; j < candies.length; j++);
		{
			k = j;
			System.out.println(candies[k]);
		}
	}
}