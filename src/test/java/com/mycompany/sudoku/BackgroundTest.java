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
//    @Test
//    public void testDeleteValue() {
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                for (int k = 1; k < 10; k++) {
//                    bg.deleteValue(k, i, j);
//                }
//            }
//        }
//        Assertions.assertTrue(!bg.toString().contains("1"));
////        System.out.println(bg.toString());
//    }
//
//    @Test
//    public void testDeleteQuadrant() {
//        bg.deleteValueFromQuadrant(3, 2,2);
////        System.out.println(bg.toString());
//    }
//    
//    @Test
//    public void findLonleyNumberTest(){
//        Gamefield gf = new Gamefield();
//        bg.deleteValue(1, 0, 0);
//        bg.deleteValue(8, 0, 0);
//        bg.deleteValue(7, 0, 0);
//        bg.deleteValue(6, 0, 0);
//        bg.deleteValue(5, 0, 0);
//        bg.deleteValue(4, 0, 0);
//        bg.deleteValue(3, 0, 0);
//        bg.deleteValue(2, 0, 0);
//
//        bg.findLonleyNumber(gf);
//        System.out.println(bg.toString());
//        System.out.println(gf.toString());
//    }
//    
    @Test
    public void spielfeldScannerTest() {
        Gamefield spf = new Gamefield();
        Background ma = new Background();
        spf.insertNumber(4, 0, 3);
        spf.insertNumber(8, 0, 7);
        spf.insertNumber(7, 0, 8);
        spf.insertNumber(8, 1, 1);
        spf.insertNumber(7, 1, 3);
        spf.insertNumber(4, 1, 6);
        spf.insertNumber(9, 1, 7);
        spf.insertNumber(3, 2, 0);
        spf.insertNumber(9, 2, 3);
        spf.insertNumber(2, 2, 4);
        spf.insertNumber(1, 2, 7);
        spf.insertNumber(1, 3, 2);
        spf.insertNumber(6, 3, 3);
        spf.insertNumber(7, 3, 4);
        spf.insertNumber(4, 3, 7);
        spf.insertNumber(6, 4, 0);
        spf.insertNumber(4, 4, 1);
        spf.insertNumber(8, 4, 3);
        spf.insertNumber(3, 4, 4);
        spf.insertNumber(2, 4, 6);
        spf.insertNumber(7, 4, 7);
        spf.insertNumber(5, 4, 8);
        spf.insertNumber(2, 5, 1);
        spf.insertNumber(7, 5, 2);
        spf.insertNumber(5, 5, 3);
        spf.insertNumber(4, 5, 4);
        spf.insertNumber(9, 5, 5);
        spf.insertNumber(3, 5, 7);
        spf.insertNumber(6, 6, 2);
        spf.insertNumber(5, 6, 4);
        spf.insertNumber(2, 6, 7);
        spf.insertNumber(2, 7, 0);
        spf.insertNumber(1, 7, 1);
        spf.insertNumber(8, 7, 2);
        spf.insertNumber(7, 7, 6);
        spf.insertNumber(5, 8, 1);
        spf.insertNumber(3, 8, 2);
        spf.insertNumber(4, 8, 5);

        int iteration = 0;
        while (spf.toString().contains("0")) {
            iteration++;
            System.out.println(spf.toString());
            ma.gamefieldScanner(spf);
            System.out.println(ma.toString());
            ma.findLonleyNumber(spf);
            System.out.println(spf.toString());
            System.out.println("ITERATION: "+iteration);
        }
    }
}
