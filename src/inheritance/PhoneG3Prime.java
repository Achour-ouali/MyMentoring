package inheritance;

public class PhoneG3Prime extends PhoneG2 {

    private String G3Pstorage;
    private String G3PScreenSize;
    private String G3Pdisplay;
    public String G3Pshape;


    public PhoneG3Prime() {
    }


    public PhoneG3Prime(String g3Pstorage) {
        G3Pstorage = g3Pstorage;
    }

    public PhoneG3Prime(String g3Pstorage, String g3PScreenSize) {
        G3Pstorage = g3Pstorage;
        G3PScreenSize = g3PScreenSize;
    }


    public PhoneG3Prime(String g3Pstorage, String g3PScreenSize, String g3Pdisplay) {
        G3Pstorage = g3Pstorage;
        G3PScreenSize = g3PScreenSize;
        G3Pdisplay = g3Pdisplay;
    }


    public PhoneG3Prime(String g3Pstorage, String g3PScreenSize, String g3Pdisplay, String g3Pshape) {
        G3Pstorage = g3Pstorage;
        G3PScreenSize = g3PScreenSize;
        G3Pdisplay = g3Pdisplay;
        G3Pshape = g3Pshape;
    }

    public String getG3Pstorage() {
        return G3Pstorage;
    }

    public void setG3Pstorage(String g3Pstorage) {
        G3Pstorage = g3Pstorage;
    }

    public String getG3PScreenSize() {
        return G3PScreenSize;
    }

    public void setG3PScreenSize(String g3PScreenSize) {
        G3PScreenSize = g3PScreenSize;
    }

    public String getG3Pdisplay() {
        return G3Pdisplay;
    }

    public void setG3Pdisplay(String g3Pdisplay) {
        G3Pdisplay = g3Pdisplay;
    }

    public String getG3Pshape() {
        return G3Pshape;
    }

    public void setG3Pshape(String g3Pshape) {
        G3Pshape = g3Pshape;
    }


    public void G3PStorage(){
        System.out.println("phone G3P has 256G");
    }

    public void G3PScreenSize(){
        System.out.println("phone G3P has 5.9");
    }



    public void G2display(){
        System.out.println("phone G3P has HD quality");
    }


    public void G3Pshape(){
        System.out.println("phone G3P has regular design");
    }



}
