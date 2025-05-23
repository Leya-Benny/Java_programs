import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a password to check: ");
        String password = reader.readLine();

        int score = 0;
        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*\\d.*")) score++;
        if (password.matches(".*[!@#$%^&*()].*")) score++;

        System.out.println("Password Strength Score: " + score + "/5");

        if (score < 3) {
            System.out.println("Try adding uppercase, lowercase, numbers, and special characters.");
            System.out.println("Also make your password at least 8 characters long.");
        } else {
            System.out.println("Nice! Your password is strong enough.");
        }
    }
}

