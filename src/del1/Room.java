package del1;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name) {

        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount () {
        return lamps.size();
    }

    public int getTotalWatt() {
        int total = 0;
        for (Lamp lamp : lamps) {
            total += lamp.getWatt();
        }
        return total;
    }

    public int getTotalWindowArea() {
        int total = 0;
        for (Window window : windows) {
            total += window.getAreaCM2();
        }
        return total;
    }

    void printRoom() {
        System.out.println(name + " (" + lamps.size() + " lamper, " + windows.size() + " vinduer)");

        System.out.print("- Lamper: ");
        for (int i = 0; i < lamps.size(); i++) {
            System.out.print(lamps.get(i));
            if (i < lamps.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" (Total: " + getTotalWatt() + "W");

        System.out.println();

        System.out.print("- Vindue: ");
        for (int i = 0; i < windows.size(); i++) {
            System.out.print(windows.get(i));
            if (i < windows.size() - 1) {
                System.out.print(", ");
            }
        }

    }



}


