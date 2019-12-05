package Test;

import Utils.FigureTypeGenerator;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();
        for (int i =0; i<3; i++) {
            Figure myFigure= factory.GetFigure(FigureTypeGenerator.GetRandomFigureType());
            myFigure.Draw();
            System.out.println(myFigure.GetInfo());
        }
        // Figure figure = new Rectangle();
        // figure.Draw();
        // System.out.println(figure.GetInfo());
        // Figure figure1 = new Circle();
        // figure1.Draw();
        // System.out.println(figure1.GetInfo());
        // Figure figure2 = new Triangle();
        // figure2.Draw();
        // System.out.println(figure2.GetInfo());
        // Figure figure3 = new Trapezoid();
        // figure3.Draw();
        // System.out.println(figure3.GetInfo());
    }
}
