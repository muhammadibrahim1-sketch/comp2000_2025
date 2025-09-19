import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    private final Grid grid = new Grid();

    public static void main(String[] args) {
        Main window = new Main();
        window.run();
    }

    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));

            // Mouse tracking: update highlight when the mouse moves
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    int row = grid.rowFromY(e.getY());
                    int col = grid.colFromX(e.getX());
                    if (row != -1 && col != -1) {
                        grid.setHighlighted(row, col);
                    } else {
                        grid.clearHighlight();
                    }
                    repaint();
                }
            });
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            grid.paint(g);
        }
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new Canvas());
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            repaint();
        }
    }
}
