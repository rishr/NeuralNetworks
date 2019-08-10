/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info6205.main.neuralnetwork;

/**
 *
 * @author PiyushPrashant
 */

import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Math.round;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class NeuralNetwork {
    
    public int calculateoutput(float[]  calculatedOutput ){
         float max_val=Integer.MIN_VALUE;
                int prediction= Integer.MIN_VALUE;
                for(int a =0; a<calculatedOutput.length;a++){
                    if(max_val<calculatedOutput[a]){
                        max_val=calculatedOutput[a];
                        prediction = a;
                        //int b = (int) Math.round(0.0000007);
                    }
                }
                return prediction;
    }
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws Exception {
         NeuralNetwork nw = new NeuralNetwork();
         LoadDataSet ld = new LoadDataSet();
         float[][] trainingData = ld.loadData();


        

		
		float[][] trainingResults = new float[][] {
//			 new float[] {1,0,0,0,0,0,0,0,0,0}, // "0"
			 new float[] {1,0,0,0,0,0,0,0,0,0}, // "0"
			 new float[] {0,1,0,0,0,0,0,0,0,0},// "1"
			 new float[] {0,0,1,0,0,0,0,0,0,0},// "2"
			 new float[] {0,0,0,1,0,0,0,0,0,0},// "3"
			 new float[] {0,0,0,0,1,0,0,0,0,0},// "4"
			 new float[] {0,0,0,0,0,1,0,0,0,0},// "5"
			 new float[] {0,0,0,0,0,0,1,0,0,0},// "6"
			 new float[] {0,0,0,0,0,0,0,1,0,0},// "7"
			 new float[] {0,0,0,0,0,0,0,0,1,0},// "8"
			 new float[] {0,0,0,0,0,0,0,0,0,1}// "9"
		};
		
		BackPropogation backpropagation = new BackPropogation(64, 15, 10);
	
		for (int iterations = 0; iterations < Constants.ITERATIONS; iterations++) {
	
			for (int x = 0; x < trainingResults.length; x++) {
				backpropagation.train(trainingData[x], trainingResults[x], Constants.LEARNING_RATE, Constants.MOMENTUM);
			}
	
			if ((iterations + 1) % 100 == 0) {
				System.out.println();
				for (int x = 0; x < trainingResults.length; x++) {
					float[] data = trainingData[x];
					float[] calculatedOutput = backpropagation.feedForward(data);
					System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
				}
			}
		}		
	
		System.out.println("---------------------------");
                //0
		float[] calculatedOutput = backpropagation.feedForward(new float[] {1,0,1,1,1,1,0,1,0,1,1,0,0,1,1,0,1,1,0,0,0,0,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,0,1,1,0,0,1,1,0,1,0,1,1,1,1,0,1});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 0 and output is - " +nw.calculateoutput(calculatedOutput));
                
	
		System.out.println("---------------------------");
		//0
		calculatedOutput = backpropagation.feedForward(new float[] {0,0,1,1,1,1,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,1,1,1,1,0,0});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
	        System.out.println("Input is 0 and output is - " +nw.calculateoutput(calculatedOutput));
                
                
		System.out.println("---------------------------");
		//0
		calculatedOutput = backpropagation.feedForward(new float[] {1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 0 and output is - " +nw.calculateoutput(calculatedOutput));
                
                
                System.out.println("---------------------------");
                //3
                calculatedOutput = backpropagation.feedForward(new float[] {0,1,1,0,0,0,1,1,0,1,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,1,0,1,1,1,1,0,0,1,0,1,0,0,1,1,0,1,0,1,0,0,0,1,1,1,1,1,0});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 3 and output is - " +nw.calculateoutput(calculatedOutput));
                
                
                System.out.println("---------------------------");
                //3
                calculatedOutput = backpropagation.feedForward(new float[] {0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,1,0,0,0,0,1,1,1,1,0,0,0,0,0,1,1,1,0,0,1,1,0,1,1,1,1,0,0,1,0,1,0,0,1,1,0,1,1,1,0,0,1,1,1,1,1,1,0});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 3 and output is - " +nw.calculateoutput(calculatedOutput)); 
                
                
                
                System.out.println("---------------------------");
                //3(1)
                calculatedOutput = backpropagation.feedForward(new float[] {1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 3 and output is - " +nw.calculateoutput(calculatedOutput)); 
                
                
                
                System.out.println("---------------------------");
                //3(2)
                calculatedOutput = backpropagation.feedForward(new float[] {1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,0,0,1,1,0,1,1,0});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 3 and output is - " +nw.calculateoutput(calculatedOutput));
                
                
                System.out.println("---------------------------");
                //7
                calculatedOutput = backpropagation.feedForward(new float[] {1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,1,0,1,1,1,0,0,1,1,1,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,1,1,0,0,0,1,1,1,0,1,0,0,0});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 7 and output is - " +nw.calculateoutput(calculatedOutput));
                
                
                
                System.out.println("---------------------------");
                //7(1)
                calculatedOutput = backpropagation.feedForward(new float[] {1,0,0,0,0,0,1,1,1,0,0,1,0,0,1,1,1,0,0,1,0,1,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,0,1,0,0,0,0});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 7 and output is - " +nw.calculateoutput(calculatedOutput));
                
                
                
                System.out.println("---------------------------");
                //7(2)
                calculatedOutput = backpropagation.feedForward(new float[] {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,1,0,1,1,1,0,0,0,1,1,1,0,0,0,0,0,1,1,0,0,0,0,0,0});
//		System.out.println(calculatedOutput[0]+" "+calculatedOutput[1]+" "+calculatedOutput[2]+" "+calculatedOutput[3]+" "+calculatedOutput[4]+" "+calculatedOutput[5]+" "+calculatedOutput[6]+" "+calculatedOutput[7]+" "+calculatedOutput[8]+" "+calculatedOutput[9]);
                System.out.println("Input is 7 and output is - " +nw.calculateoutput(calculatedOutput));
    
    }
}