import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String withoutVowels = input.replaceAll("[aeiouAEIOU]", "");

        System.out.println("The string without vowels is: " + withoutVowels);
        scanner.close();
    }
}
