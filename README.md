# Assignment 1 – Grid Items Extension

## What I added (summary)
- **Items** placed on the grid (Bone, Fish, Seed).
- A **custom generic** class `Inventory<T extends Item>` to manage items (add/remove/lookup/paint).
- An **interface** `Item` for any passive grid element that can draw itself and knows its location.
- An **abstract class** `BaseItem` that shares common behaviour for all items (inheritance).

## Why this is good design
- **Interfaces:** `Item` defines what an item must do without dictating how. Any future item type just implements this contract.
- **Inheritance:** `BaseItem` centralises shared state/behaviour; `Bone`, `Fish`, `Seed` extend it, avoiding code duplication.
- **Generics (custom):** `Inventory<T extends Item>` is our own generic container with domain-specific methods (`atCell`, `paintAll`, `snapshot`) and compile-time type safety.

## How to run
- Use Java 11 or Java 21.
- Run `src/Main.java` → `main`.
- You’ll see a 20×20 grid. Items render as small coloured circles at preset cells.
- Hovering still shows the cell label text on the right.

## Where to look in the code
- `src/Item.java` – interface  
- `src/BaseItem.java` – abstract base class  
- `src/Bone.java`, `src/Fish.java`, `src/Seed.java` – concrete items  
- `src/Inventory.java` – **custom generic** container  
- `src/Stage.java` – integrates `Inventory<Item>` and paints items

## Future directions (optional)
- Per-actor `Inventory<Item>` so actors can pick up items.
- Terrain/biomes via specialised `Cell`s or strategies.
