package inheritance;

public class PhoneG2 extends PhoneG1{

    private String G2storage;
    private String G2ScreenSize;
    private String G2display;
    public String G2shape;


    public PhoneG2() {
    }


    public PhoneG2(String g2storage) {
        G2storage = g2storage;
    }


    public PhoneG2(String g2storage, String g2ScreenSize) {
        G2storage = g2storage;
        G2ScreenSize = g2ScreenSize;
    }


    public PhoneG2(String g2storage, String g2ScreenSize, String g2display) {
        G2storage = g2storage;
        G2ScreenSize = g2ScreenSize;
        G2display = g2display;
    }


    public PhoneG2(String g2storage, String g2ScreenSize, String g2display, String g2shape) {
        G2storage = g2storage;
        G2ScreenSize = g2ScreenSize;
        G2display = g2display;
        G2shape = g2shape;
    }


    public String getG2storage() {
        return G2storage;
    }

    public void setG2storage(String g2storage) {
        G2storage = g2storage;
    }

    public String getG2ScreenSize() {
        return G2ScreenSize;
    }

    public void setG2ScreenSize(String g2ScreenSize) {
        G2ScreenSize = g2ScreenSize;
    }

    public String getG2display() {
        return G2display;
    }

    public void setG2display(String g2display) {
        G2display = g2display;
    }

    public String getG2shape() {
        return G2shape;
    }

    public void setG2shape(String g2shape) {
        G2shape = g2shape;
    }





    public void G2Storage(){
        System.out.println("phone G2 has 4G");
    }

    public void G2ScreenSize(){
        System.out.println("phone G2 has 4.9");
    }



    public void G2display(){
        System.out.println("phone G2 has acreage quality");
    }


    public void G2shape(){
        System.out.println("phone G2 has regular design");
    }
}
