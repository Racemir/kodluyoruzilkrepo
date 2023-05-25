package Derlemeler;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int mapRow, mapCol;
    int rowMine, colMine, mineNumber, mineControl = 0;
    int gameRow, gameCol;
    int win = 0, i = 0;
    int a = -1;
    int b = -1;
    String[][] game;
    Scanner scan = new Scanner(System.in);

    MineSweeper() {
    }

    public void gamePlayer() {
        System.out.print("CONTROL PANEL\nGAME BOARD\nGAME Row Number: ");
        this.mapRow = scan.nextInt();
        System.out.print("GAME Col Number: ");
        this.mapCol = scan.nextInt();

        this.game = new String[this.mapRow][this.mapCol];
        this.mineNumber = (this.mapRow * this.mapCol) / 4;
        win = (this.mapCol * this.mapRow) - this.mineNumber;

        while (this.mapRow <= 1 && this.mapCol <= 1) {
            System.out.print("!! The game board cannot be among the entered indices\nGAME Row Number: ");
            this.mapRow = scan.nextInt();
            System.out.print("GAME Col Number: ");
            this.mapCol = scan.nextInt();
        }
        this.game = new String[this.mapRow][this.mapCol];
        this.mineNumber = (this.mapRow * this.mapCol) / 4;
        win = (this.mapCol * this.mapRow) - this.mineNumber;
    }

    public void gameBoard() {

        for (int row = 0; row < this.mapRow; row++) {
            for (int col = 0; col < this.mapCol; col++) {
                this.game[row][col] = "-";
            }
        }
        randomMine();
    }

    public void randomMine() {
        //Mayın sayısı kadar mayın üretme
        Random mine = new Random();
        for (int i = 0; i < this.mineNumber; i++) {
            this.rowMine = mine.nextInt(this.mapRow);
            this.colMine = mine.nextInt(this.mapCol);
            if (!this.game[rowMine][colMine].equals("*")) {
                this.game[rowMine][colMine] = "*";
            }
        }
        //mayınları gameBoard'a yerleştirme
        for (int row = 0; row < this.mapRow; row++) {
            for (int col = 0; col < this.mapCol; col++) {
                if (!this.game[row][col].equals("*")) {
                    this.game[row][col] = "-";
                }
                System.out.print(this.game[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void startGame() {
        System.out.println("THE GAME BEGİNS");
        while (win > i) {
            System.out.print("Row: ");
            this.gameRow = scan.nextInt();
            System.out.print("Col: ");
            this.gameCol = scan.nextInt();

            if (this.gameRow == this.a && this.gameCol == this.b){
                System.out.println("Do not enter the same value !!");
                System.out.print("Row: ");
                this.gameRow = scan.nextInt();
                System.out.print("Col: ");
                this.gameCol = scan.nextInt();
            }

            if (this.gameRow < 0 || this.gameRow >= this.mapRow) {
                System.out.println("Row değeri Dizi sınırları içerisinde değil");
                startGame();
            } else if (this.gameCol < 0 || this.gameCol >= this.mapCol) {
                System.out.println("Col değeri dizi sınırları içerisinde değil");
                startGame();
            }

            if (Objects.equals(this.game[gameRow][gameCol], "*")) {
                System.out.println("BOOM GAME OVER !!");
            } else {
                i++;
                gameMineControl();
            }
            break;
        }
        if (this.i == this.win){
            System.out.println("Win");
        }
    }

    public void gameMineControl() {
        this.a = this.gameRow;
        this.b = this.gameCol;

        if (this.gameRow == 0 && this.gameCol == 0) {//5
            for (int row = this.gameRow; row <= this.gameRow + 1; row++) {
                for (int col = this.gameCol; col <= this.gameCol + 1; col++) {
                    if (Objects.equals(this.game[row][col], "*")) {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        } else if (this.gameCol == 0 && this.gameRow == this.mapRow - 1) {//6
            for (int row = this.gameRow - 1; row <= this.gameRow; row++) {
                for (int col = this.gameCol; col <= this.gameCol + 1; col++) {
                    if (this.game[row][col] == "*") {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        } else if (this.gameCol == this.mapCol - 1 && this.gameRow == 0) {//7
            for (int row = this.gameRow; row <= this.gameRow + 1; row++) {
                for (int col = this.gameCol - 1; col <= this.gameCol; col++) {
                    if (this.game[row][col] == "*") {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        } else if (this.gameCol == this.mapCol - 1 && this.gameRow == this.mapRow - 1) {//8
            for (int row = this.gameRow - 1; row <= this.gameRow; row++) {
                for (int col = this.gameCol - 1; col <= this.gameCol; col++) {
                    if (this.game[row][col].equals("*")) {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        } else if (this.gameRow == 0) { //1
            for (int row = this.gameRow; row <= this.gameRow + 1; row++) {
                for (int col = this.gameCol - 1; col <= this.gameCol + 1; col++) {
                    if (this.game[row][col] == "*") {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        } else if (this.gameCol == 0) { //2
            for (int row = this.gameRow - 1; row <= this.gameRow + 1; row++) {
                for (int col = this.gameCol; col <= this.gameCol + 1; col++) {
                    if (this.game[row][col] == "*") {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        } else if (this.gameCol == this.mapCol - 1) { //3
            for (int row = this.gameRow - 1; row <= this.gameRow + 1; row++) {
                for (int col = this.gameCol - 1; col <= this.gameCol; col++) {
                    if (this.game[row][col] == "*") {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        } else if (this.gameRow == this.mapRow - 1) {//4
            for (int row = this.gameRow - 1; row <= this.gameRow; row++) {
                for (int col = this.gameCol - 1; col <= this.gameCol + 1; col++) {
                    if (this.game[row][col] == "*") {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        } else if (this.gameCol == this.gameRow) {
            for (int row = this.gameRow - 1; row <= this.gameRow + 1; row++) {
                for (int col = this.gameCol - 1; col <= this.gameCol + 1; col++) {
                    if (this.game[row][col] == "*") {
                        this.mineControl++;
                    }
                }
            }
            printMineControl();
        }
    }

    public void printMineControl() {
        this.game[gameRow][gameCol] = String.valueOf(this.mineControl);
        mineControl = 0;
        for (int i = 0; i < this.mapRow; i++) {
            for (int j = 0; j < this.mapCol; j++) {
                System.out.print(this.game[i][j] + " ");
            }
            System.out.println("");
        }
        startGame();
    }

    public void run() {
        gamePlayer();
        gameBoard();
        startGame();
    }
}




