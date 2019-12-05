package Utils;

import java.util.Random;

public class FigureTypeGenerator {
    private static Random rnd = new Random();

    public static FigureType GetRandomFigureType(){
        return FigureType.values()[rnd.nextInt(FigureType.values().length)];
    }
}