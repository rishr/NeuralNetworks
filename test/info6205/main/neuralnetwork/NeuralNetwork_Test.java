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
public class NeuralNetwork_Test {
    
    @Test
    public void LoadDatset() throws IOException{
        
        LoadDataSet ld = new LoadDataSet();
        float[][] trainingData = ld.loadData();
        assertEquals(10, trainingData.length);
        
        for(int i= 0; i<trainingData.length;i++) {
            assertEquals(64, trainingData[i].length);
        }
    }
    

    
   
    
}
