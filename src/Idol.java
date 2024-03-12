public class Idol extends Performer{
    private String[] managers;
    private boolean warmedUp;

    public Idol(String name, String[] memberNames, String[] managers, boolean warmedUp) {
        super(name, memberNames);
        this.managers = managers;
        this.warmedUp = warmedUp;
    }

    public void warmUp() {
        System.out.println("Vocal warm up time!");
        System.out.println("Do re mi fa so la ti do!");
        System.out.println("NinetyninenunsinanIndianaNunnery...");
        System.out.println("And done! Good luck out there guys!");
        warmedUp = true;
    }
}
