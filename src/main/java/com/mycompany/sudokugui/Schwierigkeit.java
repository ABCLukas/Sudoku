/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sudokugui;

/**
 *
 * @author schne
 */
public enum Schwierigkeit {
    SCHWER,
    EXPERTE,
    MEISTER;

    public void setField(Gamefield gf) {
        if (this == Schwierigkeit.SCHWER) {
            gf.setGamefield(new int[][]{
                {0, 0, 0, 8, 0, 3, 0, 0, 0},
                {0, 0, 8, 7, 5, 0, 9, 3, 6},
                {5, 7, 0, 0, 0, 0, 0, 2, 0},
                {0, 5, 0, 0, 4, 0, 0, 0, 0},
                {0, 0, 9, 2, 0, 5, 3, 0, 0},
                {0, 0, 0, 0, 0, 1, 4, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 7, 0},
                {7, 0, 0, 5, 0, 0, 2, 0, 8},
                {0, 9, 0, 3, 8, 0, 0, 0, 0}
            });
        } else if (this == Schwierigkeit.EXPERTE) {
            gf.setGamefield(new int[][]{
                {0, 0, 0, 0, 3, 2, 6, 0, 5},
                {0, 0, 2, 0, 0, 0, 0, 0, 0},
                {5, 0, 0, 7, 0, 0, 0, 0, 9},
                {0, 4, 5, 0, 0, 1, 9, 0, 0},
                {0, 0, 0, 3, 0, 0, 0, 5, 0},
                {8, 0, 1, 0, 0, 0, 4, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 7},
                {6, 8, 0, 9, 0, 0, 3, 0, 0},
                {9, 0, 0, 0, 0, 7, 0, 0, 0}
            });
        } else {
            gf.setGamefield(new int[][]{
                {5, 3, 0, 2, 0, 0, 9, 0, 0},
                {0, 0, 0, 0, 3, 0, 2, 0, 5},
                {0, 2, 0, 9, 0, 0, 6, 3, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 6, 0, 3, 7, 0, 0},
                {4, 0, 0, 0, 5, 0, 0, 0, 0},
                {9, 0, 0, 0, 0, 0, 3, 0, 7},
                {0, 8, 0, 0, 6, 0, 0, 9, 0},
                {0, 0, 4, 8, 0, 0, 0, 0, 0},});

        }
    }
}
