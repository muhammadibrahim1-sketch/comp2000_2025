import java.awt.Graphics;

public class Grid {
    // Constants per the brief
    public static final int CELLS = 20;     // 20 x 20
    public static final int CELL_SIZE = 35; // each cell 35x35
    public static final int OFFSET = 10;    // 10px from top/left

    private final Cell[][] cells = new Cell[CELLS][CELLS];

    public Grid() {
        // build the 20x20 grid of Cell objects
        for (int r = 0; r < CELLS; r++) {
            for (int c = 0; c < CELLS; c++) {
                cells[r][c] = new Cell(r, c);
            }
        }
    }

    /** Drawing the whole grid by asking each cell to draw itself. */
    public void paint(Graphics g) {
        for (int r = 0; r < CELLS; r++) {
            for (int c = 0; c < CELLS; c++) {
                int x = OFFSET + c * CELL_SIZE;
                int y = OFFSET + r * CELL_SIZE;
                cells[r][c].paint(g, x, y, CELL_SIZE, /*highlighted*/ false);
            }
        }
    }
}
