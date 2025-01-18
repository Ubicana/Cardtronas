import java.util.Scanner;
import java.util.Random;

public class Enemy {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    Player player;
    Rock rock = new Rock();
    Paper paper = new Paper();
    Scissor scissor = new Scissor();
    Determination determination = new Determination();
    private String name = "";
    private int health = 0;
    private int reward = 0;
    private int totalCard = 0;

    // Default appearance
    public void appearance() {
        System.out.println(
            """
                            ▄▄▄▄▄▄▄▄▄
                            ▌▐░▀░▀░▀▐
                            ▌░▌░░░░░▐
                            ▌░░░░░░░▐
                            ▄▄▄▄▄▄▄▄▄
                      ▄▀▀▀▀▀▌▄█▄░▄█▄▐▀▀▀▀▀▄
                     █▒▒▒▒▒▐░░░░▄░░░░▌▒▒▒▒▒█
                    ▐▒▒▒▒▒▒▒▌░░░░░░░▐▒▒▒▒▒▒▒▌
                    ▐▒▒▒▒▒▒▒█░▀▀▀▀▀░█▒▒▒▒▒▒▒▌
                    ▐▒▒▒▒▒▒▒▒█▄▄▄▄▄█▒▒▒▒▒▒▒▒▌
                    ▐▒▒▒▒▐▒▒▒▒▒▒▒▒▒▒▒▒▐▒▒▒▒▒▌
                    ▐▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▌
                    ▐▒▒▒▒▒▐▒▒▒▒▒▒▒▒▒▒▒▌▒▒▒▒▒▌
                    ▐▒▒▒▒▒▒▌▒▒▒▒▒▒▒▒▒▐▒▒▒▒▒▒▌
                    ▐▒▒▒▒▒▒▌▄▄▄▄▄▄▄▄▄▐▒▒▒▒▒▒▌
                    ▐▄▄▄▄▄▄▌▌███████▌▐▄▄▄▄▄▄▌
                     █▀▀▀▀█ ▌███▌███▌ █▀▀▀▀█
                     ▐░░░░▌ ▌███▌███▌ ▐░░░░▌
                      ▀▀▀▀  ▌███▌███▌  ▀▀▀▀
                            ▌███▌███▌
                            ▌███▌███▌
                          ▐▀▀▀██▌█▀▀▀▌
                    ▒▒▒▒▒▒▐▄▄▄▄▄▄▄▄▄▄▌▒▒▒▒▒▒▒

               ██████╗  █████╗ ███████╗██╗ ██████╗
               ██╔══██╗██╔══██╗██╔════╝██║██╔════╝
               ██████╔╝███████║███████╗██║██║    \s
               ██╔══██╗██╔══██║╚════██║██║██║    \s
               ██████╔╝██║  ██║███████║██║╚██████╗
               ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝ ╚═════╝
            """);
    }

    // Default hint
    public void hint() {
        System.out.println("\nBasic is a default enemy.");
        System.out.println("He is very normal and also very weak.");
        System.out.print("So the creator does not want him to be appeared in this game.");
    }

    public void displayStatus(String name, int health, int totalCard) {
        System.out.print(name + "'s Health: ");

        for(int i = 1; i <= health; i++) {
            System.out.print("♥ ");
        }

        System.out.println("\nTotal Card: " + totalCard);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getTotalCard() {
        return totalCard;
    }

    public void setTotalCard(int totalCard) {
        this.totalCard = totalCard;
    }
}

class Zasky extends Enemy {
    public Zasky() {
        setName("Zasky");
        setHealth(3);
        setReward(5);
        setTotalCard(1000000000);
    }

