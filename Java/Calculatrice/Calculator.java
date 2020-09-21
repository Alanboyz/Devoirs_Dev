import java.util.Scanner;

public class Calculator {
    public static void main(final String[] args) {
      final Scanner sc = new Scanner(System.in);

      final Calculator calc = new Calculator(sc);
      calc.run();

      sc.close();
    }

    private final String QUESTION = "\nVeux-tu effectuer une nouvelle opération ?" + " O / N";
    private final String OPERATION = "Type d'opération [+-/*%]: ";
    private final String END_MESSAGE = "La calculatrice a bien été fermée ! ;)";

    private final Scanner sc;
    private int nb1 = 0, nb2 = 0;
    private String operation = "";
    private String userResponse = "";

    Calculator(final Scanner pScanner) {
      this.sc = pScanner;
    }

    public void run() {
      mainLoop: while (!userResponse.equals("n")) {

        try {
          System.out.print("1er nombre: ");

          try {

            nb1 = sc.nextInt(); 

          }

          catch (final java.util.InputMismatchException e) {

            System.out.println("Ce n'est pas un chiffre !");

          }

          sc.nextLine();

          System.out.print(OPERATION);
          operation = sc.next();
          sc.nextLine();

          System.out.print("2ème nombre: ");
          nb2 = sc.nextInt();
          sc.nextLine();

          int result = 0;
          switch (operation) {

            case "+":

              result = nb1 + nb2;
              System.out.println("Ton opération : " + nb1 + " + " + nb2);
              System.out.println("Résultat de l'opération: " + result);
              break;

            case "-":
              result = nb1 - nb2;
              System.out.println("Ton opération : " + nb1 + " - " + nb2);
              System.out.println("Ton opération n'est pas logique");

              break;

            case "/":
              if (nb2 != 0) {
                result = nb1 / nb2;
                System.out.println("Ton opération : " + nb1 + " / " + nb2);
                System.out.println("Résultat de l'opération: " + result);
              } else
                System.out.println("Le 2ème nombre est nul, la devision par 0 est donc impossible");
              break;

            case "*":
              result = nb1 * nb2;
              System.out.println("Ton opération : " + nb1 + " * " + nb2);
              System.out.println("Résultat de l'opération: " + result);
              break;

            case "%":
              result = nb1 % nb2;
              System.out.println("Ton opération : " + nb1 + " % " + nb2);
              System.out.println("Résultat de l'opération: " + result);
              break;

            case "-/":
              result = nb1 / (-nb2);
              System.out.println("Ton opération : " + nb1 + operation + nb2);
              System.out.println("Navré mais je ne peux que faire des opérations à 2 entiers...");
              break;

            default:
              continue mainLoop;
          }

          System.out.println(QUESTION);
          userResponse = sc.nextLine();
        } catch (final Exception exception) {
        if (sc.hasNextLine())
         {
          sc.nextLine();

        }
      }
    }
    
    // Affichage
    System.out.println(END_MESSAGE);
    sc.close();
  }
}
