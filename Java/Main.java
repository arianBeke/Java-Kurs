import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn ditt navn:");
        String navn = scanner.nextLine();

        System.out.println("Skriv inn din alder:");
        int alder = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Skriv inn din skole:");
        String skole = scanner.nextLine();

        System.out.println("Hei, " + navn + "! Du er " + alder + " år gammel og går på " + skole + ".");
        
        scanner.close();
    }
}

