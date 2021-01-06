package exercise7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Practice11_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>(); 
	    ArrayList<Integer> list2 = new ArrayList<>();  
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the array size n: ");
	    int num = input.nextInt();
	    Integer row = 0;   
	    Integer column = 0;
	    Integer row_Max = 0;  
	    Integer column_Max = 0; 
	    int row_number=0;
	    int column_number=0;
	    int[][] array = new int[num][num];
	    Random rand = new Random();
	    
	    System.out.println("The random array is: ");
	    for(int i = 0;i < num;i++) {
	        for(int j = 0;j < num;j++) {
	            array[i][j] = rand.nextInt(2); 
	            System.out.print(array[i][j]);
	        }
	        System.out.println();
	    }
	    
	    for(int i = 0;i < num;i++) {
	        for(int j = 0;j < num;j++) {
	            if(array[i][j] == 1) row++; 
	        }
	        if(row > row_Max) row_Max = row;  
	        row = 0;
	    }
	    
	    for(int i = 0;i < num;i++) {
	        for(int j = 0;j < num;j++) {
	            if(array[j][i] == 1) column++; 
	        }
	        if(column > column_Max) column_Max = column;  
	        column = 0;
	    }
	 
	    
	    for(int i = 0;i < num;i++) {
	        for(int j = 0;j < num;j++) {
	            if(array[i][j] == 1) row++;
	            if(array[j][i] == 1) column++;
	        }
	        if(row == row_Max) {
	        	list1.add(i);
	        	row_number++;
	        }
	        if(column == column_Max) {
	        	list2.add(i);
	        	column_number++;
	        }
	        row = 0;
	        column = 0;
	    }
	 
	    System.out.print("The largest row index:");
	    for(Integer a:list1) {
	    	System.out.print(" " + a);
	    	if (row_number > 1) {
	    		System.out.print(",");
	    		row_number--;
	    	}
	    }
	        
	    System.out.println();
	    System.out.print("The largest column index:");
	    for(Integer b:list2) {
	    	System.out.print(" " + b);
	    	if (column_number > 1) {
	    		System.out.print(",");
	    		column_number--;
	    	}
	    }
	        
	
	}

}


