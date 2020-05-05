package inheritance;

public class PhoneG1 {
    private String G1storage;
    private String G1ScreenSize;
    private String G1display;
    public String G1shape;


    public PhoneG1() {
    }


    public PhoneG1(String g1storage) {
        G1storage = g1storage;
    }

    public PhoneG1(String g1storage, String g1ScreenSize) {
        G1storage = g1storage;
        G1ScreenSize = g1ScreenSize;


    }

    public PhoneG1(String g1storage, String g1ScreenSize, String g1display) {
        G1storage = g1storage;
        G1ScreenSize = g1ScreenSize;
        G1display = g1display;
    }

    public PhoneG1(String g1storage, String g1ScreenSize, String g1display, String g1shape) {
        G1storage = g1storage;
        G1ScreenSize = g1ScreenSize;
        G1display = g1display;
        G1shape = g1shape;
    }

    public String getG1storage() {
        return G1storage;
    }

    public void setG1storage(String g1storage) {
        G1storage = g1storage;
    }

    public String getG1ScreenSize() {
        return G1ScreenSize;
    }

    public void setG1ScreenSize(String g1ScreenSize) {
        G1ScreenSize = g1ScreenSize;
    }

    public String getG1display() {
        return G1display;
    }

    public void setG1display(String g1display) {
        G1display = g1display;
    }

    public String getG1shape() {
        return G1shape;
    }

    public void setG1shape(String g1shape) {
        G1shape = g1shape;
    }



    public void G1Storage(){
        System.out.println("phone G1 has 1G");
    }

    public void G1ScreenSize(){
        System.out.println("phone G1 has 4.1");
    }



    public void G1display(){
        System.out.println("phone G1 has basic quality");
    }


    public void G1shape(){
        System.out.println("phone G1 has basic design");
    }


}
