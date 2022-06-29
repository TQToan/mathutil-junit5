/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.toantq.mathutil.core;

import static com.toantq.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    //DDT: tách data ra khỏi câu lệnh kiểm thử 
    // tham số hóa Data
    public static Object[][] initData() {
        return new Integer[][] {
            {1, 1},  
            {2, 2},  
            {5, 120},  
            {6, 720},  
        };
    }
    //import hàm static là kỹ thuật dành riêng cho những hàm static
    //gọi hàm mà bỏ qua tên class
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgReturnWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
    
    @Test
    public void testGetFactoryGivenWrongArgumentsWell() {
        //hàm nhận thám số t2 là 1 object implement cái fuctional Interface tên là Exercutable
        /*Executable excObject = new Executable() {
            @Override
            public void execute() throws Throwable {
                MathUtil.getFactorial(-5);
            }
        };*/
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtil.getFactorial(-5);
        } );
    }
}
