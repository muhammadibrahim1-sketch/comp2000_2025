import java.awt.Color;
import java.awt.Graphics;

public abstract class Actor {
  protected Color color;   // each subclass will define its own color
  protected Cell loc;      // where on the grid the actor is

  // constructor to set location + color
  public Actor(Cell loc, Color color) {
    this.loc = loc;
    this.color = color;
  }

  // paint method: draws actor in its cell
  public void paint(Graphics g) {
    g.setColor(color);
    g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
  }
}
