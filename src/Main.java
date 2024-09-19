public class Main {
    public static void main(String[] args) {
        // Getter for Singleton named it WOnka
        ChocolateFactory Wonka = ChocolateFactory.getInstance();

        System.out.println("Wonka Factory: ");

        //Running Chocolate Factory
        Wonka.fill();
        Wonka.boil();
        Wonka.drain();
        Wonka.displayStatus();



        // Getter #2
        ChocolateFactory Hersheys = ChocolateFactory.getInstance();

        // Try filling, boiling, and draining again with the same instance

        System.out.println("\nHershey's Factory: ");
        Hersheys.fill();
        Hersheys.boil();
        Hersheys.drain();
        Hersheys.displayStatus();

        // Wonka vs Hershey's
        System.out.println("Are both instances the same? " + (Wonka == Hersheys));
    }
}