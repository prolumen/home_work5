package home_work5;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) throws IOException {
        Double var1, var2;
        String str;
        Enumeration<String> operation;
        Hashtable<String, Calc<Double>> tab = new Hashtable<>();

        tab.put("-", (a, b) -> a - b);
        tab.put("+", (a, b) -> a + b);
        tab.put("*", (a, b) -> a * b);
        tab.put("/", (a, b) -> a / b);

        Scanner scan = new Scanner(System.in);
        System.out.println("first num");
        var1 = scan.nextDouble();
        System.out.println("second num");
        var2 = scan.nextDouble();
        System.out.println("operation + - * /");
        str = scan.next();

        operation = tab.keys();

        while (operation.hasMoreElements()){
            if (operation.nextElement().equals(str)){
                System.out.println("Resault:\t" + tab.get(str).exec(var1, var2));
            }
        }
    }
}
