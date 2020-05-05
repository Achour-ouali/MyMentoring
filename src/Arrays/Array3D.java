package Arrays;

public class Array3D {
    public static void main(String[] args) {


        String [][][] mobil=new String[4][5][5];


        mobil[0][0][0]="brand";
        mobil[0][0][1]="mobil name";
        mobil[0][0][2]="price";
        mobil[0][0][3]="storage";
        mobil[0][0][4]="camera";



        mobil[0][1][0]="iphone";
        mobil[0][2][1]="iphone 11";
        mobil[0][03][2]="1000";
        mobil[0][4][3]="256G";
        mobil[0][0][4]="HD";

        System.out.println(mobil[0][0][2]);
        System.out.println(mobil[0][2][1]);


        for (String [][] lamara:mobil) {
            for (String [] salah:lamara) {
                for (String ashor:salah) {
                    System.out.println(ashor);
                }

            }

        }






















}}





