/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
class ArabicHandWrittenLetters {
 public int imageClass;
 public double[][] imgPixelsArray = new double[32][32];
 public void setImageClass(String imageClass) {
 if (imageClass.startsWith("1")) {
 this.imageClass = 1;
 } else if (imageClass.startsWith("2")) {
 this.imageClass = 2;
 } else if (imageClass.startsWith("3")) {
 this.imageClass = 3;
 } else if (imageClass.startsWith("4")) {
 this.imageClass = 4;
 } else if (imageClass.startsWith("5")) {
 this.imageClass = 5;
 } else if (imageClass.startsWith("6")) {
 this.imageClass = 6;
 } else if (imageClass.startsWith("7")) {
 this.imageClass = 7;
 } else if (imageClass.startsWith("8")) {
 this.imageClass = 8;
 } else if (imageClass.startsWith("9")) {
 this.imageClass = 9;
 } else if (imageClass.startsWith("10")) {
 this.imageClass = 10;
 } else if (imageClass.startsWith("11")) {
 this.imageClass = 11;
 } else if (imageClass.startsWith("12")) {
 this.imageClass = 12;
 } else if (imageClass.startsWith("13")) {
 this.imageClass = 13;
 } else if (imageClass.startsWith("14")) {
 this.imageClass = 14;
 } else if (imageClass.startsWith("15")) {
 this.imageClass = 15;
 } else if (imageClass.startsWith("16")) {
 this.imageClass = 16;
 } else if (imageClass.startsWith("17")) {
 this.imageClass = 17;
 } else if (imageClass.startsWith("18")) {
 this.imageClass = 18;
 } else if (imageClass.startsWith("19")) {
 this.imageClass = 19;
 } else if (imageClass.startsWith("20")) {
 this.imageClass = 20;
 } else if (imageClass.startsWith("21")) {
 this.imageClass = 21;
 } else if (imageClass.startsWith("22")) {
 this.imageClass = 22;
 } else if (imageClass.startsWith("23")) {
 this.imageClass = 23;
 } else if (imageClass.startsWith("24")) {
 this.imageClass = 24;
 } else if (imageClass.startsWith("25")) {
 this.imageClass = 25;
 } else if (imageClass.startsWith("26")) {
 this.imageClass = 26;
 } else if (imageClass.startsWith("27")) {
 this.imageClass = 27;
 }else if (imageClass.startsWith("28")) {
 this.imageClass = 28;
 }
 }
 public double[][] getImgPixelsArray() {
 return imgPixelsArray;
 }
 public double getArrayElementAtIndex(int index) {
 if (index >= 0) {
 int row = index / 32;
 int col = index % 32;
 return imgPixelsArray[row][col];
 } else {
 return 1;
 }
 }
 public void setPixelIntensity(int row, int col, double intensity)
{
 imgPixelsArray[row][col] = intensity;
 }
 @Override
 protected ArabicHandWrittenLetters clone() throws
CloneNotSupportedException {
 ArabicHandWrittenLetters cloneObj = new ArabicHandWrittenLetters();
 cloneObj.imageClass = this.imageClass;
 for (int row = 0; row < 32; row++) {
 for (int col = 0; col < 32; col++) {
 cloneObj.imgPixelsArray[row][col] =
this.imgPixelsArray[row][col];
 }
 }
 return cloneObj;
 }
 public void DisplayGrid() {
 JFrame imageFrame = new JFrame("Handwritten Image [class: " + imageClass + " ]");
 imageFrame.setSize(320, 320);
 imageFrame.setLayout(new GridLayout(32, 32));
 for (int row = 0; row < 32; row++) {
 for (int col = 0; col < 32; col++) {
 JButton pixel = new JButton();
 if (imgPixelsArray[row][col] <= 0.5) {
 pixel.setBackground(Color.black);
 } else if (imgPixelsArray[row][col] > 0.5) {
 pixel.setBackground(Color.white);
 } else {
 pixel.setBackground(Color.gray);
 }
 imageFrame.add(pixel);
 }
 }
 imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 imageFrame.setVisible(true);
 }
}
public class LogisticRegressionAlgorithm {
 static ArrayList<ArabicHandWrittenLetters> ImagesDataSet = new
ArrayList<>();
 static ArabicHandWrittenLetters[] trainingDataSetForClass1;
 static ArabicHandWrittenLetters[] trainingDataSetForClass2;
 static ArabicHandWrittenLetters[] trainingDataSetForClass3;
 static ArabicHandWrittenLetters[] trainingDataSetForClass4;
 static ArabicHandWrittenLetters[] trainingDataSetForClass5;
 static ArabicHandWrittenLetters[] trainingDataSetForClass6;
 static ArabicHandWrittenLetters[] trainingDataSetForClass7;
 static ArabicHandWrittenLetters[] trainingDataSetForClass8;
 static ArabicHandWrittenLetters[] trainingDataSetForClass9;
 static ArabicHandWrittenLetters[] trainingDataSetForClass10;
 static ArabicHandWrittenLetters[] trainingDataSetForClass11;
 static ArabicHandWrittenLetters[] trainingDataSetForClass12;
 static ArabicHandWrittenLetters[] trainingDataSetForClass13;
 static ArabicHandWrittenLetters[] trainingDataSetForClass14;
 static ArabicHandWrittenLetters[] trainingDataSetForClass15;
 static ArabicHandWrittenLetters[] trainingDataSetForClass16;
 static ArabicHandWrittenLetters[] trainingDataSetForClass17;
 static ArabicHandWrittenLetters[] trainingDataSetForClass18;
 static ArabicHandWrittenLetters[] trainingDataSetForClass19;
 static ArabicHandWrittenLetters[] trainingDataSetForClass20;
 static ArabicHandWrittenLetters[] trainingDataSetForClass21;
 static ArabicHandWrittenLetters[] trainingDataSetForClass22;
 static ArabicHandWrittenLetters[] trainingDataSetForClass23;
 static ArabicHandWrittenLetters[] trainingDataSetForClass24;
 static ArabicHandWrittenLetters[] trainingDataSetForClass25;
 static ArabicHandWrittenLetters[] trainingDataSetForClass26;
 static ArabicHandWrittenLetters[] trainingDataSetForClass27;
 static ArabicHandWrittenLetters[] trainingDataSetForClass28;
 
