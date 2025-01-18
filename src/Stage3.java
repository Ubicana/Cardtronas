import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Stage3 implements userInterface{
    Scanner input = new Scanner(System.in);
    Player player;
    Ending ending = new Ending();
    Determination determination = new Determination();
    TheSouless theSouless = new TheSouless();

    public Stage3(Player player) {
        this.player = player;
    }

    @Override
    public void title(){
        System.out.print("""
                ==========================================================
                | ███████╗████████╗ █████╗  ██████╗ ███████╗    ██████╗  |
                | ██╔════╝╚══██╔══╝██╔══██╗██╔════╝ ██╔════╝    ╚════██╗ |
                | ███████╗   ██║   ███████║██║  ███╗█████╗       █████╔╝ |
                | ╚════██║   ██║   ██╔══██║██║   ██║██╔══╝       ╚═══██╗ |
                | ███████║   ██║   ██║  ██║╚██████╔╝███████╗    ██████╔╝ |
                | ╚══════╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚══════╝    ╚═════╝  |
                ==========================================================
                """);
    }

    @Override
    public void description(){
        System.out.print("\n[Narrator] You walked out of the 'CARDTRONAS'.");
        Utils.wait(3000);
        System.out.print("\n[Narrator] Suddenly, you saw a sign that wrote 'Stay Determined If You Are Strong Enough.'");
        Utils.wait(5000);
        System.out.print("\n[Narrator] You wonder what does it mean.");
        Utils.wait(3000);

        if(player.getDeterminationCard() > 0){
            System.out.print("\n[Narrator] You realize that just now Miss Ella gave you a card.");
            Utils.wait(3000);
            System.out.print("\n[Narrator] You take a look at the card.\n");
            Utils.wait(2000);
            System.out.println("\n" + determination.getAppearance());
            Utils.wait(3000);
            System.out.print("[Narrator] Then, you realize that your mum told you don't receive anything from stranger because it is very dangerous.");
            Utils.wait(6000);
            System.out.println("\n[Narrator] You are confused. What should you do ?");
            Utils.wait(3000);
            System.out.println("\n1. Keep the card");
            System.out.println("2. Throw the card");
            System.out.print("\n[System] Choose an option: ");

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
                input.nextLine();
            }

            Utils.clearScreen();
            if (playerOption == 1) {
                System.out.print("[Narrator] You decide to keep the card.");
            } else {
                System.out.print("[Narrator] You decide to throw the card.");
                player.removeCard("DETERMINATION CARD");
            }
        }

        System.out.println("\n[Narrator] You continue to take your journey.");
        Utils.wait(3000);
        System.out.print("\n[System] Please ENTER to continue.");
        input.nextLine();
        Utils.clearScreen();
    }

    public void gameplay(){
        System.out.print("[Narrator] You realize that it is getting dark.");
        Utils.wait(3000);

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = currentTime.format(formatter).toUpperCase();
        LocalTime nightStart = LocalTime.of(19, 0); // 7 PM
        LocalTime nightEnd = LocalTime.of(6, 0); // 6 AM

        System.out.print("\n[Narrator] You immediately check your watch, it is " + formattedTime + ".");
        Utils.wait(3000);

        if (currentTime.isAfter(nightStart) || currentTime.isBefore(nightEnd)) {
            System.out.print("\n[Narrator] It is the night time.");
            Utils.wait(3000);
            System.out.print("\n[Narrator] You feel a chill down your spine.");
            Utils.wait(3000);
            System.out.print("\n[Narrator] You feel like someone is watching you.");
            Utils.wait(3000);
            System.out.println("\n[Narrator] You feel like you are not alone.");
            Utils.wait(3000);
        } else {
            System.out.print("\n[Narrator] It is not the night time. Why it is so dark ?");
            Utils.wait(3000);
            System.out.print("\n[Narrator] Suddenly, you feel a pressure on your chest.");
            Utils.wait(3000);
            System.out.print("\n[Narrator] You feel like you can't breathe.");
            Utils.wait(3000);
            System.out.println("\n[Narrator] You realize that this is not normal.");
            Utils.wait(3000);
            Utils.clearScreen();
        }

        theSouless.rageEvent(player);
        System.out.print("[System] Stage 3 completed.");
        Utils.wait(2000);
        System.out.print("\n[System] Your heart increased by 3, and your heart is fully restored.");
        player.setMaxHeart(player.getMaxHeart() + 3);
        player.setHeart(player.getMaxHeart());
        Utils.wait(2000);
        System.out.print("\n[System] This is your current status.");
        player.displayStatus();
        Utils.wait(2000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
    }

    public void run(Player player) {
        this.player = player;
        Utils.clearScreen();
        System.out.print("`♡´ Hold on to your DETERMINATION `♡´");
        Utils.wait(3000);
        Utils.clearScreen();
        title();
        Utils.wait(500);
        description();
        Utils.clearScreen();
        Utils.wait(500);
        gameplay();
        ending.run();
    }
}