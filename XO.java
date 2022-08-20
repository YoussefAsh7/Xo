package tictacgame;
import java.util.*;

public class TicTacGame {
static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
                 
        char[][] board= {
                      {' ','|',' ','|',' '},
                      {'-','+','-','+','-'},
                      {' ','|',' ','|',' '},
                      {'-','+','-','+','-'},
                      {' ','|',' ','|',' '}
                              };
        System.out.println("player 1: Enter your name");
        String player1=S.nextLine(); 
        System.out.println("player 2: Enter your name");
        String player2=S.nextLine();
        System.out.println(player1+" you will play with X ");
        System.out.println(player2+" you will play with O ");
        
    boolean GameOver= isGameOver( board , player1 , player2);
        PrintBoard( board);
    while(!GameOver){
        player1Move( board);
        PrintBoard( board);
        GameOver= isGameOver( board , player1 , player2);
    if(GameOver){
        break;
        }
        player2Move( board);
        PrintBoard( board);
        GameOver= isGameOver( board , player1 , player2);
    if(GameOver){
        break;
        }      
        }   
        
    }
    
 
    public static void PrintBoard(char[][] board){
        for(int i=0; i<board.length; i++){
         for(int j=0; j<board[i].length; j++){  
            System.out.print(board[i][j]);
        }
            System.out.println();
        }
        }
        
    public static void player1Move(char[][] board){
        System.out.println("Please make a move. (1-9)");
        int position1 = S.nextInt();
    boolean result = isValidMove(position1,board);
    while(!result){
        System.out.println("Sorry! Invalid Move. Try again");
        position1 = S.nextInt();
        result = isValidMove(position1,board);
    }
    Place(board,position1,"playr1");
    }
    
    public static void player2Move(char[][] board){
        System.out.println("Please make a move. (1-9)");
        int position2 = S.nextInt();
    boolean result = isValidMove(position2,board);
    while(!result){
        System.out.println("Sorry! Invalid Move. Try again");
        position2 = S.nextInt();
        result = isValidMove(position2,board);
    }
    Place(board,position2,"playr2");
        }

    public static void Place(char[][] board, int position, String user){
            char mark=' ';
        if(user.equals("playr1")){
            mark = 'X';
        }
        else if(user.equals("playr2")){
                mark = 'O';
        }
        switch(position){
        case 1:
            board[0][0] = mark; 
        break;
        case 2:
            board[0][2] = mark;
        break; 
        case 3:
            board[0][4] = mark;
        break;
        case 4:
            board[2][0] = mark;
        break;
        case 5:
            board[2][2] = mark;
        break;
        case 6:
            board[2][4] = mark;
        break;
        case 7:
            board[4][0] = mark;
        break;
        case 8:
            board[4][2] = mark;
        break;
        case 9:
            board[4][4] = mark;
        break;
        default:
            System.out.println("wrong position");
        }
}
    public static boolean isValidMove(int position, char[][] board){
        switch (position){
        case 1:
        if(board[0][0] == ' '){
            return true;
            }
            else{
            return false;
            }
        case 2:
            if(board[0][2] == ' '){
                return true;
            }
            else{
            return false;
            }
        case 3:
            if(board[0][4] == ' '){
                return true;
            } else{
                return false;
            }

        case 4:
            if(board[2][0] == ' '){
                return true;
            } else{
                return false;
            }
        case 5:
            if(board[2][2] == ' '){
                return true;
            } else{
                return false;
            }
        case 6:
            if(board[2][4] == ' '){
                return true;
            } else{
                return false;
            }
        case 7:
            if(board[4][0] == ' '){
                return true;
            } else{
                return false;
            }
        case 8:
            if(board[4][2] == ' '){
                return true;
            } else{
                return false;
            }
        case 9:
            if(board[4][4] == ' '){
                return true;
            } else{
                return false;
            }

        default:
            return false;
    }
} 

public static boolean isGameOver(char [][] board , String player1, String player2){
    
    if(board[0][0] == 'X'&& board[0][2] == 'X' && board [0][4] == 'X' ){
        System.out.println(" Player1 Wins Congratulations " +player1);
        return true;
    }
    if(board[0][0] == 'O'&& board[0][2] == 'O' && board [0][4] == 'O' ){
        System.out.println(" player2 Wins Congratulations " +player2);
        return true;
    }
    if(board[2][0] == 'X'&& board[2][2] == 'X' && board [2][4] == 'X' ){
        System.out.println(" Player1 Wins Congratulations " +player1);
        return true;
    }
    if(board[2][0] == 'O'&& board[2][2] == 'O' && board [2][4] == 'O' ){
        System.out.println(" player2 Wins Congratulations " +player2);
        return true;
    }
    if(board[4][0] == 'X'&& board[4][2] == 'X' && board [4][4] == 'X' ){
        System.out.println(" Player1 Wins Congratulations " +player1);
        return true;
    }
    if(board[4][0] == 'O'&& board[4][2] == 'O' && board [4][4] == 'O' ) {
        System.out.println(" player2 Wins Congratulations " +player2);
        return true;
    }
    if(board[0][0] == 'X'&& board[2][0] == 'X' && board [4][0] == 'X' ){
            System.out.println(" Player1 Wins Congratulations " +player1);
            return true;
    }
    if(board[0][0] == 'O'&& board[2][0] == 'O' && board [4][0] == 'O' ){
            System.out.println(" player2 Wins Congratulations " +player2);
            return true;
    }
    if(board[0][2] == 'X'&& board[2][2] == 'X' && board [4][2] == 'X' ){
            System.out.println(" Player1 Wins Congratulations " +player1);
            return true;
    }
    if(board[0][2] == 'O'&& board[2][2] == 'O' && board [4][2] == 'O' ){
            System.out.println(" player2 Wins Congratulations " +player2);
            return true;
    }

    if(board[0][4] == 'X'&& board[2][4] == 'X' && board [4][4] == 'X' ){
            System.out.println(" Player1 Wins Congratulations " +player1);
            return true;
    }
    if(board[0][4] == 'O'&& board[2][4] == 'O' && board [4][4] == 'O' ){
            System.out.println(" player2 Wins Congratulations " +player2);
            return true;
    }
    if(board[0][0] == 'X'&& board[2][2] == 'X' && board [4][4] == 'X' ){
            System.out.println(" Player1 Wins Congratulations " +player1);
            return true;
    }
    if(board[0][0] == 'O'&& board[2][2] == 'O' && board [4][4] == 'O' ){
            System.out.println(" player2 Wins Congratulations " +player2);
            return true;
    }

    if(board[4][0] == 'X'&& board[2][2] == 'X' && board [0][4] == 'X' ){
            System.out.println(" Player1 Wins Congratulations " +player1);
            return true;
    }
    if(board[4][0] == 'O'&& board[2][2] == 'O' && board [0][4] == 'O' ){
            System.out.println(" player2 Wins Congratulations " +player2);
            return true;
    }

    if(board[0][0] != ' ' && board[0][2] != ' ' && board[0][4] != ' ' && board[2][0] !=' '&&
       board[2][2] != ' ' && board[2][4] != ' ' && board[4][0] != ' ' && board[4][2] != ' ' && board[4][4] != ' '){
            System.out.println("Its a tie");
            return true;
    }

    return false;}       
                          
}

