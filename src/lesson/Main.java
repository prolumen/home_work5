package lesson;

import java.io.IOException;

public class Main {
    public static  Double getSum3(Double var1, Double var2){
        return var1 + var2 + 2;
    }


    public static void main(String[] args) throws IOException {
        Calculate<Double> var;

        var = (a, b) -> a / b;
        System.out.println(var.exec(10d, 20d));
        var = var::getSum;
       // System.out.println(var.exec(10d, 20d));
        System.out.println(var.getSum(10d, 20d));
        System.out.println(var.getSum2(10d,20d));

        var =  Main::getSum3;
        System.out.println(var.exec(10d, 20d));
    }
}