    @Override
    public void appearance() {
        System.out.print("""
                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣠⠤⠤⠤⠤⣤⣀⣀⡤⢤⣀⠀⠀⠀⢰⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀⢀⠞⠉⠉⠓⢮⡓⢄⠀⣾⣸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⢞⡥⠤⠤⢤⣀⠀⠀⠀⠀⠀⠀⠀⡰⠃⠀⠀⠀⠀⠀⠹⣎⢰⠃⢻⡇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⠀⠀⠀⣴⠋⢰⠏⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⢸⡟⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⠀⢀⡾⠁⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⡤⢤⣄⣸⡷⣾⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⠀⡾⠁⠀⡞⠀⠀⠀⠀⠀⠀⢀⣀⡤⣴⣖⣚⣭⣭⣯⣿⣷⣿⣿⣿⠶⣿⣶⣦⢀⣿⣸⢃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⢸⠇⠀⠀⠁⠀⠀⣀⡤⢖⣺⣭⣶⣿⣿⣿⣿⣿⢿⣿⣿⡟⣻⠁⣶⣾⣿⣿⣿⣏⢿⡷⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⣿⠀⡤⠖⠋⠉⢉⣵⣾⣿⣿⣿⣿⡋⣥⣴⡌⢿⣆⠻⣿⢃⣿⡄⣤⣾⡿⣿⣿⣿⢸⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⣿⠀⠙⣆⠀⠀⣿⣿⣿⣧⢹⣿⣿⣷⠹⣿⣿⡘⣿⣷⣄⣼⣿⣿⣬⣤⣶⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⠀⢹⡄⠀⠉⢓⡦⢻⣿⣿⣿⡆⠿⠿⠛⣧⣩⣥⣾⣿⢿⣿⣿⣿⣿⣿⣿⣟⡭⠽⠖⠋⠸⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                ⠀⠀⠀⣠⠞⢷⡀⠀⠚⢦⡌⢿⣿⣿⣿⣴⣾⣿⡿⢿⣿⣿⠞⢉⣷⣦⡉⠉⠉⠁⠀⠀⠀⠀⠀⠀⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠤⡤⠤⠤⠤⣀⣀⠀⠀⠀⠀⠀⠀
                                ⠀⢠⡞⠁⠀⡁⠳⣄⠀⢾⣀⠈⢛⣛⣫⡭⣿⣶⠋⠉⠁⠀⠀⠘⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡃⢀⣠⢤⣒⠋⢉⡟⠉⠙⣆⠀⣸⠁⠀⠀⢸⡄⠀⠀⣤⡬⠯⠷⣶⢤⣄⠀
                                ⡴⠋⠠⠄⠀⠊⠓⠮⣷⣄⡗⠋⠉⡏⣷⠃⢹⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠗⠀⠀⠀⠀⢠⡿⢛⡭⢖⡽⠉⢧⣘⢧⡀⠀⠸⣆⡏⠀⠀⣴⠋⠙⢦⣰⠃⠙⢦⠀⢸⡖⠁⠙
                                ⡇⠀⠀⠀⠀⢘⣅⣀⠀⠙⠻⢶⣶⡇⠈⠀⢸⠘⠃⠠⣤⣀⣀⣀⣀⣠⠤⠒⠋⠁⠀⠀⠀⢀⣴⣿⣟⣁⣀⣸⣀⠀⠀⢷⠀⠙⢦⣀⣽⣀⣠⠞⠁⠀⠀⢸⠇⠀⢀⣸⠖⠋⢙⣏⠀
                                ⡱⠀⠀⠀⣀⢰⣄⠀⠐⠀⣄⠀⠈⠙⠶⣤⡈⢉⡽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⡿⣿⠞⠉⠀⡞⠁⠈⣧⢀⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣔⠋⠀⠀⣠⠞⠀⠙
                                ⠀⠀⠠⣄⣥⡄⠙⢧⡀⠀⠀⠀⠙⠤⡀⠀⠙⠺⣤⡀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡴⠞⣹⠫⣾⡏⣀⣀⠤⠧⣄⠀⠸⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⢰⠶⢏⡁⠀⠀⠀
                                ⠴⠒⠉⢱⠏⠀⠀⢀⣙⣦⣀⠀⠀⠀⠀⠀⢠⡆⠀⠉⠳⢶⣤⣴⣶⣶⣿⣿⣿⣧⣞⣡⢴⡏⡟⠁⣿⠀⠀⠈⠳⣀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣟⠿⡆⠀⠘⢳⡶⠋
                                ⠀⠀⠀⠈⠉⠉⠉⠉⠁⠀⢸⠗⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠻⠿⡟⠛⠉⠉⠀⣼⡟⢧⠀⠈⣷⠤⠀⢠⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠾⣞⢀⢷⠀⠀⣸⠆⠀
                                ⣠⡤⢴⡆⠀⠀⠀⠀⠀⠀⠈⠉⠉⠈⠳⣦⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠸⠂⢀⡀⣠⠾⢿⡗⠈⠓⢒⠻⣄⣠⡿⢧⢳⠟⠋⠓⡒⠦⠤⡀⠀⢀⡖⠛⣅⠀⠀⢹⣼⠀⠹⡏⢹⡀⠀
                                ⠀⢱⡯⡴⠶⠶⢶⢶⣶⠦⣤⣄⡀⠀⠀⠈⠻⣯⡙⠳⠦⣤⣄⣀⣀⣀⡀⠀⣨⢟⣥⣿⣸⡏⠀⠀⠀⠀⠈⢷⡘⡄⣿⠀⠀⣸⠁⠀⠀⢳⡀⣾⠁⠀⠸⡆⠀⢀⣿⠃⠀⠃⢸⣧⠀
                                ⠀⠀⠀⠻⡀⠀⠸⡄⠤⡣⣻⡝⣟⡷⢤⡀⠀⠈⠙⢦⡀⠚⠋⠉⠹⠏⠁⣼⢱⡇⠈⡯⠻⣧⠀⠀⠀⠀⠀⠈⢧⡱⡻⣄⣤⡷⣦⣄⠀⠀⢿⡇⠀⢀⣶⠏⡹⠛⢾⣬⣀⣄⣸⣀⡀
                                ⠀⠀⠀⠀⢗⠀⠀⣇⠀⠀⢻⣷⢋⡴⡟⠙⣦⡀⠀⠀⠙⢦⡀⠀⠀⢰⠟⣿⢸⠉⢠⠃⠀⡽⢷⣦⣀⠀⠀⠐⠂⢣⣱⠞⠉⠀⠹⣮⢽⣶⣿⡒⢚⡟⠁⣾⠴⡞⠉⢹⠉⠉⠹⠀⠀
                                ⢤⡀⠀⠀⠘⡴⣦⣼⠀⠀⠘⣿⠋⠀⣿⡞⠉⢙⣦⣀⡀⠀⢳⡄⠀⣾⡴⠋⡇⠀⡎⠀⡸⠁⠀⠈⡏⠉⣲⠶⣶⡿⠥⠤⣤⠶⡂⠹⣾⣿⣟⠁⠸⡇⠀⠋⢸⠀⠀⠘⠀⠀⠀⠀⠀
                                ⣠⣬⣑⠢⢤⣱⣹⡉⠉⠒⢤⣿⢀⡴⠋⣰⠖⢻⣥⡹⣿⣦⡀⣹⠖⠋⣀⠜⠁⡸⠀⢰⠃⠀⠀⡸⠁⢠⠃⠀⠉⢳⠀⢠⠃⠀⢸⢠⣿⣿⣿⣿⣦⣧⠀⣀⢸⠀⠀⠀⠀⠀⠀⠀⠀
                                ⣿⣿⣿⣿⣷⣶⣤⣄⡀⣤⠅⣿⣿⣶⣾⣻⡠⠀⠹⣧⣈⣼⠟⠁⡠⠞⠁⠀⢠⠃⢠⠇⠀⠀⣰⠃⠀⡜⠀⠀⠀⢸⠀⠀⠀⠀⢨⣿⣿⣿⣿⣿⠟⠀⠀⠂⢻⠀⠀⠀⠀⠀⠀⠀⠀
                                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣷⣼⠟⢀⡴⠋⠀⠀⠀⡠⠃⠀⡮⠀⠀⣤⠃⠀⢠⠃⠀⠀⠀⡘⠀⠀⠀⢠⣿⣿⣿⣿⡿⠁⠀⠀⠀⢐⢽⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                        ███████╗ █████╗ ███████╗██╗  ██╗██╗   ██╗  \s
                                        ╚══███╔╝██╔══██╗██╔════╝██║ ██╔╝╚██╗ ██╔╝  \s
                                          ███╔╝ ███████║███████╗█████╔╝  ╚████╔╝   \s
                                         ███╔╝  ██╔══██║╚════██║██╔═██╗   ╚██╔╝    \s
                                        ███████╗██║  ██║███████║██║  ██╗   ██║     \s
                                        ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝     \s
                """);
    }

