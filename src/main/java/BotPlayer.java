import java.util.Random;

public class BotPlayer implements Playable {
    private String name;
    private Symbol s;


    public BotPlayer(String name){
        this.name = name;
    }
    public int[] getCoord() {
        Random r = new Random();
        int row = r.nextInt(3);
        int col =  r.nextInt(3);

        return new int[]{row, col};
    }

    public Symbol getSymbol() {
        return s;
    }

    public void setSymbol(Symbol s) {
        this.s =s;

    }
    @Override
    public String toString(){
        return name + " ";
    }
}