 static double[] recentMinimalTheta;
 static double[] minimalThetaArrayForClass1 = new double[1025];
 static double[] minimalThetaArrayForClass2 = new double[1025];
 static double[] minimalThetaArrayForClass3 = new double[1025];
 static double[] minimalThetaArrayForClass4 = new double[1025];
 static double[] minimalThetaArrayForClass5 = new double[1025];
 static double[] minimalThetaArrayForClass6 = new double[1025];
 static double[] minimalThetaArrayForClass7 = new double[1025];
 static double[] minimalThetaArrayForClass8 = new double[1025];
 static double[] minimalThetaArrayForClass9 = new double[1025];
 static double[] minimalThetaArrayForClass10 = new double[1025];
 static double[] minimalThetaArrayForClass11 = new double[1025];
 static double[] minimalThetaArrayForClass12 = new double[1025];
 static double[] minimalThetaArrayForClass13 = new double[1025];
 static double[] minimalThetaArrayForClass14 = new double[1025];
 static double[] minimalThetaArrayForClass15 = new double[1025];
 static double[] minimalThetaArrayForClass16 = new double[1025];
 static double[] minimalThetaArrayForClass17 = new double[1025];
 static double[] minimalThetaArrayForClass18 = new double[1025];
 static double[] minimalThetaArrayForClass19 = new double[1025];
 static double[] minimalThetaArrayForClass20 = new double[1025];
 static double[] minimalThetaArrayForClass21 = new double[1025];
 static double[] minimalThetaArrayForClass22 = new double[1025];
 static double[] minimalThetaArrayForClass23 = new double[1025];
 static double[] minimalThetaArrayForClass24 = new double[1025];
 static double[] minimalThetaArrayForClass25 = new double[1025];
 static double[] minimalThetaArrayForClass26 = new double[1025];
 static double[] minimalThetaArrayForClass27 = new double[1025];
 static double[] minimalThetaArrayForClass28 = new double[1025];
 

