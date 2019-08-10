/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info6205.main.neuralnetwork;

import java.io.IOException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author PiyushPrashant
 */
public class BackPropogation_Test {
     
     @Test
    public void LayerInitialization() throws IOException{
       int inputNeurons = 20;
       int hiddenNeurons = 10;
       int outputNeuron = 50;
       BackPropogation backpropagation = new BackPropogation(inputNeurons, hiddenNeurons, outputNeuron);
       
       assertEquals(2, backpropagation.layers.length);
       
       
    }
    
}
