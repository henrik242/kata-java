package mastercrupt;

public class UI {

    private SuperLeeter leeter;
    private String leeted;

    public UI(SuperLeeter leeter) {
        this.leeter = leeter;
    }

    public String leetMessage(String unLeeted) {
        leeted = this.leeter.leet(unLeeted);
        return "Leeted: " + leeted;
    }
}