 static ArrayList<Double> costFunctionValuesForClass1 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass2 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass3 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass4 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass5 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass6 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass7 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass8 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass9 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass10 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass11 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass12 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass13 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass14 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass15 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass16 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass17 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass18 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass19 = new
ArrayList<>(); 
 static ArrayList<Double> costFunctionValuesForClass20 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass21 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass22 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass23 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass24 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass25 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass26 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass27 = new
ArrayList<>();
 static ArrayList<Double> costFunctionValuesForClass28 = new
ArrayList<>();

 public static double hypothesis(double[] thetaArray, ArabicHandWrittenLetters x) {
 final double E = 2.718;
 int k = 0;
 double thetaTansposX = thetaArray[k++];
 for (int i = 0; i < x.imgPixelsArray.length; i++) {
 for (int j = 0; j < x.imgPixelsArray.length; j++) {
 thetaTansposX += x.imgPixelsArray[i][j] * thetaArray[k++];
 }
 }
 thetaTansposX = (-1 * thetaTansposX);
 double hypothesis = Math.pow(E, thetaTansposX);
 hypothesis = 1 + hypothesis;
 hypothesis = 1 / hypothesis;
 return hypothesis;
 }
 public static double costFunction(double[] thetaArray,
ArabicHandWrittenLetters[] trainingDataSetForGivenClass) {
 double cost = 0;
 double hypothesis;
 for (int i = 0; i < trainingDataSetForGivenClass.length; i++)
{
 hypothesis = hypothesis(thetaArray,
trainingDataSetForGivenClass[i]);
 if (trainingDataSetForGivenClass[i].imageClass == 1) {
 cost += Math.log10(hypothesis);
 } else {
 hypothesis = 1 - hypothesis;
 hypothesis = Math.log10(hypothesis);
 cost += hypothesis;
 }
 }
 cost = (-1 * cost);
 cost = (cost / trainingDataSetForGivenClass.length);
 return cost;
 }
 /**
 * Takes oldThetaArray and return us newThetaArray.
 *
 * @param oldThetaArray
 * @param learningRateAlpha
 * @param trainingDataSetForGivenClass
 * @return newThetaArray
 */
 public static double[] gradientDescent(double[] oldThetaArray,
double learningRateAlpha, ArabicHandWrittenLetters[]
trainingDataSetForGivenClass) {
 double[] newThetaArray = new double[oldThetaArray.length];
 double hypothesis;
 double summation = 0;
 double[] summationInternal = new
double[trainingDataSetForGivenClass.length];
 for (int i = 0; i < trainingDataSetForGivenClass.length; i++)
{
 hypothesis = hypothesis(oldThetaArray,
trainingDataSetForGivenClass[i]); // h0( x(i) )
 hypothesis = hypothesis -
trainingDataSetForGivenClass[i].imageClass; // ( h0( x(i) ) - (y(i) ) )
 summationInternal[i] = hypothesis; // = ( h0( x(i)) - ( y(i) ) )
 }
 for (int j = 0; j < oldThetaArray.length; j++) {
 for (int i = 0; i < trainingDataSetForGivenClass.length;
i++) {
 summation += summationInternal[i] *
trainingDataSetForGivenClass[i].getArrayElementAtIndex(j - 1);
// E( i to m) += ( ( h0( x(i) ) - ( y(i) ) ) ) * x( (i) j ) )
 }
 summation = learningRateAlpha * summation;
 newThetaArray[j] = oldThetaArray[j] - summation;
 }
 return newThetaArray;
 }
 public static void getMinThetaValues(double[]
minimalThetaArrayForClass, ArabicHandWrittenLetters[]
trainingDataSetForClass, ArrayList<Double>
costFunctionValuesForClass) {
 recentMinimalTheta = new double[1025];
 double learningRate;
 Scanner input = new Scanner(System.in);
 System.out.println("Please enter learning rate");
 learningRate = input.nextDouble();
 int j = 0;
 double oldCost = costFunction(minimalThetaArrayForClass,
trainingDataSetForClass);
 double newCost = 0;
 while (true) {
 for (int i = 0; i < 100; i++) {
 newCost = costFunction(minimalThetaArrayForClass,
trainingDataSetForClass);
 minimalThetaArrayForClass =
gradientDescent(minimalThetaArrayForClass, learningRate,
trainingDataSetForClass);
 if (newCost > oldCost) {
 System.out.println("Learning rate is large.");
 System.out.println("old Cost " + oldCost);
 System.out.println("New Cost " + newCost);
 System.out.println("Difference between them is: " + (newCost - oldCost));
 minimalThetaArrayForClass = new double[1025];
 costFunctionValuesForClass = new ArrayList<>();

getMinThetaValues(minimalThetaArrayForClass,
trainingDataSetForClass, costFunctionValuesForClass);
 return;
 } else if (((oldCost - newCost) < 0.001) && ((oldCost
- newCost) > 0)) {
 System.out.println("Differernce of two consecutive costs functions is less than 0.001");
 System.out.println(" Minimum Theta values ");
 recentMinimalTheta = minimalThetaArrayForClass;
 costFunctionValuesForClass.add(oldCost);
 return;
 }
 oldCost = newCost;
 costFunctionValuesForClass.add(oldCost);
 }
}
 }
 public static void DataFileReader() {
 Scanner inputReader;
 try {
 inputReader = new Scanner(new FileInputStream("E:\\University\\DM\\csvTestImages3360x1024.csv"));
 inputReader.useDelimiter(",|\n");
 int j = 1;
 while (inputReader.hasNext()) {
 ArabicHandWrittenLetters image = new ArabicHandWrittenLetters();
 for (int row = 0; row < 32; row++) {
 for (int col = 0; col < 32; col++) {
 image.setPixelIntensity(row, col,
inputReader.nextDouble());
 }
 }
 image.setImageClass(inputReader.next());
 ImagesDataSet.add(image);
 }
 } catch (Exception e) {
 System.out.println("Exception Caught: " + e.getMessage());
 }
 }
 public static void TrainingSetsForAllClasses() {
 
 trainingDataSetForClass1 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass2 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass3 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass4 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass5 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass6 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass7 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass8 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass9 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
  trainingDataSetForClass10 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass11 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass12 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass13 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass14 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass15 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass16 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass17 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass18 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass19 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass20 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass21 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass22 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass23 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass24 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass25 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass26 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass27 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 trainingDataSetForClass28 = new
ArabicHandWrittenLetters[ImagesDataSet.size()];
 
 
 for (int imgClass = 1; imgClass <= 28; imgClass++) {
 for (int i = 0; i < ImagesDataSet.size(); i++) {
 try {
 switch (imgClass) {
 
 case 1:
 trainingDataSetForClass1[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass1[i].imageClass
== 1) {
 trainingDataSetForClass1[i].imageClass
= 1;
 } else {
 trainingDataSetForClass1[i].imageClass
= 0;
 }
break;
 case 2:
 trainingDataSetForClass2[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass2[i].imageClass
== 2) {
 trainingDataSetForClass2[i].imageClass
= 1;
 } else {
 trainingDataSetForClass2[i].imageClass
= 0;
 }
break;
 case 3:
 trainingDataSetForClass3[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass3[i].imageClass
== 3) {
 trainingDataSetForClass3[i].imageClass
= 1;
 } else {
 trainingDataSetForClass3[i].imageClass
= 0;
 }
 break;
 case 4:
 trainingDataSetForClass4[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass4[i].imageClass
== 4) {
 trainingDataSetForClass4[i].imageClass
= 1;
 } else {
 trainingDataSetForClass4[i].imageClass
= 0;
 }
break;
 case 5:
 trainingDataSetForClass5[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass5[i].imageClass
== 5) {
 trainingDataSetForClass5[i].imageClass
= 1;
 } else {
 trainingDataSetForClass5[i].imageClass
= 0;
 }
break;
 case 6:
 trainingDataSetForClass6[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass6[i].imageClass
== 6) {
 trainingDataSetForClass6[i].imageClass
= 1;
 } else {
 trainingDataSetForClass6[i].imageClass
= 0;
 }
 break;
 case 7:
 trainingDataSetForClass7[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass7[i].imageClass
== 7) {
 trainingDataSetForClass7[i].imageClass
= 1;
 } else {
 trainingDataSetForClass7[i].imageClass
= 0;
 }
break;
 case 8:
 trainingDataSetForClass8[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass8[i].imageClass
== 8) {
 trainingDataSetForClass8[i].imageClass
= 1;
 } else {
 trainingDataSetForClass8[i].imageClass
= 0;
 }
break;
 case 9:
 trainingDataSetForClass9[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass9[i].imageClass
== 9) {
 trainingDataSetForClass9[i].imageClass
= 1;
 } else {
 trainingDataSetForClass9[i].imageClass
= 0;
 }
break;
case 10:
 trainingDataSetForClass10[i] =ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass10[i].imageClass
== 10) {
 trainingDataSetForClass10[i].imageClass
= 1;
 } else {
 trainingDataSetForClass10[i].imageClass
= 0;
 }
break;
 case 11:
 trainingDataSetForClass11[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass11[i].imageClass
== 11) {
 trainingDataSetForClass11[i].imageClass
= 1;
 } else {
 trainingDataSetForClass11[i].imageClass
= 0;
 }
break;
 case 12:
 trainingDataSetForClass12[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass12[i].imageClass
== 12) {
 trainingDataSetForClass12[i].imageClass
= 1;
 } else {
 trainingDataSetForClass12[i].imageClass
= 0;
 }
break;
 case 13:
 trainingDataSetForClass13[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass13[i].imageClass
== 13) {
 trainingDataSetForClass13[i].imageClass
= 1;
 } else {
 trainingDataSetForClass13[i].imageClass
= 0;
 }
 break;
 case 14:
 trainingDataSetForClass14[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass14[i].imageClass
== 14) {
 trainingDataSetForClass14[i].imageClass
= 1;
 } else {
 trainingDataSetForClass14[i].imageClass
= 0;
 }
break;
 case 15:
 trainingDataSetForClass15[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass15[i].imageClass
== 15) {
 trainingDataSetForClass15[i].imageClass
= 1;
 } else {
 trainingDataSetForClass15[i].imageClass
= 0;
 }
break;
 case 16:
 trainingDataSetForClass16[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass16[i].imageClass
== 16) {
 trainingDataSetForClass16[i].imageClass
= 1;
 } else {
 trainingDataSetForClass16[i].imageClass
= 0;
 }
 break;
 case 17:
 trainingDataSetForClass17[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass17[i].imageClass
== 17) {
 trainingDataSetForClass17[i].imageClass
= 1;
 } else {
 trainingDataSetForClass17[i].imageClass
= 0;
 }
break;
 case 18:
 trainingDataSetForClass18[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass18[i].imageClass
== 18) {
 trainingDataSetForClass18[i].imageClass
= 1;
 } else {
 trainingDataSetForClass18[i].imageClass
= 0;
 }
break;
 case 19:
 trainingDataSetForClass19[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass19[i].imageClass
== 19) {
 trainingDataSetForClass19[i].imageClass
= 1;
 } else {
 trainingDataSetForClass19[i].imageClass
= 0;
 }
break;
case 20:
 trainingDataSetForClass20[i] =ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass20[i].imageClass
== 20) {
 trainingDataSetForClass20[i].imageClass
= 1;
 } else {
 trainingDataSetForClass20[i].imageClass
= 0;
 }
break;
 case 21:
 trainingDataSetForClass21[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass21[i].imageClass
== 21) {
 trainingDataSetForClass21[i].imageClass
= 1;
 } else {
 trainingDataSetForClass21[i].imageClass
= 0;
 }
break;
 case 22:
 trainingDataSetForClass22[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass22[i].imageClass
== 22) {
 trainingDataSetForClass22[i].imageClass
= 1;
 } else {
 trainingDataSetForClass22[i].imageClass
= 0;
 }
break;
 case 23:
 trainingDataSetForClass23[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass23[i].imageClass
== 23) {
 trainingDataSetForClass23[i].imageClass
= 1;
 } else {
 trainingDataSetForClass23[i].imageClass
= 0;
 }
 break;
 case 24:
 trainingDataSetForClass24[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass24[i].imageClass
== 24) {
 trainingDataSetForClass24[i].imageClass
= 1;
 } else {
 trainingDataSetForClass24[i].imageClass
= 0;
 }
break;
 case 25:
 trainingDataSetForClass25[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass25[i].imageClass
== 25) {
 trainingDataSetForClass25[i].imageClass
= 1;
 } else {
 trainingDataSetForClass25[i].imageClass
= 0;
 }
break;
 case 26:
 trainingDataSetForClass26[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass26[i].imageClass
== 26) {
 trainingDataSetForClass26[i].imageClass
= 1;
 } else {
 trainingDataSetForClass26[i].imageClass
= 0;
 }
 break;
 case 27:
 trainingDataSetForClass27[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass27[i].imageClass
== 27) {
 trainingDataSetForClass27[i].imageClass
= 1;
 } else {
 trainingDataSetForClass27[i].imageClass
= 0;
 }
break;
 case 28:
 trainingDataSetForClass28[i] =
ImagesDataSet.get(i).clone();
 if (trainingDataSetForClass28[i].imageClass
== 28) {
 trainingDataSetForClass28[i].imageClass
= 1;
 } else {
 trainingDataSetForClass28[i].imageClass
= 0;
 }
break;
}
 } catch (Exception e) {
 System.out.println("Error while cloning: " +
e.getMessage());
 }
 }
 }
 }
 public static void StoringArray(double[]
minimalThetaArrayForGivenClass, String fileName) {
 PrintWriter outputStream = null;
 try {
 outputStream = new PrintWriter(new
FileOutputStream(fileName));
 } catch (FileNotFoundException e) {
 System.out.println(e.getMessage());
 }
 for (int i = 0; i < minimalThetaArrayForGivenClass.length;
i++) {
 outputStream.println(minimalThetaArrayForGivenClass[i]);
 }
 outputStream.close();
 }
 public static void StoringArrayList(ArrayList<Double>
costFunctionValuesForClass, String fileName) {
 PrintWriter outputStream = null;
 try {
 outputStream = new PrintWriter(new
FileOutputStream(fileName));
 } catch (FileNotFoundException e) {
 System.out.println(e.getMessage());
 }
 for (int i = 0; i < costFunctionValuesForClass.size();
i++) {

outputStream.println(costFunctionValuesForClass.get(i));
 }
 outputStream.close();
 }
 public static double CalculatingAccuracy(double[]
LRCthetas, ArabicHandWrittenLetters[] trainingDataSetForClass, int
imageClass) {
 ArabicHandWrittenLetters currentImg;
 double probability;
 int examplesClassifiedCorrectly = 0;
 double accuracy;
 for (int i = 0; i < trainingDataSetForClass.length; i++)
{
 currentImg = trainingDataSetForClass[i];
 probability = hypothesis(LRCthetas, currentImg);
 probability = (Math.round(probability * 100.0) / 100.0);
 if (probability >= 0.05) {
 if (trainingDataSetForClass[i].imageClass == 1) {
 examplesClassifiedCorrectly++;
 }
 } else {
 if (trainingDataSetForClass[i].imageClass == 0) {
 examplesClassifiedCorrectly++;
 }
 }
 //System.out.println(i + "th image Probability: " + probability);
 }
 System.out.println("\nExamples Classified Correctly For class_" + imageClass + ": " + examplesClassifiedCorrectly);
 System.out.println("Total number of examples: " +
trainingDataSetForClass.length);
 accuracy = (examplesClassifiedCorrectly * 100) /
trainingDataSetForClass.length;
 return accuracy;
 }
 public static double
