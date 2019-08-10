/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info6205.main.neuralnetwork;

import org.junit.Test;
import org.hamcrest.number.IsCloseTo;
import static org.junit.Assert.*;

/**
 *
 * @author PiyushPrashant
 */
public class ActivationFunction_Test {
    
    
    @Test
    public void sigmoidReturn(){
        float test1 = 3.772f;
        float test2 = 1.772f;
        float test3 = -2.772f;
        
       
        
//        ActivationFunction act = new ActivationFunction();
//        assertEquals(IsCloseTo.closeTo(operand, error), ActivationFunction.sigmoid(test1));
//        assertThat(, ActivationFunction.sigmoid(test2));
//        assertEquals(IsCloseTo.closeTo(operand, error), ActivationFunction.sigmoid(test3));
//        assertThat(ActivationFunction.sigmoid(test2), IsCloseTo.closeTo(operand, error));
        
        assertTrue((0 <= (ActivationFunction.sigmoid(test1))) && (ActivationFunction.sigmoid(test1) <= 1));
        assertTrue((0 <= (ActivationFunction.sigmoid(test2))) && (ActivationFunction.sigmoid(test2) <= 1));
        assertTrue((0 <= (ActivationFunction.sigmoid(test3))) && (ActivationFunction.sigmoid(test3) <= 1));
    }
}
