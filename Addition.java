import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your First Number:");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("Enter your Second Number:");
		int b = Integer.parseInt(reader.readLine());
		int sum = a+b;
		System.out.println("Sum = "+ sum);
	}
}
