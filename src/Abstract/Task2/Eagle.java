package Abstract.Task2;

public class Eagle extends Bird{
    public Eagle(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        if (flySpeed > 200) {
            System.out.println("Орел пикирует на замеченную добычу.");
        } else {
            System.out.println("Орел находится на земле");
        }
    }

    @Override
    public void makeSound() {
        if (flySpeed ==0 ) {
            System.out.println("Орел издает клекающие звуки в общении с партнером и при этом находясь на земле");
        }
        else {
            System.out.println("В полете хищные птицы не издают звуки!!!!");
        }
    }
}
