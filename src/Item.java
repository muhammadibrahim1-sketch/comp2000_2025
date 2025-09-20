import java.awt.Graphics;

/**
 * A passive thing that lives on the grid and can draw itself.
 */
public interface Item {
  
  /** Where on the grid this item lives. */
  Cell cell();

  /** Drawing the item. The item chooses how it looks inside its cell. */
  void paint(Graphics g);
}
