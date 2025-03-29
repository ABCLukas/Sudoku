/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudoku;

import java.util.ArrayList;

/**
 *
 * @author schne
 */
public class Background {

    private ArrayList<Integer>[][] background;

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

    public void resetCell(int x, int y) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                background[i][j].clear();
            }
        }
    }

    public void deleteFromRow(int value, int row) {
        for (int i = 0; i < 9; i++) {
            deleteValue(value, i, row);
        }
    }

    public void deleteFromColumn(int value, int Column) {
        for (int i = 0; i < 9; i++) {
            deleteValue(value, Column, i);
        }
    }

    public void deleteValueFromQuadrant(int vlaue, int quadrant) {
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
                deleteValue(vlaue, i, j);
            }
        }
    }

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