Accuracy_For_Multiclass_Classifier(ArrayList<ArabicHandWrittenLetters>
originalDataSetArray) {
 ArabicHandWrittenLetters currentImg;
 int examplesClassifiedCorrectly = 0;
 double accuracy;
 double[] probabilityForAllClassifier = new double[28];
 for (int i = 1; i < originalDataSetArray.size(); i++) {
 currentImg = originalDataSetArray.get(i);
 for (int j = 1; j < probabilityForAllClassifier.length;
j++) {
 switch (j) {
 case 1:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass1, currentImg);
 break;
 case 2:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass2, currentImg);
 break;
 case 3:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass3, currentImg);
 break;
 case 4:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass4, currentImg);
 break;
 case 5:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass5, currentImg);
 break;
 case 6:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass6, currentImg);
 break;
 case 7:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass7, currentImg);
 break;
 case 8:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass8, currentImg);
 break;
 case 9:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass9, currentImg);
 break;
 case 10:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass10, currentImg);
 break;
 case 11:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass11, currentImg);
 break;
 case 12:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass12, currentImg);
 break;
 case 13:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass13, currentImg);
 break;
 case 14:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass14, currentImg);
 break;
 case 15:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass15, currentImg);
 break;
 case 16:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass16, currentImg);
 break;
 case 17:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass17, currentImg);
 break;
 case 18:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass18, currentImg);
 break;
 case 19:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass19, currentImg);
 break;
 case 20:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass20, currentImg);
 break;
 case 21:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass21, currentImg);
 break;
 case 22:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass22, currentImg);
 break;
 case 23:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass23, currentImg);
 break;
 case 24:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass24, currentImg);
 break;
 case 25:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass25, currentImg);
 break;
 case 26:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass26, currentImg);
 break;
 case 27:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass27, currentImg);
 break;
 case 28:
 probabilityForAllClassifier[j] =
