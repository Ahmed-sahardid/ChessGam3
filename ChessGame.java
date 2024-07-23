import java.util.HashMap;
import java.util.Map;

public class ChessGame {

    private Map<String, ChessPiece> board;

    public ChessGame() {
        board = new HashMap<String, ChessPiece>();
        initBoard();
    }

    public void initBoard() {
        board.put("a1", new Rook(PieceColor.WHITE));
        board.put("b1", new Knight(PieceColor.WHITE));
        board.put("c1", new Bishop(PieceColor.WHITE));
        board.put("d1", new Queen(PieceColor.WHITE));
        board.put("e1", new King(PieceColor.WHITE));
        board.put("f1", new Bishop(PieceColor.WHITE));
        board.put("g1", new Knight(PieceColor.WHITE));
        board.put("h1", new Rook(PieceColor.WHITE));
        board.put("a2", new Pawn(PieceColor.WHITE));
        board.put("b2", new Pawn(PieceColor.WHITE));
        board.put("c2", new Pawn(PieceColor.WHITE));
        board.put("d2", new Pawn(PieceColor.WHITE));
        board.put("e2", new Pawn(PieceColor.WHITE));
        board.put("f2", new Pawn(PieceColor.WHITE));
        board.put("g2", new Pawn(PieceColor.WHITE));
        board.put("h2", new Pawn(PieceColor.WHITE));

        board.put("a8", new Rook(PieceColor.BLACK));
        board.put("b8", new Knight(PieceColor.BLACK));
        board.put("c8", new Bishop(PieceColor.BLACK));
        board.put("d8", new Queen(PieceColor.BLACK));
        board.put("e8", new King(PieceColor.BLACK));
        board.put("f8", new Bishop(PieceColor.BLACK));
        board.put("g8", new Knight(PieceColor.BLACK));
        board.put("h8", new Rook(PieceColor.BLACK));
        board.put("a7", new Pawn(PieceColor.BLACK));
        board.put("b7", new Pawn(PieceColor.BLACK));
        board.put("c7", new Pawn(PieceColor.BLACK));
        board.put("d7", new Pawn(PieceColor.BLACK));
        board.put("e7", new Pawn(PieceColor.BLACK));
        board.put("f7", new Pawn(PieceColor.BLACK));
        board.put("g7", new Pawn(PieceColor.BLACK));
        board.put("h7", new Pawn(PieceColor.BLACK));
    }

    public ChessPiece getPiece(String position) {
        return board.get(position);
    }

    public void movePiece(String start, String end) {
        ChessPiece piece = board.get(start);
        board.remove(start);
        board.put(end, piece);
    }

    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        game.movePiece("e2", "e4");
        game.movePiece("e7", "e5");
        ChessPiece whitePawn = game.getPiece("e4");
        ChessPiece blackPawn = game.getPiece("e5");
        System.out.println(whitePawn.getColor()); // should output WHITE
        System.out.println(blackPawn.getColor()); // should output BLACK
    }

}
