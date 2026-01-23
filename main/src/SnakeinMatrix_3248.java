import java.util.List;

public class SnakeinMatrix_3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int col=0;
        int row=0;
        for( String command: commands){
            if(command.equals("UP")){
                row--;
            }
            else if(command.equals("RIGHT")){
                col++;
            }else if(command.equals("DOWN")){
                row++;
            }else if(command.equals("LEFT")){
                col--;
            }
        }
        return (row*n)+col;


    }
}
