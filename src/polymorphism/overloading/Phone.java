package polymorphism.overloading;

public class Phone {

    public void mobile(){
        String G1;
        String G2;
    }

    public void mobile(String s1,String s2){
        String G1=s1;
        String G2=s2;
        String G3=s1+s2;

        System.out.println("G3 is a mix between "+G3);
    }

    public void mobile(String s1,String s2,String s3){
        String G1=s1;
        String G2=s2;
        String G3=s3;
        String G4=s1+s2+s3;
        System.out.println("G4 is a mix "+G4);
    }






}
