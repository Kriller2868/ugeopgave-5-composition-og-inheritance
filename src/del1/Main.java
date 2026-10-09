package del1;

public class Main {
    public static void main (String[] args) {

        Building building = new Building("Kontorbygning");
        building.printBuilding();

        Room room1 = new Room("Mødelokale");
        room1.addLamp(new Lamp(60));
        room1.addLamp(new Lamp(60));
        room1.addLamp(new Lamp(100));
        room1.addWindow(new Window(120, 90));
        room1.addWindow(new Window(120, 90));
        building.addRoom(room1);

        room1.printRoom();

        System.out.println();
        System.out.println();

        Room room2 = new Room("Køkken");
        room2.addLamp(new Lamp(40));
        room2.addLamp(new Lamp(40));
        room2.addWindow(new Window(60, 60));
        building.addRoom(room2);
        room2.printRoom();

        Room room3 = new Room("Kontor");
        room3.addLamp(new Lamp(80));
        room3.addLamp(new Lamp(80));
        room3.addLamp(new Lamp(80));
        building.addRoom(room3);

        System.out.println();
        System.out.println();

        System.out.print("Total: " + building.getTotalLampCount()+" lamper" + ", " + building.getTotalWatt() + "W");




    }

}
