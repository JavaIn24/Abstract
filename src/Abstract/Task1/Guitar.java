package Abstract.Task1;

public class Guitar extends Instrument{

    @Override
    public void play() {
        System.out.println("На гитаре можно сыграть что угодно от класических произведений, до блюза и рока.");

    }

    @Override
    public void tune() {
        System.out.println("Настраивают гитару путем регулировки натяжения струн колками, которые распологаются на грифе.");

    }
}
