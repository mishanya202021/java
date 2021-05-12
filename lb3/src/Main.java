import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.Завдання 1");
            System.out.println("2.Завдання 2");
            System.out.println("3.Exit");
            System.out.println("Введіть номер : ");
            int nomer = scanner.nextInt();
            switch (nomer){
                case 1:
                    System.out.println("first task");
                    Task1();
                    break;
                case 2:
                    System.out.println("second task");
                    //Task2();
                    break;
                case 3:
                    return;
                default:
                    System.err.println("Не вірно введене число! Введіть ще раз :");
                    break;
            }
        }
    }
    public static void Task1(){

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Ввід з клавіатури");
            System.out.println("2.Робота з введеними даними");
            int nomer = scanner.nextInt();
            switch (nomer) {
                case 1:
                    Info information = new Info();
                    information.add();

                    break;
                case 2:
                    ArrayList<Info> list = new ArrayList<Info>();
                    list.add(new Info(10, 3, 2020, 22, 100));
                    list.add(new Info(30, 5, 2020, 15, 80));
                    list.add(new Info(1, 4, 2020, 27, 88));
                    list.add(new Info(15, 3, 2020, 12, 78));
                    list.add(new Info(29, 4, 2020, 19, 83));
                    System.out.println("Information : ");
                    double midl = 0;
                    int k = 0;
                    for (Info inf : list) {
                        System.out.println(inf.toString());
                        midl += inf.getTempr();
                        k++;
                    }
                    midl = midl / k;
                    System.out.println("Midl temperature" + midl);
                    for (Info info : list) {
                        if (info.getTempr() > midl) {
                            System.out.println(info.toString());
                        }
                    }
                break;
            }
        }
    }
}
