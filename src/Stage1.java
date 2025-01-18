import java.util.Scanner;

public class Stage1 implements userInterface {
    Scanner input = new Scanner(System.in);
    Player player = new Player();
    Stage2 stage2 = new Stage2(player);
    Zasky zasky = new Zasky();
    Rock rock = new Rock();
    Paper paper = new Paper();
    Scissor scissor = new Scissor();

    public void config() {
        player.addCard("ROCK CARD");
        player.addCard("ROCK CARD");
        player.addCard("ROCK CARD");
        player.addCard("PAPER CARD");
        player.addCard("PAPER CARD");
        player.addCard("PAPER CARD");
        player.addCard("SCISSOR CARD");
        player.addCard("SCISSOR CARD");
        player.addCard("SCISSOR CARD");
    }

    @Override
    public void title() {
        System.out.print("""
                ======================================================
                | ███████╗████████╗ █████╗  ██████╗ ███████╗     ██╗ |
                | ██╔════╝╚══██╔══╝██╔══██╗██╔════╝ ██╔════╝    ███║ |
                | ███████╗   ██║   ███████║██║  ███╗█████╗      ╚██║ |
                | ╚════██║   ██║   ██╔══██║██║   ██║██╔══╝       ██║ |
                | ███████║   ██║   ██║  ██║╚██████╔╝███████╗     ██║ |
                | ╚══════╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚══════╝     ╚═╝ |
                ======================================================
                """);
    }

