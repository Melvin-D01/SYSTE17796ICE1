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
        System.out.println("The average temperature is: " + (double)(avg / 10));
    }
    
    public static double calcAvg(double[] tempArray){
        double average = 0;
        for(int counter = 0; counter < tempArray.length;counter++){
            average += tempArray[counter];
        }
        
        
        return average/ tempArray.length;
    }
}
