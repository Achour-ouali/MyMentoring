package Arrays;
/* 0    1      2   3
0  a    b     c    d
1  a1   b1    c1   d1
2  a2   b2    c2   d2*/





public class Array2d {



    public static void main(String[] args) {
        String x[][]=new String[3][4];
        //1 row
        x[0][0]="a";
        x[0][1]="b";
        x[0][2]="c";
        x[0][3]="d";

        //2nd row
        x[1][0]="a1";
        x[1][1]="b1";
        x[1][2]="c1";
        x[1][3]="d1";



        //3rd row

        x[2][0]="a2";
        x[2][1]="b2";
        x[2][2]="c2";
        x[2][3]="d2";


        System.out.println(x[0][2]);
        System.out.println(x[1][3]);
        System.out.println(x[2][0]);

        System.out.println("***********************************************************************");
//if we want to print all the values from the array we have toi use for loop


        for (int row=0;row<x.length;row++){
            for (int col=0;col<x.length;col++){

                System.out.println(x[row][col]);
            }

        }




















    }












}
