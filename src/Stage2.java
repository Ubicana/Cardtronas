import java.util.Scanner;
import java.util.ArrayList;

public class Stage2 implements userInterface{
    Scanner input = new Scanner(System.in);
    Player player;
    Stage3 stage3 = new Stage3(player);
    Cardtronas cardtronas = new Cardtronas();
    MissElla missElla = new MissElla();
    ArrayList<String> cardsForSale = new ArrayList<>();

    public Stage2(Player player) {
        this.player = player;
        cardsForSale.add("ROCK CARD");
        cardsForSale.add("PAPER CARD");
        cardsForSale.add("SCISSOR CARD");
    }

    @Override
    public void title() {
        System.out.print("""
                ==========================================================
                | ███████╗████████╗ █████╗  ██████╗ ███████╗    ██████╗  |
                | ██╔════╝╚══██╔══╝██╔══██╗██╔════╝ ██╔════╝    ╚════██╗ |
                | ███████╗   ██║   ███████║██║  ███╗█████╗       █████╔╝ |
                | ╚════██║   ██║   ██╔══██║██║   ██║██╔══╝      ██╔═══╝  |
                | ███████║   ██║   ██║  ██║╚██████╔╝███████╗    ███████╗ |
                | ╚══════╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚══════╝    ╚══════╝ |
                ==========================================================
                """);
    }

    @Override
    public void description() {
        System.out.print("\n[Narrator] You defeated Zasky, but you feel something strange.");
        Utils.wait(3000);
        System.out.print("\n[Narrator] Suddenly, there is a building in front of you.");
        Utils.wait(3000);
        System.out.print("\n[Narrator] The building looks historic and beautiful. Seems someone maintain the building well.");
        Utils.wait(5000);
        System.out.print("\n[Narrator] You decide to enter the building.");
        Utils.wait(2000);
        System.out.print("[System] Press Enter to continue.");
        Utils.clearScreen();
        System.out.print("(...) Welcome to 'CARDTRONAS' (˶˃ ᵕ ˂˶)");
        Utils.wait(1500);
        System.out.print("\n(Miss Ella) My name is Ella, and I am the owner of this shop ⸜(｡˃ ᵕ ˂ )⸝♡");
        Utils.wait(3000);
        System.out.print("\n(Miss Ella) I heard that you defeated Zasky, right (ㅅ´ ˘ `)");
        Utils.wait(3000);
        System.out.print("\n(Miss Ella) Actually, he always trolls the new player, like losing the game on purpose ( ｡ •̀ ᴖ •́ ｡)");
        Utils.wait(5000);
        System.out.print("\n(Miss Ella) I don't know why he did that, probably he wants to help the new player moves to next stage without any harm ( ｡ •̀ ⤙ •́ ｡ )");
        Utils.wait(7000);
        System.out.print("\n(Miss Ella) Anyway, feel free to look around my shop. I have a lot of cards that you can buy ( ｰ̀εｰ́ )");
        Utils.wait(3000);
        System.out.print("\n(Miss Ella) REMEMBER.");
        Utils.wait(2000);
        System.out.println("\n(Miss Ella) Other than asking for a discount, I am willing to assist you anything ( ˃ ᵕ ˂ )");
        Utils.wait(3000);
        System.out.print("\n[System] Press Enter to continue.");
        input.nextLine();
    }

