package Tasks.Task1;

import java.util.Scanner;


public class Books {
    String avtor;
    String name;
    String viddavnitsvo;
    int year;

    public Books(){
    avtor = "";
    name ="";
    viddavnitsvo = "";
    year = 0;
    }

    public Books(String avtor , String name , String viddavnitsvo , int year){
        this.avtor = avtor;
        this.name = name;
        this.viddavnitsvo = viddavnitsvo;
        this.year = year;
    }
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Автор : ");
        avtor = scanner.nextLine();
        System.out.print("Назва книги : ");
        name = scanner.nextLine();
        System.out.println("Назва видавництва");
        viddavnitsvo = scanner.nextLine();
        System.out.print("Рік видавництва : ");
        year = scanner.nextInt();
    }

    void output() {
        System.out.println("Автор - " + avtor);
        System.out.println("Назва книги - " + name);
        System.out.println("Назва видавництва - " + viddavnitsvo);
        System.out.println("Рік видавництва - " + year);
    }


    @Override
    public String toString() {
        System.out.println("Автор\t\t"+"Назва книги\t\t"+"Hазва видавництва\t\t"+"Pік видавництва");
        return avtor + '\t' + '\t' +
                name + '\t' + '\t' +
                viddavnitsvo + '\t' + '\t' +
                year;
    }

    public String to_string() {
        return avtor + '\n' + name + '\n' + viddavnitsvo + '\n' + year +'\n';
    }

    //гетери
    public String getAvtor() {return avtor;}
    public String getName() {return name;}
    public String getViddavnitstvo() {return viddavnitsvo;}
    public int getYear() {return year;}

    //сетери
    public void setAvtor(String avtor) {this.avtor = avtor;}
    public void setName(String name) {this.name = name;}
    public void setViddavnitsvo(String viddavnitsvo) {this.viddavnitsvo = viddavnitsvo;}
    public void setYear(int year) {this.year = year;}
}
