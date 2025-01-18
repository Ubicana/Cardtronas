import java.util.ArrayList;

public class Cardtronas implements userInterface {
    Player player = new Player();
    Rock rock = new Rock();
    Paper paper = new Paper();
    Scissor scissor = new Scissor();
    Samurai samurai = new Samurai();
    QuantumPaper quantumPaper = new QuantumPaper();
    Determination determination = new Determination();
    NuclearBomb nuclearBomb = new NuclearBomb();

    @Override
    public void title() {
        System.out.print("""
                ====================================================================================
                 ██████╗ █████╗ ██████╗ ██████╗ ████████╗██████╗  ██████╗ ███╗   ██╗ █████╗ ███████╗
                ██╔════╝██╔══██╗██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔═══██╗████╗  ██║██╔══██╗██╔════╝
                ██║     ███████║██████╔╝██║  ██║   ██║   ██████╔╝██║   ██║██╔██╗ ██║███████║███████╗
                ██║     ██╔══██║██╔══██╗██║  ██║   ██║   ██╔══██╗██║   ██║██║╚██╗██║██╔══██║╚════██║
                ╚██████╗██║  ██║██║  ██║██████╔╝   ██║   ██║  ██║╚██████╔╝██║ ╚████║██║  ██║███████║
                 ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝    ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝
                ====================================================================================
                """);
    }

    @Override
    public void description() {
        System.out.println("\n[Miss Ella] Hello " + player.getName() + "! Do you need any assistance ◝(ᵔ ᗜ ᵔ)◜ ?");
    }

    public void displayStatus(ArrayList<String> cards) {
        int i = 1;

        for(String card : cards) {
            switch (card) {
                case "ROCK CARD" -> {
                    System.out.println(i + ". " + rock.getName());
                    System.out.println("\n" + rock.getAppearance());
                    System.out.println("Description: " + rock.getDescription());
                    System.out.println("Price: " + rock.getPrice() + " STAR\n");
                    Utils.wait(2000);
                }
                case "PAPER CARD" -> {
                    System.out.println(i + ". " + paper.getName());
                    System.out.println("\n" + paper.getAppearance());
                    System.out.println("Description: " + paper.getDescription());
                    System.out.println("Price: " + paper.getPrice() + " STAR\n");
                    Utils.wait(2000);
                }
                case "SCISSOR CARD" -> {
                    System.out.println(i + ". " + scissor.getName());
                    System.out.println("\n" + scissor.getAppearance());
                    System.out.println("Description: " + scissor.getDescription());
                    System.out.println("Price: " + scissor.getPrice() + " STAR\n");
                    Utils.wait(2000);
                }
                case "SAMURAI CARD" -> {
                    System.out.println(i + ". " + samurai.getName());
                    System.out.println("\n" + samurai.getAppearance());
                    System.out.println("Description: " + samurai.getDescription());
                    System.out.println("Price: " + samurai.getPrice() + " STARS\n");
                    Utils.wait(2000);
                }
                case "QUANTUM PAPER CARD" -> {
                    System.out.println(i + ". " + quantumPaper.getName());
                    System.out.println("\n" + quantumPaper.getAppearance());
                    System.out.println("Description: " + quantumPaper.getDescription());
                    System.out.println("Price: " + quantumPaper.getPrice() + " STARS\n");
                    Utils.wait(2000);
                }
                case "DETERMINATION CARD" -> {
                    System.out.println(i + ". " + determination.getName());
                    System.out.println("\n" + determination.getAppearance());
                    System.out.println("Description: " + determination.getDescription());
                    System.out.println("Price: " + determination.getPrice() + " STARS\n");
                    Utils.wait(2000);
                }
                default -> {
                    System.out.println(i + ". " + nuclearBomb.getName());
                    System.out.println("\n" + nuclearBomb.getAppearance());
                    System.out.println("Description: " + nuclearBomb.getDescription());
                    System.out.println("\nPrice: " + nuclearBomb.getPrice() + " STARS\n");
                    Utils.wait(2000);
                }
            }

            i++;
        }
    }
}