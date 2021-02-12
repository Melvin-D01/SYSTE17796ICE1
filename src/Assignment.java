/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melvi
 */
public class Assignment {
    public static void main(String[] args){
        double[] tempArray = new double[14];
        for(int counter = 0; counter < tempArray.length;counter++){
            tempArray[counter] = (Math.random() * 100) +1;
        }
        double avg = (int)(calcAvg(tempArray) * 10);
        double maxTemp = (int) calcMax(tempArray) * 10;
        System.out.println("The average temperature is: " + (double)(avg / 10));
        System.out.println("The max temperature is " + (double)maxTemp / 10);
    }
    
    public static double calcAvg(double[] tempArray){
        double x = 0;
        for(int counter = 0; counter < tempArray.length;counter++){
            if(tempArray[counter] >-50 && tempArray[counter] < 50){
               x += tempArray[counter];
            }
            
        }
        return x/ tempArray.length;
    }
    
    public static double calcMax(double[] tempArray){
        double x = 0;
        for(int counter = 0; counter < tempArray.length-1;counter++){
            if(tempArray[counter] < tempArray[counter+1]){
                x = tempArray[counter+1];
            }
        }     
        return x;
    }
}
