import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Завданння 1");
        System.out.println("2.Завданння 2");
        System.out.println("3.Завдання 3");
        System.out.println("4.Вихід");
        System.out.println("Введіть число : ");
        int num = scanner.nextInt();

        while(num != 4){
            switch (num){
                case 1:
                    try {
                        System.out.println("\nЗавданння 1 :");
                        Task.task1();
                        System.out.println();
                    }
                    catch (IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("\nЗавданння 2 :");
                        Task.task2("D:\\учоба\\GitHub Repository\\java\\lb2\\sport.txt");
                    }
                    catch (IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    //try {
                        System.out.println("\nЗавданння 3 :");
                       // Tasks.task3("D:\учоба\GitHub Repository\java\lb2\\input.txt", "D:\учоба\GitHub Repository\java\lb2\\output.txt");
                   // }
                   // catch (IOException ex){
                    //    System.out.println(ex.getMessage());
                   // }
                    break;
                default:
                    System.out.println("Не вірно введене число!Введіть ще раз :");
                    break;
            }
            System.out.println("1.Завданння 1");
            System.out.println("2.Завданння 2");
            System.out.println("3.Завдання 3");
            System.out.println("4.Вихід");
            System.out.println("Введіть число : ");
            num = scanner.nextInt();
        }
    }
}
