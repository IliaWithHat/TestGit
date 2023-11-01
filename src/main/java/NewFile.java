import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewFile {

//    Рабочий код через hash map. Или можно через enum.
//    static HashMap<Integer, String> years;
//
//    static {
//        years = new HashMap<>(Map.of(
//                0, "Monkey",
//                1, "Rooster",
//                2, "Dog",
//                3, "Pig",
//                4, "Rat",
//                5, "Ox"));
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int year = scanner.nextInt();
        int answer = year % 12;
//        System.out.println(year + " - the year of the " + years.get(answer));
        System.out.println(year + " - the year of the " + getValue(answer));
    }

    private static Years getValue(int value) {
        for(Years e: Years.values()) {
            if(e.value == value) {
                return e;
            }
        }
        return null;
    }
}
