/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info6205.main.neuralnetwork;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author PiyushPrashant
 */
public class LoadDataSet {
    public float[][] readImage(File imgFile) throws IOException  {
       BufferedImage image = ImageIO.read(imgFile);
        float[][] pixels = new float[image.getWidth()][];
//            System.out.print("new float[] {");
            for (int x = 0; x < image.getWidth(); x++) {
                 pixels[x] = new float[image.getHeight()];
                  for (int y = 0; y < image.getHeight(); y++) {
                                          pixels[x][y] = (byte) (image.getRGB(x, y) == 0xFFFFFFFF ? 0 : 1);
//                                         System.out.print(pixels[x][y]+",");
                                  }

                }
//            System.out.print("\n");
                return pixels;
            }
	//D:\\DataStructure and Algos\\udemy\\neural-networks\\OCRData
     public float[][] loadData() throws IOException {
         final File dir = new File("D:\\DataStructure and Algos\\FINAL PROJECT\\NeuralNetworks\\TrainingDataSet");
         int len = dir.listFiles().length;
         float[][] trainingData = new float[len][64] ;
         int i =0;
         for(final File imgFile : dir.listFiles()) {
            float[][] pixels = readImage(imgFile);
               while(i < len ){
                    float[] temp = new float[64];
                    int k=0;
                    while(k < temp.length)  {   
                        for(int x=0; x< pixels.length; x++){   
                                    for(int y=0; y < pixels[x].length; y++){
                                        temp[k] = pixels[x][y];
                                        k++;
                                    }
                          }
                    }
                    trainingData[i] = temp;
                    i++;
                    break;
                }
            
        }
         return trainingData;
     }
    
    
    }

