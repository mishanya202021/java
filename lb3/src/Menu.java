


import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void menu(){
        try {
            Scanner scanner = new Scanner(System.in);
            Task2 task = new Task2();
            for(;;){
                System.out.print("\nВведіть команду : ");
                String command = scanner.nextLine();
                switch (command){
                    case "add":
                        task.add();
                        break;
                    case "edit":
                        task.edit();
                        break;
                    case "print":
                        task.print();
                        break;
                    case "search":
                        task.search();
                        break;
                    case "sort":
                        task.sort();
                        break;
                    case "delete":
                        task.delete();
                        break;
                    case "exit":
                        return;
                    case "help":
                        System.out.println("\nadd - додати фільм" + "\n" +
                                "edit - редагувати фільм" + "\n" +
                                "print - висести список фільмів" + "\n" +
                                "search - пошук фільма" + "\n" +
                                "sort - сортування фільмів" + "\n" +
                                "delete - видалити фільм" + "\n" +
                                "exit - вихід");
                        break;
                    default:
                        System.err.print("Не вірно введена команда(help - допомога)! Введіть ще раз :");
                        break;
                }
            }
        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
