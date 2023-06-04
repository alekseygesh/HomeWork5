import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число и нажмите Enter: ");
        int x = Integer.parseInt(buffer.readLine());

        System.out.println("Введите второе число и нажмите Enter: ");
        int y = Integer.parseInt(buffer.readLine());

        String z = "a";
        do{System.out.println("Введите арифметическую операцию (+,-,*,/) и нажмите Enter: ");
           z = buffer.readLine();
        }
        while(!z.equals("-") && !z.equals("+") && !z.equals("*") && !z.equals("/"));

        if ((y == 0) & (z == "/")) {
            System.out.println("значение стремится к бесконечности");}
        else{
                int itog = 0;

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
                System.out.println(x + z + y + " = " + itog);
            }
        }
    }