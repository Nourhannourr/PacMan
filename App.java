//used to creat a graphical window
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        // creatig the board.
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;  //pixels
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man");
        //set the size of the board in pixels.
        frame.setSize(boardWidth, boardHeight);
        //centers the window on the screen.
        frame.setLocationRelativeTo(null);
        //Prevents resizing of the window.
        frame.setResizable(false);
        //make sure the window will be closed when the user click on the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus();// for moving by key board
        frame.setVisible(true);
    }
}