import java.awt.Graphics;

public class Grid {
    public static final int CELLS = 20;
    public static final int CELL_SIZE = 35;
    public static final int OFFSET = 10;

    private final Cell[][] cells = new Cell[CELLS][CELLS];
    private int highlightedRow = -1;
    private int highlightedCol = -1;

    public Grid() {
        for (int r = 0; r < CELLS; r++) {
            for (int c = 0; c < CELLS; c++) {
                cells[r][c] = new Cell(r, c);
            }
        }
    }

    public void paint(Graphics g) {
        for (int r = 0; r < CELLS; r++) {
            for (int c = 0; c < CELLS; c++) {
                int x = OFFSET + c * CELL_SIZE;
                int y = OFFSET + r * CELL_SIZE;
                boolean isHighlighted = (r == highlightedRow && c == highlightedCol);
                cells[r][c].paint(g, x, y, CELL_SIZE, isHighlighted);
            }
        }
    }

    // Highlight handling
    public void setHighlighted(int row, int col) {
        highlightedRow = row;
        highlightedCol = col;
    }

    public void clearHighlight() {
        highlightedRow = -1;
        highlightedCol = -1;
    }

    // Converting mouse coordinates to row/col
    public int rowFromY(int y) {
        int r = (y - OFFSET) / CELL_SIZE;
        return (y >= OFFSET && r >= 0 && r < CELLS) ? r : -1;
    }

    public int colFromX(int x) {
        int c = (x - OFFSET) / CELL_SIZE;
        return (x >= OFFSET && c >= 0 && c < CELLS) ? c : -1;
    }
}
