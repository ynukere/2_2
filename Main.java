import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  System.out.println("Wprowadz dowolny tekst");

    Scanner scan = new Scanner(System.in);
    String tekst = scan.nextLine();
    tekst = tekst.replaceAll(" ", "_");
        System.out.println(tekst);

    }
}