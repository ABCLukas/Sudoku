/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudoku;

import java.util.ArrayList;

/**
 * This Class is The Backend for the game and will not bee seen by the Player it
 * contains most of the logic
 *
 * @author schne
 */
public class Background {

    private ArrayList<Integer>[][] background;

    /**
     * Initializes The Bsackground Class and Creates The background Array
     */
    public Background() {
        this.background = new ArrayList[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ArrayList<Integer> tempIntArrayList = new ArrayList<>();
                for (int k = 1; k < 10; k++) {
                    tempIntArrayList.add(k);
                }
                background[i][j] = tempIntArrayList;
            }
        }
    }

    /**
     * Deletes the Value of the Cell on the Given Positions if it is in The
     * given Conditions
     *
     * @param value The Value that will be deletet from the given Position
     * @param x The Horizontal Position of The Value that will be deletet
     * @param y The Vertical Position of The Value that will be deletet
     */
    public void deleteValue(int value, int x, int y) {
        if (x >= 0 && y >= 0 && x < 9 && y < 9) {
            for (int i = 0; i < background[x][y].size(); i++) {
                if (background[x][y].get(i) == value) {
                    background[x][y].remove(i);
                    break;
                }
            }
        }
    }

    /**
     * Resets All of the Values inside of the list
     *
     * @param x The Horizontal Position of the Cell to be Cleared
     * @param y The Vertical Position of the Cell to be Cleared
     */
    public void resetCell(int x, int y) {
        background[x][y].clear();
    }

    /**
     * Delets a given Value from a entire Row
     *
     * @param value the Value that will be Deletet from the entire row
     * @param row the row that will have the given Value removed
     */
    public void deleteFromRow(int value, int row) {
        for (int i = 0; i < 9; i++) {
            deleteValue(value, i, row);
        }
    }

    /**
     * Delets a given Value from a entire Column
     *
     * @param value the Value that will be Deletet from the entire Column
     * @param Column the Column that will have the given Value removed
     */
    public void deleteFromColumn(int value, int Column) {
        for (int i = 0; i < 9; i++) {
            deleteValue(value, Column, i);
        }
    }

    /**
     * Delets a given Value from a entire Quadrant
     *
     * @param value the Value that will be Deletet from the entire Quadrant
     * @param quadrant the Quadrant that will have the given Value removed
     */
    public void deleteValueFromQuadrant(int value, int quadrant) {
        int y = 0;
        int x = 0;
        switch (quadrant) {
            case 1 -> {
                y = 1;
                x = 1;
            }
            case 2 -> {
                y = 4;
                x = 1;
            }
            case 3 -> {
                y = 8;
                x = 1;
            }
            case 4 -> {
                y = 1;
                x = 4;
            }
            case 5 -> {
                y = 4;
                x = 4;
            }
            case 6 -> {
                y = 8;
                x = 4;
            }
            case 7 -> {
                y = 1;
                x = 8;
            }
            case 8 -> {
                y = 4;
                x = 8;
            }
            case 9 -> {
                y = 8;
                x = 8;
            }
        }
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                deleteValue(value, i, j);
            }
        }
    }

    public void findLonleyNumber(Gamefield gf) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (background[i][j].size() == 1) {
                    gf.insertNumber(background[i][j].get(0), i, j);
                    resetCell(i, j);
                }
            }
        }
    }

    public void FindUniqueNumberHorizontally(int value, int row, Gamefield gf) {
        int[] numberCount = new int[9];
        for (int i = 0; i < 9; i++) {
            for(int j= 1;j<background[row][i].size()+1;j++){
                numberCount[background[row][i].get(j-1)-1]++;
            }
        }
        
        for (int i = 0; i < 9; i++) {
            System.out.println("NC: "+numberCount[i]);
        }
    }

    /**
     *
     * @return Returns the Array as a String
     */
    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < background[i][j].size(); k++) {
                    res += background[i][j].get(k);
                }
                res += "\t";
            }
            res += "\n";
        }
        return res;
    }
}
