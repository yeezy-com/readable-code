package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.Advanced;
import cleancode.minesweeper.tobe.gamelevel.Beginner;
import cleancode.minesweeper.tobe.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.gamelevel.Middle;
import cleancode.minesweeper.tobe.gamelevel.VeryBeginner;

public class GameApplication {

    public static void main(String[] args) {
        GameLevel gameLevel = new VeryBeginner();

        Minesweeper minesweeper = new Minesweeper(gameLevel);
        minesweeper.run();
    }
}
