import java.awt.Graphics;
import java.awt.Point;

public class Grid {
  // keep your 20x20 grid
  Cell[][] cells = new Cell[20][20];

  // constants (match your Cell.size and 10px offset)
  static final int OFFSET = 10;

  public Grid() {
    for (int r = 0; r < cells.length; r++) {              // r = row (y)
      for (int c = 0; c < cells[r].length; c++) {         // c = col (x)
        int x = OFFSET + Cell.size * c;                   // x from column
        int y = OFFSET + Cell.size * r;                   // y from row
        cells[r][c] = new Cell(r, c, x, y);               // pass row, col, x, y
      }
    }
  }

  // unchanged API shape: paint every cell, passing mouse position
  public void paint(Graphics g, Point mousePos) {
    for (int r = 0; r < cells.length; r++) {
      for (int c = 0; c < cells[r].length; c++) {
        cells[r][c].paint(g, mousePos);
      }
    }
  }

  // keep your accessor but fix the indexing to row-major (cells[row][col])
  public Cell cellAtColRow(int c, int r) {
    return cells[r][c];
  }

  // optional tiny helper (if you ever need row/col from pixel coords)
  public Point rcFromXY(int x, int y) {
    for (int r = 0; r < cells.length; r++) {
      for (int c = 0; c < cells[r].length; c++) {
        if (cells[r][c].contains(new Point(x, y))) return new Point(r, c);
      }
    }
    return new Point(-1, -1);
  }
}
