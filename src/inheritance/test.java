package inheritance;

public class test {
    public static void main(String[] args) {

        //single level display
        PhoneG2 MyPhoneG2=new PhoneG2();
        MyPhoneG2.G2display();
        MyPhoneG2.G2ScreenSize();
        MyPhoneG2.G2Storage();



        PhoneG1 MyPhoneG1=new PhoneG2();
        MyPhoneG1.G1display();
        MyPhoneG1.G1ScreenSize();
        MyPhoneG1.G1Storage();

        System.out.println("****************************************************************");

        //multi level

        PhoneG3 MyPhoneG3=new PhoneG3();
        MyPhoneG3.G3display();
        MyPhoneG3.G3ScreenSize();
        MyPhoneG3.G3Storage();
        MyPhoneG3.G2ScreenSize();
        MyPhoneG3.G2shape();



        //hierarchical level
        PhoneG3Prime MyPhoneG3P=new PhoneG3Prime();
        MyPhoneG3P.G2display();
        MyPhoneG3P.G3PStorage();
        MyPhoneG3P.G1ScreenSize();































    }





















}
