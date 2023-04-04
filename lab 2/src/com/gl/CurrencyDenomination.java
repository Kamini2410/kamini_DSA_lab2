package com.gl;

import java.util.*;
import com.gl.BubbleSort;

import java.lang.*;
 
public class CurrencyDenomination{
 
	     
    public void countCurrency( int[] notes,int amount)
    {
    	 int[] noteCounter = new int[9];
    	 // count notes using Greedy approach
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
      
        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
    }
     
       
   
    public static void main(String argc[]){
    	Scanner sc=new Scanner(System.in);
    	int[] notes=new int[9];
    	BubbleSort ob = new BubbleSort();
    	
    	System.out.println("Enter currency denomination");
    	for(int i=0;i<9;i++) {
        notes[i] = sc.nextInt();
    	}
        ob.bubbleSort(notes);
        System.out.println("Sorted array");
        ob.printArray(notes);
        System.out.println("Enter the amount");
    	int amount = sc.nextInt();
   CurrencyDenomination cd=new CurrencyDenomination();
        cd.countCurrency(notes,amount);
    }
     
   
}   