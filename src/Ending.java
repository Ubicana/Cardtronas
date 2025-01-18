import java.util.Scanner;

public class Ending {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();

    public void run() {
        Utils.clearScreen();
        System.out.println("""
                ====================================================
                | ███████╗███╗   ██╗██████╗ ██╗███╗   ██╗ ██████╗  |
                | ██╔════╝████╗  ██║██╔══██╗██║████╗  ██║██╔════╝  |
                | █████╗  ██╔██╗ ██║██║  ██║██║██╔██╗ ██║██║  ███╗ |
                | ██╔══╝  ██║╚██╗██║██║  ██║██║██║╚██╗██║██║   ██║ |
                | ███████╗██║ ╚████║██████╔╝██║██║ ╚████║╚██████╔╝ |
                | ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝╚═╝  ╚═══╝ ╚═════╝  |
                ====================================================
                """);
        System.out.print("\n[Narrator] Now, you have reached the end of the game.");
        Utils.wait(4000);
        System.out.print("\n[Narrator] But, this is not the end of your journey.");
        Utils.wait(4000);
        System.out.print("\n[Narrator] You still have a lot of questions in your mind.");
        Utils.wait(4000);
        System.out.print("\n[Narrator] 1. Who is Zasky ? Why he always let you win ?");
        Utils.wait(5000);
        System.out.print("\n[Narrator] 2. Why Miss Ella did not want to give the discount for the customer ? Maybe she have a past story .. ?");
        Utils.wait(7000);
        System.out.print("\n[Narrator] 3. Does The Souless really a bad person ?");
        Utils.wait(4000);
        System.out.print("\n[Narrator] 4. Why the DETERMINATION CARD is so important ?");
        Utils.wait(4000);
        System.out.print("\n[Narrator] 5. Why the people outside this world are killing each other to get more power ?");
        Utils.wait(5000);
        System.out.print("\n[Narrator] You really want to find out the answer.");
        Utils.wait(4000);
        System.out.println("\n[Narrator] So you decide to continue your journey.");
        Utils.wait(4000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
        Utils.clearScreen();
        System.out.print("""
                ████████╗ ██████╗     ██████╗ ███████╗     ██████╗ ██████╗ ███╗   ██╗████████╗██╗███╗   ██╗██╗   ██╗███████╗██████╗\s
                ╚══██╔══╝██╔═══██╗    ██╔══██╗██╔════╝    ██╔════╝██╔═══██╗████╗  ██║╚══██╔══╝██║████╗  ██║██║   ██║██╔════╝██╔══██╗
                   ██║   ██║   ██║    ██████╔╝█████╗      ██║     ██║   ██║██╔██╗ ██║   ██║   ██║██╔██╗ ██║██║   ██║█████╗  ██║  ██║
                   ██║   ██║   ██║    ██╔══██╗██╔══╝      ██║     ██║   ██║██║╚██╗██║   ██║   ██║██║╚██╗██║██║   ██║██╔══╝  ██║  ██║
                   ██║   ╚██████╔╝    ██████╔╝███████╗    ╚██████╗╚██████╔╝██║ ╚████║   ██║   ██║██║ ╚████║╚██████╔╝███████╗██████╔╝
                   ╚═╝    ╚═════╝     ╚═════╝ ╚══════╝     ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═════╝\s
                """);
        Utils.wait(3000);
        System.out.print("\n[System] Press ENTER to exit.");
        input.nextLine();
        menu.run();
    }
}