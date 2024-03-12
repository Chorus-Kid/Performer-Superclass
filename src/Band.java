public class Band extends Performer {
    private String[] instruments;
    private boolean soundChecked;


    public Band(String name, String[] memberNames, String[] instruments, boolean soundCheck) {
        super(name, memberNames);
        this.instruments = instruments;
        soundChecked = soundCheck;
    }


    public void soundCheckGo() {
        System.out.println("Alright, sound check time!");
        System.out.println("One, two...");
        System.out.println("*BAWOOOOOM*");
        System.out.println("Soundcheck success! Good luck on your performance!");
        soundChecked = true;
    }

}
