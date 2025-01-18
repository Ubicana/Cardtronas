public class Card {
    private String name;
    private String description;
    private String appearance;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Rock extends Card {
    public Rock() {
        setName("NORMAL CARD - Rock Card");
        setDescription("A card that can beat SCISSOR CARD.");
        setAppearance("""
                                ⠀⠀⠀⠀⠀⠀⢀⣠⠤⠤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⡴⠏⠀⠀⠀⠀⠀⠉⠒⠻⠭⣉⠓⠦⣀⠀⠀
                        ⠀⠀⠀⢀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣗⠓⠚⠳⡄
                        ⠀⠀⣠⠊⠀⠀⠀⠀⠠⣆⡀⠀⠀⠀⠀⠀⠀⣏⠀⠀⠀⣹
                        ⢤⠞⠁⠀⠀⠀⠀⠀⠀⠈⢹⣲⡆⠀⠀⠀⠀⣇⣀⣤⣴⠋
                        ⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣧⠀⠀⠀⠀⡇⠀⠀⠀⢳
                        ⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡈⠢⢄⣀⣠⠃⠀⠀⠀⡼
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠟⠙⠒⠒⠒⠛⠈⠉⠛⢯⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣱⠒⠒⠒⠲⠤⠤⢤⡤⠞⠀
                        ⢠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⡽⠀⠀
                        ⠀⠈⠉⠒⠒⠤⠤⠤⢀⣀⣀⣀⣉⣉⣲⠶⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """);
        setPrice(1);
    }
}

class Paper extends Card {
    public Paper() {
        setName("NORMAL CARD - Paper Card");
        setDescription("A card that can beat ROCK CARD.");
        setAppearance("""
                        ⠀⠀⠀⠀⠀⠀⠀⢠⣤⠒⠚⠉⢱⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⢀⡤⠞⠉⠀⠀⠀⠀⠀⠙⠠⡀⠀⠀⠀⢀⣀⣀⡀⡀⠤⢀⡀⠀⠀
                        ⠀⠀⠀⡠⠋⠀⠀⠀⠀⠐⠏⠉⠑⠒⠒⠋⠉⠉⠉⠀⠀⠀⠀⣀⠀⣀⣟⣀⡀
                        ⠀⣶⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠖⠒⠒⠈⠉⠀⠀⠀⢀⣀⣠⠇
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠶⠰⠆⠉⠉⠀⠀⡷⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠋⠀⠀⠀⣀⣀⡤⠄⠒⠉⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠖⠒⠉⠈⠁⢀⡠⠃⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠠⠄⠐⠒⠉⠁⠀⠀⠀⠀⠀⠀⠀
                        ⠘⠛⠛⠛⠣⠄⣀⡀⠀⠀⣀⡀⠤⠜⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """);
        setPrice(1);
    }
}

class Scissor extends Card {
    public Scissor() {
        setName("NORMAL CARD - Scissor Card");
        setDescription("A card that can beat PAPER CARD.");
        setAppearance("""
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠤⠀⠀⠂⠈⠉⢀⣀⠼⠀
                        ⠀⠀⣀⠤⠒⠊⠉⠐⠺⢍⡉⠉⠉⠉⠉⠁⠀⠀⠀⣀⡠⠤⠒⠈⠁⠀⠀⠀
                        ⠐⠟⠁⠀⠀⠀⠀⠀⠀⠀⠈⠲⢄⡀⠀⠀⢀⡴⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣀⠀⠀⠹⡤⢄⡀⠀⠉⠁⠐⠂⠠⠤⠀⣀⡀⠀
                        ⠀⠀⠀⠀⠀⠓⠒⢏⡈⠉⠙⣦⠀⠀⣇⠀⢘⠒⠢⠤⠄⣀⡀⠀⠀⠀⠈⡇
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⢤⡈⠓⡤⠟⠀⠁⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁
                        ⠀⠀⠋⠉⠀⠒⠒⠠⠤⠤⠤⠤⠚⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """);
        setPrice(1);
    }
}

class Samurai extends Card {
    public Samurai() {
        setName("EPIC CARD - Samurai");
        setDescription("A card that can slice any NORMAL CARDS.");
        setAppearance("""
                        ⠀⠀⠀⠀⠀⣀⡀⣤⡤⠤⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⢀⠴⠚⠉⠉⠉⠉⠀⠒⠨⢁⢈⠭⠖⡢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠮⠒⠀⠉⠉⠀⠉⠁⠐⠠⢀⠀⢸⠃⡘⠈⠨⣂⢄⡀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠪⠄⣧⠶⢛⠙⠻⡝⢦⣄⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⢡⡴⠓⠲⣝⢦⡀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢡⣠⠾⠤⠽⢄⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⢂⣠⣁⣈⢣⡀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡎⠏⠀⠈⢊⡇
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠡⡣⠀⠠⠊⡇
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠀
                """);
        setPrice(10);
    }
}

class QuantumPaper extends Card {
    public QuantumPaper() {
        setName("LEGENDARY CARD - Quantum Paper");
        setDescription("A card that can copy the enemy's card.");
        setAppearance("""
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡒⠦⠤⠤⠄⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⢼⠀⠀⠒⠒⠤⠤⠤⠤⠤⣀⣀⣀⣀⠀⠀⠘⡇⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⢀⣀⠤⠔⠒⠉⠁⢀⣼⡀⠀⢠⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠰⡧⠚⠉⢹⡀⠀⠀⠀⠀⠀⠀
                        ⠰⣖⠊⠉⠀⠀⠀⣠⠔⠚⠉⠁⢀⡇⠀⡀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⢀⡇⠀⣤⠀⢷⡀⠀⠀⠀⠀⠀
                        ⠀⠈⠳⡄⠀⠀⠋⣠⠖⠂⡠⠖⢙⡇⠀⠈⠉⠉⠉⠉⠓⠒⠒⠒⠒⠒⠆⠀⠀⣷⡀⠉⢦⠀⢳⡀⠀⠀⠀⠀
                        ⠀⠀⠀⠈⢦⠀⠀⠁⠀⠀⠀⢀⠼⡇⠀⠀⠦⠤⠤⠄⡀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠱⡀⠀⠳⡀⠙⣆⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠳⡄⠀⢀⡤⠊⠁⢠⡇⠀⠠⠤⢤⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⡧⡀⠙⢄⠀⠱⠄⠈⠳⡄⠀
                        ⠀⠀⠀⠀⠀⠀⠙⡄⠀⠀⡠⠔⢻⠀⠀⠀⠀⠀⠀⠠⣄⣀⣀⣁⣀⠀⠀⠀⠀⡇⠱⡀⠀⠀⠀⠀⠀⣀⣘⣦
                        ⠀⠀⠀⠀⠀⠀⠀⠘⣆⠀⠀⠀⡸⠀⠀⠰⣄⣀⡀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⡇⠀⠃⢀⣠⠴⠛⠉⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠙⠒⠀⠀⠀⠠⡇⣠⠔⠋⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⢸⠁⠀⠀⠀⠒⠲⠤⣀⡀⠀⠀⠀⠀⠀⠀⠀⢰⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠢⣄⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣎⣀⠀⠀⠀⠀⠀⠀⠀⠢⠤⣀⠀⠀⠁⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢡⠉⠙⠒⠤⢤⡀⠀⠀⠀⠀⠉⠒⠀⠀⠀⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠶⠒⠊⠉⠉⠉⠓⠦⣀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠲⢄⡀⠀⠀⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠲⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """);
        setPrice(20);
    }
}

class Determination extends Card {
    public Determination() {
        setName("MYTHIC CARD - Determination");
        setDescription("Restore your heart to full. Ignore the enemy's card.");
        setAppearance("""
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡀⠀⠀⠀⠀⡆⠀⠀⠀⠀⠀⡠⠁⠀⠀⠀
                         ⠀⠀⠀⠀⠀⢄⠀⠀⠀⠀⠘⡄⠀⠀⠀⠁⠀⠀⠀⠀⡰⠀⠀⠀⠀⠀
                         ⠀⠀⠀⠀⠀⠀⠑⢄⠀⠀⠀⠘⠄⠀⠀⠸⠀⠀⠀⡐⠀⣀⠎⣀⠀⠀
                        ⠀⠀⠀⠄⡀⠀⠀⠀⠀⠁⠄⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀
                         ⠀⠀⠀⠀⠁⠀⢀⠀⠀⠀⠀⠀⢀⡀⠄⠀⠀⠀⠀⠀⠀⠀⠒⠀⠀⢀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠖⠉⠀⠀⠀⡀⠀⠀⠀⠀⠀⠠⠈⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠏⠀⠀⣶⣄⣼⡷⢤⣄⠀⠀⠢⠀⠀⠀⠀
                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⢹⣿⣿⣿⣿⡿⠁⠀⠀⠀⠒⠒⠀
                        ⠀⠀⠀⠀⠀⡀⠀⠠⠀⠀⢿⡄⠀⠀⢨⣿⣿⣿⣿⡇⠀⠀⢠⠀⠀⠀⠀
                         ⠀⢂⣈⠁⠀⠀⠀⠀⠀⠈⢿⣤⣴⣾⣿⣿⣿⣿⣧⠀⣠⠃⠀⠀⠠⠀
                        ⠀⠀⠘⠻⣷⡀⢀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀
                         ⠀⠀⣠⣿⠇⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀
                        ⠀⠀⢰⣿⡿⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠘⠄⠀⠀
                         ⠀⣼⣿⠃⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠂⢀
                        ⠀⠀⢿⣿⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⠟⢻⣿⡇⠘⡀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠸⣿⣷⣤⣴⣿⣿⣿⣿⣿⣿⣿⣉⣄⠈⣿⣧⡀⠁⠀⠀⠀⠀⠀⠀
                        ⠓⠒⠒⠚⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠚⠐⠚⠛⠓⠒⠒⠒⠒⠒
                      """);
        setPrice(100);
    }
}

class NuclearBomb extends Card {
    public NuclearBomb() {
        setName("LEGENDARY CARD - Nuclear Bomb");
        setDescription("A card that can destroy anything, but it does not have the DETERMINATION.");
        setAppearance("""
                                        ⣠⣾⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠙⢿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣦⡀⠙⢿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣶⣦⣀⠙⢿⣦⡀⠙⢿⣿⣿⣿⣿⣿⣷⡄⠀
                        ⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣷⣄⠙⢿⣦⡀⠙⢿⣿⣿⡿⠋⠀⠀
                        ⠀⠀⠀⠀⣠⣴⣿⣿⣿⠿⢻⣿⣿⣿⣿⣿⣿⣿⣧⡀⠙⠛⠂⠀⠙⠋⠀⠀⠀⠀
                        ⠀⠀⠀⢸⣿⣿⣿⡿⠁⠀⣠⣿⣿⠋⠙⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⢠⣇⠘⣿⣿⣿⣿⣷⣾⣏⣉⣿⣀⣀⢸⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⢸⣿⣧⡈⢻⣿⣿⡿⠋⠉⠛⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⢸⣿⣿⣷⣄⠙⢿⣿⣷⣦⣤⣽⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⢻⣿⣿⣿⣷⣄⠙⠻⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠙⠿⣿⣿⣿⣿⣦⣄⡉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀""");
        setPrice(50);
    }
}