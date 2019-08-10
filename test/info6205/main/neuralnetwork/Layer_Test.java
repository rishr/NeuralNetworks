/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info6205.main.neuralnetwork;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PiyushPrashant
 */
public class Layer_Test {
    
    @Test
    public void NoOfNeurons() throws IOException{
       int inputNeurons = 10;
       int outputNeurons = 30;
//       Backpropogation backpropagation = new Backpropogation(inputNeurons, hiddenNeurons, outputNeuron);

       Layer layer = new Layer(inputNeurons,outputNeurons);
       
       // This to test the no of neuran size when creating layers. The input size should be 1+ 10 and the output should be 20.
       // The one is added to input because of the bias
       assertEquals(11, layer.input.length);
       assertEquals(30, layer.output.length);
       
       
    }
    
    
    @Test
    public void weightsGenreated(){
        int inputNeurons = 10;
       int outputNeurons = 14;
       
        Layer layer = new Layer(inputNeurons,outputNeurons);
        
        for(int i=0; i< layer.weights.length; i++)
        {
            assertTrue((layer.weights[i] <= 2) && (layer.weights[i] >= -2));
        }
    }
}
