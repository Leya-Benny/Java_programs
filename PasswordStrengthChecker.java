import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter password to check: ");
        String password = reader.readLine();

        int score = 0;
        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*\\d.*")) score++;
        if (password.matches(".*[!@#$%^&*()].*")) score++;

        System.out.println("Password Strength: " + score + "/5");
        if (score < 3) {
            System.out.println("Suggestions: Use uppercase, lowercase, digits, special characters, and make it longer.");
        } else {
            System.out.println("Your password is fairly strong.");
        }
    }
}
