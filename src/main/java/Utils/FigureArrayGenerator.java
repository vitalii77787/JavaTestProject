package Utils;

import Figures.Figure;

public class FigureArrayGenerator {
    static FigureFactory factory = new FigureFactory();

    public static Figure[] GetFigureArr() {
        int arraySize = ValueGenerator.GetRandomRangedIntValue(InitialData.MinFigureCount, InitialData.MaxFigureCount);
        Figure myArray[] = new Figure[arraySize];
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = factory.GetFigure(ValueGenerator.GetRandomFigureType());
        }
        return myArray;
    }
}