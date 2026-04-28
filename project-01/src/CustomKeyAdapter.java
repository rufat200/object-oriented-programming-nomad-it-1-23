import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CustomKeyAdapter extends KeyAdapter {

    private final GameBoard gameBoard;
    private final GamePanel gamePanel;

    public CustomKeyAdapter(GameBoard gameBoard, GamePanel gamePanel) {
        this.gameBoard = gameBoard;
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyCode());
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT -> {
                gameBoard.right();
                gamePanel.repaint();
                System.out.println("right arrow");
            }
            case KeyEvent.VK_LEFT -> {
                gameBoard.left();
                gamePanel.repaint();
                System.out.println("left arrow");
            }
            case KeyEvent.VK_UP -> {
                gameBoard.up();
                gamePanel.repaint();
                System.out.println("up arrow");
            }
            case KeyEvent.VK_DOWN -> {
                gameBoard.down();
                gamePanel.repaint();
                System.out.println("down arrow");
            }
        }
    }
}