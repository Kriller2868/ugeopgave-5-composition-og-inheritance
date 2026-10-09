package del2;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 60));
        animals.add(new Wolf("Fenris", 90));
        animals.add(new Rabbit("Hopps", 100));
        animals.add(new Wolf("Felbound", 95));

        for (int i = 0; i < animals.size() - 1; i += 2) {
            Contest contest = new Contest(animals.get(i), animals.get(i + 1) );

            while (contest.getWinner() == null) {
                contest.playRound();
            }
            System.out.println("Vinderen er " + contest.getWinner().getName());
        }

    }


}
