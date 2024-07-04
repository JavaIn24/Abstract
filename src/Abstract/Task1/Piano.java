package Abstract.Task1;

public class Piano extends Instrument{

    @Override
    public void play() {
        System.out.println("На пианино играют в основном класические произведения,");
        System.out.println("сам же процесс игры осуществляется путем нажатия на клавиши,которые взаимодейсвуют с молоточками,");
        System.out.println("внутри инструмента, которые в свою очередь бьют по струнам");
    }

    @Override
    public void tune() {
        System.out.println("Настройка пианино в свою очередь заключается также регулирокой натяжения струн,");
        System.out.println("сама регулировка производится специальным ключом");
    }
}
