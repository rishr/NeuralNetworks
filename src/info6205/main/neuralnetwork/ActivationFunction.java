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
public class ActivationFunction {
    
    public static float sigmoid(float x) {
		return (float) (1 / (1 + Math.exp(-x)));
	}

	public static float dSigmoid(float x) {
		return x*(1-x); // because the output is the sigmoid(x) !!! we dont have to apply it twice
	}
    
}
