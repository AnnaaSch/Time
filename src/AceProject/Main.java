package AceProject;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите действие 1-сложение,2-вычииание");

        int znak = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        if (znak == 1){
            int result = a+b;
            System.out.println(result);
        }



    }
}
