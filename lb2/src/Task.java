import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Task {
    /*14.  а)  знищує  всі  слова,  які  починаються  і  закінчуються  за  одну  й  ту  ж  літеру;
    б)  підраховує кількість різних слів, що входять до заданого тексту.*/
    public static void task1() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок : ");
        String str = scanner.nextLine();
        System.out.println("Введений рядок :\n" + str);
        String[] p = str.split(" ");
        if (str.length()==0 || p.length == 0) {
            throw new IOException("Не був введений рядок!");
        }
        String k = "";
        for (String word:p) {
            if (word.charAt(0) != word.charAt(word.length() - 1)){
                k += word + " ";
            }
        }
        System.out.println("\nОтриманий рядок після видалення слів :\n" + k);
        int j=0;
        for(String words :p)
        {
           int t=-1;
            for (String perevirka : p)
            {
                if (words.equals(perevirka))
                {
                   t++;
                }
            }
            if(t <= 0){
                j++;
            }
        }
        System.out.println("\nКількість різних слів: " + j);
        System.out.println();
    }

/*14. Записати у файл sport.txt, що знаходитиметься на диску D прізвища та результати 3 переможців олімпіади  з  інформатики.
Вивести  вміст  файлу  на  екран  для  візуального  контролю.  Внести  в кінець файлу прізвище та ім'я голови журі.*/
    public static void task2 (String path)throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть прізвища та результати 3 студентів");
        System.out.println("Введіть прізвище 1 студента");
        String firstname = scanner.nextLine();
        System.out.println("Введіть результат 1 студента");
        String first = scanner.nextLine();

        System.out.println("Введіть прізвище 2 студента");
        String second_name = scanner.nextLine();
        System.out.println("Введіть результат 2 студента");
        String second = scanner.nextLine();

        System.out.println("Введіть прізвище 3 студента");
        String third_name = scanner.nextLine();
        System.out.println("Введіть результат 3 студента");
        String third = scanner.nextLine();

        String text ="" ;
        text += "Прізвище 1 студент : "+firstname +"\n-Бал 1 студента : "+ first+"\n-Прізвище 2 студента :"+second_name+"\n-Бал 2 студента : "+second+"\n-Прізвище 3 студента : "+third_name+"\n-Бал 3 студента : "+third;
        outputFile(path,text);
        String inputtext = inputFile(path);

        String[] words = inputtext.split("-");

        if(words.length <= 0) throw new IOException("Файл пустий.");
        System.out.println("Інформація про студентів :");
        for(String word : words){
            System.out.println(word);
        }
        System.out.println();
        System.out.println("Введіть голову журі : ");
        text +="\n-Голова журі : "+ scanner.nextLine();
        outputFile(path,text);
    }

    public static void task3(String input,String output)throws IOException{
        String inputtext = inputFile(input);
        int kilk=0;
        String[] words = inputtext.split("");
        if(words.length <= 0) throw new IOException("Файл пустий.");
        System.out.println("Текст з файлу :"+inputtext);
        for(String word : words){
            kilk++;
        }
        System.out.println("Кількість символів в масиві : " + kilk);
        outputFile(output, Integer.toString(kilk));
    }

    //
    //Робота з файлами
    //

    private static void isFile(String path) throws IOException{
        File file = new File(path);
        if(!file.isFile()) throw new IOException("Файл не знайдено!");
    }

    private static void outputFile(String path, String text) throws IOException{
        isFile(path);

        BufferedWriter output = new BufferedWriter(new FileWriter(path));
        output.write(text);
        output.flush();
        output.close();
    }

    private static String inputFile(String path) throws IOException {
        isFile(path);

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String text;
        StringBuilder lines = new StringBuilder();
        while ((text = reader.readLine()) != null) {
            lines.append(text);
        }
        reader.close();
        return lines.toString();
    }
}
