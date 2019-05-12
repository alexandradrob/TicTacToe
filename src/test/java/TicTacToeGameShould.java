import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TicTacToeGameShould {
    @Test
    public void shouldStopAfterPlayingTwoBots(){
        Referee r = new Referee(new Playboard(), new BotPlayer("Gandalf"), new BotPlayer("Dumbledore"));
        r.start();
        assertTrue(true);
    }

    @Test
    public void winX(){
        Scanner sc =null;
        try {
             sc = new Scanner(new File("src/test/java/TestWinX.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Referee r = new Referee(new Playboard(), new HumanPlayer("Gandalf", sc), new HumanPlayer("Dumbledore", sc));
        assertEquals(Symbol.SYMBOL_X, r.start());
    }


}