    @Override
    public void hint() {
        System.out.println("\nZasky is a mysterious person.");
        System.out.println("He is very strong and has a lot of cards.");
        System.out.print("But he never want to defeat the new player.");
    }
}

class MissElla extends Enemy {
    public MissElla() {
        setName("Miss Ella");
        setHealth(3);
        setReward(10);
        setTotalCard(9);
    }

    @Override
    public void appearance() {
        System.out.print("""
                                ⣍⣉                      ⣭⡽⠟⠛⢿⡍
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠈⠉⠉⠓⢦⣄⡀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⢀⡴⠋⠉⢀⣀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠇⠀⢰⠶⣤⡀⠉⠻⠶⣄⣀⣠⣬⣧⣤⣤⣤⣀⣰⠏⠀⢀⡼⠛⠉⡇⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⡞⠀⠈⣽⣦⣀⣠⡿⠛⠉⠀⠀⠀⠀⠈⠉⠙⠒⠲⠿⣦⣄⠀⡇⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡀⠸⣿⣤⣶⡿⠟⠋⠁⠀⠀⠀⣠⣆⣀⣦⡀⠀⠀⠀⠀⠀⠉⠻⢷⡇⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡣⣸⣿⠛⠉⠀⠀⠀⠀⠀⢠⡾⠷⣌⣩⠿⠻⣦⠀⠀⠀⠀⠀⠀⠀⠙⢾⣍⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⠟⠁⠀⠀⠀⠀⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⢤⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠏⠀⠀⠀⠀⠀⠀⠀⢠⠯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⡄⠀⠀⠀⠀⠀⠀⢸⣇⣀⣀⣀⡀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣴⡏⠀⠀⠀⠀⢠⡄⠀⢠⡏⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⠉⠙⠶⣆⡀⠀
                    ⡆⠀⣴⠶⠛⠋⠉⠉⠁⠀⡏⠀⠀⠀⠀⢠⠏⠀⣠⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⠈⢳⣤
                    ⢃⣾⠁⠀⠀⠀⠀⠀⠀⢠⠗⠀⠀⠀⠀⣿⣶⡞⠁⠀⠀⢀⣀⠀⠀⠀⠀⢰⣶⣶⠀⠀⠀⠀⠘⣧⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⠀⠈⢿
                    ⣿⠇⠀⠀⠀⠀⠀⠀⣠⠏⠀⠀⠀⠀⠀⣴⡓⠀⠀⠀⠀⣿⣿⠇⢀⠀⠀⠈⠛⠋⠀⠀⠀⠀⠀⠸⣧⠀⠀⠀⠀⠀⠈⢻⠿⠀⠀⠀⠀⢸
                    ⣿⠀⠀⠀⠀⠀⠘⣯⡁⠀⠀⠀⠀⢀⣸⡗⠀⠀⠀⠀⠀⢠⣄⠘⣛⣀⠀⢰⡶⠀⠀⠀⠀⠀⠀⠈⢻⣦⣄⣀⣀⣤⡴⠟⠁⠀⠀⠀⠀⢸
                    ⣿⠀⠀⠀⠀⠀⠀⠈⠻⣷⡒⠒⠚⢯⣿⡁⠀⠀⠀⠀⠀⠀⠙⠛⠋⠩⠿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⣬⣿⠟⠁⠀⠀⠀⠀⠀⠀⣾
                    ⡹⣇⠀⠀⠀⠀⠀⠀⠀⠈⠛⢶⣶⡟⠛⣧⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠃⠀⣿⡀⠀⠀⠀⠀⠀⠀⣰⠟
                    ⡇⠹⣦⣀⠀⠀⠀⠀⠀⣀⠔⠋⣿⠀⠀⠸⢯⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡿⠏⠠⢻⡏⠑⢄⡀⠀⢀⣠⡾⠋⠀
                    ⠃⠀⠈⠛⠳⠶⢦⣔⣋⣁⣀⣀⣿⠀⠀⠀⠀⠙⢷⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⣦⠿⠁⠀⠀⠀⢸⣇⣀⡴⠾⠿⠛⠉⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡆⠀⠀⠀⠀⠀⠈⠟⢶⣶⣤⣤⣤⣤⣤⣤⣶⡶⠟⠉⠀⠀⠀⠀⠀⠀⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⢰⠂⠀⠀⣠⠀⠘⡿⣿⣟⣻⣿⣿⣿⣿⡇⠀⢀⠀⠀⢰⡆⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣄⣸⡀⠀⢠⡿⡆⢰⣷⡙⠻⠿⠿⠿⠛⢙⣷⠀⣼⣧⠀⣸⣧⠀⢹⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⠋⡿⠂⢸⡇⣇⢸⠷⣉⠲⠤⠤⠔⠊⣉⠿⣿⠏⢿⣦⣿⠙⣦⣼⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣆⣾⠇⠈⡟⣆⠀⠉⠉⠉⠉⠉⢁⠴⡇⠀⢸⣇⣿⡀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡟⠀⢠⠷⢄⡙⠒⠒⠒⠒⠒⢁⡴⢻⠀⠸⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⢸⠀⠀⠈⠉⠉⢉⣉⠉⠁⠀⢸
                
                ███╗   ███╗██╗███████╗███████╗    ███████╗██╗     ██╗      █████╗
                ████╗ ████║██║██╔════╝██╔════╝    ██╔════╝██║     ██║     ██╔══██╗
                ██╔████╔██║██║███████╗███████╗    █████╗  ██║     ██║     ███████║
                ██║╚██╔╝██║██║╚════██║╚════██║    ██╔══╝  ██║     ██║     ██╔══██║
                ██║ ╚═╝ ██║██║███████║███████║    ███████╗███████╗███████╗██║  ██║
                ╚═╝     ╚═╝╚═╝╚══════╝╚══════╝    ╚══════╝╚══════╝╚══════╝╚═╝  ╚═╝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """);
    }

