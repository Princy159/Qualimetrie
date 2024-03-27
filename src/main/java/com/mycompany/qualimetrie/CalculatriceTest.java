/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qualimetrie;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author inclu
 */





public class CalculatriceTest {

    @Test
    public void testAddition() {
        Calculatrice calc = new Calculatrice();
        assertEquals(4, calc.addition(2, 2));
        assertEquals(-1, calc.addition(-2, 1));
        assertEquals(5, calc.addition(5, 0));
        assertEquals(-3, calc.addition(0, -3));
    }

    @Test
    public void testSoustraction() {
        Calculatrice calc = new Calculatrice();
        assertEquals(3, calc.soustraction(5, 2));
        assertEquals(-4, calc.soustraction(-2, 2));
        assertEquals(5, calc.soustraction(5, 0));
        assertEquals(-3, calc.soustraction(0, 3));
    }

    @Test
    public void testMultiplication() {
        Calculatrice calc = new Calculatrice();
        assertEquals(10, calc.multiplication(2, 5));
        assertEquals(-6, calc.multiplication(-2, 3));
        assertEquals(0, calc.multiplication(5, 0));
        assertEquals(0, calc.multiplication(0, -3));
    }

    @Test
    public void testDivision() {
        Calculatrice calc = new Calculatrice();
        assertEquals(2, calc.division(4, 2), 0.001);
        assertEquals(-3, calc.division(9, -3), 0.001);
        assertEquals(0, calc.division(0, 5), 0.001);

        try {
            calc.division(55.0, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Le diviseur ne peut être zéro", e.getMessage());
        }

    }


}