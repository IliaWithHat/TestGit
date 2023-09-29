import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewFile {
    static HashMap<Integer, String> years;

    static {
        years = new HashMap<>(Map.of(
                0, "Monkey",
                1, "Rooster",
                2, "Dog",
                3, "Pig",
                4, "Rat",
                5, "Ox"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int year = scanner.nextInt();
        int answer = year % 12;
        System.out.println(year + " - the year of the " + years.get(answer));
    }
}
