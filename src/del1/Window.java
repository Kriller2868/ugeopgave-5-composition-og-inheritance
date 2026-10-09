package del1;

public class Window {

    private int widthCM;
    private int heightCM;

    public Window(int heightCM, int widthCM) {
        this.widthCM = widthCM;
        this.heightCM = heightCM;
    }

    public int getAreaCM2() {
        return heightCM * widthCM;
    }

    public static void main() {
        Window window = new Window(120, 90);
        System.out.println(window);
    }

    @Override
    public String toString() {
        return heightCM + "x" +widthCM + "Cm" ;
    }
}

