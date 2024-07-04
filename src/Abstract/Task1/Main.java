package Abstract.Task1;

public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play();
        piano.tune();


        System.out.println("--------------------------------------------------");

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tune();

    }
}
