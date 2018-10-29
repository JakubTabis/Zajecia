import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        email();

    }

    private static void email() {
        String nameOrExit;
        List<String> listOfMails = new ArrayList<>();
        int count = 1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj imie i nazwisko lub 'exit'");
            nameOrExit = input.nextLine();
            if (!nameOrExit.equalsIgnoreCase("exit")) {
                String modifyName = nameOrExit.replace(" ", ".");
                String modifiedMail = modifyName + "@gmail.com";

                for (String oneMail : listOfMails) {
                    if (oneMail.equals(modifiedMail)) {
                        modifiedMail = modifyName + count + "@gmail.com";
                        count++;
                    }
                }
                listOfMails.add(modifiedMail);
                System.out.println("Twoj e-mail to: " + modifiedMail);
            }
        } while (!"exit".equalsIgnoreCase(nameOrExit));
            System.exit(0);

    }

}
