import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoTeam {
    private static final ArrayList<ArrayList<Player>> teams;

    static {
        ArrayList<Player> teamOne = new ArrayList<>(List.of(
                new Player("Ilia"), new Player("Roma"), new Player("Sergei")));
        ArrayList<Player> teamTwo = new ArrayList<>(List.of(
                new Player("Masha"), new Player("Lisa"), new Player("Ulala")));
        ArrayList<Player> teamTree = new ArrayList<>(List.of(
                new Player("Pasha"), new Player("Egor"), new Player("Evgeniy")));
        ArrayList<Player> teamFour = new ArrayList<>(List.of(
                new Player("Igor"), new Player("Nastya"), new Player("Sasha")));
        teams = new ArrayList<>(List.of(teamOne, teamTwo, teamTree, teamFour));
    }

    private static void strike(Player player) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Player " + player.name + " is shooting.");
            player.num = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> bestPlayer = new ArrayList<>();
        for (ArrayList<Player> oneTeam : teams) {
            for (Player player : oneTeam) {
                strike(player);
            }
            oneTeam.sort((p1, p2) -> p2.num - p1.num);
            bestPlayer.add(oneTeam.get(0).name + ". His got " + oneTeam.get(0).num + " points.");
        }
        bestPlayer.forEach(System.out::println);
    }
}

class Player {
    String name;
    int num;

    public Player(String name) {
        this.name = name;
    }
}
