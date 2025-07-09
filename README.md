# Java Exercise: Matrix Manipulation (Two-Dimensional Array)
## Project Description
This project is a simple Java program designed to demonstrate the creation, display, and calculation of the total elements of a matrix (two-dimensional array). The program creates a 3x3 matrix, populates its elements with random integers, displays it in a neat table format on the console, and then calculates and displays the sum of all elements in the matrix.
*(Please note: Some parts of the codebase, including variable names, are written in Indonesian for clarity among local developers.)*
## Functionality
* Creates a two-dimensional array (matrix) of a predefined size (3x3).
* Fills all matrix elements with random integer values.
* Displays the matrix to the console in an organized table format.
* Calculates the total sum of all elements in the matrix.
* Displays the total sum result.
## How It Works
1.  The program initializes a 3x3 matrix (`int[][] matrix = new int[rows][cols];`).
2.  Using the `Random` object, each matrix element is filled with a random integer between 1 and 100.
3.  The matrix is printed to the console using a *nested loop* for row and column iterations. The `System.out.printf("%4d", ...)` method is used to align numbers neatly in table format.
4.  During the matrix printing process, each element's value is also added to the `totalSum` variable.
5.  After all elements have been processed, the `totalSum` value will be displayed at the end.
## Project Structure
This project consists of a single Java file:
```
.
└── src/
    └── Latihan3.java
└── README.md
```
## Usage Example (Console Output)
Here is an example of how the program output looks on the console. Since the matrix values are generated randomly, the numbers you see will vary each time the program is run.
Matriks
```
93   2  19
3  74  87
6   7  79

Jumlah semua elemen: 370
```
*(The matrix values and total sum will differ each time the program is run because it uses `Random`.)*
## How to Run the Project
To run this program, you need to have the Java Development Kit (JDK) installed on your system.
1.  **Prepare Files**
    Make sure the `Latihan3.java` file is inside the `src/` folder within your project directory.
2.  **Compile Code**
    Open your terminal or Command Prompt, navigate to the root directory of your project (the folder where `src/` and `README.md` are located), and compile the Java file:
    ```
    javac src/Latihan3.java
    ```
3.  **Run the Program**
    Once successfully compiled, you can run the program:
    ```
    java -cp src Latihan3
    ```
