import java.util.Arrays;

public class Playboard {

    private Symbol[][] matrix;

    /*public Playboard(Symbol[][]matrix){
     this.matrix = matrix;
    */

    public Playboard() {
        matrix = new Symbol[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrix[row][col] = Symbol.SYMBOL_EMPTY;
            }
        }

    }

    public boolean isEmpty(int[] coord) {
        int row = coord[0];
        int col = coord[1];
        return matrix[coord[0]][coord[1]] == Symbol.SYMBOL_EMPTY;

    }

    public boolean isBoardFull(){
        int k = 0;
        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col < 3; col++) {
                if(matrix[row][col] != Symbol.SYMBOL_EMPTY)
                    k++;

            }
        }
        if(k == 9){
            return true;
    }else{return false;
        }
    }

    public void fill(int[] coord, Symbol symbol) {
        int row = coord[0];
        int col = coord[1];
        matrix[row][col] = symbol;
    }

    @Override
    public String toString() {
        String txt = "";
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                txt = txt + matrix[row][col] + " ";
            }
            txt = txt + "\n";
        }
        return txt;

    }

    public Symbol getWinner() {

        Symbol result = Symbol.SYMBOL_EMPTY;
                if (matrix [0][0] != Symbol.SYMBOL_EMPTY && matrix[0][0] == matrix [0][1]&& matrix[0][1] == matrix[0][2]){
                    result = matrix[0][0];}
                if (matrix [1][0] != Symbol.SYMBOL_EMPTY && matrix[1][0] ==  matrix[1][1] && matrix[1][1] == matrix[1][2]) {
                    result =  matrix [1][0];}
                if (matrix [2][0] != Symbol.SYMBOL_EMPTY && matrix[2][0] ==  matrix[2][1] && matrix[2][1] == matrix[2][2]){
                    result =  matrix [2][0];}
                if(matrix [0][0] != Symbol.SYMBOL_EMPTY && matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0] ){
                    result =  matrix[0][0];}
                if(matrix [0][1] != Symbol.SYMBOL_EMPTY && matrix[0][1] ==  matrix[1][1] && matrix[1][1] == matrix[2][1] ){
                    return matrix[0][1];}
                if(matrix [0][2] != Symbol.SYMBOL_EMPTY && matrix[0][2] == matrix[1][2]  && matrix[1][2]  == matrix[2][2]){
                    result = matrix[0][2];}
                if(matrix [0][0] != Symbol.SYMBOL_EMPTY && matrix[0][0] ==  matrix[1][1] && matrix[1][1] ==  matrix[2][2]){
                    result = matrix[0][0];}
                if(matrix [0][2] != Symbol.SYMBOL_EMPTY && matrix[0][2] ==  matrix[1][1] && matrix[1][1] == matrix[2][0] ){
                    result = matrix[0][0];}


        return result;
    }
}


