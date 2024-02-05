public class Main {
    public static void main(String[] args) {
        Deck game1 = new Deck();
        Deck game2 = new Deck();
        Deck game3 = new Deck();

        System.out.println("Juego 1.....\n");
        game1.Shuffle();
        game1.hand();
        game1.pick();
        game1.head();

        System.out.println("Juego 2.....\n");

        game2.pick();
        game2.hand();

        System.out.println("Juego 3.....\n");
        game3.hand();
        game3.head();




    }
}