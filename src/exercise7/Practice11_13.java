package exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten integers: ");
	        for(int i=0;i<10;i++){
	            int num=input.nextInt();
	            list.add(num);
	        }
	    removeDuplicate(list);
	    System.out.print("The distinct intergers are ");
	    for(Integer a:list) 
	        System.out.print(a+" ");

	}
	public static void removeDuplicate(ArrayList<Integer> list){
		for(int i = 0; i < list.size();i++) {
	        for(int j = 1+i; j < list.size();j++) {
	            if(list.get(i) == list.get(j)) {
	                list.remove(j); 
	                j=j-1;
	            }
	      }
	    }

	}

}
