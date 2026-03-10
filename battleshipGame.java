/*
import java.util.Scanner;

public class battleshipGame {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String[][] shipMap = new String[10][10];

        int columns = shipMap[0].length;
        int rows = shipMap.length;

        int randomX = (int)(Math.random() * rows);
        int randomY = (int)(Math.random() * columns);

        // Fill and print empty board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                shipMap[i][j] = "[ ]";
                System.out.print(shipMap[i][j]);
            }
            System.out.println();
        }

        // -----------------------------
        // PART 1: shipCount / random lengths / random positions
        // -----------------------------
        int shipCount = 3; // how many ships you want

        for (int s = 0; s < shipCount; s++) {

            int shipLength = 2 + (int)(Math.random() * 3); // random length: 2, 3, or 4
            boolean placed = false;

            while (!placed) {

                randomX = (int)(Math.random() * rows);
                randomY = (int)(Math.random() * columns);

                boolean horizontal = Math.random() < 0.5;

                // bounds check (does it fit?)
                if (horizontal) {
                    if (randomY + shipLength - 1 >= columns) {
                        continue;
                    }
                } else {
                    if (randomX + shipLength - 1 >= rows) {
                        continue;
                    }
                }

                // overlap check (is any spot already "X"?)
                boolean overlap = false;
                for (int k = 0; k < shipLength; k++) {
                    int xPos;
                    int yPos;

                    if (horizontal) {
                        xPos = randomX;
                        yPos = randomY + k;
                    } else {
                        xPos = randomX + k;
                        yPos = randomY;
                    }

                    if (shipMap[xPos][yPos].equals(" X ")) {
                        overlap = true;
                        break;
                    }
                }
                if (overlap) {
                    continue;
                }

                // -----------------------------
                // PART 2: place the ship (your requested rewrite)
                // -----------------------------
                for (int k = 0; k < shipLength; k++) {
                    int xPos;
                    int yPos;

                    if (horizontal) {
                        xPos = randomX;
                        yPos = randomY + k;
                    } else {
                        xPos = randomX + k;
                        yPos = randomY;
                    }

                    shipMap[xPos][yPos] = " X ";
                }

                placed = true;
            }
        }

        // -----------------------------
        // PART 3: hitCount logic with randomized ship sizes
        // -----------------------------
        int totalShipSquares = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (shipMap[i][j].equals(" X ")) {
                    totalShipSquares++;
                }
            }
        }

        int hitCount = 0;

        while (hitCount != totalShipSquares) {

            System.out.println("Guess the y position of the ship! (0-9)");
            int xGuess = Integer.parseInt(myObj.nextLine());

            System.out.println("Guess the x position of the ship! (0-9)");
            int yGuess = Integer.parseInt(myObj.nextLine());

            // bounds check so it doesn't crash
            if (xGuess < 0 || xGuess >= rows || yGuess < 0 || yGuess >= columns) {
                System.out.println("Out of bounds. Try again.");
                continue;
            }

            if (shipMap[xGuess][yGuess].equals(" X ")) {
                System.out.println("Right on!");
                hitCount++;
                shipMap[xGuess][yGuess] = " H "; // mark hit so it can't be counted twice
            } else if (shipMap[xGuess][yGuess].equals(" H ")) {
                System.out.println("You already hit that spot!");
            } else {
                System.out.println("Try again!");
            }

            // print board after each guess (this currently shows ships too)
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(shipMap[i][j]);
                }
                System.out.println();
            }
        }

        System.out.println("You win! All ship squares hit.");
    }
}
*/