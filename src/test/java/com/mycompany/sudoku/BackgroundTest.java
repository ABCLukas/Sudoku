/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sudoku;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author schne
 */
public class BackgroundTest {

    private Background bg = new Background();

    public BackgroundTest() {
    }

    /**
     * Test of deleteValue method, of class Background.
     */
    @Test
    public void testDeleteValue() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 1; k < 10; k++) {
                    bg.deleteValue(k, i, j);
                }
            }
        }
        Assertions.assertTrue(!bg.toString().contains("1"));
        System.out.println(bg.toString());
    }

    @Test
    public void testDeleteQuadrant() {
        bg.deleteValueFromQuadrant(3, 2);
        System.out.println(bg.toString());
    }
}
