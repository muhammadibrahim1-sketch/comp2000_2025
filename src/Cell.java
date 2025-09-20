import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Cell extends Rectangle {
  static int size = 35;
  private final int row;
  private final int col;

  public Cell(int row, int col, int x, int y) {
    super(x, y, size, size);
    this.row = row;
    this.col = col;
  }

  public void paint(Graphics g, Point mousePos) {
    if (mousePos != null && contains(mousePos)) {
      g.setColor(Color.GRAY);   // highlighted
      g.fill(this);             // fill the Rectangle
    } else {
      g.setColor(Color.WHITE);  // normal
      g.fill(this);
    }
    g.setColor(Color.BLACK);
    g.draw(this);               // draw the outline
  }

  public boolean contains(Point p) {
    return (p != null) && super.contains(p);
  }

  public int row() { return row; }
  public int col() { return col; }
}
