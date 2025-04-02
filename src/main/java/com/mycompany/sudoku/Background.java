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
     * @param eingabex the Quadrant that will have the given Value removed
     * @param eingabey
     */
    public void deleteValueFromQuadrant(int value, int eingabex, int eingabey) {
        int outputy = 0;
        int outputx = 0;

        if (eingabex >= 0 && eingabex <= 2 && eingabey >= 0 && eingabey <= 2) {
            outputy = 1;
            outputx = 1;
        } else if (eingabex >= 3 && eingabex <= 5 && eingabey >= 0 && eingabey <= 2) {
            outputy = 1;
            outputx = 4;
        } else if (eingabex >= 6 && eingabex <= 8 && eingabey >= 0 && eingabey <= 2) {
            outputy = 1;
            outputx = 8;
        } else if (eingabex >= 0 && eingabex <= 2 && eingabey >= 3 && eingabey <= 5) {
            outputy = 4;
            outputx = 1;
        } else if (eingabex >= 3 && eingabex <= 5 && eingabey >= 3 && eingabey <= 5) {
            outputy = 4;
            outputx = 4;
        } else if (eingabex >= 6 && eingabex <= 8 && eingabey >= 3 && eingabey <= 5) {
            outputy = 4;
            outputx = 8;
        } else if (eingabex >= 0 && eingabex <= 2 && eingabey >= 6 && eingabey <= 8) {
            outputy = 8;
            outputx = 1;
        } else if (eingabex >= 3 && eingabex <= 5 && eingabey >= 6 && eingabey <= 8) {
            outputy = 8;
            outputx = 4;
        } else if (eingabex >= 6 && eingabex <= 8 && eingabey >= 6 && eingabey <= 8) {
            outputy = 8;
            outputx = 8;
        }

        for (int i = outputx - 1; i <= outputx + 1; i++) {
            for (int j = outputy - 1; j <= outputy + 1; j++) {
                deleteValue(value, i, j);
            }
        }
    }

    /**
     * OVERWRITE Method to find if a value in standing alone in the eintire
     * Backend Field
     *
     * @param gf The Gamefield that will be edited
     */
    public void findLonleyNumber(Gamefield gf) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (background[i][j].size() == 1) {
//                    gf.insertNumber(background[i][j].get(0), i, j);
                    resetCell(i, j);
                }
            }
        }
    }

    /**
     * Finds Unique Values in a Row and
     *
     * @param gf
     */
    public void spielfeldScanner(Gamefield gf) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (gf.getValOnField(i, j) != 0) {
                    deleteFromRow(gf.getValOnField(i, j), i);
                    deleteFromColumn(gf.getValOnField(i, j), j);
                    deleteValueFromQuadrant(gf.getValOnField(i, j), i, j);
                    resetCell(i, j);//WORKING
                }
            }
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
                    res += background[i][j].get(k) +",";
                }
                res += " | ";
            }
            res += "\n";
        }
        return res;
    }
}
