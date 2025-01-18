import java.util.Scanner;

public class Menu implements userInterface {
    @Override
    public void title() {
        System.out.print("""
                 ██████╗ █████╗ ██████╗ ██████╗ ████████╗██████╗  ██████╗ ███╗   ██╗ █████╗ ███████╗
                ██╔════╝██╔══██╗██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔═══██╗████╗  ██║██╔══██╗██╔════╝
                ██║     ███████║██████╔╝██║  ██║   ██║   ██████╔╝██║   ██║██╔██╗ ██║███████║███████╗
                ██║     ██╔══██║██╔══██╗██║  ██║   ██║   ██╔══██╗██║   ██║██║╚██╗██║██╔══██║╚════██║
                ╚██████╗██║  ██║██║  ██║██████╔╝   ██║   ██║  ██║╚██████╔╝██║ ╚████║██║  ██║███████║
                 ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝    ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝                                                                                                                                       \s
                """);
    }

    @Override
    public void description() {
        System.out.println("Version: 1.0.0");
        System.out.println("\n1. New Game");
//      System.out.println("2. Load Game");
      System.out.println("2. Exit");
        System.out.print("\nChoose an option: ");
    }

    public void control() {
        Scanner input = new Scanner(System.in);

        while (!input.hasNextInt()) {
            System.out.print("[System] Invalid option. Please choose again: ");
            input.next();
        }

        int playerOption = input.nextInt();
        input.nextLine();

        while (playerOption < 1 || playerOption > 2) {
            System.out.print("[System] Invalid option. Please choose again: ");

            while (!input.hasNextInt()) {
                System.out.print("[System] Invalid option. Please choose again: ");
                input.next();
            }

            playerOption = input.nextInt();
        }

        switch (playerOption) {
            case 1:
                Stage1 stage1 = new Stage1();
                stage1.run();
                break;
            case 2:
                Utils.clearScreen();
                System.out.print("Thank you for playing my game.");
                Utils.wait(1500);
                System.out.print("\nGoodbye user :)");
                Utils.wait(1500);
                Utils.clearScreen();
                System.exit(0);
                break;
        }
    }

    public void run() {
        Utils.clearScreen();
        title();
        description();
        control();
    }
}