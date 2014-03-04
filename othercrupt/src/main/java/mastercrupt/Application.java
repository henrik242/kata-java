package mastercrupt;

public class Application {

    public static void main(String[] args) {
        UI ui = new UI(new OtherLeeter());
        System.out.println(ui.leetMessage(args[0]));
    }
}