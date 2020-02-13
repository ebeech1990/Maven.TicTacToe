package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        int count = 0;
        //[0,0] [0,1] [0,2]
        //[1,0] [1,1] [1,2]
        //[2,0] [2,1] [2,2]
        boolean result = false;

            if((matrix[0][0] == 'X') &&(matrix[1][0] == 'X') && (matrix[2][0] == 'X')) {//col 0
                result = true;
            }
            else if((matrix[0][1] == 'X') &&(matrix[1][1] == 'X') && (matrix[2][1] == 'X')) {//col 1
                result = true;
            }
            else if((matrix[0][2] == 'X') &&(matrix[1][2] == 'X') && (matrix[2][2] == 'X')) {//col 2
                result = true;
            }
            else if((matrix[0][0] == 'X') &&(matrix[0][1] == 'X') && (matrix[0][2] == 'X')) {//row0
                result = true;
            }
            else if((matrix[1][0] == 'X') &&(matrix[1][1] == 'X') && (matrix[1][2] == 'X')) {//row1
                result = true;
            }
            else if((matrix[2][0] == 'X') &&(matrix[2][1] == 'X') && (matrix[2][2] == 'X')) {//row2
                result = true;
            }
            else if((matrix[0][0] == 'X') &&(matrix[1][1] == 'X') && (matrix[2][2] == 'X')) {//diag right
                result = true;
            }

        else if((matrix[0][2] == 'X') && (matrix[1][1] == 'X') && (matrix[2][0] == 'X')) {//diag left
            result = true;
        }
        return result;
    }

    public Boolean isInFavorOfO() {

        int count = 0;

        boolean result = false;
        if((matrix[0][0] == 'O') &&(matrix[1][0] == 'O') && (matrix[2][0] == 'O')) {//col 0
            result = true;
        }
        else if((matrix[0][1] == 'O') &&(matrix[1][1] == 'O') && (matrix[2][1] == 'O')) {//col 1
            result = true;
        }
        else if((matrix[0][2] == 'O') &&(matrix[1][2] == 'O') && (matrix[2][2] == 'O')) {//col 2
            result = true;
        }
        else if((matrix[0][0] == 'O') &&(matrix[0][1] == 'O') && (matrix[0][2] == 'O')) {//row0
            result = true;
        }
        else if((matrix[1][0] == 'O') &&(matrix[1][1] == 'O') && (matrix[1][2] == 'O')) {//row1
            result = true;
        }
        else if((matrix[2][0] == 'O') &&(matrix[2][1] == 'O') && (matrix[2][2] == 'O')) {//row2
            result = true;
        }
        else if((matrix[0][0] == 'O') &&(matrix[1][1] == 'O') && (matrix[2][2] == 'O')) {//diag right
            result = true;
        }

        else if((matrix[0][2] == 'O') && (matrix[1][1] == 'O') && (matrix[2][0] == 'O')) {//diag left
            result = true;
        }
        return result;
    }

    public Boolean isTie() {
        boolean result = false;
        if(!isInFavorOfO() && !isInFavorOfX()){
            result = true;
        }
        return  result;
    }

    public String getWinner() {
        String result = "";
        if(isInFavorOfO()){
            result = "O";
        }
        else if(isInFavorOfX()){
            result = "X";
        }

        return result;
    }

}