    @Override
    public void hint() {
        System.out.println("\nMiss Ella is the merchant of 'CARDTRONAS'.");
        System.out.println("She is very kind and always happy.");
        System.out.print("She likes to duel with customer who STILL wants a discount.");
    }

    public void rageEvent(Player player) {
        this.player = player;
        int playerOption;
        int round = 1;

        System.out.print("[Miss Ella] ...");
        Utils.wait(2000);
        System.out.println("\n[Miss Ella] Are doing this on purpose (๑•̀ᗝ•́)૭ ?");
        Utils.wait(2000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
        Utils.clearScreen();
        System.out.print("[System] Miss Ella is angry right now, even thought she is still smiling.");
        Utils.wait(3000);
        Utils.clearScreen();
        appearance();
        Utils.wait(3000);
        System.out.print("\n[Miss Ella] I will show you my true power (｡•̀⤙•́｡) !");
        Utils.wait(3000);
        Utils.clearScreen();

        while (true) {
            appearance();
            System.out.println("\n==================");
            System.out.println("| Round " + round + " - Hint |");
            System.out.println("==================");
            hint();
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

            while (true) {
                if (playerOption == 1) {
                    while (player.getRockCard() == 0) {
                        System.out.println("[System] You don't have any ROCK CARD.");
                        System.out.print("[System] Choose another card: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();

                        if (playerOption != 1) {
                            break;
                        }
                    }

                if (playerOption != 1) {
                        continue;
                    }

                    Utils.clearScreen();
                    player.removeCard("ROCK CARD");
                    System.out.println("[System] You chose a ROCK CARD.\n");
                    System.out.println(rock.getAppearance());
                    break;
                } else if (playerOption == 2) {
                    while (player.getPaperCard() == 0) {
                        System.out.println("[System] You don't have any PAPER CARD.");
                        System.out.print("[System] Choose another card: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();

                        if (playerOption != 2) {
                            break;
                        }
                    }

                    if (playerOption != 2) {
                        continue;
                    }

                    Utils.clearScreen();
                    player.removeCard("PAPER CARD");
                    System.out.println("[System] You chose a PAPER CARD.\n");
                    System.out.println(paper.getAppearance());
                    break;
                } else {
                    while (player.getScissorCard() == 0) {
                        System.out.println("[System] You don't have any SCISSOR CARD.");
                        System.out.print("[System] Choose another card: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();

                        if (playerOption != 3) {
                            break;
                        }
                    }

                    if (playerOption != 3) {
                        continue;
                    }

                    Utils.clearScreen();
                    player.removeCard("SCISSOR CARD");
                    System.out.println("[System] You chose a SCISSOR CARD.\n");
                    System.out.println(scissor.getAppearance());
                    break;
                }
            }

            Utils.wait(2500);
            displayStatus(getName(), getHealth(), getTotalCard());
            Utils.wait(2000);
            System.out.println("\n[System] Miss Ella is thinking ...");
            Utils.wait(3000);

            // Random probability of choosing a card;
            Random random = new Random();
            int ellaOption = random.nextInt(3) + 1;

            if (ellaOption == 1) {
                System.out.println("[System] Miss Ella chose ROCK CARD.\n");
                System.out.println(rock.getAppearance());
                Utils.wait(3000);

                if (playerOption == 1) {
                    System.out.print("[System] It's a draw.");
                } else if (playerOption == 2) {
                    System.out.print("[System] You WON this round.");
                    setHealth(getHealth() - 1);
                } else {
                    System.out.print("[System] Miss Ella WON this round.");
                    player.setHeart(player.getHeart() - 1);
                }
            } else if (ellaOption == 2) {
                System.out.println("[System] Miss Ella chose PAPER CARD.\n");
                System.out.println(paper.getAppearance());
                Utils.wait(3000);

                if (playerOption == 1) {
                    System.out.print("[System] Miss Ella WON this round.");
                    player.setHeart(player.getHeart() - 1);
                } else if (playerOption == 2) {
                    System.out.print("[System] It's a draw.");
                } else {
                    System.out.print("[System] You WON this round.");
                    setHealth(getHealth() - 1);
                }
            } else {
                System.out.println("[System] Miss Ella chose SCISSOR CARD.\n");
                System.out.println(scissor.getAppearance());
                Utils.wait(3000);

                if (playerOption == 1) {
                    System.out.print("[System] You WON this round.");
                    setHealth(getHealth() - 1);
                } else if (playerOption == 2) {
                    System.out.print("[System] Miss Ella WON this round.");
                    player.setHeart(player.getHeart() - 1);
                } else {
                    System.out.print("[System] It's a draw.");
                }
            }

            setTotalCard(getTotalCard() - 1);
            player.setTotalCard(player.getTotalCard() - 1);

            if (player.getTotalCard() == 0) {
                Utils.clearScreen();
                System.out.println("\n[System] You don't have any card left.");
                Utils.wait(2000);
                System.out.println("[System] Miss Ella defeated you.");
                Utils.wait(2000);
                System.out.println("[System] Game Over.");
                Utils.wait(2000);
                menu.run();
                break;
            }

            if (player.getHeart() == 0) {
                Utils.clearScreen();
                System.out.println("\n[System] You lost all your HEART.");
                Utils.wait(2000);
                System.out.println("[System] Miss Ella defeated you.");
                Utils.wait(2000);
                System.out.println("[System] Game Over.");
                Utils.wait(2000);
                menu.run();
                break;
            }

            if (getHealth() == 0) {
                break;
            }

            if (getTotalCard() == 0) {
                break;
            }

            round++;
            Utils.wait(3000);
            Utils.clearScreen();
        }

        Utils.clearScreen();
        System.out.println("[System] You defeated Miss Ella !");
        Utils.wait(3000);
        Utils.clearScreen();
        System.out.print("(Miss Ella) Okay okay, I give up (╥ ﹏ ╥)");
        Utils.wait(2000);
        System.out.println("\n(Miss Ella) I will give these cards as your rewards (╥ ﹏ ╥)");
        Utils.wait(4000);
        player.addCard("ROCK CARD");
        System.out.println("\n[System] You got a ROCK CARD !\n");
        System.out.println(rock.getAppearance());
        Utils.wait(1000);
        player.addCard("PAPER CARD");
        System.out.println("[System] You got a PAPER CARD !\n");
        System.out.println(paper.getAppearance());
        Utils.wait(1000);
        player.addCard("SCISSOR CARD");
        System.out.println("[System] You got a SCISSOR CARD !\n");
        System.out.println(scissor.getAppearance());
        Utils.wait(1000);
        System.out.println("(Miss Ella) Ohh wait, I forgot to give you this card too (˶˃ ᵕ ˂˶)");
        Utils.wait(2000);
        player.addCard("DETERMINATION CARD");
        System.out.println("\n[System] You got a DETERMINATION CARD !\n");
        System.out.println(determination.getAppearance());
        System.out.print("(Miss Ella) This card is not for sale, but I will give it to you as a gift (˶ᵔ ᵕ ᵔ˶)");
        Utils.wait(5000);
        System.out.print("\n(Miss Ella) Unlike other cards, this card is very special. It has a special ability (๑ᵔ ⤙ ᵔ๑)");
        Utils.wait(5000);
        System.out.print("\n(Miss Ella) I always define it as a MYTHIC CARD since it's very rare to find (•̀ ⤙ •́)");
        Utils.wait(5000);
        System.out.print("\n(Miss Ella) You can use it when your HEART is almost empty, it will restore your HEART to full ( • ̀ω•́ )✧");
        Utils.wait(7000);
        System.out.print("\n(Miss Ella) It also ignores the enemy's card, so the enemy can't attack you (≖ ⩊ ≖)");
        Utils.wait(5000);
        System.out.println("\n(Miss Ella) But remember, you can only use it once, then it will disappear just like your NORMAL CARD (Rock & Paper & Scissor) (⸝⸝> ᴗ•⸝⸝)");
        Utils.wait(7000);
        System.out.print("\n[System] Press enter to continue.");
        input.nextLine();
        Utils.clearScreen();
        System.out.print("(Miss Ella) By the way, I am still happy because I am still alive (⸝⸝> ᴗ•⸝⸝)");
        Utils.wait(2000);
        System.out.print("\n(Miss Ella) I hope you will come back to my shop again ◝(ᵔ ᗜ ᵔ)◜");
        Utils.wait(2000);
        System.out.println("\n(Miss Ella) See you later (๑>◡<๑)");
        Utils.wait(2000);
        System.out.print("\n[System] Press enter to continue.");
        input.nextLine();
    }
}

class TheSouless extends Enemy {
    public TheSouless() {
        setName("The Souless");
        setHealth(80);
        setReward(1000);
        setTotalCard(100);
    }

    @Override
    public void appearance() {
        System.out.print("""
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠈⠀⠀⠀⠀⠀⠀ ⠈⢷⠀⠘⠀⠀⠀⠀⠀⠀⠀⢀⠐⠈⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⠀⠀⠀⠨⠃⠤⠐⣶⣿⣿⣶⣦⣶⣄⠀⠀⠀⠀⠠⠐⡀⠌⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⡇⢀⣴⣿⡿⠋⠔⡌⣛⡻⢿⡟⠀⠀⠀⠡⠐⢀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡘⡇⠀⠀⠀⡿⠼⠿⢿⣧⢘⢰⠏⠁⠀⠀⠐⣅⠀⠀⠀⠌⠀⠀⠀⠀⠄⡀⠄⠠⠐⠠⠁⠌⠐⠠⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢹⠀⢀⠀⠈⠀⠀⠀⠉⢫⣬⡀⠀⠁⠀⢀⣿⡁⠐⡂⠀⢀⠀⢂⠡⠐⠀⠄⡁⠂⢁⠐⢈⠠⠁⡈⠐⠠⠀⢀⠀⢀⠀⡀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠀⠸⠀⠀⠐⠀⠀⠀⠀⠉⠻⣿⡏⣿⠓⡹⠃⠀⠀⢀⠂⠈⠄⡀⠂⡁⢂⠠⠁⢂⠈⠠
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢁⠀⠀⠁⠀⢠⡀⠀⢀⠀⠀⠀⢸⣷⠿⠪⠀⠈⠄⠀⡀⠂⠡⠐⢀⠁⠄⠠⠐⡀⠂⡈⠐⠠
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⢂⡀⠀⠀⠀⠁⠈⠀⢦⠀⡎⡝⠏⢛⠁⠀⠀⠠⠀⢀⠁⠂⠌⢀⠂⡈⠐⠠⢀⠁⠄⢁⠂⢁⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⢈⠐⠀⠉⢳⡄⠀⠀⠀⠑⠀⡃⠭⠰⠊⠁⠀⡘⠀⠀⠀⠀⠌⠐⢈⠀⡐⠀⡁⠂⠄⡈⠄⠂⡐⠀⢂⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠡⠀⠂⠠⠁⠀⢻⣄⠀⠀⠀⠀⠀⠀⠀⠀⡐⡀⠑⠀⠀⠀⠈⠐⡈⠠⠐⢀⠁⡐⠈⠠⢀⠂⡐⠀⠡⢀⠂⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠌⠐⠀⠀⠄⠁⡀⢂⠀⡌⠑⠂⠀⠀⠀⠀⠂⠀⠁⠀⠀⠀⠀⠘⡀⠁⠄⠂⡁⠄⠂⠠⠁⠂⠄⡐⠀⡁⠂⠄⠂⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠁⠈⠀⠈⡀⠀⠆⠰⢀⠀⢷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢁⠀⢀⠁⠹⡀⠈⡀⠰⠀⠁⠆⠁⡈⠀⠰⢀⠀⠁⠆⡈⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⠠⠈⠀⠠⠁⠀⠌⠐⡀⠂⠀⠸⠂⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⢀⠬⠀⠀⠁⠀⠐⠀⠡⠈⡐⠠⢀⠁⠂⠄⡈⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠐⠠⠀⢀⠂⠁⠄⠁⢈⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡀⢄⠂⠀⠄⠂⠀⠀⠀⢁⡐⠀⡐⠠⠈⡐⠠⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⠈⢀⠐⠠⠈⢀⣤⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⡀⠤⠂⠀⠀⠀⠀⠀⠀⠉⠓⢤⡀⠁⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⡀⠂⠈⠀⠂⠀⠄⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⢉⠁⠂⡤⠀⢀⣀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⢀⡠⠔⠊⠁⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠈⣁⠀⠀⠀⡜⠀⢠⠊⠀⠌⢳⡀⢄⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⡀⠂⠠⠁⠀⠀⠀⠀⠀⠀⠀⠁⢆⡀⠀⠀⠄⠀⠢⡀⠀⠀⠀⠂⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠆⠁⢀⡀⠰⡀⠀⠐⠀⠐⠀⠀⠠⣌⠣⡝⢦⠣⡀⠀⠀⠀⠀
                        ⠀⠀⢀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⡄⠀⠘⡀⠀⢱⢢⡀⢀⢄⡸⢡⢂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠐⡌⡰⣐⢂⡅⠀⠀⠀⠀⠀⢠⠚⠄⡫⢜⡣⢏⡽⡄⠀⠀⠀
                        ⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⢀⠀⠄⠀⠀⠀⠀⠀⠅⢀⠂⢧⡘⢥⢎⢖⢣⢎⣒⠀⠀⠀⠀⠀⠀⢠⠐⡌⢢⠑⣆⢳⡱⢎⡴⠀⠀⠀⠀⠠⠃⠌⠠⠑⣣⢙⡎⠄⠹⡄⠀⠀
                        ⠀⠈⠄⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⡀⠀⠀⠀⠀⠀⠌⠠⣉⠖⣘⢎⢾⡘⣆⢊⠌⠓⠔⣂⠤⣀⠒⡄⢣⠜⣢⠹⣌⢧⡝⣾⡸⣁⠀⠀⠀⠀⠀⠈⢀⡴⢃⡏⡜⡸⠀⣿⠀⠀
                        ⠀⢈⠠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⢠⢋⠴⣊⠷⣹⡜⢎⡜⠤⡀⠀⠀⠁⠚⠈⢃⠞⣰⢋⠾⣥⢻⢶⡹⢆⠀⠀⠀⠀⠀⠐⠣⠚⠱⠘⠬⠁⠀⣿⠀⠀
                        ⠀⠠⠐⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢃⢎⡱⢌⡳⣓⢮⠳⣜⢣⡕⠈⠀⠀⠀⠀⠌⡸⢡⢏⡻⣜⢯⡞⣽⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢀⠠⡿⠀⠀
                        ⠀⡐⠀⣿⠀⠀⠀⠀⠀⡀⠀⠲⣶⣿⣷⣶⣦⢄⠀⠀⠀⠀⠀⠀⠂⠱⣊⠵⣩⢞⡹⢢⠳⣬⠁⠀⠀⠀⠀⠠⠐⢣⢚⡵⢫⡞⡽⠆⠀⠀⠀⢀⠠⠀⠤⠐⣶⣶⣶⣶⣦⣀⠹⠀⠀
                        ⠀⠀⠠⠃⣠⢄⡴⣎⠑⠠⠌⢖⣿⣿⣿⣿⣿⡞⡆⠀⠀⠀⠀⠀⠀⠐⠀⠓⠤⢋⠖⡩⠓⡔⠀⠀⠀⠀⠀⠀⠀⠂⠡⠊⠧⠙⠀⠀⠀⠀⠐⢠⡦⠉⠤⣙⢿⣿⢿⣿⣿⣿⣷⡄⠀
                        ⠀⠁⢀⢧⢣⣏⣷⠨⠠⡑⠌⣎⢿⣿⣿⣿⣿⡇⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⢀⡴⣡⡾⠗⢠⡔⠃⠐⣋⣴⣿⣿⣿⣿⣿⣷⠀
                        ⠀⠀⠸⢎⡳⣜⡧⢡⢃⠜⡰⡘⣾⣿⣿⣿⣿⣿⡧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠉⢄⠻⠁⢾⠟⠁⠀⡌⠹⣿⣿⣿⣿⣿⣿⣿⡇
                        ⠀⠀⡇⢹⠲⡭⢠⡟⡬⢒⡱⠸⡇⣿⣿⣿⣿⠟⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢀⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿
                        ⠀⠀⢿⠀⠹⡅⡲⢽⡱⢣⡇⣥⠱⣜⠏⠁⡀⠌⠁⠀⡀⠀⠀⠀⠀⠀⠀⠤⢀⡡⠁⠀⠈⢀⠠⠀⠁⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⡠⡀⠒⢂⢖⡄⣍⣨⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿
                        ⠀⠀⢸⡇⢀⠱⣙⢦⠹⣡⠧⣿⣷⣜⣀⠀⠐⠀⠀⠀⠐⠀⠀⠀⠐⠉⠀⠀⠀⠁⠀⠀⠸⠉⡀⠊⠀⠀⠀⠀⢀⠁⠔⠀⢩⠀⠄⠀⠀⢀⠀⡈⠀⠁⠰⠊⢙⣛⡛⢿⣿⣿⣿⣿⡇
                        ⠀⠀⠀⣿⡄⢊⠔⡎⢱⢣⡓⢿⣿⣿⣿⣿⣿⣿⣯⣶⣐⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⡸⠟⠀⠀⠈⠒⠐⣎⣡⣶⡀⢠⡀⡠⠌⠉⠿⣱⣿⣿⣿⣿⠇
                        ⠀⠀⠀⠘⣿⠀⢚⢸⡀⢣⡙⠯⠶⠯⣽⣛⣿⣿⣿⣿⣿⣷⣌⡌⢡⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⠀⠄⣀⠀⠀⠈⠐⠉⠑⠐⠀⠀⢙⢾⠝⣳⣶⣻⣽⣿⣿⣿⣿⡟⠀
                        ⠀⠀⠀⠄⢸⠀⠰⣸⣧⠀⠐⡈⠤⠑⢠⠉⢿⣿⣿⣿⣿⣿⣯⣴⣄⡈⢐⠢⡐⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠂⠀⠀⠀⠀⠀⠀⡄⠀⠉⠠⠈⡦⢉⠿⡽⣿⣿⣿⣿⣿⣿⠁⢀
                        ⠀⠀⠀⠠⠈⡆⠡⠸⣿⣿⣶⣔⡠⢂⡀⠩⡀⠖⢺⠡⠿⣏⣿⣿⣿⣿⣆⠢⡁⢆⠡⢃⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡁⠀⠀⠀⠐⠰⡀⠀⠀⠀⠐⠀⢀⡐⠀⠐⠺⢟⡻⢿⡇⠀⠀
                        ⠀⠀⠀⠐⠀⢹⡀⠃⠽⣿⢿⣿⢻⡱⢬⡑⠰⣌⣀⠡⠚⡈⢆⠰⡀⠌⡌⠡⢌⠢⡑⠌⣘⢠⢡⢒⡰⠀⠄⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠉⠙⠈⠁⠠⢄⠰⣀⣭⣤⣤⣡⡾⠀⠀⠀
                        ⠀⠀⠀⠀⠡⠀⢻⣮⣐⣉⣶⣬⣥⡶⡤⢉⠱⠠⡈⢏⢿⣾⣿⣷⣿⣶⣷⣿⣿⡏⣧⡝⠆⠃⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢀⠀⠀⠀⠈⠁⠈⠁⡀⠈⠉⠉⠉⠁⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠋⠛⠃⠓⠀⠄⠀⠁⠀⠀⡀⠄⢩⢉⢛⡛⡽⡻⠟⠘⠉⠁⠀⠀⠀⠀⠀⠀⢄⠢⠐⠂⠄⠀⠀⠀⠀⠄⡃⢄⠀⠠⠁⠂⡁⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠈⠀⠈⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠎⢠⠉⠌⠀⠀⠀⠀⠀⢆⠁⠈⡇⠀⠌⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                
                ████████╗██╗  ██╗███████╗    ███████╗ ██████╗ ██╗   ██╗██╗     ███████╗███████╗███████╗
                ╚══██╔══╝██║  ██║██╔════╝    ██╔════╝██╔═══██╗██║   ██║██║     ██╔════╝██╔════╝██╔════╝
                   ██║   ███████║█████╗      ███████╗██║   ██║██║   ██║██║     █████╗  ███████╗███████╗
                   ██║   ██╔══██║██╔══╝      ╚════██║██║   ██║██║   ██║██║     ██╔══╝  ╚════██║╚════██║
                   ██║   ██║  ██║███████╗    ███████║╚██████╔╝╚██████╔╝███████╗███████╗███████║███████║
                   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝╚══════╝╚══════╝
                """);
    }

    @Override
    public void hint() {
        System.out.println("\nThe Souless is a very powerful enemy and has no mercy.");
        System.out.println("He usually appears in the dark and silent place.");
        System.out.print("But, he really needs someone to guide him to stay determined.");
    }

    public void rageEvent(Player player) {
        this.player = player;
        int playerOption;
        int round = 1;

        System.out.println("\n[...] I think you are the one who disturb my sleep.");
        Utils.wait(3000);
        System.out.print("\n[System] Press ENTER to continue.");
        input.nextLine();
        Utils.clearScreen();
        System.out.print("[System] Someone is taking seriously right now.");
        Utils.wait(3000);
        Utils.clearScreen();
        appearance();
        Utils.wait(3000);
        System.out.print("\n[The Souless] So you need to die now.");
        Utils.wait(3000);
        System.out.print("\n[The Souless] Goodbye.");
        Utils.wait(3000);

        while (true) {
            appearance();
            System.out.println("\n==================");
            System.out.println("| Round " + round + " - Hint |");
            System.out.println("==================");
            hint();
            Utils.wait(3000);
            player.displayStatus();
            System.out.print("\n[System] Choose a card: ");

            while (!input.hasNextInt()) {
                System.out.print("[System] Invalid option. Please choose again: ");
                input.next();
            }

            playerOption = input.nextInt();
            input.nextLine();

            if(player.getDeterminationCard() > 0){
                while (playerOption < 1 || playerOption > 4) {
                    System.out.print("[System] Invalid option. Please choose again: ");

                    while (!input.hasNextInt()) {
                        System.out.print("[System] Invalid option. Please choose again: ");
                        input.next();
                    }

                    playerOption = input.nextInt();
                    input.nextLine();
                }
            } else{
                while (playerOption < 1 || playerOption > 3) {
                    System.out.print("[System] Invalid option. Please choose again: ");

                    while (!input.hasNextInt()) {
                        System.out.print("[System] Invalid option. Please choose again: ");
                        input.next();
                    }

                    playerOption = input.nextInt();
                    input.nextLine();
                }
            }

            while (true) {
                if (playerOption == 1) {
                    while (player.getRockCard() == 0) {
                        System.out.println("[System] You don't have any ROCK CARD.");
                        System.out.print("[System] Choose another card: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();

                        if (playerOption != 1) {
                            break;
                        }
                    }

                    if(playerOption != 1) {
                        continue;
                    }

                    Utils.clearScreen();
                    player.removeCard("ROCK CARD");
                    System.out.println("[System] You chose a ROCK CARD.\n");
                    System.out.println(rock.getAppearance());
                    break;
                } else if (playerOption == 2) {
                    while (player.getPaperCard() == 0) {
                        System.out.println("[System] You don't have any PAPER CARD.");
                        System.out.print("[System] Choose another card: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();

                        if (playerOption != 2) {
                            break;
                        }
                    }

                    if(playerOption != 2) {
                        continue;
                    }

                    Utils.clearScreen();
                    player.removeCard("PAPER CARD");
                    System.out.println("[System] You chose a PAPER CARD.\n");
                    System.out.println(paper.getAppearance());
                    break;
                } else if (playerOption == 3) {
                    while (player.getScissorCard() == 0) {
                        System.out.println("[System] You don't have any SCISSOR CARD.");
                        System.out.print("[System] Choose another card: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();

                        if (playerOption != 3) {
                            break;
                        }
                    }

                    if(playerOption != 3) {
                        continue;
                    }

                    Utils.clearScreen();
                    player.removeCard("SCISSOR CARD");
                    System.out.println("[System] You chose a SCISSOR CARD.\n");
                    System.out.println(scissor.getAppearance());
                    break;
                }
                else {
                    if(player.getDeterminationCard() > 0) {
                        player.removeCard("DETERMINATION CARD");
                        System.out.println("[System] You chose a DETERMINATION CARD.\n");
                        System.out.println(determination.getAppearance());
                        System.out.println("[System] The Souless is thinking ...");
                        Utils.wait(3000);
                        System.out.print("\n[The Souless] Wait ... How did you get that card ?");
                        Utils.wait(3000);
                        System.out.print("\n[The Souless] You only can get that card from Miss Ella.");
                        Utils.wait(3000);
                        System.out.print("\n[The Souless] Actually, this is the pass key to get through me.");
                        Utils.wait(4000);
                        System.out.print("\n[The Souless] Seems like you are trusted by Miss Ella.");
                        Utils.wait(3000);
                        System.out.print("\n[The Souless] So I guess you are the one who can guide everyone to stay determined.");
                        Utils.wait(5000);
                        System.out.print("\n[The Souless] Anyway, I will let you pass through me, then you can continue your journey.");
                        Utils.wait(6000);
                        System.out.print("\n[The Souless] This world is rusting and need someone to save it.");
                        Utils.wait(4000);
                        System.out.print("\n[The Souless] After you pass through me, you will face the reality of this world.");
                        Utils.wait(5000);
                        System.out.print("\n[The Souless] In case you didn't know, the people who are outside of this world are killing each other.");
                        Utils.wait(7000);
                        System.out.print("\n[The Souless] They are fighting for more powers, as don't care about the others.");
                        Utils.wait(5000);
                        System.out.print("\n[The Souless] The DETERMINATION CARD is one of the rarest cards that has the power.");
                        Utils.wait(5000);
                        System.out.print("\n[The Souless] Surely, there are more power cards you can find in this world.");
                        Utils.wait(5000);
                        System.out.print("\n[The Souless] That's why people are fighting each other to get more powers.");
                        Utils.wait(5000);
                        System.out.print("\n[The Souless] You need to be careful, the world is not as easy as you think, and always stay determined.");
                        Utils.wait(7000);
                        System.out.print("\n[The Souless] Good luck " + player.getName() + ", I really hope you can save this world.");
                        Utils.wait(5000);
                        System.out.println("\n[The Souless] I will let you pass through me now.");
                        Utils.wait(3000);
                        System.out.print("\n[System] Press ENTER to continue.");
                        input.nextLine();
                        break;
                    }
                    else {
                        System.out.print("[System] Invalid option. Please choose again: ");

                        while (!input.hasNextInt()) {
                            System.out.print("[System] Invalid option. Please choose again: ");
                            input.next();
                        }

                        playerOption = input.nextInt();
                        input.nextLine();
                    }

                }
            }

            if(playerOption == 4) {
                break;
            }

            Utils.wait(2500);
            displayStatus(getName(), getHealth(), getTotalCard());
            Utils.wait(2000);
            System.out.println("\n[System] The Souless is thinking ...");
            Utils.wait(3000);

            // Random probability of choosing a card;
            Random random = new Random();
            int theSoulessOption = random.nextInt(3) + 1;

            if (theSoulessOption == 1) {
                System.out.println("[System] The Souless chose ROCK CARD.\n");
                System.out.println(rock.getAppearance());
                Utils.wait(3000);

                if (playerOption == 1) {
                    System.out.print("[System] It's a draw.");
                } else if (playerOption == 2) {
                    System.out.print("[System] You WON this round.");
                    setHealth(getHealth() - 1);
                } else {
                    System.out.print("[System] The Souless WON this round.");
                    player.setHeart(player.getHeart() - 1);
                }
            } else if(theSoulessOption == 2) {
                System.out.println("[System] The Souless chose PAPER CARD.\n");
                System.out.println(paper.getAppearance());
                Utils.wait(3000);

                if (playerOption == 1) {
                    System.out.print("[System] The Souless WON this round.");
                    player.setHeart(player.getHeart() - 1);
                } else if (playerOption == 2) {
                    System.out.print("[System] It's a draw.");
                } else {
                    System.out.print("[System] You WON this round.");
                    setHealth(getHealth() - 1);
                }
            } else {
                System.out.println("[System] The Souless chose SCISSOR CARD.\n");
                System.out.println(scissor.getAppearance());
                Utils.wait(3000);

                if (playerOption == 1) {
                    System.out.print("[System] You WON this round.");
                    setHealth(getHealth() - 1);
                } else if (playerOption == 2) {
                    System.out.print("[System] The Souless WON this round.");
                    player.setHeart(player.getHeart() - 1);
                } else {
                    System.out.print("[System] It's a draw.");
                }
            }

            setTotalCard(getTotalCard() - 1);
            player.setTotalCard(player.getTotalCard() - 1);

            if(player.getHeart() == 0) {
                Utils.clearScreen();
                System.out.print("\n[System] You lost all your HEART.");
                Utils.wait(2000);
                System.out.print("\n[System] The Souless defeated you.");
                Utils.wait(2000);
                System.out.print("\n[System] Game Over.");
                Utils.wait(2000);
                menu.run();
                break;
            }

            if(player.getTotalCard() == 0) {
                Utils.clearScreen();
                System.out.print("[System] You don't have any card left.");
                Utils.wait(2000);
                System.out.print("\n[System] The Souless defeated you.");
                Utils.wait(2000);
                System.out.print("\n[System] Game Over.");
                Utils.wait(2000);
                menu.run();
                break;
            }

            if(getHealth() == 0){
                break;
            }

            if (getTotalCard() == 0) {
                break;
            }

            round++;
            Utils.wait(3000);
            Utils.clearScreen();
        }
    }
}