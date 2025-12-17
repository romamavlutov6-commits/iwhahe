package practice24.ТASK2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    FunctionalChair createFunctionalChair();
    MagicChair createMagicChair();
}