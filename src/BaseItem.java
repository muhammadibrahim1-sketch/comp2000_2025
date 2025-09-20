import java.awt.Color;
import java.awt.Graphics;

public abstract class BaseItem implements Item {
  protected final Cell loc;
  protected final Color color;

  protected BaseItem(Cell loc, Color color) {
    this.loc = loc;
    this.color = color;
  }

  @Override
  public Cell getLocation() {
    return loc;
  }

  @Override
  public void paint(Graphics g) {
    // draw a small filled oval inside the cell
    int pad = 10;
    int x = loc.x + pad;
    int y = loc.y + pad;
    int w = loc.width  - 2 * pad;
    int h = loc.height - 2 * pad;

    g.setColor(color);
    g.fillOval(x, y, w, h);
    g.setColor(Color.DARK_GRAY);
    g.drawOval(x, y, w, h);
  }
}

