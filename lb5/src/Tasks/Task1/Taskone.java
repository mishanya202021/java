package Tasks.Task1;

import Tasks.Task;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Taskone implements Task {
    ArrayList<Books> books;


    public Taskone() throws IOException {
        books = read_from_file();
    }

    public void add() throws IOException {
        Books new_books = new Books();
        System.out.println("\n___________Введіть інформацію :___________");
        new_books.input();
        books.add(new_books);

        write_to_file();
    }

    public void edit() throws IOException {
        System.out.println("Перед мною такої задачі не стояло!");

    }

    public void print() throws IOException {
        count_note();

        int i = 0;
        System.out.println("\n_____Інформація про студентів :_____");
        for (var p :
                books) {
            System.out.println("\n____Студент №" + (i + 1) + " :____");
            p.output();
            i++;
        }
        System.out.println();
    }

    public void printlist() throws IOException {
        count_note();

        System.out.println("\n_____Інформація про студентів :_____\n");
        for (var p :
                books) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

    public void search() throws IOException {
        System.out.println("Перед мною такої задачі не стояло!");
    }

    public void sort() throws IOException {
        count_note();

        ArrayList<Books> sortbooks = new ArrayList<Books>(books);
        Scanner scanner = new Scanner(System.in);
        sortbooks.sort(Comparator.comparing(Books::getAvtor));

        System.out.println("\n======Відсортований список :======\n");
        for (var p :
                sortbooks) {
            System.out.println(p.toString());
        }
    }

    public void delete() throws IOException {
        System.out.println("Перед мною такої задачі не стояло!");
    }

    public void task() throws IOException {
        count_note();

        String name = "";
        for (var p : books) {
            int count = 0;
            name = p.getViddavnitstvo();
            for (var b : books) {
                if (name.equals(b.getViddavnitstvo())) {
                    count++;
                }
            }
            System.out.println("Кількість книг видавництва " + p.getViddavnitstvo() + "=" + count);
        }
    }

    private void count_note() throws IOException {
        if (books.size() == 0)
            throw new IOException("Записів нема!");
    }

    private static void isFile(String filepath) throws IOException {
        File file = new File(filepath);
        if (!file.isFile()) throw new IOException("Файл не знайдено!");
        //file.createNewFile();
    }

    public void write_to_file() throws IOException {
        isFile("book.txt");

        BufferedWriter output = new BufferedWriter(new FileWriter("book.txt"));
        for (var p :
                books) {
            output.write(p.to_string());
        }
        output.flush();
        output.close();
        output.close();
    }

    private static ArrayList<Books> read_from_file() throws IOException {
        isFile("book.txt");

        BufferedReader reader = new BufferedReader(new FileReader("book.txt"));
        String text;
        ArrayList<Books> arrayList = new ArrayList<>();
        while ((text = reader.readLine()) != null) {
            arrayList.add(new Books(text, text, text, Integer.parseInt(reader.readLine())));
        }
        reader.close();
        return arrayList;
    }
}