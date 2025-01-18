import java.util.ArrayList;

public class Player {
    ArrayList<String> cards = new ArrayList<>();
    private String name = "";
    private int heart = 3;
    private int maxHeart = 3;
    private int star = 0;
    private int totalCard = 0;
    private int rockCard = 0;
    private int paperCard = 0;
    private int scissorCard = 0;
    private int samuraiCard = 0;
    private int quantumPaperCard = 0;
    private int determinationCard = 0;
    private int nuclearBombCard = 0;

    public void addCard(String card) {
        cards.add(card);
    }

    public void removeCard(String card) {
        cards.remove(card);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public int getMaxHeart() {
        return maxHeart;
    }

    public void setMaxHeart(int maxHeart) {
        this.maxHeart = maxHeart;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public void countTotalCard() {
        totalCard = cards.size();
    }

    public int getTotalCard() {
        return totalCard;
    }

    public void setTotalCard(int totalCard) {
        this.totalCard = totalCard;
    }

    public int getRockCard() {
        return rockCard;
    }

    public int getPaperCard() {
        return paperCard;
    }

    public int getScissorCard() {
        return scissorCard;
    }

    public int getSamuraiCard() {
        return samuraiCard;
    }

    public int getQuantumPaperCard() {
        return quantumPaperCard;
    }

    public int getDeterminationCard() {
        return determinationCard;
    }

    public int getNuclearBombCard() {
        return nuclearBombCard;
    }

    public void countEveryCard() {
        rockCard = 0;
        paperCard = 0;
        scissorCard = 0;
        samuraiCard = 0;
        quantumPaperCard = 0;
        determinationCard = 0;
        nuclearBombCard = 0;

        for (String card : cards) {
            if (card.equals("ROCK CARD")) {
                rockCard++;
            }

            if (card.equals("PAPER CARD")) {
                paperCard++;
            }

            if (card.equals("SCISSOR CARD")) {
                scissorCard++;
            }

            if (card.equals("SAMURAI CARD")) {
                samuraiCard++;
            }

            if (card.equals("QUANTUM PAPER CARD")) {
                quantumPaperCard++;
            }

            if (card.equals("DETERMINATION CARD")) {
                determinationCard++;
            }

            if (card.equals("NUCLEAR BOMB CARD")) {
                nuclearBombCard++;
            }
        }
    }

    public void displayStatus() {
        System.out.println("\n\nPlayer's HEART: " + "♥ ".repeat(Math.max(0, heart)));
        System.out.println("Player's STAR: " + getStar());
        countEveryCard();
        countTotalCard();
        System.out.println("Player's TOTAL CARD: " + getTotalCard());
        System.out.print("\n");
        System.out.println("1. ROCK CARD (x " + getRockCard() + ")");
        System.out.println("2. PAPER CARD (x " + getPaperCard() + ")");
        System.out.println("3. SCISSOR CARD (x " + getScissorCard() + ")");
        int cardIndex = 4;

        for (String card : cards) {
            if (!card.equals("ROCK CARD") && !card.equals("PAPER CARD") && !card.equals("SCISSOR CARD")) {
                System.out.println(cardIndex++ + ". " + card);
            }
        }
    }
}