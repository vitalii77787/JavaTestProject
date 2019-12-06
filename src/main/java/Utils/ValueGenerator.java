package Utils;

import java.util.Random;

public class ValueGenerator {
    private static Random rnd = new Random();

    public static FigureType GetRandomFigureType() {
        return FigureType.values()[rnd.nextInt(FigureType.values().length)];
    }

    public static Colour GetRandomColour() {
        return Colour.values()[rnd.nextInt(Colour.values().length)];
    }

    public static double GetRangedDoubleValue(double leftBoundary, double rightBoundary) {
        double randomValue = leftBoundary + (rightBoundary - leftBoundary) * rnd.nextDouble();
        return Math.round(randomValue * 100.0) / 100.0;
    }

    public static int GetRandomRangedIntValue(int leftBoundary, int rightBoundary) {
        int randomValue = rnd.nextInt((rightBoundary - leftBoundary) + 1) + leftBoundary;
        return randomValue;
    }
}