    public void gameplay() {
        cardtronas.title();
        cardtronas.description();
        System.out.println("\n1. Buy card");
        System.out.println("2. Ask for a discount");
        System.out.println("3. Exit");
        System.out.print("\n[System] Please choose an option: ");

        while (!input.hasNextInt()) {
            System.out.print("[System] Invalid option. Please choose again: ");
            input.next();
        }

        int playerOption = input.nextInt();
        input.nextLine();

        while (true) {
            if (playerOption == 1) {
                Utils.clearScreen();
                System.out.println("Today Card: ");
                cardtronas.displayStatus(cardsForSale);
                System.out.println("Player's STAR: " + player.getStar());
                System.out.print("\n[System] Choose a card (Enter 0 to exit): ");

                while (!input.hasNextInt()) {
                    System.out.print("[System] Invalid option. Please choose again: ");
                    input.next();
                }

                int cardOption = input.nextInt();
                input.nextLine();

                while (cardOption < 0 || cardOption > cardsForSale.size()) {
                    System.out.print("[System] Invalid option. Please choose again: ");

                    while (!input.hasNextInt()) {
                        System.out.print("[System] Invalid option. Please choose again: ");
                        input.next();
                    }

                    cardOption = input.nextInt();
                    input.nextLine();
                }

                if(cardOption == 0) {
                    Utils.clearScreen();
                    cardtronas.title();
                    cardtronas.description();
                    System.out.println("\n1. Buy card");
                    System.out.println("2. Ask for a discount");
                    System.out.println("3. Leave the shop");
                    System.out.print("\n[System] Please choose an option: ");

                    while (!input.hasNextInt()) {
                        System.out.print("[System] Invalid option. Please choose again: ");
                        input.next();
                    }

                    playerOption = input.nextInt();
                    input.nextLine();

                    if (playerOption < 1 || playerOption > 3) {
                        System.out.print("[System] Invalid option. Please choose again: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();
                    }

                    if (playerOption == 1 || playerOption == 2) {
                        continue;
                    } else {
                        if(cardsForSale.size() == 3) {
                            Utils.clearScreen();
                            System.out.print("(Miss Ella) Are you sure not want to buy something (っ º - º ς) ?");
                            Utils.wait(3000);
                            System.out.println("Because you will face stronger enemy in the upcoming stage (๑ ﹏ ๑//)");
                            Utils.wait(3000);
                            System.out.println("\n1. I will buy a card");
                            System.out.println("2. Leave the shop");
                            System.out.print("\n[System] Please choose an option: ");

                            while (!input.hasNextInt()) {
                                System.out.print("[System] Invalid option. Please choose again: ");
                                input.next();
                            }

                            playerOption = input.nextInt();
                            input.nextLine();

                            if(playerOption < 1 || playerOption > 2) {
                                System.out.print("[System] Invalid option. Please choose again: ");

                                while (!input.hasNextInt()) {
                                    System.out.print("[System] Invalid option. Please choose again: ");
                                    input.next();
                                }

                                playerOption = input.nextInt();
                                input.nextLine();
                            }

                            if(playerOption == 1) {
                                continue;
                            } else {
                                break;
                            }
                        }

                        Utils.clearScreen();
                    }
                }

                Utils.clearScreen();
                String chosenCard = cardsForSale.get(cardOption - 1);
                player.addCard(chosenCard);
                cardsForSale.remove(chosenCard);
                System.out.println("[System] You bought a " + chosenCard + ".\n");

                switch (chosenCard) {
                    case "ROCK CARD" -> {
                        player.setStar(player.getStar() - cardtronas.rock.getPrice());
                        System.out.print(cardtronas.rock.getAppearance());
                    }
                    case "PAPER CARD" -> {
                        player.setStar(player.getStar() - cardtronas.paper.getPrice());
                        System.out.print(cardtronas.paper.getAppearance());
                    }
                    case "SCISSOR CARD" -> {
                        player.setStar(player.getStar() - cardtronas.scissor.getPrice());
                        System.out.print(cardtronas.scissor.getAppearance());
                    }
                }

                if(cardsForSale.isEmpty()) {
                    Utils.clearScreen();
                    System.out.print("(Miss Ella) I'm sorry, but there is no card left (╥﹏╥)");
                    Utils.wait(2000);
                    System.out.println("\n(Miss Ella) Please come back soon (˶˃ ᵕ ˂˶)");
                    Utils.wait(2000);
                    System.out.print("\n[System] Please ENTER to continue.");
                    input.nextLine();
                    break;
                }

                Utils.wait(2000);
                System.out.println("\n(Miss Ella) Thank you for buying the card ৻(  •̀ ᗜ •́  ৻)");
                Utils.wait(2000);
                System.out.println("\n1. Buy another card");
                System.out.println("2. Ask for a discount");
                System.out.println("3. Leave the shop");
                System.out.print("\n[System] Please choose an option: ");

                while (!input.hasNextInt()) {
                    System.out.print("[System] Invalid option. Please choose again: ");
                    input.next();
                }

                playerOption = input.nextInt();

                if(playerOption < 1 || playerOption > 3) {
                    System.out.print("[System] Invalid option. Please choose again: ");

                    while (!input.hasNextInt()) {
                        System.out.print("[System] Invalid option. Please choose again: ");
                        input.next();
                    }

                    playerOption = input.nextInt();
                    input.nextLine();
                }

                if(playerOption == 3) {
                    break;
                }
            } else if (playerOption == 2) {
                Utils.clearScreen();
                System.out.println("[Miss Ella] As I said before, the discount is currently not available ( ˃ ᵕ ˂ )");
                Utils.wait(2000);
                System.out.println("\n1. Buy card without discount");
                System.out.println("2. Ask for a discount again");
                System.out.println("3. Leave the shop");
                System.out.print("\n[System] Please choose an option: ");

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

                if (playerOption == 2) {
                    Utils.clearScreen();
                    System.out.print("(Miss Ella) I'm sorry, I really can't give you a discount.");
                    Utils.wait(2000);
                    System.out.println("\n(Miss Ella) Please buy something or just leave my shop.");
                    Utils.wait(2000);
                    System.out.println("\n1. Buy card without discount");
                    System.out.println("2. STILL ask for a discount");
                    System.out.println("3. Leave the freaking shop");
                    System.out.print("\n[System] Please choose an option: ");

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

                    if (playerOption == 2) {
                        missElla.rageEvent(player);
                        break;
                    }

                    if (playerOption == 3) {
                        break;
                    }
                }

                if (playerOption == 3) {
                    break;
                }
            } else {
                if(cardsForSale.size() == 3) {
                    Utils.clearScreen();
                    System.out.print("(Miss Ella) Are you sure not want to buy something (っ º - º ς) ?");
                    Utils.wait(3000);
                    System.out.println("\nBecause you will face stronger enemy in the upcoming stage (๑ ﹏ ๑//)");
                    Utils.wait(3000);
                    System.out.println("\n1. I will buy a card");
                    System.out.println("2. Leave the shop");
                    System.out.print("\n[System] Please choose an option: ");

                    while (!input.hasNextInt()) {
                        System.out.print("[System] Invalid option. Please choose again: ");
                        input.next();
                    }

                    playerOption = input.nextInt();
                    input.nextLine();

                    if(playerOption < 1 || playerOption > 2) {
                        System.out.print("[System] Invalid option. Please choose again: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();
                    }

                    if(playerOption == 1) {
                        continue;
                    } else {
                        break;
                    }
                }

                Utils.clearScreen();
            }
        }

        Utils.clearScreen();
        System.out.print("[Miss Ella] Thank you for visiting my shop ( ˃ ᵕ ˂ )");
        Utils.wait(3000);
        Utils.clearScreen();
        System.out.print("[System] Stage 2 completed.");
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
        System.out.print("`♡´ Hold on to your DETERMINATION `♡´");
        Utils.wait(3000);
        Utils.clearScreen();
        gameplay();
        stage3.run(player);
    }
}
