package home_work5;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Calculator{
    double var1, var2 ;
    String str;

    private Calculator(){
        Calc<Double> var;
        Enumeration<String> operation;
        Hashtable<String, Double> tab = new Hashtable<>();
        var = (a, b) -> a + b;

        Scanner scan = new Scanner(System.in);
        System.out.println("first num");
        var1 = scan.nextDouble();
        System.out.println("second num");
        var2 = scan.nextDouble();
        System.out.println("operation + - * /");
        str = scan.next();

        tab.put("+", var.exec(var1, var2));
        tab.put("*", var.getProd(var1, var2));
        tab.put("-", var.getDiff(var1, var2));
        tab.put("/", var.getQuot(var1, var2));

        operation = tab.keys();

        while (operation.hasMoreElements()){
            if (operation.nextElement().equals(str)){
                System.out.println("Resault:\t" + tab.get(str));
            }
        }

    }
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
    }
}
