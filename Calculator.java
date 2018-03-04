import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String act = scan.nextLine();       //ввод строки в консоль
            String[] numb = act.split("[*/+-]");
            double[] numbers = new double[numb.length];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Double.valueOf(numb[i]);
            }
            String[] operator = act.split("\\d+");//  \\d+ совпадение с одним или неск.десятичными цифрами
            double res;
            res = numbers[0];
            for (int i = 1; i < operator.length; i++) {

                if (operator[i].equalsIgnoreCase("*")) {
                    res = res * numbers[i];
                }
                if (operator[i].equalsIgnoreCase("/")) {
                    res = res / numbers[i];
                }

                if (operator[i].equalsIgnoreCase("+")) {
                    res = res + numbers[i];
                }
                if (operator[i].equalsIgnoreCase("-")) {
                    res = res - numbers[i];
                }
                System.out.println("="+res);



            }
        }
    }



