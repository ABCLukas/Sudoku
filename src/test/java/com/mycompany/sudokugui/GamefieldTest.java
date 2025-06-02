/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sudokugui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author schne
 */
public class GamefieldTest {

    public GamefieldTest() {
    }

    @Test
    public void testInsertNumber_ValidAndInvalid() {
        Gamefield gf = new Gamefield();

        // Valid insertion
        gf.insertNumber(7, 3, 4);
        assertEquals(7, gf.getValOnField(3, 4));

        // Invalid insertion (out of bounds)
        gf.insertNumber(5, -1, 0);
        // Ensure the invalid insertion did not change the field
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != 3 || j != 4) {
                    assertEquals(0, gf.getValOnField(j, j));
                }
            }
        }
    }

}
