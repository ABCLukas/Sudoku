/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudoku;

/**
 *The Vialual Representaion for The user
 * @author schne
*/

public class Gamefield {

    private int[][] gamefield;

    /**
     * Initializes The gamefield Array
     */
    public Gamefield() {
        this.gamefield = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                gamefield[i][j] = 0;
            }
        }
    }

    /**
     * Inserts a given Value on a Position if its inside of the Bounds
     *
     * @param value The Value that will be placed
     * @param x The Horizontal Position of The Value
     * @param y The Vertical Position of The Value
     */
    public void insertNumber(int value, int x, int y) {
        if (x >= 0 && y >= 0 && x < 9 && y < 9) {
            gamefield[x][y] = value;
        }
    }

    public int getValOnField(int x,int y){
        return gamefield[x][y];
    }
    
    /**
     *
     * @return Returns The Array as a String
     */
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
