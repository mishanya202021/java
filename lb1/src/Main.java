import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Перше завдання");
        System.out.println("2. Друге завдання");
        System.out.println("3. Третє завдання");
        System.out.println("4. Четверте завдання");
        System.out.println("5.Вихід");
        System.out.println("Введіть номер завдання");
        int num = scanner.nextInt();
        while (num != 5) {
            switch (num) {
                case 1:
                    try {
                        task1();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                default:
                    System.out.println("");
            }
            System.out.println("1. Перше завдання");
            System.out.println("2. Друге завдання");
            System.out.println("3. Третє завдання");
            System.out.println("4. Четверте завдання");
            System.out.println("5.Вихід");
            System.out.println("Введіть номер завдання");
            num = scanner.nextInt();
        }
    }
    public static void task1() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер квартири ");
        int p = scanner.nextInt();
        if (p == 0) throw new IOException("Такої квартири немає!");
        if (p > 45) throw new IOException("Такої квартири немає!");
        if (p >= 1 && p <= 5) {
            System.out.println("Перший поверх");
        }
        if (p > 5 && p <= 10) {
            System.out.println("Другий поверх");
        }
        if (p > 10 && p <= 15) {
            System.out.println("Третій поверх");
        }
        if (p > 15 && p <= 20) {
            System.out.println("Четвертий");
        }
        if (p > 20 && p <= 25) {
            System.out.println("П'ятий поверх");
        }
        if (p > 25 && p <= 30) {
            System.out.println("Шостий поверх");
        }
        if (p > 30 && p <= 35) {
            System.out.println("Сьомий поверх");
        }
        if (p > 35 && p <= 40) {
            System.out.println("Восьмий поверх");
        }
        if (p > 40 && p <= 45) {
            System.out.println("Дев'ятий поверх");
        }
        double number=p/5;
        if(p%5!=0){
            number++;
        }
        System.out.println(String.format("%.0f", number)+" поверх");
        System.out.println();
    }
    public static void task2() {
        int a = -6 , b= 3;
        double d = 0.75;
        System.out.println("X=\t\tY=");
        for(double x = a; x <= b; x += d){
            double y = Math.pow(x,3);
            System.out.println(String.format("%.2f", x) + "\t"+ String.format("%.3f", y));
        }
        System.out.println("");
    }
    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмірність масиву:");
        int size = scanner.nextInt();
        while(true) {
            if (size <= 0){
                System.out.println("Невірно введений масив!");
                System.out.println("Введіть кількість елементів масиву:");
                size = scanner.nextInt();
            }
            else break;
        }
        int[] mas = new int[size];
        System.out.println("1.Ввести масив з клавіатури.");
        System.out.println("2.Рандомний масив.");
        System.out.print("Введіть номер : ");
        int num = scanner.nextInt();
        while (true) {
            if (num != 1 && num != 2) {
                System.out.println("Невірний номер");
                System.out.println("1.Ввести масив з клавіатури.");
                System.out.println("2.Рандомний масив.");
                System.out.print("Введіть номер : ");
                num = scanner.nextInt();
            } else break;
        }
        if(num == 1){
            for(int i=0;i<mas.length; i++){
                System.out.println("A [" + i + "] =");
                mas[i] = scanner.nextInt();
            }
        }
        if(num ==2){
            Random random = new Random();
            for (int i = 0; i < mas.length; i++) {
                mas[i] = random.nextInt(200) - 100;
            }
        }
        System.out.println("Your array:");
        for (int i : mas) {
            System.out.print(i + " ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<mas.length;i++){
            if(i > 1 && i%2 == 0){
                sum=sum+mas[i];
            }
        }
        System.out.println("Сума елементів масиву на парних місцях :  "+sum);
        int max=mas[0],maxi=0, suma=0;
        for(int i=0;i<mas.length;i++){
            if(Math.abs(mas[i])>=Math.abs(max)) {
                max = mas[i];
            maxi=i;
            }
        }
        for(int i =0;i<maxi;i++){
            suma+=mas[i];
        }
        System.out.println("Максимальний елемент по модулю : " + Math.abs(max));
        System.out.println("Сума елементів до максимального елементу  : " + suma);
    }
    public static void task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір матриці : ");
        int n = scanner.nextInt();
        while (true){
            if (n <= 0) {
                System.out.println("Не вірно введена розмірність!!! Повторіть спробу :");
                System.out.print("Введіть розмір матриці : ");
                n = scanner.nextInt();
            }
            else break;
        }
        int m = n;
        int[][] mas = new int[n][m];
        System.out.println("1.Ввести матрицю з клавіатури.");
        System.out.println("2.Згенерувати матрицю.");
        System.out.print("Введіть число : ");
        int num = scanner.nextInt();
        while (true) {
            if (num != 1 && num != 2) {
                System.out.println("Не вірно введене число!!! Повторіть спробу :");
                System.out.println("1.Ввести матрицю з клавіатури.");
                System.out.println("2.Згенерувати матрицю.");
                System.out.print("Введіть число : ");
                num = scanner.nextInt();
            } else break;
        }

        if (num == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("A [" + i + "][" + j + "] = ");
                    mas[i][j] = scanner.nextInt();
                }
            }
        }
        if (num==2){
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mas[i][j] = random.nextInt(200) - 100;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("");
        int sum=0;
        int g=m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j+1==g){
                sum+=mas[i][j];
                }
            }
            g--;
        }
        System.out.println("Сума бічної діагоналі :  "+sum);
    }
    }