hypothesis(minimalThetaArrayForClass28, currentImg);
 break;
 }
 }
 double maximumProbability = -1;
 int maxProbabilityForClassNo = -1;
 for (int j = 0; j < probabilityForAllClassifier.length;
j++) {
 if (probabilityForAllClassifier[j] >
maximumProbability) {
 maximumProbability =
probabilityForAllClassifier[j];
 maxProbabilityForClassNo = j;
 }
 }
 if (currentImg.imageClass == maxProbabilityForClassNo) {
 examplesClassifiedCorrectly++;
 }
 }
 System.out.println("\nExamples Classified Correctly For Multiclass Classifier: " + examplesClassifiedCorrectly);
 System.out.println("Total number of examples: " + originalDataSetArray.size());
 accuracy = (examplesClassifiedCorrectly * 100) /
originalDataSetArray.size();
 return accuracy;
 }
 public static void main(String[] args) {
 DataFileReader();
 TrainingSetsForAllClasses();
System.out.println("allHandWrittenImaged.size(): " + ImagesDataSet.size());
 //originalImagesDataSet.get(0).displayImage();
//originalImagesDataSet.get(240).displayImage(); 
ImagesDataSet.get(360).DisplayGrid(); 



 System.out.println("\nFor class 1...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass1,
trainingDataSetForClass1, costFunctionValuesForClass1);
 minimalThetaArrayForClass1 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass1, "Theta Values for Hypothesis of DataSet of class 1.txt");
 StoringArrayList(costFunctionValuesForClass1, "Cost Function Values for each Iteration of DataSet of class 1.txt");
 System.out.println("\nFor class 2...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass2,
trainingDataSetForClass2, costFunctionValuesForClass2);
 minimalThetaArrayForClass2 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass2, "Theta Values for Hypothesis of DataSet of class 2.txt");
 StoringArrayList(costFunctionValuesForClass2, "Cost Function Values for each Iteration of DataSet of class 2.txt");
 System.out.println("\nFor class 3...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass3,
trainingDataSetForClass3, costFunctionValuesForClass3);
 minimalThetaArrayForClass3 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass3, "Theta Values for Hypothesis of DataSet of class 3.txt");
 StoringArrayList(costFunctionValuesForClass3, "Cost Function Values for each Iteration of DataSet of class 3.txt");
 System.out.println("\nFor class 4...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass4,
trainingDataSetForClass4, costFunctionValuesForClass4);
 minimalThetaArrayForClass4 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass4, "Theta Values for Hypothesis of DataSet of class 4.txt");
 StoringArrayList(costFunctionValuesForClass4, "Cost Function Values for each Iteration of DataSet of class 4.txt");
 System.out.println("\nFor class 5...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass5,
trainingDataSetForClass5, costFunctionValuesForClass5);
 minimalThetaArrayForClass5 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass5, "Theta Values for Hypothesis of DataSet of class 5.txt");
 StoringArrayList(costFunctionValuesForClass5, "Cost Function Values for each Iteration of DataSet of class 5.txt");
 System.out.println("\nFor class 6...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass6,
trainingDataSetForClass6, costFunctionValuesForClass6);
 minimalThetaArrayForClass6 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass6, "Theta Values for Hypothesis of DataSet of class 6.txt");
 StoringArrayList(costFunctionValuesForClass6, "Cost Function Values for each Iteration of DataSet of class 6.txt");
 System.out.println("\nFor class 7...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass7,
trainingDataSetForClass7, costFunctionValuesForClass7);
 minimalThetaArrayForClass7 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass7, "Theta Values for Hypothesis of DataSet of class 7.txt");
 StoringArrayList(costFunctionValuesForClass7, "Cost Function Values for each Iteration of DataSet of class 7.txt");
 System.out.println("\nFor class 8...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass8,
trainingDataSetForClass8, costFunctionValuesForClass8);
 minimalThetaArrayForClass8 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass8, "Theta Values for Hypothesis of DataSet of class 8.txt");
 StoringArrayList(costFunctionValuesForClass8, "Cost Function Values for each Iteration of DataSet of class 8.txt");
 System.out.println("\nFor class 9...\n__________________");
 getMinThetaValues(minimalThetaArrayForClass9,
trainingDataSetForClass9, costFunctionValuesForClass9);
 minimalThetaArrayForClass9 = recentMinimalTheta;
 StoringArray(minimalThetaArrayForClass9, "Theta Values for Hypothesis of DataSet of class 9.txt");
 StoringArrayList(costFunctionValuesForClass9, "Cost Function Values for each Iteration of DataSet of class 9.txt");

 double accurayForClass1 =
