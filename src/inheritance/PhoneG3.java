package inheritance;

public class PhoneG3 extends PhoneG2{


    private String G3storage;
    private String G3ScreenSize;
    private String G3display;
    public String G3shape;

    public PhoneG3() {
    }

    public PhoneG3(String g3storage) {
        G3storage = g3storage;
    }

    public PhoneG3(String g3storage, String g3ScreenSize) {
        G3storage = g3storage;
        G3ScreenSize = g3ScreenSize;
    }


    public PhoneG3(String g3storage, String g3ScreenSize, String g3display) {
        G3storage = g3storage;
        G3ScreenSize = g3ScreenSize;
        G3display = g3display;
    }


    public PhoneG3(String g3storage, String g3ScreenSize, String g3display, String g3shape) {
        G3storage = g3storage;
        G3ScreenSize = g3ScreenSize;
        G3display = g3display;
        G3shape = g3shape;
    }


    public String getG3storage() {
        return G3storage;
    }

    public void setG3storage(String g3storage) {
        G3storage = g3storage;
    }

    public String getG3ScreenSize() {
        return G3ScreenSize;
    }

    public void setG3ScreenSize(String g3ScreenSize) {
        G3ScreenSize = g3ScreenSize;
    }

    public String getG3display() {
        return G3display;
    }

    public void setG3display(String g3display) {
        G3display = g3display;
    }

    public String getG3shape() {
        return G3shape;
    }

    public void setG3shape(String g3shape) {
        G3shape = g3shape;
    }



    public void G3Storage(){
        System.out.println("phone G3 has 64/128G");
    }

    public void G3ScreenSize(){
        System.out.println("phone G3 has 6.1");
    }



    public void G3display(){
        System.out.println("phone G3 has hd quality");
    }


    public void G3shape(){
        System.out.println("phone G3 has modern design");
    }




}
