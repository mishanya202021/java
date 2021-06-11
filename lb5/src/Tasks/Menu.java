package Tasks;


import Tasks.Task1.Taskone;
//import Tasks.Task2;

import java.io.IOException;
import java.util.Scanner;


public class Menu {
    public static void menu() {
            Scanner scanner = new Scanner(System.in);
            for (; ; ) {
                System.out.print("1.Перше завдання." + "\n" +
                        "2.Друге завдання." + "\n" +
                        "3.Вихід." + "\n" +
                        "Введіть число : ");
                int nomer = scanner.nextInt();
                switch (nomer) {
                    case 1:
                        try {
                            TaskOne();
                        }catch (IOException ex) {
                            System.err.println(ex.getMessage());
                        }
                        break;
                    case 2:

                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Не вірно введене число! Введіть ще раз :");
                        break;
                }
            }
        }

        public static void TaskOne()throws IOException{
            Scanner scanner = new Scanner(System.in);
            Taskone task = new Taskone();
            for (; ; ) {
                try {
                    System.out.print("\nВведіть команду : ");
                    String command = scanner.nextLine();

                    switch (command) {
                        case "add" -> task.add();
                        case "edit" -> task.edit();
                        case "print" -> task.print();
                        case "printlist" -> task.printlist();
                        case "search" -> task.search();
                        case "sort" -> task.sort();
                        case "delete" -> task.delete();
                        case "task" -> task.task();
                        case "exit" -> {
                            return;
                        }
                        case "help" -> {
                            System.out.println("\nadd - додати інформацію " + "\n" +
                                    "edit - редагувати інформацію " + "\n" +
                                    "print - висести інформацію " + "\n" +
                                    "printlist - висести інформацію  у вигляді таблиці" + "\n" +
                                    "search - пошук інформації " + "\n" +
                                    "sort - сортування інформації " + "\n" +
                                    "delete - видалити інформацію " + "\n" +
                                    "task - кількість книжок від одного видавництва" + "\n" +
                                    "exit - вихід");
                        }
                        default -> System.err.print("Не вірно введена команда(help - допомога)! Введіть ще раз :");
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
}
