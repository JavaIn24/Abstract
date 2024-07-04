package Abstract.Task2;

public class Main {
    public static void main(String[] args) {
        Hawk hawk = new Hawk(290);
        hawk.fly();
        hawk.makeSound();
        System.out.println("------------------------------------------");
        Hawk hawk1 = new Hawk (0);
        hawk1.makeSound();
        hawk1.fly();
        System.out.println("------------------------------------------");
        Eagle eagle = new Eagle(220);
        eagle.fly();
        eagle.makeSound();
        System.out.println("------------------------------------------");
        Eagle eagle1 = new Eagle(0);
        eagle1.fly();
        eagle1.makeSound();

    }
}
