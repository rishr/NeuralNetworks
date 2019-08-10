# NeuralNetworks
Input layer: We keep feeding our network with data through the input layer.

Hidden layer: It is needed in order to make predictions when we have a non-linear problems.

Output layer: We have the results here.The predicted digit.

Percepton: It is a neuron in the neural network.We have to sum up the weighted inputs.For perceptrons we use the step function with a given threshold. It is not working fine for neural network training because the output can be 0 or 1 for perceptrons .A small change in the weights or bias of any single perceptron in the network can sometimes cause the output of that perceptron to completely flip ( 0  1 )  That flip may then cause the behaviour of the rest of the  network to completely change in some very complicated way

Sigmoid neuron: very similar to perceptrons. But small changes in the edge weights   causes small change in the output.The inputs / outputs can take any values between 0 and 1 !!!



 

“Sigmoid function”


Layer
One layer is consists of many neurons and can be represented as the following picture:

 

Figure 2. The construction of a neural network layer.

 



Neural Network Explanation along with code snippets:
1.	Activation Function (Sigmoid Function):

2.	Calculating the output:
a.	Calculate the sum:
k = amount of previous neurons

b.	The desired output is the Sigmoid Value of the sum:

Calculating the error to update the weights:


Calculation delta weight ( i.e. change in weight) to update the weights to train the network:


Where η = learning rate which should be greater than 0.


Back Propagation Code Snippets:





WORKING:


Important Classes:
1.	Backpropogation.java
This class contains the initial weights, bias and learning rate which is the core requirement of Neural Network.


2.	Layer.java

This class contains an array which will be used to hold the hidden layers. There can be any number of hidden layers defined in the Neural Network through this array.


3.	NeuralNetwork.java

This is our multi-layered Perceptron aka Neural Network which contains all the neural network functionalities such as Adjusting Weights, Calculating Back Propagation, Training the Neural Network, Calculating the final output.


4.	Utils.java

This is a helper class which contains functions to get random values that are used to create random arrays for weights and calculating highest index value of the output array.

