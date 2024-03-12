public class Performer {
    private String unitName;
    private String[] members;


    public Performer(String name, String[] memberNames) {
        unitName = name;
        members = memberNames;
    }


    public void perform() {
        System.out.println("Start the music!!");
        System.out.println("2 hours later...");
        System.out.println("That was a great show, " + unitName + "! Can't wait to see you perform again!");
    }

}
