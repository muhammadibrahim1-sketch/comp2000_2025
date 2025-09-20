import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Inventory<T extends Item> {
  private final List<T> items = new ArrayList<>();

  public void add(T item) {
    if (item != null) items.add(item);
  }

  public boolean remove(T item) {
    return items.remove(item);
  }

  public List<T> snapshot() {
    return Collections.unmodifiableList(items);
  }

  public Optional<T> atCell(Cell c) {
    if (c == null) return Optional.empty();
    for (T t : items) {
      if (t.getLocation() == c) return Optional.of(t);
    }
    return Optional.empty();
  }

  public void paintAll(Graphics g) {
    for (T t : items) t.paint(g);
  }

  public int size() {
    return items.size();
  }
}

