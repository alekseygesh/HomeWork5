import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String reg = "^[0-9]*[.]?[0-9]+$";

        //System.out.println("Введите первое число и нажмите Enter: ");
        //int x = Integer.parseInt(buffer.readLine());

        String xx;
        do {
            System.out.println("Введите первое число и нажмите Enter: ");
            xx = buffer.readLine();
        } while (!(xx.matches(reg)));
        double x = Double.parseDouble(xx);

        String yy;
        do {
            System.out.println("Введите второе число и нажмите Enter: ");
            xx = buffer.readLine();
        } while (!(xx.matches(reg)));
        double y = Double.parseDouble(xx);

        String z = "a";
        do {
            System.out.println("Введите арифметическую операцию (+,-,*,/) и нажмите Enter: ");
            z = buffer.readLine();
        }
        while (!z.equals("-") && !z.equals("+") && !z.equals("*") && !z.equals("/"));

        if ((y == 0) & (z == "/")) {
            System.out.println("значение стремится к бесконечности");
        } else {
            double itog = 0;

            switch (z) {
                case "+":
                    itog = x + y;
                    break;
                case "-":
                    itog = x - y;
                    break;
                case "*":
                    itog = x * y;
                    break;
                case "/":
                    itog = x / y;
            }
            System.out.println(x + z + y + " = " + String.format("%.3f",itog));
        }
    }
    }