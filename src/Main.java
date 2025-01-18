import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Utils.clearScreen();
        System.out.print("[Creator] Make sure you type 'chcp 65001' in the terminal before running this game.");
        Utils.wait(3000);
        System.out.print("\n[Creator] Without typing this command, the game will not run properly.");
        Utils.wait(3000);
        System.out.println("\n[Creator] Thanks for the understanding.");
        Utils.wait(1500);
        System.out.print("\n[System] Press Enter to continue.");
        input.nextLine();
        Menu menu = new Menu();
        menu.run();
    }
}