package CreationalDesignPattern.PrototypePattern;

import java.util.List;

public class GameBoard implements Prototype<GameBoard>{
    private List<GamePiece> gamePieces;

    public void addGamePiece(GamePiece piece){
        this.gamePieces.add(piece);
    }

    @Override
    public GameBoard clone() {
        GameBoard gameBoard = new GameBoard();
        for(GamePiece gamePiece: gamePieces){
            gameBoard.addGamePiece(gamePiece.clone());
        }

        return gameBoard;
    }
}
