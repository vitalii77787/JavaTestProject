package Test;

import Figures.Figure;
import Utils.FigureArrayGenerator;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        Figure [] figureArr = FigureArrayGenerator.GetFigureArr();
        for (Figure figure : figureArr) {
            figure.Draw();
            figure.DisplayInfo();
        }      
    }
}
