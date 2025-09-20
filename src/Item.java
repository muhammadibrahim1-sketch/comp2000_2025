import java.awt.Graphics;

public interface Item {
  void paint(Graphics g);
  Cell getLocation();
}

