/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sudoku;

import org.junit.jupiter.api.Test;

/**
 *
 * @author schne
 */
public class GamefieldTest {

    private Gamefield gf = new Gamefield();

    public GamefieldTest() {
    }

    /**
     * Test of placeValue method, of class Gamefield.
     */
    @Test
    public void testinsertNumber() {
        gf.insertNumber(1, 4, 4);
        gf.insertNumber(1, 8, 8);
        gf.insertNumber(1, 9, 7);
        gf.insertNumber(2, 2, 8);
        gf.insertNumber(2, 4, 7);
        gf.insertNumber(2, 7, 4);
        gf.insertNumber(2, 8, 9);
        gf.insertNumber(3, 1, 3);
        gf.insertNumber(3, 4, 9);
        gf.insertNumber(3, 5, 2);
        gf.insertNumber(3, 8, 1);
        gf.insertNumber(4, 3, 1);
        gf.insertNumber(4, 4, 6);
        gf.insertNumber(4, 5, 7);
        gf.insertNumber(4, 8, 4);
        gf.insertNumber(5, 1, 6);
        gf.insertNumber(5, 2, 4);
        gf.insertNumber(5, 4, 8);
        gf.insertNumber(5, 5, 3);
        gf.insertNumber(5, 7, 2);
        gf.insertNumber(5, 8, 7);
        gf.insertNumber(5, 9, 5);
        gf.insertNumber(6, 2, 2);
        gf.insertNumber(6, 3, 7);
        gf.insertNumber(6, 4, 5);
        gf.insertNumber(6, 5, 4);
        gf.insertNumber(6, 6, 9);
        gf.insertNumber(6, 8, 3);
        gf.insertNumber(7, 3, 6);
        gf.insertNumber(7, 5, 5);
        gf.insertNumber(7, 8, 2);
        gf.insertNumber(8, 1, 2);
        gf.insertNumber(8, 2, 1);
        gf.insertNumber(8, 3, 8);
        gf.insertNumber(8, 7, 7);
        gf.insertNumber(9, 2, 5);
        gf.insertNumber(9, 3, 3);
        gf.insertNumber(9, 6, 4);
        System.out.println(gf.toString());
    }

    /**
     * Test of toString method, of class Gamefield.
     */
    @Test
    public void testToString() {
        System.out.println(gf.toString());
    }

}
