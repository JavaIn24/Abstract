package Abstract.Task2;

public class Hawk  extends Bird {
    public Hawk(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        if (flySpeed > 200 || flySpeed >0) {
            System.out.println("Ястреб пикирует на замеченную добычу.");
        } else {
            System.out.println("Ястреб находится на земле");
        }
    }

    @Override
    public void makeSound() {
        if (flySpeed ==0) {
            System.out.println("Ястреб издает высокие звуки в общении с партнером и при этом находясь на земле");
        }
        else {
            System.out.println("В полете хищные птицы не издают звуки!!!!");
        }
    }
}