import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ввод числа */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x:");
        double x = sc.nextDouble();
        sc.close();
        System.out.println("x= " +x);

        /* проверка условий */
        if(x<=-1){
            double y = ( Math.pow(x,6) * Math.log10(Math.abs(Math.pow(6, x)-Math.pow(Math.abs(x-5), x))) );
            System.out.println("y(x)= "+y);
        }else if(x>=-1 && x<1) {
            double y = ( Math.sin(x/(1-2*Math.pow(x, 2))) );
            System.out.println("y(x)= "+y);
        }else if(x>=1){
            double y = ( Math.asin(1/Math.pow(x, 4)) );
            System.out.println("y(x)= "+y);
        }
    }
}
