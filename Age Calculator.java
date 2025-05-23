import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your birth year: ");
        int birthYear = Integer.parseInt(reader.readLine());

        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();

        int age = currentYear - birthYear;

        System.out.println("You are " + age + " years old.");
    }
}

