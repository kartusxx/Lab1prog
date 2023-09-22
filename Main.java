import java.util.Arrays;
import java.util.Random;

public class Main {
    public static double Func1(double x){
        return Math.atan(Math.sin(Math.asin(0.2*((x-1)/2)*Math.E+1)));
    }
    public static double Func2(double x){
        return Math.log(Math.pow(Math.tan(Math.tan(Math.atan((x-1)/2*Math.E+1))),2));
    }
    public static double Func3(double x){
        return Math.pow((0.5/(Math.tan(Math.log(Math.pow((3/Math.abs(x)),x))) - 1)),3);
    }

    public static void main(String[] args) {
        //одномерный массив c
        short[] c = {6,8,10,12,14,16};
//        System.out.println(Arrays.toString(c));

        //рандомный массив x
        Random rand = new Random();
        float[] x =new float[12];
        for (int i=0;i<12;i++){
            x[i]= rand.nextFloat(-11,9);
        }
//        System.out.println(Arrays.toString(x));

        //двумерный массив c1
        double[][] c1 = new double[6][12];
//        System.out.println(Arrays.deepToString(c1));
        for (int i =0; i<=5;i++){
            for (int j =0; j<=11;j++){
                if (c[i]==8){
                    c1[i][j] = Main.Func1(x[j]);
                } else if (c[i]==10 || c[i]==12 ||c[i]==16) {
                    c1[i][j] = Main.Func2(x[j]);
                } else {
                    c1[i][j] = Main.Func3(x[j]);
                }
            }
        }

        for (int i =0; i<=5;i++){
            for (int j =0; j<=11;j++){
                System.out.printf("%10.3f", c1[i][j]);
            }
            System.out.print("\n");
        }



    }

}