import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) {
        Main window = new Main();
        window.run();
    }

    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g); // clear background

            g.setColor(Color.BLACK);

            int cellSize = 35;   // each cell 35x35
            int offset = 10;     // 10px from top and left
            int cells = 20;      // 20 rows, 20 cols

            // draw 20x20 grid
            for (int row = 0; row < cells; row++) {
                for (int col = 0; col < cells; col++) {
                    int x = offset + col * cellSize;
                    int y = offset + row * cellSize;
                    g.drawRect(x, y, cellSize, cellSize);
                }
            }
        }
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            repaint();
        }
    }
}
