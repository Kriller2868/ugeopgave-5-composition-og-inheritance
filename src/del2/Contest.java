package del2;

public class Contest {
    private Animal a;
    private Animal b;
    private int round;

    public Contest(Animal a, Animal b) {
        this.a = a;
        this.b = b;
        this.round = 0;
    }


    public void playRound() {
        round++;
        System.out.println("--- Runde " + round + " ---");

        int damage1 = a.attack();
        b.setEnergy(b.getEnergy() - damage1);
        if (b.getEnergy() < 0) b.setEnergy(0);
        System.out.println(a.getName() + " angriber " + b.getName()
                + " for " + damage1 + "! (" + b.getName()
                + " har " + b.getEnergy() + " energi tilbage)");

        if (b.isActive()) {
            int damage2 = b.attack();
            a.setEnergy(a.getEnergy() - damage2);
            if (a.getEnergy() < 0) a.setEnergy(0);
            System.out.println(b.getName() + " angriber " + a.getName()
                    + " for " + damage2 + "! (" + a.getName()
                    + " har " + a.getEnergy() + " energi tilbage)");

            System.out.println();
        }
    }

    public Animal getWinner() {
       if (!a.isActive() && !b.isActive()) return null;
       if (!a.isActive()) return b;
       if (!b.isActive()) return a;
       return null;
    }

}
