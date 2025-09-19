# Task 1

Clone this repository (well done!)

# Task 2

The repository you just cloned is a VSCode project, so lets work with it.  It currently will print "Red vs. Blue" message to the console when run.

You will find "Run" and "Debug" commands over the `main` method.  Try them out.  You can also trigger them with `F5` for "Debug" and `Ctrl-F5` for "Run"

Modify the application so that instead it prints

~~~~~
COMP2000 2025
~~~~~

# Task 3

Draw a 20 by 20 grid on a 720x720 window.  Each cell in the grid should be 35 pixels high and wide and the grid should be drawn 10 pixels off the top and left borders of the screen.  To do this, you should use the `Graphics` class from the Java libraries.  Be sure to consult the tips video for this task (it is a link in iLearn).  Without it, you will be very confused.

# Task 4

The "grid" has no identity - it is just drawn.  Later on we will need to do lots of things "with" this grid.  We will modify it and adjust it and ask it questions.  Our task here is to refactor the program to give this grid an identity.  We will create an object to represent the grid and will give that object its own `paint` method for drawing the grid.

We will also need to give an identity to each "cell" of the grid and make each cell responsible for it's own painting to the screen.

Modify the program to make these things happen.  Make a `Grid` class and a `Cell` class and organise them in a sensible way.  What fields and methods should each class have?

# Task 5

Anything that is a `JFrame` or `JPanel` can find out the position of the mouse using `getMousePosition`.  Modify your program so that mousing over a cell will "highlight" it.  Highlighted cells should be drawn in grey.  You may have to think about how you will get the mouse position from the place you can read it, to the place it is needed (the `paint` method of a `Cell` object).











# Week 03 Worksheet : My work for this week

## Task 3
Created a 720×720 window and drew a 20×20 grid of squares.  
Each square was 35×35 pixels, and the whole grid was offset 10 pixels from the top and left.  
This produced the required grid layout.

## Task 4
Refactored the code so the grid and its cells are objects:  
- `Grid.java` represents the whole board and contains a 2D array of `Cell` objects.  
- `Cell.java` represents a single square and knows how to draw itself.  
- `Main.java` now only creates the window and delegates drawing to the `Grid`.  
This gave the grid and cells their own identity, matching OOP principles.

## Task 5
Added functionality so that the cell under the mouse is highlighted.  
- `Main.Canvas` listens for mouse movement.  
- The mouse coordinates are converted to a grid row/column.  
- The corresponding cell is marked as highlighted.  
- When painting, that cell is filled grey while others remain outlined.  

## Reflection
This week learnt how to:
- Draw a grid using loops and coordinate calculations.  
- Apply object-oriented design by splitting responsibilities into `Main`, `Grid`, and `Cell`.  
- Handle mouse input to add interactivity.  
By the end, the program displayed a grid where the hovered cell was clearly highlighted.