CalculatingAccuracy(minimalThetaArrayForClass1,
trainingDataSetForClass1, 1);
 System.out.println("Accuray For Class_1: " + accurayForClass1
+ "\n");
 double accurayForClass2 =
CalculatingAccuracy(minimalThetaArrayForClass2,
trainingDataSetForClass2, 2);
 System.out.println("Accuray For Class_2: " + accurayForClass2
+ "\n");
 double accurayForClass3 =
CalculatingAccuracy(minimalThetaArrayForClass3,
trainingDataSetForClass3, 3);
 System.out.println("Accuray For Class_3: " + accurayForClass3
+ "\n");
 double accurayForClass4 =
CalculatingAccuracy(minimalThetaArrayForClass4,
trainingDataSetForClass4, 4);
 System.out.println("Accuray For Class_4: " + accurayForClass4
+ "\n");
 double accurayForClass5 =
CalculatingAccuracy(minimalThetaArrayForClass5,
trainingDataSetForClass5, 5);
 System.out.println("Accuray For Class_5: " + accurayForClass5
+ "\n");
 double accurayForClass6 =
CalculatingAccuracy(minimalThetaArrayForClass6,
trainingDataSetForClass6, 6);
 System.out.println("Accuray For Class_6: " + accurayForClass6
+ "\n");
 double accurayForClass7 =
