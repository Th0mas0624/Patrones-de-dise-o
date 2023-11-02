package controller;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import model.memento.Caretaker;
import model.memento.OriginatorPlayer;
import view.GamePanel;
public class KeyboardInputs implements KeyListener {
	private GamePanel gameMainPanel;
	private OriginatorPlayer player;
	private Caretaker caretaker;

	public KeyboardInputs(GamePanel gamePanel, 
            OriginatorPlayer player, Caretaker caretaker) {
        this.gameMainPanel = gamePanel;
        this.player = player;
        this.caretaker = caretaker;
    }

	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
            // Llama al método de movimiento apropiado
            case KeyEvent.VK_W: player.moveUp(); break;
            case KeyEvent.VK_A: player.moveLeft(); break;
            case KeyEvent.VK_S: player.moveDown(); break;
            case KeyEvent.VK_D: player.moveRight(); break;
            // Guardar un checkpoint (Memento)
			case KeyEvent.VK_C: caretaker.addCheckpoint(); break;
            // Deshacer (restaurar desde el último chec↕kpoint)
            case KeyEvent.VK_Z: caretaker.undo(); break;
        }
	}
}