    @Override
    public void description() {
        System.out.print("\n(...) Hello user. Welcome to the first stage of the game !");
        Utils.wait(2500);
        System.out.print("\n(...) Before that, let's talk about the game ~");
        Utils.wait(2000);
        System.out.print("\n(...) This game is a text-based game. How do you play ? Just choose an option and the game will do the rest.");
        Utils.wait(3500);
        System.out.print("\n(...) Do you know Rock, Paper, Scissors ?");
        Utils.wait(2000);
        System.out.print("\n(...) Yeah, this game is a little bit similar to that game :)");
        Utils.wait(2500);
        System.out.print("\n(...) But in this game, you will use CARD to fight the ENEMY.");
        Utils.wait(2500);
        System.out.print("\n(...) You can choose 'ROCK CARD', 'PAPER CARD', 'SCISSOR CARD' (Or others hehe) to fight the ENEMY.");
        Utils.wait(3000);
        System.out.print("\n(...) The ENEMY will also choose one of those cards to fight back.");
        Utils.wait(2500);
        System.out.print("\n(...) If you win, you will get a STAR, or even more !");
        Utils.wait(2500);
        System.out.print("\n(...) Besides, you have 3 HEARTS for each stage.");
        Utils.wait(2000);
        System.out.print("\n(...) If you lose all of your HEARTS, you will game over :(");
        Utils.wait(2500);
        System.out.print("\n(...) But don't worry, you can always start a new game :)");
        Utils.wait(2500);
        System.out.print("\n(...) So, what's your name ?");
        Utils.wait(2000);
        System.out.print("\n\n[System] Enter your name: ");
        player.setName(input.nextLine());

        while (player.getName().isEmpty()) {
            System.out.print("[System] Invalid name. Please enter your name again: ");
            player.setName(input.nextLine());
        }

        System.out.print("\n(...) Hmm ... " + player.getName() + ", what a nice name.");
        Utils.wait(2000);
        System.out.print("\n(...) Alright, you are ready to fight the first ENEMY.");
        Utils.wait(2500);
        System.out.print("\n(...) Are you ready ?");
        Utils.wait(1000);
        System.out.print("\n\n[System] Press ENTER to continue.");
        input.nextLine();
        Utils.clearScreen();
        Utils.wait(1500);
        System.out.print("(...) Alright, so.");
        Utils.wait(3000);
        System.out.println("\n(...) You are gonna to fight me.");
        Utils.wait(2000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
        Utils.clearScreen();
        System.out.print("[System] Someone is arrived.");
        Utils.wait(2000);
        Utils.clearScreen();
        zasky.appearance();
        Utils.wait(2000);
        System.out.println("\n(Zasky) Don't worry, I am just to simulate the game for you :)");
        Utils.wait(2000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
        Utils.clearScreen();
        Utils.wait(1000);
        System.out.print("(Zasky) Now, look at your screen. You have 3 HEARTS, 3 ROCK CARDS, 3 PAPER CARDS, and 3 SCISSOR CARDS at first.");
        Utils.wait(5000);
        config();
        player.displayStatus();
        Utils.wait(6000);
        System.out.print("\n(Zasky) You can choose one of those cards to fight me.");
        Utils.wait(3000);
        System.out.println("\n(Zasky) Good luck, " + player.getName() + ".");
        Utils.wait(2000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
    }

    public void gameplay() {
        int playerOption;
        int round = 1;

        do {
            zasky.appearance();
            System.out.println("\n==================");
            System.out.println("| Round " + round + " - Hint |");
            System.out.println("==================");
            zasky.hint();
            Utils.wait(3000);
            player.displayStatus();
            System.out.print("\n[System] Choose a card: ");

            while (!input.hasNextInt()) {
                System.out.print("[System] Invalid option. Please choose again: ");
                input.next();
            }

            playerOption = input.nextInt();
            input.nextLine();

            while (playerOption < 1 || playerOption > 3) {
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
                player.removeCard("ROCK CARD");
                System.out.println("[System] You chose a ROCK CARD.\n");
                System.out.println(rock.getAppearance());
            } else if (playerOption == 2) {
                player.removeCard("PAPER CARD");
                System.out.println("[System] You chose a PAPER CARD.\n");
                System.out.println(paper.getAppearance());
            } else {
                player.removeCard("SCISSOR CARD");
                System.out.println("[System] You chose a SCISSOR CARD.\n");
                System.out.println(scissor.getAppearance());
            }

            Utils.wait(2500);
            zasky.displayStatus(zasky.getName(), zasky.getHealth(), zasky.getTotalCard());
            Utils.wait(2000);
            System.out.println("\n[System] Zasky is thinking ...");
            Utils.wait(3000);

            if (playerOption == 1) {
                System.out.println("\n[System] Zasky chose SCISSOR CARD.\n");
                System.out.println(scissor.getAppearance());
            } else if (playerOption == 2) {
                System.out.println("[System] Zasky chose ROCK CARD.\n");
                System.out.println(rock.getAppearance());
            } else {
                System.out.println("[System] Zasky chose PAPER CARD.\n");
                System.out.println(paper.getAppearance());
            }

            Utils.wait(3000);
            System.out.print("[System] You WON this round.");
            zasky.setHealth(zasky.getHealth() - 1);
            zasky.setTotalCard(zasky.getTotalCard() - 1);
            round++;
            Utils.wait(2000);
            Utils.clearScreen();

        } while (zasky.getHealth() != 0);

        System.out.print("[System] You defeated Zasky !");
        Utils.wait(2000);
        Utils.clearScreen();
        System.out.print("(Zasky) Wow, you are so strong !");
        Utils.wait(2000);
        System.out.print("\n(Zasky) I can't believe you defeated me 0.0");
        Utils.wait(2000);
        System.out.print("\n(Zasky) Since you defeated me, I will give you a reward.");
        Utils.wait(2000);
        System.out.print("\n(Zasky) Here, take these STARS.");
        player.setStar(player.getStar() + zasky.getReward());
        Utils.wait(2000);
        System.out.println("\n[System] You got " + zasky.getReward() + " STAR.");
        Utils.wait(3000);
        System.out.print("\n(Zasky) You can use these STARS to buy CARD in the 'CARDTRONAS'.");
        Utils.wait(2000);
        System.out.print("\n(Zasky) Don't ask me why the name is called 'CARDTRONAS', it just a shop I believe.");
        Utils.wait(3000);
        System.out.print("\n(Zasky) Anyway, good luck on your journey, " + player.getName() + ". I believe you can do it.");
        Utils.wait(3000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
        Utils.clearScreen();
        System.out.print("[System] Stage 1 completed.");
        Utils.wait(2000);
        System.out.print("\n[System] Your heart increased by 2, and your heart is fully restored.");
        player.setMaxHeart(player.getMaxHeart() + 2);
        player.setHeart(player.getMaxHeart());
        Utils.wait(2000);
        System.out.print("\n[System] This is your current status.");
        player.displayStatus();
        Utils.wait(2000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
    }

    public void run() {
        Utils.clearScreen();
        System.out.print("`♡´ Hold on to your DETERMINATION `♡´");
        Utils.wait(3000);
        Utils.clearScreen();
        title();
        Utils.wait(500);
        description();
        Utils.clearScreen();
        System.out.print("`♡´ Hold on to your DETERMINATION `♡´");
        Utils.wait(3000);
        Utils.clearScreen();
        gameplay();
        stage2.run(player);
    }
}