CalculatingAccuracy(minimalThetaArrayForClass7,
trainingDataSetForClass7, 7);
 System.out.println("Accuray For Class_7: " + accurayForClass7
+ "\n");
 double accurayForClass8 =
CalculatingAccuracy(minimalThetaArrayForClass8,
trainingDataSetForClass8, 8);
 System.out.println("Accuray For Class_8: " + accurayForClass8
+ "\n");
 double accurayForClass9 =
CalculatingAccuracy(minimalThetaArrayForClass9,
trainingDataSetForClass9, 9);
 System.out.println("Accuray For Class_9: " + accurayForClass9
+ "\n");
 double accurayForMultiClassClassifier =
Accuracy_For_Multiclass_Classifier(ImagesDataSet);
 System.out.println("\nAccuray For MultiClass Classifier: " +
accurayForMultiClassClassifier);
// System.out.println("trainingDataSetForClass0");
// for (int i = 0; i < trainingDataSetForClass0.length; i++) {
// System.out.println((i + 1) + ": class: " + trainingDataSetForClass0[i].imageClass);
// }
//

//System.out.println("allHandWrittenImaged.size(): " + originalImagesDataSet.size());
// originalImagesDataSet.get(0).displayImage();
// originalImagesDataSet.get(500).displayImage();
// originalImagesDataSet.get(1000).displayImage();
// originalImagesDataSet.get(1500).displayImage();
// originalImagesDataSet.get(2000).displayImage();
// originalImagesDataSet.get(2500).displayImage();
// originalImagesDataSet.get(3000).displayImage();
// originalImagesDataSet.get(3500).displayImage();
// originalImagesDataSet.get(4000).displayImage();
// originalImagesDataSet.get(4500).displayImage();
// originalImagesDataSet.get(4900).displayImage();
 }
}
