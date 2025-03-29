/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudoku;

/**
 *
 * @author schne
 */
public class Gamefield {

    private int[][] gamefield;

    public Gamefield() {
        this.gamefield = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                gamefield[i][j] = 0;
            }
        }
    }

    public void insertNumber(int value, int x, int y) {
        if (x >= 0 && y >= 0 && x < 9 && y < 9) {
            gamefield[x][y] = value;
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                res += gamefield[i][j];
            }
            res += "\n";
        }
        return res;
    }

}
