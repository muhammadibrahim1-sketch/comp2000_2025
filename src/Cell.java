import java.awt.Color;
import java.awt.Graphics;

public class Cell {
    private final int row;
    private final int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void paint(Graphics g, int x, int y, int size, boolean highlighted) {
        if (highlighted) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(x, y, size, size);
        }
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }

    public int row() { return row; }
    public int col() { return col; }
}
