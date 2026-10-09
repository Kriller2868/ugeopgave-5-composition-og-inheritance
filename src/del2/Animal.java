package del2;

public abstract class Animal {
    private String name;
    private int energy;

    public abstract int attack();

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isActive() {
        if (energy > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " \"" + name +  "\" (energi: " +  energy + ")";
    }

}
